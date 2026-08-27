import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dyj(ih<drg<?, ?>> e, List<dym> f) {
   public static final Codec<dyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drg.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dym.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dyj::new)
   );
   public static final Codec<ih<dyj>> b = ahc.a(ke.aC, a);
   public static final Codec<il<dyj>> c = iv.a(ke.aC, a);
   public static final Codec<List<il<dyj>>> d = iv.a(ke.aC, a, true).listOf();

   public boolean a(cuj $$0, dld $$1, auu $$2, hx $$3) {
      return this.a(new dyk($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cuj $$0, dld $$1, auu $$2, hx $$3) {
      return this.a(new dyk($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dyk $$0, auu $$1, hx $$2) {
      Stream<hx> $$3 = Stream.of($$2);

      for (dym $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      drg<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<drg<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ih<drg<?, ?>> b() {
      return this.e;
   }

   public List<dym> c() {
      return this.f;
   }
}
