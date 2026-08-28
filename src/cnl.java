import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnl extends cmd {
   private static final String a = "Johnny";
   static final Predicate<btf> b = $$0 -> $$0 == btf.c || $$0 == btf.d;
   boolean bZ;

   public cnl(bvq<? extends cnl> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cck<>(this, coa.class, 8.0F, 1.0, 1.2));
      this.bT.a(2, new cnl.a(this));
      this.bT.a(3, new cmd.b(this));
      this.bT.a(4, new crk.a(this, 10.0F));
      this.bT.a(5, new cdn(this, 1.0, false));
      this.bU.a(1, new cev(this, crk.class).a());
      this.bU.a(2, new cew<>(this, cpw.class, true));
      this.bU.a(3, new cew<>(this, cpd.class, true));
      this.bU.a(3, new cew<>(this, cii.class, true));
      this.bU.a(4, new cnl.b(this));
      this.bT.a(8, new cea(this, 0.6));
      this.bT.a(9, new cdl(this, cpw.class, 3.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
   }

   @Override
   protected void a(ash $$0) {
      if (!this.gb() && chb.a(this)) {
         boolean $$1 = $$0.e(this.dw());
         ((cfq)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bxm.a p() {
      return cmw.gt().a(bxn.v, 0.35F).a(bxn.m, 12.0).a(bxn.s, 24.0).a(bxn.c, 5.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.bZ) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cmd.a m() {
      if (this.gd()) {
         return cmd.a.b;
      } else {
         return this.gG() ? cmd.a.g : cmd.a.a;
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bZ = $$0.q("Johnny");
      }
   }

   @Override
   public axe ak_() {
      return axf.BM;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bwy $$4 = super.a($$0, $$1, $$2, $$3);
      ((cfq)this.L()).b(true);
      bam $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      if (this.gB() == null) {
         this.a(bvr.a, new cxo(cxs.pA));
      }
   }

   @Override
   public void b(@Nullable xv $$0) {
      super.b($$0);
      if (!this.bZ && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bZ = true;
      }
   }

   @Override
   protected axe u() {
      return axf.BL;
   }

   @Override
   protected axe o_() {
      return axf.BN;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.BO;
   }

   @Override
   public void a(ash $$0, int $$1, boolean $$2) {
      cxo $$3 = new cxo(cxs.pA);
      crj $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aly<dfg> $$6 = $$1 > $$4.a(btf.c) ? dfm.f : dfm.e;
         dea.a($$3, $$0.K_(), $$6, $$0.d_(this.dw()), this.ae);
      }

      this.a(bvr.a, $$3);
   }

   static class a extends ccn {
      public a(bwh $$0) {
         super($$0, 6, cnl.b);
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean c() {
         cnl $$0 = (cnl)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         cnl $$0 = (cnl)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cew<bwf> {
      public b(cnl $$0) {
         super($$0, bwf.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cnl)this.e).bZ && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
