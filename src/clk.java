import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clk extends ckc {
   private static final String b = "Johnny";
   static final Predicate<brh> c = $$0 -> $$0 == brh.c || $$0 == brh.d;
   boolean bZ;

   public clk(btq<? extends clk> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(1, new clk.a(this));
      this.bT.a(2, new ckc.b(this));
      this.bT.a(3, new cpd.a(this, 10.0F));
      this.bT.a(4, new cbm(this, 1.0, false));
      this.bU.a(1, new ccu(this, cpd.class).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true));
      this.bU.a(3, new ccv<>(this, cmx.class, true));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
      this.bU.a(4, new clk.b(this));
      this.bT.a(8, new cbz(this, 0.6));
      this.bT.a(9, new cbk(this, cnp.class, 3.0F, 1.0F));
      this.bT.a(10, new cbk(this, buh.class, 8.0F));
   }

   @Override
   protected void ad() {
      if (!this.gd() && cfa.a(this)) {
         boolean $$0 = ((arg)this.dS()).e(this.ds());
         ((cdp)this.P()).b($$0);
      }

      super.ad();
   }

   public static bvl.a t() {
      return ckv.gu().a(bvm.v, 0.35F).a(bvm.m, 12.0).a(bvm.s, 24.0).a(bvm.c, 5.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.bZ) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ckc.a q() {
      if (this.gf()) {
         return ckc.a.b;
      } else {
         return this.gH() ? ckc.a.g : ckc.a.a;
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bZ = $$0.q("Johnny");
      }
   }

   @Override
   public awc ah_() {
      return awd.Bt;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      bux $$4 = super.a($$0, $$1, $$2, $$3);
      ((cdp)this.P()).b(true);
      azk $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      if (this.gC() == null) {
         this.a(btr.a, new cvl(cvo.pf));
      }
   }

   @Override
   public void b(@Nullable xd $$0) {
      super.b($$0);
      if (!this.bZ && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bZ = true;
      }
   }

   @Override
   protected awc w() {
      return awd.Bs;
   }

   @Override
   protected awc n_() {
      return awd.Bu;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.Bv;
   }

   @Override
   public void a(arg $$0, int $$1, boolean $$2) {
      cvl $$3 = new cvl(cvo.pf);
      cpc $$4 = this.gC();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         ala<dce> $$6 = $$1 > $$4.a(brh.c) ? dck.f : dck.e;
         day.a($$3, $$0.F_(), $$6, $$0.d_(this.ds()), this.af);
      }

      this.a(btr.a, $$3);
   }

   static class a extends cam {
      public a(buh $$0) {
         super($$0, 6, clk.c);
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean c() {
         clk $$0 = (clk)this.d;
         return $$0.gF() && super.c();
      }

      @Override
      public boolean b() {
         clk $$0 = (clk)this.d;
         return $$0.gF() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends ccv<buf> {
      public b(clk $$0) {
         super($$0, buf.class, 0, true, true, buf::fH);
      }

      @Override
      public boolean b() {
         return ((clk)this.e).bZ && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
