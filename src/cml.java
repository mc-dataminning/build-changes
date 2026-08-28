import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cml extends cld {
   private static final String a = "Johnny";
   static final Predicate<bsf> b = $$0 -> $$0 == bsf.c || $$0 == bsf.d;
   boolean bY;

   public cml(buq<? extends cml> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cbk<>(this, cna.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cml.a(this));
      this.bS.a(3, new cld.b(this));
      this.bS.a(4, new cqj.a(this, 10.0F));
      this.bS.a(5, new ccn(this, 1.0, false));
      this.bT.a(1, new cdv(this, cqj.class).a());
      this.bT.a(2, new cdw<>(this, cov.class, true));
      this.bT.a(3, new cdw<>(this, cob.class, true));
      this.bT.a(3, new cdw<>(this, chi.class, true));
      this.bT.a(4, new cml.b(this));
      this.bS.a(8, new cda(this, 0.6));
      this.bS.a(9, new ccl(this, cov.class, 3.0F, 1.0F));
      this.bS.a(10, new ccl(this, bvh.class, 8.0F));
   }

   @Override
   protected void a(arc $$0) {
      if (!this.gc() && cgb.a(this)) {
         boolean $$1 = $$0.e(this.dw());
         ((ceq)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bwm.a p() {
      return clw.gu().a(bwn.v, 0.35F).a(bwn.m, 12.0).a(bwn.s, 24.0).a(bwn.c, 5.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cld.a m() {
      if (this.ge()) {
         return cld.a.b;
      } else {
         return this.gH() ? cld.a.g : cld.a.a;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avy aj_() {
      return avz.Cb;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      bvy $$4 = super.a($$0, $$1, $$2, $$3);
      ((ceq)this.L()).b(true);
      azg $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      if (this.gC() == null) {
         this.a(bur.a, new cwn(cwr.pJ));
      }
   }

   @Override
   public void b(@Nullable wo $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avy u() {
      return avz.Ca;
   }

   @Override
   protected avy o_() {
      return avz.Cc;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Cd;
   }

   @Override
   public void a(arc $$0, int $$1, boolean $$2) {
      cwn $$3 = new cwn(cwr.pJ);
      cqi $$4 = this.gC();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         akt<def> $$6 = $$1 > $$4.a(bsf.c) ? del.f : del.e;
         dcz.a($$3, $$0.K_(), $$6, $$0.d_(this.dw()), this.ae);
      }

      this.a(bur.a, $$3);
   }

   static class a extends cbn {
      public a(bvh $$0) {
         super($$0, 6, cml.b);
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean c() {
         cml $$0 = (cml)this.d;
         return $$0.gF() && super.c();
      }

      @Override
      public boolean b() {
         cml $$0 = (cml)this.d;
         return $$0.gF() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cdw<bvf> {
      public b(cml $$0) {
         super($$0, bvf.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cml)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
