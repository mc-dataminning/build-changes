import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dir extends ddn implements ddh {
   public static final MapCodec<dir> a = b(dir::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final drb d = dqx.R;
   public static final drh e = dqx.S;
   private static final BiFunction<is, Integer, eui> f = ac.a(
      ($$0, $$1) -> {
         eui[] $$2 = new eui[]{
            dde.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dde.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dde.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dde.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eui $$3 = euf.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = euf.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   protected dir(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, is.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dqh a(dqh $$0, djr $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dqh $$0, cwi $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new csz(this));
      }
   }
}
