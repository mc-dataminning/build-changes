import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cba extends bzt {
   private static final String b = "Johnny";
   static final Predicate<bhy> e = $$0 -> $$0 == bhy.c || $$0 == bhy.d;
   boolean bT;

   public cba(bjx<? extends cba> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new cba.a(this));
      this.bO.a(2, new bzt.b(this));
      this.bO.a(3, new cef.a(this, 10.0F));
      this.bO.a(4, new bro(this, 1.0, false));
      this.bP.a(1, new bsw(this, cef.class).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true));
      this.bP.a(3, new bsx<>(this, ccf.class, true));
      this.bP.a(3, new bsx<>(this, bwg.class, true));
      this.bP.a(4, new cba.b(this));
      this.bO.a(8, new bsb(this, 0.6));
      this.bO.a(9, new brm(this, ccx.class, 3.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 8.0F));
   }

   @Override
   protected void X() {
      if (!this.fU() && bva.a(this)) {
         boolean $$0 = ((alq)this.dL()).d(this.dl());
         ((btr)this.L()).b($$0);
      }

      super.X();
   }

   public static blo.a t() {
      return cal.gk().a(blp.m, 0.35F).a(blp.g, 12.0).a(blp.l, 24.0).a(blp.c, 5.0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public bzt.a s() {
      if (this.fW()) {
         return bzt.a.b;
      } else {
         return this.gv() ? bzt.a.g : bzt.a.a;
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aqc ad_() {
      return aqd.ze;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      blc $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((btr)this.L()).b(true);
      ate $$6 = $$0.E_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      if (this.gs() == null) {
         this.a(bjy.a, new ckj(ckm.op));
      }
   }

   @Override
   public boolean s(bjt $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bkj && ((bkj)$$0).eR() == bko.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable ui $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aqc w() {
      return aqd.zd;
   }

   @Override
   protected aqc m_() {
      return aqd.zf;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.zg;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ckj $$2 = new ckj(ckm.op);
      cee $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bhy.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cot, Integer> $$6 = Maps.newHashMap();
         $$6.put(cox.n, $$4);
         cov.a($$6, $$2);
      }

      this.a(bjy.a, $$2);
   }

   static class a extends bqo {
      public a(bkl $$0) {
         super($$0, 6, cba.e);
         this.a(EnumSet.of(bre.a.a));
      }

      @Override
      public boolean b() {
         cba $$0 = (cba)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         cba $$0 = (cba)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends bsx<bkj> {
      public b(cba $$0) {
         super($$0, bkj.class, 0, true, true, bkj::fz);
      }

      @Override
      public boolean a() {
         return ((cba)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
