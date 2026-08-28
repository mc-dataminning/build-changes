public class dpw extends dqv implements dqt {
   private static final int d = 1;
   private js<cuc> e = js.a(27, cuc.l);
   private final dqc f = new dqc() {
      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2) {
         dpw.a($$0, $$1, $$2, avh.eQ);
      }

      @Override
      protected void b(dcf $$0, ja $$1, dsk $$2) {
         dpw.a($$0, $$1, $$2, avh.eO);
      }

      @Override
      protected void a(dcf $$0, ja $$1, dsk $$2, int $$3, int $$4) {
         dpw.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(cmk $$0) {
         if (!($$0.cd instanceof cpp)) {
            return false;
         } else {
            bpz $$1 = ((cpp)$$0.cd).l();
            return $$1 == dpw.this || $$1 instanceof bpy && ((bpy)$$1).a(dpw.this);
         }
      }
   };
   private final dpx g = new dpx();

   protected dpw(dpr<?> $$0, ja $$1, dsk $$2) {
      super($$0, $$1, $$2);
   }

   public dpw(ja $$0, dsk $$1) {
      this(dpr.b, $$0, $$1);
   }

   @Override
   public int b() {
      return 27;
   }

   @Override
   protected wu k() {
      return wu.c("container.chest");
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.e = js.a(this.b(), cuc.l);
      if (!this.a_($$0)) {
         bqa.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bqa.a($$0, this.e, $$1);
      }
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dpw $$3) {
      $$3.g.a();
   }

   static void a(dcf $$0, ja $$1, dsk $$2, avg $$3) {
      dtc $$4 = $$2.c(dgk.d);
      if ($$4 != dtc.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dtc.c) {
            jf $$8 = dgk.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avi.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.g.a($$1 > 0);
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   @Override
   public void d_(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(cmk $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected js<cuc> j() {
      return this.e;
   }

   @Override
   protected void a(js<cuc> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(dbl $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dpp $$3 = $$0.c_($$1);
         if ($$3 instanceof dpw) {
            return ((dpw)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dpw $$0, dpw $$1) {
      js<cuc> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cph a(int $$0, cmj $$1) {
      return cpp.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dcf $$0, ja $$1, dsk $$2, int $$3, int $$4) {
      dfh $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
