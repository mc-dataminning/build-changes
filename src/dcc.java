import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dcc extends cwz implements cwt {
   public static final MapCodec<dcc> a = b(dcc::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dkb d = djx.R;
   public static final dkh e = djx.S;
   private static final BiFunction<ic, Integer, emm> f = ac.a(
      ($$0, $$1) -> {
         emm[] $$2 = new emm[]{
            cwq.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cwq.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cwq.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cwq.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         emm $$3 = emj.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = emj.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   protected dcc(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ic.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cmy(this));
      }
   }
}
