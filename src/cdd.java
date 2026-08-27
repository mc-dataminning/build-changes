import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdd extends cbw {
   private static final String b = "Johnny";
   static final Predicate<bjx> e = $$0 -> $$0 == bjx.c || $$0 == bjx.d;
   boolean bT;

   public cdd(bly<? extends cdd> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(1, new cdd.a(this));
      this.bO.a(2, new cbw.b(this));
      this.bO.a(3, new cgq.a(this, 10.0F));
      this.bO.a(4, new btq(this, 1.0, false));
      this.bP.a(1, new buy(this, cgq.class).a());
      this.bP.a(2, new buz<>(this, cfh.class, true));
      this.bP.a(3, new buz<>(this, cep.class, true));
      this.bP.a(3, new buz<>(this, byj.class, true));
      this.bP.a(4, new cdd.b(this));
      this.bO.a(8, new bud(this, 0.6));
      this.bO.a(9, new bto(this, cfh.class, 3.0F, 1.0F));
      this.bO.a(10, new bto(this, bmm.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fU() && bxd.a(this)) {
         boolean $$0 = ((and)this.dM()).e(this.dm());
         ((bvt)this.N()).b($$0);
      }

      super.Z();
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.m, 0.35F).a(bnq.g, 12.0).a(bnq.l, 24.0).a(bnq.c, 5.0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cbw.a u() {
      if (this.fW()) {
         return cbw.a.b;
      } else {
         return this.gv() ? cbw.a.g : cbw.a.a;
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public arq af_() {
      return arr.Ac;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      bnd $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bvt)this.N()).b(true);
      auu $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      if (this.gs() == null) {
         this.a(blz.a, new cmx(cna.pa));
      }
   }

   @Override
   public boolean s(blu $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmk && ((bmk)$$0).eS() == bmp.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable vf $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected arq y() {
      return arr.Ab;
   }

   @Override
   protected arq n_() {
      return arr.Ad;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.Ae;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cmx $$2 = new cmx(cna.pa);
      cgp $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bjx.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cri, Integer> $$6 = Maps.newHashMap();
         $$6.put(crm.n, $$4);
         crk.a($$6, $$2);
      }

      this.a(blz.a, $$2);
   }

   static class a extends bsq {
      public a(bmm $$0) {
         super($$0, 6, cdd.e);
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean b() {
         cdd $$0 = (cdd)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cdd $$0 = (cdd)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends buz<bmk> {
      public b(cdd $$0) {
         super($$0, bmk.class, 0, true, true, bmk::fz);
      }

      @Override
      public boolean a() {
         return ((cdd)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
