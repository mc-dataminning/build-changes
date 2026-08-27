import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record eci(il<dvf<?, ?>> e, List<ecl> f) {
   public static final Codec<eci> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvf.b.fieldOf("feature").forGetter($$0x -> $$0x.e), ecl.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, eci::new)
   );
   public static final Codec<il<eci>> b = ajd.a(kj.aD, a);
   public static final Codec<ip<eci>> c = ja.a(kj.aD, a);
   public static final Codec<List<ip<eci>>> d = ja.a(kj.aD, a, true).listOf();

   public boolean a(cxw $$0, doy $$1, axd $$2, ib $$3) {
      return this.a(new ecj($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cxw $$0, doy $$1, axd $$2, ib $$3) {
      return this.a(new ecj($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(ecj $$0, axd $$1, ib $$2) {
      Stream<ib> $$3 = Stream.of($$2);

      for (ecl $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      dvf<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<dvf<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public il<dvf<?, ?>> b() {
      return this.e;
   }

   public List<ecl> c() {
      return this.f;
   }
}
