import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cks extends cjk {
   private static final String b = "Johnny";
   static final Predicate<bqr> e = $$0 -> $$0 == bqr.c || $$0 == bqr.d;
   boolean bY;

   public cks(bta<? extends cks> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cks.a(this));
      this.bS.a(2, new cjk.b(this));
      this.bS.a(3, new coj.a(this, 10.0F));
      this.bS.a(4, new cax(this, 1.0, false));
      this.bT.a(1, new ccf(this, coj.class).a());
      this.bT.a(2, new ccg<>(this, cmx.class, true));
      this.bT.a(3, new ccg<>(this, cmf.class, true));
      this.bT.a(3, new ccg<>(this, cfr.class, true));
      this.bT.a(4, new cks.b(this));
      this.bS.a(8, new cbk(this, 0.6));
      this.bS.a(9, new cav(this, cmx.class, 3.0F, 1.0F));
      this.bS.a(10, new cav(this, btr.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && cel.a(this)) {
         boolean $$0 = ((arf)this.dP()).e(this.dp());
         ((cda)this.K()).b($$0);
      }

      super.Z();
   }

   public static buw.a u() {
      return ckd.gw().a(bux.r, 0.35F).a(bux.k, 12.0).a(bux.q, 24.0).a(bux.c, 5.0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjk.a s() {
      if (this.gi()) {
         return cjk.a.b;
      } else {
         return this.gJ() ? cjk.a.g : cjk.a.a;
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avz ae_() {
      return awa.Bj;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      bui $$4 = super.a($$0, $$1, $$2, $$3);
      ((cda)this.K()).b(true);
      azh $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      if (this.gE() == null) {
         this.a(btb.a, new cup(cus.pd));
      }
   }

   @Override
   public void b(@Nullable xp $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avz v() {
      return awa.Bi;
   }

   @Override
   protected avz o_() {
      return awa.Bk;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cup $$2 = new cup(cus.pd);
      coi $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqr.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(dad.n, $$4);
      }

      this.a(btb.a, $$2);
   }

   static class a extends bzx {
      public a(btr $$0) {
         super($$0, 6, cks.e);
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public boolean b() {
         cks $$0 = (cks)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         cks $$0 = (cks)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends ccg<btp> {
      public b(cks $$0) {
         super($$0, btp.class, 0, true, true, btp::fH);
      }

      @Override
      public boolean a() {
         return ((cks)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
