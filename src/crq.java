import com.google.common.collect.Lists;
import java.util.List;

public class crq extends cpp {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqa t;
   private final cqh u = cqh.a();
   private final dbt v;
   private List<cys<czk>> w = Lists.newArrayList();
   private cuk x = cuk.l;
   long y;
   final crk m;
   final crk n;
   Runnable z = () -> {
   };
   public final bqi o = new bqy(1) {
      @Override
      public void e() {
         super.e();
         crq.this.a(this);
         crq.this.z.run();
      }
   };
   final crf A = new crf();

   public crq(int $$0, cmr $$1) {
      this($$0, $$1, cqa.a);
   }

   public crq(int $$0, cmr $$1, final cqa $$2) {
      super(cqw.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new crk(this.o, 0, 20, 33));
      this.n = this.a(new crk(this.A, 1, 143, 33) {
         @Override
         public boolean a(cuk $$0) {
            return false;
         }

         @Override
         public void a(cms $$0, cuk $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            crq.this.A.a($$0, this.j());
            cuk $$2 = crq.this.m.a(1);
            if (!$$2.e()) {
               crq.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crq.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avw.As, avx.e, 1.0F, 1.0F);
                  crq.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cuk> j() {
            return List.of(crq.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crk($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crk($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cys<czk>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cms $$0) {
      return a(this.t, $$0, dew.oc);
   }

   @Override
   public boolean b(cms $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(bqi $$0) {
      cuk $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bqi $$0, cuk $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cuk.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyv.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cys<czk> $$0 = this.w.get(this.u.b());
         cuk $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cuk.l);
         }
      } else {
         this.n.f(cuk.l);
      }

      this.d();
   }

   @Override
   public cqw<?> a() {
      return cqw.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cuk $$0, crk $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         cuf $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cuk.l;
            }
         } else if (this.v.r().a(cyv.f, new bqy($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cuk.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cuk.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
