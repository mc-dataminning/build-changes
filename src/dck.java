import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dck extends cxh implements cxb {
   public static final MapCodec<dck> a = b(dck::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dkj d = dkf.R;
   public static final dkp e = dkf.S;
   private static final BiFunction<ic, Integer, emv> f = ac.a(
      ($$0, $$1) -> {
         emv[] $$2 = new emv[]{
            cwy.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cwy.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cwy.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cwy.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         emv $$3 = ems.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ems.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   protected dck(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ic.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cng(this));
      }
   }
}
