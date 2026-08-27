import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cde extends cbx {
   private static final String b = "Johnny";
   static final Predicate<bjy> e = $$0 -> $$0 == bjy.c || $$0 == bjy.d;
   boolean bT;

   public cde(blz<? extends cde> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btb(this));
      this.bO.a(1, new cde.a(this));
      this.bO.a(2, new cbx.b(this));
      this.bO.a(3, new cgr.a(this, 10.0F));
      this.bO.a(4, new btr(this, 1.0, false));
      this.bP.a(1, new buz(this, cgr.class).a());
      this.bP.a(2, new bva<>(this, cfi.class, true));
      this.bP.a(3, new bva<>(this, ceq.class, true));
      this.bP.a(3, new bva<>(this, byk.class, true));
      this.bP.a(4, new cde.b(this));
      this.bO.a(8, new bue(this, 0.6));
      this.bO.a(9, new btp(this, cfi.class, 3.0F, 1.0F));
      this.bO.a(10, new btp(this, bmn.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fU() && bxe.a(this)) {
         boolean $$0 = ((and)this.dM()).e(this.dm());
         ((bvu)this.N()).b($$0);
      }

      super.Z();
   }

   public static bnq.a w() {
      return ccp.gk().a(bnr.m, 0.35F).a(bnr.g, 12.0).a(bnr.l, 24.0).a(bnr.c, 5.0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cbx.a u() {
      if (this.fW()) {
         return cbx.a.b;
      } else {
         return this.gv() ? cbx.a.g : cbx.a.a;
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
   public arr af_() {
      return ars.Ac;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      bne $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bvu)this.N()).b(true);
      auv $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      if (this.gs() == null) {
         this.a(bma.a, new cmy(cnb.pa));
      }
   }

   @Override
   public boolean s(blv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bml && ((bml)$$0).eS() == bmq.d ? this.cg() == null && $$0.cg() == null : false;
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
   protected arr y() {
      return ars.Ab;
   }

   @Override
   protected arr n_() {
      return ars.Ad;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Ae;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cmy $$2 = new cmy(cnb.pa);
      cgq $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bjy.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<crj, Integer> $$6 = Maps.newHashMap();
         $$6.put(crn.n, $$4);
         crl.a($$6, $$2);
      }

      this.a(bma.a, $$2);
   }

   static class a extends bsr {
      public a(bmn $$0) {
         super($$0, 6, cde.e);
         this.a(EnumSet.of(bth.a.a));
      }

      @Override
      public boolean b() {
         cde $$0 = (cde)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cde $$0 = (cde)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bva<bml> {
      public b(cde $$0) {
         super($$0, bml.class, 0, true, true, bml::fz);
      }

      @Override
      public boolean a() {
         return ((cde)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
