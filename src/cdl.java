import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdl extends cce {
   private static final String b = "Johnny";
   static final Predicate<bjz> e = $$0 -> $$0 == bjz.c || $$0 == bjz.d;
   boolean bU;

   public cdl(bmc<? extends cdl> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(1, new cdl.a(this));
      this.bP.a(2, new cce.b(this));
      this.bP.a(3, new cgz.a(this, 10.0F));
      this.bP.a(4, new btu(this, 1.0, false));
      this.bQ.a(1, new bvc(this, cgz.class).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
      this.bQ.a(3, new bvd<>(this, cey.class, true));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
      this.bQ.a(4, new cdl.b(this));
      this.bP.a(8, new buh(this, 0.6));
      this.bP.a(9, new bts(this, cfq.class, 3.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 8.0F));
   }

   @Override
   protected void aa() {
      if (!this.fV() && bxi.a(this)) {
         boolean $$0 = ((ane)this.dL()).e(this.dl());
         ((bvx)this.N()).b($$0);
      }

      super.aa();
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.o, 0.35F).a(bnu.i, 12.0).a(bnu.n, 24.0).a(bnu.c, 5.0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      if (this.bU) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cce.a u() {
      if (this.fX()) {
         return cce.a.b;
      } else {
         return this.gw() ? cce.a.g : cce.a.a;
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bU = $$0.q("Johnny");
      }
   }

   @Override
   public ars ag_() {
      return art.Ar;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      bnh $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bvx)this.N()).b(true);
      auw $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      if (this.gt() == null) {
         this.a(bmd.a, new cng(cnj.pc));
      }
   }

   @Override
   public boolean r(blw $$0) {
      if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof bmo && ((bmo)$$0).eS() == bmt.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable vg $$0) {
      super.b($$0);
      if (!this.bU && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bU = true;
      }
   }

   @Override
   protected ars y() {
      return art.Aq;
   }

   @Override
   protected ars n_() {
      return art.As;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.At;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cng $$2 = new cng(cnj.pc);
      cgy $$3 = this.gt();
      int $$4 = 1;
      if ($$0 > $$3.a(bjz.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<crr, Integer> $$6 = Maps.newHashMap();
         $$6.put(crv.n, $$4);
         crt.a($$6, $$2);
      }

      this.a(bmd.a, $$2);
   }

   static class a extends bsu {
      public a(bmq $$0) {
         super($$0, 6, cdl.e);
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean b() {
         cdl $$0 = (cdl)this.d;
         return $$0.gu() && super.b();
      }

      @Override
      public boolean a() {
         cdl $$0 = (cdl)this.d;
         return $$0.gu() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bvd<bmo> {
      public b(cdl $$0) {
         super($$0, bmo.class, 0, true, true, bmo::fz);
      }

      @Override
      public boolean a() {
         return ((cdl)this.e).bU && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
