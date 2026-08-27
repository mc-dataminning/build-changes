public class dnt extends dor implements dop {
   private static final int d = 1;
   private jf<csz> e = jf.a(27, csz.i);
   private final dnz f = new dnz() {
      @Override
      protected void a(dad $$0, in $$1, dqh $$2) {
         dnt.a($$0, $$1, $$2, avc.eQ);
      }

      @Override
      protected void b(dad $$0, in $$1, dqh $$2) {
         dnt.a($$0, $$1, $$2, avc.eO);
      }

      @Override
      protected void a(dad $$0, in $$1, dqh $$2, int $$3, int $$4) {
         dnt.this.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      protected boolean a(clh $$0) {
         if (!($$0.cc instanceof cok)) {
            return false;
         } else {
            bpf $$1 = ((cok)$$0.cc).l();
            return $$1 == dnt.this || $$1 instanceof bpe && ((bpe)$$1).a(dnt.this);
         }
      }
   };
   private final dnu g = new dnu();

   protected dnt(dno<?> $$0, in $$1, dqh $$2) {
      super($$0, $$1, $$2);
   }

   public dnt(in $$0, dqh $$1) {
      this(dno.b, $$0, $$1);
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
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.e = jf.a(this.b(), csz.i);
      if (!this.a_($$0)) {
         bpg.b($$0, this.e, $$1);
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.b_($$0)) {
         bpg.a($$0, this.e, $$1);
      }
   }

   public static void a(dad $$0, in $$1, dqh $$2, dnt $$3) {
      $$3.g.a();
   }

   static void a(dad $$0, in $$1, dqh $$2, avb $$3) {
      dqz $$4 = $$2.c(deh.d);
      if ($$4 != dqz.b) {
         double $$5 = (double)$$1.u() + 0.5;
         double $$6 = (double)$$1.v() + 0.5;
         double $$7 = (double)$$1.w() + 0.5;
         if ($$4 == dqz.c) {
            is $$8 = deh.h($$2);
            $$5 += (double)$$8.j() * 0.5;
            $$7 += (double)$$8.l() * 0.5;
         }

         $$0.a(null, $$5, $$6, $$7, $$3, avd.e, 0.5F, $$0.z.i() * 0.1F + 0.9F);
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
   public void d_(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.a($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   public void c(clh $$0) {
      if (!this.p && !$$0.N_()) {
         this.f.b($$0, this.i(), this.az_(), this.n());
      }
   }

   @Override
   protected jf<csz> j() {
      return this.e;
   }

   @Override
   protected void a(jf<csz> $$0) {
      this.e = $$0;
   }

   @Override
   public float a(float $$0) {
      return this.g.a($$0);
   }

   public static int a(czj $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      if ($$2.t()) {
         dnm $$3 = $$0.c_($$1);
         if ($$3 instanceof dnt) {
            return ((dnt)$$3).f.a();
         }
      }

      return 0;
   }

   public static void a(dnt $$0, dnt $$1) {
      jf<csz> $$2 = $$0.j();
      $$0.a($$1.j());
      $$1.a($$2);
   }

   @Override
   protected cod a(int $$0, clg $$1) {
      return cok.a($$0, $$1, this);
   }

   public void l() {
      if (!this.p) {
         this.f.c(this.i(), this.az_(), this.n());
      }
   }

   protected void a(dad $$0, in $$1, dqh $$2, int $$3, int $$4) {
      dde $$5 = $$2.b();
      $$0.a($$1, $$5, 1, $$4);
   }
}
