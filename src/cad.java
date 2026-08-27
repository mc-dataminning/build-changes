import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cad extends byw {
   private static final String b = "Johnny";
   static final Predicate<bhb> e = $$0 -> $$0 == bhb.c || $$0 == bhb.d;
   boolean bT;

   public cad(bja<? extends cad> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new cad.a(this));
      this.bO.a(2, new byw.b(this));
      this.bO.a(3, new cdi.a(this, 10.0F));
      this.bO.a(4, new bqr(this, 1.0, false));
      this.bP.a(1, new brz(this, cdi.class).a());
      this.bP.a(2, new bsa<>(this, cca.class, true));
      this.bP.a(3, new bsa<>(this, cbi.class, true));
      this.bP.a(3, new bsa<>(this, bvj.class, true));
      this.bP.a(4, new cad.b(this));
      this.bO.a(8, new bre(this, 0.6));
      this.bO.a(9, new bqp(this, cca.class, 3.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 8.0F));
   }

   @Override
   protected void X() {
      if (!this.fU() && bud.a(this)) {
         boolean $$0 = ((akt)this.dL()).d(this.dl());
         ((bsu)this.L()).b($$0);
      }

      super.X();
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.m, 0.35F).a(bks.g, 12.0).a(bks.l, 24.0).a(bks.c, 5.0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byw.a s() {
      if (this.fW()) {
         return byw.a.b;
      } else {
         return this.gv() ? byw.a.g : byw.a.a;
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public apf ac_() {
      return apg.zc;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      bkf $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsu)this.L()).b(true);
      ash $$6 = $$0.D_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      if (this.gs() == null) {
         this.a(bjb.a, new cjl(cjo.op));
      }
   }

   @Override
   public boolean s(biw $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjm && ((bjm)$$0).eR() == bjr.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable tl $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected apf w() {
      return apg.zb;
   }

   @Override
   protected apf l_() {
      return apg.zd;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.ze;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cjl $$2 = new cjl(cjo.op);
      cdh $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bhb.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cnu, Integer> $$6 = Maps.newHashMap();
         $$6.put(cny.n, $$4);
         cnw.a($$6, $$2);
      }

      this.a(bjb.a, $$2);
   }

   static class a extends bpr {
      public a(bjo $$0) {
         super($$0, 6, cad.e);
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean b() {
         cad $$0 = (cad)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cad $$0 = (cad)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bsa<bjm> {
      public b(cad $$0) {
         super($$0, bjm.class, 0, true, true, bjm::fz);
      }

      @Override
      public boolean a() {
         return ((cad)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
