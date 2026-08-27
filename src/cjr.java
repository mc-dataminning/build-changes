import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjr extends cij {
   private static final String b = "Johnny";
   static final Predicate<bpr> e = $$0 -> $$0 == bpr.c || $$0 == bpr.d;
   boolean bY;

   public cjr(bsa<? extends cjr> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new cjr.a(this));
      this.bS.a(2, new cij.b(this));
      this.bS.a(3, new cni.a(this, 10.0F));
      this.bS.a(4, new bzw(this, 1.0, false));
      this.bT.a(1, new cbe(this, cni.class).a());
      this.bT.a(2, new cbf<>(this, clw.class, true));
      this.bT.a(3, new cbf<>(this, cle.class, true));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
      this.bT.a(4, new cjr.b(this));
      this.bS.a(8, new caj(this, 0.6));
      this.bS.a(9, new bzu(this, clw.class, 3.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gf() && cdk.a(this)) {
         boolean $$0 = ((aqm)this.dP()).e(this.dp());
         ((cbz)this.K()).b($$0);
      }

      super.Y();
   }

   public static btv.a u() {
      return cjc.gv().a(btw.r, 0.35F).a(btw.k, 12.0).a(btw.q, 24.0).a(btw.c, 5.0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cij.a s() {
      if (this.gh()) {
         return cij.a.b;
      } else {
         return this.gI() ? cij.a.g : cij.a.a;
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avg ae_() {
      return avh.Bj;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      bth $$4 = super.a($$0, $$1, $$2, $$3);
      ((cbz)this.K()).b(true);
      ayk $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      if (this.gD() == null) {
         this.a(bsb.a, new cto(ctr.pd));
      }
   }

   @Override
   public void b(@Nullable wx $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avg v() {
      return avh.Bi;
   }

   @Override
   protected avg o_() {
      return avh.Bk;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cto $$2 = new cto(ctr.pd);
      cnh $$3 = this.gD();
      int $$4 = 1;
      if ($$0 > $$3.a(bpr.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(czc.n, $$4);
      }

      this.a(bsb.a, $$2);
   }

   static class a extends byw {
      public a(bsq $$0) {
         super($$0, 6, cjr.e);
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean b() {
         cjr $$0 = (cjr)this.d;
         return $$0.gG() && super.b();
      }

      @Override
      public boolean a() {
         cjr $$0 = (cjr)this.d;
         return $$0.gG() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cbf<bso> {
      public b(cjr $$0) {
         super($$0, bso.class, 0, true, true, bso::fH);
      }

      @Override
      public boolean a() {
         return ((cjr)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
