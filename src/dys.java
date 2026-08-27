import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;

public record dys(ih<drp<?, ?>> e, List<dyv> f) {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drp.b.fieldOf("feature").forGetter($$0x -> $$0x.e), dyv.b.listOf().fieldOf("placement").forGetter($$0x -> $$0x.f)).apply($$0, dys::new)
   );
   public static final Codec<ih<dys>> b = ahd.a(ke.aC, a);
   public static final Codec<il<dys>> c = iv.a(ke.aC, a);
   public static final Codec<List<il<dys>>> d = iv.a(ke.aC, a, true).listOf();

   public boolean a(cus $$0, dlm $$1, auw $$2, hx $$3) {
      return this.a(new dyt($$0, $$1, Optional.empty()), $$2, $$3);
   }

   public boolean b(cus $$0, dlm $$1, auw $$2, hx $$3) {
      return this.a(new dyt($$0, $$1, Optional.of(this)), $$2, $$3);
   }

   private boolean a(dyt $$0, auw $$1, hx $$2) {
      Stream<hx> $$3 = Stream.of($$2);

      for (dyv $$4 : this.f) {
         $$3 = $$3.flatMap($$3x -> $$4.a_($$0, $$1, $$3x));
      }

      drp<?, ?> $$5 = this.e.a();
      MutableBoolean $$6 = new MutableBoolean();
      $$3.forEach($$4 -> {
         if ($$5.a($$0.d(), $$0.f(), $$1, $$4)) {
            $$6.setTrue();
         }
      });
      return $$6.isTrue();
   }

   public Stream<drp<?, ?>> a() {
      return this.e.a().a();
   }

   @Override
   public String toString() {
      return "Placed " + this.e;
   }

   public ih<drp<?, ?>> b() {
      return this.e;
   }

   public List<dyv> c() {
      return this.f;
   }
}
