import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzo extends byh {
   private static final String b = "Johnny";
   static final Predicate<bgl> e = $$0 -> $$0 == bgl.c || $$0 == bgl.d;
   boolean bT;

   public bzo(bik<? extends bzo> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bzo.a(this));
      this.bO.a(2, new byh.b(this));
      this.bO.a(3, new cct.a(this, 10.0F));
      this.bO.a(4, new bzo.c(this));
      this.bP.a(1, new brk(this, cct.class).a());
      this.bP.a(2, new brl<>(this, cbl.class, true));
      this.bP.a(3, new brl<>(this, cat.class, true));
      this.bP.a(3, new brl<>(this, buu.class, true));
      this.bP.a(4, new bzo.b(this));
      this.bO.a(8, new bqp(this, 0.6));
      this.bO.a(9, new bqa(this, cbl.class, 3.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
   }

   @Override
   protected void V() {
      if (!this.fQ() && bto.a(this)) {
         boolean $$0 = ((aki)this.dK()).d(this.dk());
         ((bsf)this.H()).b($$0);
      }

      super.V();
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.d, 0.35F).a(bkd.b, 12.0).a(bkd.a, 24.0).a(bkd.f, 5.0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byh.a p() {
      if (this.fS()) {
         return byh.a.b;
      } else {
         return this.gq() ? byh.a.g : byh.a.a;
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aot Y_() {
      return aou.yX;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      bjq $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsf)this.H()).b(true);
      art $$6 = $$0.y_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      if (this.gn() == null) {
         this.a(bil.a, new ciw(ciz.op));
      }
   }

   @Override
   public boolean s(big $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biw && ((biw)$$0).eQ() == bjb.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable te $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aot r() {
      return aou.yW;
   }

   @Override
   protected aot h_() {
      return aou.yY;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.yZ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ciw $$2 = new ciw(ciz.op);
      ccs $$3 = this.gn();
      int $$4 = 1;
      if ($$0 > $$3.a(bgl.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cnd, Integer> $$6 = Maps.newHashMap();
         $$6.put(cnh.n, $$4);
         cnf.a($$6, $$2);
      }

      this.a(bil.a, $$2);
   }

   static class a extends bpc {
      public a(biy $$0) {
         super($$0, 6, bzo.e);
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean b() {
         bzo $$0 = (bzo)this.d;
         return $$0.go() && super.b();
      }

      @Override
      public boolean a() {
         bzo $$0 = (bzo)this.d;
         return $$0.go() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends brl<biw> {
      public b(bzo $$0) {
         super($$0, biw.class, 0, true, true, biw::fx);
      }

      @Override
      public boolean a() {
         return ((bzo)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }

   class c extends bqc {
      public c(bzo $$0) {
         super($$0, 1.0, false);
      }

      @Override
      protected double a(biw $$0) {
         if (this.a.cY() instanceof bze) {
            float $$1 = this.a.cY().df() - 0.1F;
            return (double)($$1 * 2.0F * $$1 * 2.0F + $$0.df());
         } else {
            return super.a($$0);
         }
      }
   }
}
