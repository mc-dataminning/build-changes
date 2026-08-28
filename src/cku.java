import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cku extends cjm {
   private static final String b = "Johnny";
   static final Predicate<bqt> e = $$0 -> $$0 == bqt.c || $$0 == bqt.d;
   boolean bY;

   public cku(btc<? extends cku> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new caj(this));
      this.bS.a(1, new cku.a(this));
      this.bS.a(2, new cjm.b(this));
      this.bS.a(3, new col.a(this, 10.0F));
      this.bS.a(4, new caz(this, 1.0, false));
      this.bT.a(1, new cch(this, col.class).a());
      this.bT.a(2, new cci<>(this, cmz.class, true));
      this.bT.a(3, new cci<>(this, cmh.class, true));
      this.bT.a(3, new cci<>(this, cft.class, true));
      this.bT.a(4, new cku.b(this));
      this.bS.a(8, new cbm(this, 0.6));
      this.bS.a(9, new cax(this, cmz.class, 3.0F, 1.0F));
      this.bS.a(10, new cax(this, btt.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && cen.a(this)) {
         boolean $$0 = ((arf)this.dP()).e(this.dp());
         ((cdc)this.K()).b($$0);
      }

      super.Z();
   }

   public static buy.a u() {
      return ckf.gw().a(buz.r, 0.35F).a(buz.k, 12.0).a(buz.q, 24.0).a(buz.c, 5.0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjm.a s() {
      if (this.gi()) {
         return cjm.a.b;
      } else {
         return this.gJ() ? cjm.a.g : cjm.a.a;
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      buk $$4 = super.a($$0, $$1, $$2, $$3);
      ((cdc)this.K()).b(true);
      azh $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      if (this.gE() == null) {
         this.a(btd.a, new cur(cuu.pd));
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
   protected avz d(brp $$0) {
      return awa.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cur $$2 = new cur(cuu.pd);
      cok $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqt.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(daf.n, $$4);
      }

      this.a(btd.a, $$2);
   }

   static class a extends bzz {
      public a(btt $$0) {
         super($$0, 6, cku.e);
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean b() {
         cku $$0 = (cku)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         cku $$0 = (cku)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends cci<btr> {
      public b(cku $$0) {
         super($$0, btr.class, 0, true, true, btr::fH);
      }

      @Override
      public boolean a() {
         return ((cku)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
