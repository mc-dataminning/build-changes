import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends djy implements dkd {
   public static final MapCodec<dke> a = b(dke::new);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dxu.d $$0) {
      super($$0);
   }

   @Override
   public cwm b() {
      return cwm.a;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dus($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.p, dus::a);
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dus $$5) {
         $$3.a($$5);
         $$3.a(axp.ab);
      }

      return btj.a;
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }
}
