import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzq extends byj {
   private static final String b = "Johnny";
   static final Predicate<bgn> e = $$0 -> $$0 == bgn.c || $$0 == bgn.d;
   boolean bT;

   public bzq(bim<? extends bzq> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bzq.a(this));
      this.bO.a(2, new byj.b(this));
      this.bO.a(3, new ccv.a(this, 10.0F));
      this.bO.a(4, new bzq.c(this));
      this.bP.a(1, new brm(this, ccv.class).a());
      this.bP.a(2, new brn<>(this, cbn.class, true));
      this.bP.a(3, new brn<>(this, cav.class, true));
      this.bP.a(3, new brn<>(this, buw.class, true));
      this.bP.a(4, new bzq.b(this));
      this.bO.a(8, new bqr(this, 0.6));
      this.bO.a(9, new bqc(this, cbn.class, 3.0F, 1.0F));
      this.bO.a(10, new bqc(this, bja.class, 8.0F));
   }

   @Override
   protected void V() {
      if (!this.fQ() && btq.a(this)) {
         boolean $$0 = ((akk)this.dK()).d(this.dk());
         ((bsh)this.H()).b($$0);
      }

      super.V();
   }

   public static bke.a q() {
      return bzb.gf().a(bkf.d, 0.35F).a(bkf.b, 12.0).a(bkf.a, 24.0).a(bkf.f, 5.0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public byj.a p() {
      if (this.fS()) {
         return byj.a.b;
      } else {
         return this.gq() ? byj.a.g : byj.a.a;
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aov Y_() {
      return aow.yX;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      bjs $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsh)this.H()).b(true);
      aru $$6 = $$0.y_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      if (this.gn() == null) {
         this.a(bin.a, new ciy(cjb.op));
      }
   }

   @Override
   public boolean s(bii $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biy && ((biy)$$0).eQ() == bjd.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable tf $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aov r() {
      return aow.yW;
   }

   @Override
   protected aov h_() {
      return aow.yY;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yZ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ciy $$2 = new ciy(cjb.op);
      ccu $$3 = this.gn();
      int $$4 = 1;
      if ($$0 > $$3.a(bgn.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cnf, Integer> $$6 = Maps.newHashMap();
         $$6.put(cnj.n, $$4);
         cnh.a($$6, $$2);
      }

      this.a(bin.a, $$2);
   }

   static class a extends bpe {
      public a(bja $$0) {
         super($$0, 6, bzq.e);
         this.a(EnumSet.of(bpu.a.a));
      }

      @Override
      public boolean b() {
         bzq $$0 = (bzq)this.d;
         return $$0.go() && super.b();
      }

      @Override
      public boolean a() {
         bzq $$0 = (bzq)this.d;
         return $$0.go() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends brn<biy> {
      public b(bzq $$0) {
         super($$0, biy.class, 0, true, true, biy::fx);
      }

      @Override
      public boolean a() {
         return ((bzq)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }

   class c extends bqe {
      public c(bzq $$0) {
         super($$0, 1.0, false);
      }

      @Override
      protected double a(biy $$0) {
         if (this.a.cY() instanceof bzg) {
            float $$1 = this.a.cY().df() - 0.1F;
            return (double)($$1 * 2.0F * $$1 * 2.0F + $$0.df());
         } else {
            return super.a($$0);
         }
      }
   }
}
