import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chv extends cgn {
   private static final String b = "Johnny";
   static final Predicate<boc> e = $$0 -> $$0 == boc.c || $$0 == boc.d;
   boolean bX;

   public chv(bqg<? extends chv> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new chv.a(this));
      this.bR.a(2, new cgn.b(this));
      this.bR.a(3, new clm.a(this, 10.0F));
      this.bR.a(4, new bya(this, 1.0, false));
      this.bS.a(1, new bzi(this, clm.class).a());
      this.bS.a(2, new bzj<>(this, cka.class, true));
      this.bS.a(3, new bzj<>(this, cji.class, true));
      this.bS.a(3, new bzj<>(this, ccu.class, true));
      this.bS.a(4, new chv.b(this));
      this.bR.a(8, new byn(this, 0.6));
      this.bR.a(9, new bxy(this, cka.class, 3.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 8.0F));
   }

   @Override
   protected void Y() {
      if (!this.gd() && cbo.a(this)) {
         boolean $$0 = ((apu)this.dM()).e(this.dm());
         ((cad)this.K()).b($$0);
      }

      super.Y();
   }

   public static brz.a u() {
      return chg.gt().a(bsa.r, 0.35F).a(bsa.k, 12.0).a(bsa.q, 24.0).a(bsa.c, 5.0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      if (this.bX) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cgn.a r() {
      if (this.gf()) {
         return cgn.a.b;
      } else {
         return this.gE() ? cgn.a.g : cgn.a.a;
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bX = $$0.q("Johnny");
      }
   }

   @Override
   public aun ae_() {
      return auo.AQ;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      brl $$4 = super.a($$0, $$1, $$2, $$3);
      ((cad)this.K()).b(true);
      axt $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      if (this.gB() == null) {
         this.a(bqh.a, new crs(crv.pc));
      }
   }

   @Override
   public void b(@Nullable wi $$0) {
      super.b($$0);
      if (!this.bX && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bX = true;
      }
   }

   @Override
   protected aun v() {
      return auo.AP;
   }

   @Override
   protected aun o_() {
      return auo.AR;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.AS;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      crs $$2 = new crs(crv.pc);
      cll $$3 = this.gB();
      int $$4 = 1;
      if ($$0 > $$3.a(boc.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.v();
      if ($$5) {
         $$2.a(cxc.n, $$4);
      }

      this.a(bqh.a, $$2);
   }

   static class a extends bxa {
      public a(bqv $$0) {
         super($$0, 6, chv.e);
         this.a(EnumSet.of(bxq.a.a));
      }

      @Override
      public boolean b() {
         chv $$0 = (chv)this.d;
         return $$0.gC() && super.b();
      }

      @Override
      public boolean a() {
         chv $$0 = (chv)this.d;
         return $$0.gC() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bzj<bqt> {
      public b(chv $$0) {
         super($$0, bqt.class, 0, true, true, bqt::fE);
      }

      @Override
      public boolean a() {
         return ((chv)this.e).bX && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
