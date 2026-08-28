import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class clp extends ckh {
   private static final String b = "Johnny";
   static final Predicate<brm> c = $$0 -> $$0 == brm.c || $$0 == brm.d;
   boolean bY;

   public clp(btv<? extends clp> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new clp.a(this));
      this.bS.a(2, new ckh.b(this));
      this.bS.a(3, new cpj.a(this, 10.0F));
      this.bS.a(4, new cbr(this, 1.0, false));
      this.bT.a(1, new ccz(this, cpj.class).a());
      this.bT.a(2, new cda<>(this, cnu.class, true));
      this.bT.a(3, new cda<>(this, cnc.class, true));
      this.bT.a(3, new cda<>(this, cgm.class, true));
      this.bT.a(4, new clp.b(this));
      this.bS.a(8, new cce(this, 0.6));
      this.bS.a(9, new cbp(this, cnu.class, 3.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
   }

   @Override
   protected void ad() {
      if (!this.ge() && cff.a(this)) {
         boolean $$0 = ((arh)this.dS()).e(this.ds());
         ((cdu)this.P()).b($$0);
      }

      super.ad();
   }

   public static bvq.a t() {
      return cla.gv().a(bvr.v, 0.35F).a(bvr.m, 12.0).a(bvr.s, 24.0).a(bvr.c, 5.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ckh.a q() {
      if (this.gg()) {
         return ckh.a.b;
      } else {
         return this.gI() ? ckh.a.g : ckh.a.a;
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awd ah_() {
      return awe.Bt;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      bvc $$4 = super.a($$0, $$1, $$2, $$3);
      ((cdu)this.P()).b(true);
      azl $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      if (this.gD() == null) {
         this.a(btw.a, new cvp(cvt.pf));
      }
   }

   @Override
   public void b(@Nullable xd $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awd w() {
      return awe.Bs;
   }

   @Override
   protected awd n_() {
      return awe.Bu;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.Bv;
   }

   @Override
   public void a(arh $$0, int $$1, boolean $$2) {
      cvp $$3 = new cvp(cvt.pf);
      cpi $$4 = this.gD();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         alb<dcs> $$6 = $$1 > $$4.a(brm.c) ? dcy.f : dcy.e;
         dbm.a($$3, $$0.F_(), $$6, $$0.d_(this.ds()), this.af);
      }

      this.a(btw.a, $$3);
   }

   static class a extends car {
      public a(bum $$0) {
         super($$0, 6, clp.c);
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean c() {
         clp $$0 = (clp)this.d;
         return $$0.gG() && super.c();
      }

      @Override
      public boolean b() {
         clp $$0 = (clp)this.d;
         return $$0.gG() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends cda<buk> {
      public b(clp $$0) {
         super($$0, buk.class, 0, true, true, buk::fI);
      }

      @Override
      public boolean b() {
         return ((clp)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
