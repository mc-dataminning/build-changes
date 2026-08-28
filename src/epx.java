import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record epx(je<eiq<?, ?>> e, List<eqa> f) {
   public static final Codec<epx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.b.fieldOf("feature").forGetter($$0x -> $$0x.e), eqa.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, epx::new)
   );
   public static final Codec<je<epx>> b = alc.a(mg.ba, a);
   public static final Codec<ji<epx>> c = jt.a(mg.ba, a);
   public static final Codec<List<ji<epx>>> d = jt.a(mg.ba, a, true).listOf();

   public boolean a(dju $$0, ebx $$1, azv $$2, iu $$3) {
      return this.a(new epy($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(dju $$0, ebx $$1, azv $$2, iu $$3) {
      return this.a(new epy($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(epy $$0, azv $$1, iu $$2) {
      Stream<iu> $$3 = Stream.of($$2);

      for (eqa $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      eiq<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<eiq<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public je<eiq<?, ?>> b() {
      return this.e;
   }

   public List<eqa> c() {
      return this.f;
   }
}
