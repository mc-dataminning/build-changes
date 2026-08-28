import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckr extends cjj {
   private static final String b = "Johnny";
   static final Predicate<bqq> e = $$0 -> $$0 == bqq.c || $$0 == bqq.d;
   boolean bY;

   public ckr(bsz<? extends ckr> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cag(this));
      this.bS.a(1, new ckr.a(this));
      this.bS.a(2, new cjj.b(this));
      this.bS.a(3, new coi.a(this, 10.0F));
      this.bS.a(4, new caw(this, 1.0, false));
      this.bT.a(1, new cce(this, coi.class).a());
      this.bT.a(2, new ccf<>(this, cmw.class, true));
      this.bT.a(3, new ccf<>(this, cme.class, true));
      this.bT.a(3, new ccf<>(this, cfq.class, true));
      this.bT.a(4, new ckr.b(this));
      this.bS.a(8, new cbj(this, 0.6));
      this.bS.a(9, new cau(this, cmw.class, 3.0F, 1.0F));
      this.bS.a(10, new cau(this, btq.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gg() && cek.a(this)) {
         boolean $$0 = ((are)this.dP()).e(this.dp());
         ((ccz)this.K()).b($$0);
      }

      super.Z();
   }

   public static buv.a u() {
      return ckc.gw().a(buw.r, 0.35F).a(buw.k, 12.0).a(buw.q, 24.0).a(buw.c, 5.0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjj.a s() {
      if (this.gi()) {
         return cjj.a.b;
      } else {
         return this.gJ() ? cjj.a.g : cjj.a.a;
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avy ae_() {
      return avz.Bj;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      buh $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccz)this.K()).b(true);
      azg $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      if (this.gE() == null) {
         this.a(bta.a, new cuo(cur.pd));
      }
   }

   @Override
   public void b(@Nullable xo $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avy v() {
      return avz.Bi;
   }

   @Override
   protected avy o_() {
      return avz.Bk;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.Bl;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cuo $$2 = new cuo(cur.pd);
      coh $$3 = this.gE();
      int $$4 = 1;
      if ($$0 > $$3.a(bqq.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(dac.n, $$4);
      }

      this.a(bta.a, $$2);
   }

   static class a extends bzw {
      public a(btq $$0) {
         super($$0, 6, ckr.e);
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         ckr $$0 = (ckr)this.d;
         return $$0.gH() && super.b();
      }

      @Override
      public boolean a() {
         ckr $$0 = (ckr)this.d;
         return $$0.gH() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends ccf<bto> {
      public b(ckr $$0) {
         super($$0, bto.class, 0, true, true, bto::fH);
      }

      @Override
      public boolean a() {
         return ((ckr)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
