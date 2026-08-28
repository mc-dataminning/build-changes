import com.mojang.serialization.MapCodec;

public class dob extends dpy implements dqq {
   public static final MapCodec<dob> b = b(dob::new);
   public static final dxm c = dxl.J;
   public static final dxm d = dxl.B;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<dob> a() {
      return b;
   }

   public dob(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jn.b).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dwv a(dae $$0) {
      esx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == esy.c;
      return this.m().b(a, $$0.k()).b(c, Boolean.valueOf($$2));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(c) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void e(dwv $$0, dgg $$1, ji $$2) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      this.f($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void f(dwv $$0, dgg $$1, ji $$2) {
      jn $$3 = $$0.c(a).g();
      $$1.a($$2.a($$3), this, eub.a($$1, $$3, null));
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
      this.f($$0, $$1, $$2);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$1.af() && (long)$$1.A.a(200) <= $$1.ad() % 200L && $$2.v() == $$1.a(ecq.a.b, $$2.u(), $$2.w()) - 1) {
         azc.a($$0.c(a).o(), $$1, $$2, 0.125, lt.aV, brt.a(1, 2));
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.f($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }
}
