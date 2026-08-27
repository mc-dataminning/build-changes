import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cig extends cgy {
   private static final String b = "Johnny";
   static final Predicate<bon> e = $$0 -> $$0 == bon.c || $$0 == bon.d;
   boolean bY;

   public cig(bqr<? extends cig> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new cig.a(this));
      this.bS.a(2, new cgy.b(this));
      this.bS.a(3, new clx.a(this, 10.0F));
      this.bS.a(4, new byl(this, 1.0, false));
      this.bT.a(1, new bzt(this, clx.class).a());
      this.bT.a(2, new bzu<>(this, ckl.class, true));
      this.bT.a(3, new bzu<>(this, cjt.class, true));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
      this.bT.a(4, new cig.b(this));
      this.bS.a(8, new byy(this, 0.6));
      this.bS.a(9, new byj(this, ckl.class, 3.0F, 1.0F));
      this.bS.a(10, new byj(this, brg.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gf() && cbz.a(this)) {
         boolean $$0 = ((aqe)this.dN()).e(this.dn());
         ((cao)this.K()).b($$0);
      }

      super.Y();
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.r, 0.35F).a(bsl.k, 12.0).a(bsl.q, 24.0).a(bsl.c, 5.0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cgy.a r() {
      if (this.gh()) {
         return cgy.a.b;
      } else {
         return this.gG() ? cgy.a.g : cgy.a.a;
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public auy ae_() {
      return auz.AX;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      brw $$4 = super.a($$0, $$1, $$2, $$3);
      ((cao)this.K()).b(true);
      ayd $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      if (this.gD() == null) {
         this.a(bqs.a, new csd(csg.pd));
      }
   }

   @Override
   public void b(@Nullable ws $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected auy v() {
      return auz.AW;
   }

   @Override
   protected auy o_() {
      return auz.AY;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.AZ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      csd $$2 = new csd(csg.pd);
      clw $$3 = this.gD();
      int $$4 = 1;
      if ($$0 > $$3.a(bon.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ah.i() <= $$3.v();
      if ($$5) {
         $$2.a(cxq.n, $$4);
      }

      this.a(bqs.a, $$2);
   }

   static class a extends bxl {
      public a(brg $$0) {
         super($$0, 6, cig.e);
         this.a(EnumSet.of(byb.a.a));
      }

      @Override
      public boolean b() {
         cig $$0 = (cig)this.d;
         return $$0.gE() && super.b();
      }

      @Override
      public boolean a() {
         cig $$0 = (cig)this.d;
         return $$0.gE() && $$0.ah.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bzu<bre> {
      public b(cig $$0) {
         super($$0, bre.class, 0, true, true, bre::fF);
      }

      @Override
      public boolean a() {
         return ((cig)this.e).bY && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
