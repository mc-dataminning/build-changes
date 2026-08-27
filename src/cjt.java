import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjt extends cij {
   private static final String b = "Johnny";
   static final Predicate<bpx> e = $$0 -> $$0 == bpx.c || $$0 == bpx.d;
   boolean ch;

   public cjt(bsb<? extends cjt> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cjt.a(this));
      this.cb.a(2, new cij.b(this));
      this.cb.a(3, new cnn.a(this, 10.0F));
      this.cb.a(4, new bzv(this, 1.0, false));
      this.cc.a(1, new cbd(this, cnn.class).a());
      this.cc.a(2, new cbe<>(this, cly.class, true));
      this.cc.a(3, new cbe<>(this, clg.class, true));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
      this.cc.a(4, new cjt.b(this));
      this.cb.a(8, new cai(this, 0.6));
      this.cb.a(9, new bzt(this, cly.class, 3.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.go() && cdj.a(this)) {
         boolean $$0 = ((aqt)this.dU()).e(this.du());
         ((cby)this.J()).b($$0);
      }

      super.Y();
   }

   public static btu.a t() {
      return cjd.gG().a(btv.r, 0.35F).a(btv.k, 12.0).a(btv.q, 24.0).a(btv.c, 5.0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.ch) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cij.a r() {
      if (this.gq()) {
         return cij.a.b;
      } else {
         return this.gP() ? cij.a.g : cij.a.a;
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.ch = $$0.q("Johnny");
      }
   }

   @Override
   public avn af_() {
      return avo.BH;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      btg $$4 = super.a($$0, $$1, $$2, $$3);
      ((cby)this.J()).b(true);
      ayt $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      if (this.gM() == null) {
         this.a(bsc.a, new cuh(cuk.qw));
      }
   }

   @Override
   public void b(@Nullable xe $$0) {
      super.b($$0);
      if (!this.ch && $$0 != null && $$0.getString().equals("Johnny")) {
         this.ch = true;
      }
   }

   @Override
   protected avn u() {
      return avo.BG;
   }

   @Override
   protected avn n_() {
      return avo.BI;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.BJ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cuh $$2 = new cuh(cuk.qw);
      cnm $$3 = this.gM();
      int $$4 = 1;
      if ($$0 > $$3.a(bpx.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.al.i() <= $$3.v();
      if ($$5) {
         $$2.a(dag.n, $$4);
      }

      this.a(bsc.a, $$2);
   }

   static class a extends byv {
      public a(bsq $$0) {
         super($$0, 6, cjt.e);
         this.a(EnumSet.of(bzl.a.a));
      }

      @Override
      public boolean b() {
         cjt $$0 = (cjt)this.d;
         return $$0.gN() && super.b();
      }

      @Override
      public boolean a() {
         cjt $$0 = (cjt)this.d;
         return $$0.gN() && $$0.al.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cbe<bso> {
      public b(cjt $$0) {
         super($$0, bso.class, 0, true, true, bso::fQ);
      }

      @Override
      public boolean a() {
         return ((cjt)this.e).ch && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
