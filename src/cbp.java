import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbp extends cai {
   private static final String b = "Johnny";
   static final Predicate<bin> e = $$0 -> $$0 == bin.c || $$0 == bin.d;
   boolean bT;

   public cbp(bkm<? extends cbp> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(1, new cbp.a(this));
      this.bO.a(2, new cai.b(this));
      this.bO.a(3, new ceu.a(this, 10.0F));
      this.bO.a(4, new bsd(this, 1.0, false));
      this.bP.a(1, new btl(this, ceu.class).a());
      this.bP.a(2, new btm<>(this, cdm.class, true));
      this.bP.a(3, new btm<>(this, ccu.class, true));
      this.bP.a(3, new btm<>(this, bwv.class, true));
      this.bP.a(4, new cbp.b(this));
      this.bO.a(8, new bsq(this, 0.6));
      this.bO.a(9, new bsb(this, cdm.class, 3.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
   }

   @Override
   protected void X() {
      if (!this.fU() && bvp.a(this)) {
         boolean $$0 = ((ama)this.dL()).d(this.dl());
         ((bug)this.L()).b($$0);
      }

      super.X();
   }

   public static bmd.a t() {
      return cba.gk().a(bme.m, 0.35F).a(bme.g, 12.0).a(bme.l, 24.0).a(bme.c, 5.0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cai.a s() {
      if (this.fW()) {
         return cai.a.b;
      } else {
         return this.gv() ? cai.a.g : cai.a.a;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aqm ad_() {
      return aqn.zg;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      blr $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bug)this.L()).b(true);
      ato $$6 = $$0.E_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      if (this.gs() == null) {
         this.a(bkn.a, new clb(cle.op));
      }
   }

   @Override
   public boolean s(bki $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bky && ((bky)$$0).eR() == bld.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable ur $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aqm w() {
      return aqn.zf;
   }

   @Override
   protected aqm m_() {
      return aqn.zh;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.zi;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      clb $$2 = new clb(cle.op);
      cet $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bin.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cpm, Integer> $$6 = Maps.newHashMap();
         $$6.put(cpq.n, $$4);
         cpo.a($$6, $$2);
      }

      this.a(bkn.a, $$2);
   }

   static class a extends brd {
      public a(bla $$0) {
         super($$0, 6, cbp.e);
         this.a(EnumSet.of(brt.a.a));
      }

      @Override
      public boolean b() {
         cbp $$0 = (cbp)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cbp $$0 = (cbp)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends btm<bky> {
      public b(cbp $$0) {
         super($$0, bky.class, 0, true, true, bky::fz);
      }

      @Override
      public boolean a() {
         return ((cbp)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
