import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjt extends cil {
   private static final String b = "Johnny";
   static final Predicate<bpt> e = $$0 -> $$0 == bpt.c || $$0 == bpt.d;
   boolean bY;

   public cjt(bsc<? extends cjt> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cjt.a(this));
      this.bS.a(2, new cil.b(this));
      this.bS.a(3, new cnk.a(this, 10.0F));
      this.bS.a(4, new bzy(this, 1.0, false));
      this.bT.a(1, new cbg(this, cnk.class).a());
      this.bT.a(2, new cbh<>(this, cly.class, true));
      this.bT.a(3, new cbh<>(this, clg.class, true));
      this.bT.a(3, new cbh<>(this, ces.class, true));
      this.bT.a(4, new cjt.b(this));
      this.bS.a(8, new cal(this, 0.6));
      this.bS.a(9, new bzw(this, cly.class, 3.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gf() && cdm.a(this)) {
         boolean $$0 = ((aqn)this.dP()).e(this.dp());
         ((ccb)this.K()).b($$0);
      }

      super.Y();
   }

   public static btx.a u() {
      return cje.gv().a(bty.r, 0.35F).a(bty.k, 12.0).a(bty.q, 24.0).a(bty.c, 5.0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cil.a s() {
      if (this.gh()) {
         return cil.a.b;
      } else {
         return this.gI() ? cil.a.g : cil.a.a;
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
   public avh ae_() {
      return avi.Bj;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      btj $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccb)this.K()).b(true);
      aym $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      if (this.gD() == null) {
         this.a(bsd.a, new ctq(ctt.pd));
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
   protected avh v() {
      return avi.Bi;
   }

   @Override
   protected avh o_() {
      return avi.Bk;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ctq $$2 = new ctq(ctt.pd);
      cnj $$3 = this.gD();
      int $$4 = 1;
      if ($$0 > $$3.a(bpt.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(cze.n, $$4);
      }

      this.a(bsd.a, $$2);
   }

   static class a extends byy {
      public a(bss $$0) {
         super($$0, 6, cjt.e);
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean b() {
         cjt $$0 = (cjt)this.d;
         return $$0.gG() && super.b();
      }

      @Override
      public boolean a() {
         cjt $$0 = (cjt)this.d;
         return $$0.gG() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cbh<bsq> {
      public b(cjt $$0) {
         super($$0, bsq.class, 0, true, true, bsq::fH);
      }

      @Override
      public boolean a() {
         return ((cjt)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
