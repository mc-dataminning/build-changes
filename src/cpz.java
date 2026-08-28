import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpz extends cor {
   private static final String a = "Johnny";
   static final Predicate<buz> b = $$0 -> $$0 == buz.c || $$0 == buz.d;
   private static final boolean e = false;
   boolean f = false;

   public cpz(bxn<? extends cpz> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cei<>(this, cqo.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new cpz.a(this));
      this.bF.a(3, new cor.b(this));
      this.bF.a(4, new ctz.a(this, 10.0F));
      this.bF.a(5, new cfl(this, 1.0, false));
      this.bG.a(1, new cgt(this, ctz.class).a());
      this.bG.a(2, new cgu<>(this, csi.class, true));
      this.bG.a(3, new cgu<>(this, crp.class, true));
      this.bG.a(3, new cgu<>(this, ckl.class, true));
      this.bG.a(4, new cpz.b(this));
      this.bF.a(8, new cfy(this, 0.6));
      this.bF.a(9, new cfj(this, csi.class, 3.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
   }

   @Override
   protected void a(asb $$0) {
      if (!this.gj() && ciz.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cho)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.v, 0.35F).a(bzl.m, 12.0).a(bzl.s, 24.0).a(bzl.c, 5.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.f) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cor.a j() {
      if (this.gl()) {
         return cor.a.b;
      } else {
         return this.gK() ? cor.a.g : cor.a.a;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.f = $$0.b("Johnny", false);
   }

   @Override
   public awx aj_() {
      return awy.Cr;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      byx $$4 = super.a($$0, $$1, $$2, $$3);
      ((cho)this.O()).b(true);
      bai $$5 = $$0.G_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      if (this.gF() == null) {
         this.a(bxo.a, new dak(dao.pS));
      }
   }

   @Override
   public void b(@Nullable xg $$0) {
      super.b($$0);
      if (!this.f && $$0 != null && $$0.getString().equals("Johnny")) {
         this.f = true;
      }
   }

   @Override
   protected awx u() {
      return awy.Cq;
   }

   @Override
   protected awx l_() {
      return awy.Cs;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.Ct;
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
      dak $$3 = new dak(dao.pS);
      cty $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alq<dif> $$6 = $$1 > $$4.a(buz.c) ? dil.f : dil.e;
         dgz.a($$3, $$0.J_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bxo.a, $$3);
   }

   static class a extends cel {
      public a(byh $$0) {
         super($$0, 6, cpz.b);
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean c() {
         cpz $$0 = (cpz)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cpz $$0 = (cpz)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cgu<byf> {
      public b(cpz $$0) {
         super($$0, byf.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cpz)this.e).f && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
