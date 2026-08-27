import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccc extends cav {
   private static final String b = "Johnny";
   static final Predicate<biy> e = $$0 -> $$0 == biy.c || $$0 == biy.d;
   boolean bT;

   public ccc(bkz<? extends ccc> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new ccc.a(this));
      this.bO.a(2, new cav.b(this));
      this.bO.a(3, new cfh.a(this, 10.0F));
      this.bO.a(4, new bsq(this, 1.0, false));
      this.bP.a(1, new bty(this, cfh.class).a());
      this.bP.a(2, new btz<>(this, cdz.class, true));
      this.bP.a(3, new btz<>(this, cdh.class, true));
      this.bP.a(3, new btz<>(this, bxi.class, true));
      this.bP.a(4, new ccc.b(this));
      this.bO.a(8, new btd(this, 0.6));
      this.bO.a(9, new bso(this, cdz.class, 3.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fV() && bwc.a(this)) {
         boolean $$0 = ((ami)this.dN()).d(this.dn());
         ((but)this.N()).b($$0);
      }

      super.Z();
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.m, 0.35F).a(bmr.g, 12.0).a(bmr.l, 24.0).a(bmr.c, 5.0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cav.a u() {
      if (this.fX()) {
         return cav.a.b;
      } else {
         return this.gw() ? cav.a.g : cav.a.a;
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aqu af_() {
      return aqv.zH;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      bme $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((but)this.N()).b(true);
      atw $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      if (this.gt() == null) {
         this.a(bla.a, new clo(clr.pa));
      }
   }

   @Override
   public boolean s(bkv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bll && ((bll)$$0).eT() == blq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable uv $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aqu y() {
      return aqv.zG;
   }

   @Override
   protected aqu n_() {
      return aqv.zI;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.zJ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      clo $$2 = new clo(clr.pa);
      cfg $$3 = this.gt();
      int $$4 = 1;
      if ($$0 > $$3.a(biy.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cpz, Integer> $$6 = Maps.newHashMap();
         $$6.put(cqd.n, $$4);
         cqb.a($$6, $$2);
      }

      this.a(bla.a, $$2);
   }

   static class a extends brq {
      public a(bln $$0) {
         super($$0, 6, ccc.e);
         this.a(EnumSet.of(bsg.a.a));
      }

      @Override
      public boolean b() {
         ccc $$0 = (ccc)this.d;
         return $$0.gu() && super.b();
      }

      @Override
      public boolean a() {
         ccc $$0 = (ccc)this.d;
         return $$0.gu() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends btz<bll> {
      public b(ccc $$0) {
         super($$0, bll.class, 0, true, true, bll::fA);
      }

      @Override
      public boolean a() {
         return ((ccc)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
