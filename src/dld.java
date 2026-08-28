import com.mojang.serialization.MapCodec;

public class dld extends dgf {
   public static final MapCodec<dld> a = b(dld::new);
   public static final int b = 3;
   public static final dua c = dtq.as;
   private static final exp[] d = new exp[]{
      dfw.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(dfy.dW);
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(cur.sj);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }
}
