import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dii extends dde implements dcy {
   public static final MapCodec<dii> a = b(dii::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dqs d = dqo.R;
   public static final dqy e = dqo.S;
   private static final BiFunction<ir, Integer, ety> f = ac.a(
      ($$0, $$1) -> {
         ety[] $$2 = new ety[]{
            dcv.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dcv.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dcv.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dcv.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ety $$3 = etv.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = etv.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   protected dii(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ir.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dpy $$0, cvl $$1) {
      return !$$1.h() && $$1.n().a(this.p()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().a(d, $$0.g().g());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new csd(this));
      }
   }
}
