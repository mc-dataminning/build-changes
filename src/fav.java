import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fav extends fbb {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ezo.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fav::new)
   );
   private final ezo.b b;

   public fav(List<fcx> $$0, ezo.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fav> b() {
      return fbe.B;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      if ($$0.a(czo.vx) && $$1.c(this.b.a()) instanceof crj $$2) {
         $$0.b(kk.ak, new dck($$2.gh()));
      }

      return $$0;
   }

   public static fbb.a<?> a(ezo.b $$0) {
      return a($$1 -> new fav($$1, $$0));
   }
}
