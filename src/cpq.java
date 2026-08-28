import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpq extends coh {
   private static final String a = "Johnny";
   static final Predicate<buq> b = $$0 -> $$0 == buq.c || $$0 == buq.d;
   private static final boolean e = false;
   boolean f = false;

   public cpq(bxe<? extends cpq> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cdz<>(this, cqf.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new cpq.a(this));
      this.bF.a(3, new coh.b(this));
      this.bF.a(4, new ctq.a(this, 10.0F));
      this.bF.a(5, new cfc(this, 1.0, false));
      this.bG.a(1, new cgk(this, ctq.class).a());
      this.bG.a(2, new cgl<>(this, crz.class, true));
      this.bG.a(3, new cgl<>(this, crg.class, true));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
      this.bG.a(4, new cpq.b(this));
      this.bF.a(8, new cfp(this, 0.6));
      this.bF.a(9, new cfa(this, crz.class, 3.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
   }

   @Override
   protected void a(aru $$0) {
      if (!this.gj() && ciq.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((chf)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.v, 0.35F).a(bzc.m, 12.0).a(bzc.s, 24.0).a(bzc.c, 5.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.f) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public coh.a j() {
      if (this.gl()) {
         return coh.a.b;
      } else {
         return this.gK() ? coh.a.g : coh.a.a;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.f = $$0.b("Johnny", false);
   }

   @Override
   public awq ai_() {
      return awr.Cr;
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      byo $$4 = super.a($$0, $$1, $$2, $$3);
      ((chf)this.O()).b(true);
      azz $$5 = $$0.G_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      if (this.gF() == null) {
         this.a(bxf.a, new daa(dae.pS));
      }
   }

   @Override
   public void b(@Nullable xc $$0) {
      super.b($$0);
      if (!this.f && $$0 != null && $$0.getString().equals("Johnny")) {
         this.f = true;
      }
   }

   @Override
   protected awq u() {
      return awr.Cq;
   }

   @Override
   protected awq l_() {
      return awr.Cs;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.Ct;
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
      daa $$3 = new daa(dae.pS);
      ctp $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alj<dhv> $$6 = $$1 > $$4.a(buq.c) ? dib.f : dib.e;
         dgp.a($$3, $$0.J_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bxf.a, $$3);
   }

   static class a extends cec {
      public a(bxy $$0) {
         super($$0, 6, cpq.b);
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean c() {
         cpq $$0 = (cpq)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cpq $$0 = (cpq)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cgl<bxw> {
      public b(cpq $$0) {
         super($$0, bxw.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cpq)this.e).f && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
