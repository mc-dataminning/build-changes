import javax.annotation.Nullable;

public class cem extends bof implements bpv {
   private static final aii<Integer> c = ail.a(cem.class, aik.b);
   private static final aii<dme> d = ail.a(cem.class, aik.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private box g;

   public cem(bol<? extends cem> $$0, cwe $$1) {
      super($$0, $$1);
      this.H = true;
   }

   public cem(cwe $$0, double $$1, double $$2, double $$3, @Nullable box $$4) {
      this(bol.ba, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.J = $$1;
      this.K = $$2;
      this.L = $$3;
      this.g = $$4;
   }

   @Override
   protected void c_() {
      this.am.a(c, 80);
      this.am.a(d, czh.ck.o());
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   public boolean bt() {
      return !this.dE();
   }

   @Override
   public void l() {
      if (!this.aV()) {
         this.g(this.dm().b(0.0, -0.04, 0.0));
      }

      this.a(bpc.a, this.dm());
      this.g(this.dm().a(0.98));
      if (this.aC()) {
         this.g(this.dm().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.s() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.am();
         if (!this.dJ().B) {
            this.x();
         }
      } else {
         this.bg();
         if (this.dJ().B) {
            this.dJ().a(kb.ab, this.do(), this.dq() + 0.5, this.du(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void x() {
      float $$0 = 4.0F;
      this.dJ().a(this, this.do(), this.e(0.0625), this.du(), 4.0F, cwe.a.d);
   }

   @Override
   protected void b(sy $$0) {
      $$0.a("fuse", (short)this.s());
      $$0.a("block_state", tn.a(this.u()));
   }

   @Override
   protected void a(sy $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(tn.a(this.dJ().a(ki.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public box q() {
      return this.g;
   }

   @Override
   public void v(bof $$0) {
      super.v($$0);
      if ($$0 instanceof cem $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.am.b(c, $$0);
   }

   public int s() {
      return this.am.b(c);
   }

   public void c(dme $$0) {
      this.am.b(d, $$0);
   }

   public dme u() {
      return this.am.b(d);
   }
}
