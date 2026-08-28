import com.google.common.collect.Lists;
import java.util.List;

public class crk extends cpi {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cpu t;
   private final cqb u = cqb.a();
   private final dcg v;
   private List<cyl<czg>> w = Lists.newArrayList();
   private cud x = cud.l;
   long y;
   final cre m;
   final cre n;
   Runnable z = () -> {
   };
   public final bqa o = new bqq(1) {
      @Override
      public void e() {
         super.e();
         crk.this.a(this);
         crk.this.z.run();
      }
   };
   final cqz A = new cqz();

   public crk(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public crk(int $$0, cmk $$1, final cpu $$2) {
      super(cqq.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dR();
      this.m = this.a(new cre(this.o, 0, 20, 33));
      this.n = this.a(new cre(this.A, 1, 143, 33) {
         @Override
         public boolean a(cud $$0) {
            return false;
         }

         @Override
         public void a(cml $$0, cud $$1) {
            $$1.a($$0.dR(), $$0, $$1.H());
            crk.this.A.a($$0, this.j());
            cud $$2 = crk.this.m.a(1);
            if (!$$2.e()) {
               crk.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crk.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avh.Av, avi.e, 1.0F, 1.0F);
                  crk.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cud> j() {
            return List.of(crk.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyl<czg>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.t, $$0, dfk.oc);
   }

   @Override
   public boolean a(cml $$0, int $$1) {
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
   public void a(bqa $$0) {
      cud $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private static cyz c(bqa $$0) {
      return new cyz($$0.a(0));
   }

   private void a(bqa $$0, cud $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cud.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyp.f, c($$0), this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyl<czg> $$0 = this.w.get(this.u.b());
         cud $$1 = $$0.b().a(c(this.o), this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cud.l);
         }
      } else {
         this.n.f(cud.l);
      }

      this.d();
   }

   @Override
   public cqq<?> a() {
      return cqq.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cud $$0, cre $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         cty $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dR(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cud.l;
            }
         } else if (this.v.r().a(cyp.f, new cyz($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cud.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cud.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
