import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dve(ib<dob<?, ?>> e, List<dvh> f) {
   public static final Codec<dve> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dob.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dvh.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dve::new)
   );
   public static final Codec<ib<dve>> b = afs.a(jz.az, a);
   public static final Codec<ig<dve>> c = iq.a(jz.az, a);
   public static final Codec<List<ig<dve>>> d = iq.a(jz.az, a, true).listOf();

   public boolean a(crt $$0, dhy $$1, ate $$2, ht $$3) {
      return this.a(new dvf($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(crt $$0, dhy $$1, ate $$2, ht $$3) {
      return this.a(new dvf($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dvf $$0, ate $$1, ht $$2) {
      Stream<ht> $$3 = Stream.of($$2);

      for (dvh $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dob<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dob<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ib<dob<?, ?>> b() {
      return this.e;
   }

   public List<dvh> c() {
      return this.f;
   }
}
