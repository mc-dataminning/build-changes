import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dyk(ih<drh<?, ?>> e, List<dyn> f) {
   public static final Codec<dyk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drh.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dyn.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dyk::new)
   );
   public static final Codec<ih<dyk>> b = ahc.a(ke.aC, a);
   public static final Codec<il<dyk>> c = iv.a(ke.aC, a);
   public static final Codec<List<il<dyk>>> d = iv.a(ke.aC, a, true).listOf();

   public boolean a(cuk $$0, dle $$1, auv $$2, hx $$3) {
      return this.a(new dyl($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cuk $$0, dle $$1, auv $$2, hx $$3) {
      return this.a(new dyl($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dyl $$0, auv $$1, hx $$2) {
      Stream<hx> $$3 = Stream.of($$2);

      for (dyn $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      drh<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<drh<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ih<drh<?, ?>> b() {
      return this.e;
   }

   public List<dyn> c() {
      return this.f;
   }
}
