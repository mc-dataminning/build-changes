import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cot extends cnk {
   private static final String a = "Johnny";
   static final Predicate<bua> b = $$0 -> $$0 == bua.c || $$0 == bua.d;
   boolean bG;

   public cot(bwo<? extends cot> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cdh<>(this, cpi.class, 8.0F, 1.0, 1.2));
      this.bD.a(2, new cot.a(this));
      this.bD.a(3, new cnk.b(this));
      this.bD.a(4, new cst.a(this, 10.0F));
      this.bD.a(5, new cek(this, 1.0, false));
      this.bE.a(1, new cfs(this, cst.class).a());
      this.bE.a(2, new cft<>(this, crc.class, true));
      this.bE.a(3, new cft<>(this, cqj.class, true));
      this.bE.a(3, new cft<>(this, cjk.class, true));
      this.bE.a(4, new cot.b(this));
      this.bD.a(8, new cex(this, 0.6));
      this.bD.a(9, new cei(this, crc.class, 3.0F, 1.0F));
      this.bD.a(10, new cei(this, bxg.class, 8.0F));
   }

   @Override
   protected void a(arq $$0) {
      if (!this.gg() && chy.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cgn)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static byj.a m() {
      return cod.gu().a(byk.v, 0.35F).a(byk.m, 12.0).a(byk.s, 24.0).a(byk.c, 5.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.bG) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cnk.a j() {
      if (this.gi()) {
         return cnk.a.b;
      } else {
         return this.gH() ? cnk.a.g : cnk.a.a;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bG = $$0.q("Johnny");
      }
   }

   @Override
   public awm ae_() {
      return awn.Cr;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      bxw $$4 = super.a($$0, $$1, $$2, $$3);
      ((cgn)this.O()).b(true);
      azv $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      if (this.gC() == null) {
         this.a(bwp.a, new czd(czh.pS));
      }
   }

   @Override
   public void b(@Nullable wy $$0) {
      super.b($$0);
      if (!this.bG && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bG = true;
      }
   }

   @Override
   protected awm u() {
      return awn.Cq;
   }

   @Override
   protected awm l_() {
      return awn.Cs;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.Ct;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      czd $$3 = new czd(czh.pS);
      css $$4 = this.gC();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alf<dgy> $$6 = $$1 > $$4.a(bua.c) ? dhe.f : dhe.e;
         dfs.a($$3, $$0.F_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bwp.a, $$3);
   }

   static class a extends cdk {
      public a(bxg $$0) {
         super($$0, 6, cot.b);
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean c() {
         cot $$0 = (cot)this.d;
         return $$0.gF() && super.c();
      }

      @Override
      public boolean b() {
         cot $$0 = (cot)this.d;
         return $$0.gF() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cft<bxe> {
      public b(cot $$0) {
         super($$0, bxe.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cot)this.e).bG && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
