import com.google.common.collect.Lists;
import java.util.List;

public class crj extends cph {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cpt t;
   private final cqa u = cqa.a();
   private final dcf v;
   private List<cyk<czf>> w = Lists.newArrayList();
   private cuc x = cuc.l;
   long y;
   final crd m;
   final crd n;
   Runnable z = () -> {
   };
   public final bpz o = new bqp(1) {
      @Override
      public void e() {
         super.e();
         crj.this.a(this);
         crj.this.z.run();
      }
   };
   final cqy A = new cqy();

   public crj(int $$0, cmj $$1) {
      this($$0, $$1, cpt.a);
   }

   public crj(int $$0, cmj $$1, final cpt $$2) {
      super(cqp.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dQ();
      this.m = this.a(new crd(this.o, 0, 20, 33));
      this.n = this.a(new crd(this.A, 1, 143, 33) {
         @Override
         public boolean a(cuc $$0) {
            return false;
         }

         @Override
         public void a(cmk $$0, cuc $$1) {
            $$1.a($$0.dQ(), $$0, $$1.H());
            crj.this.A.a($$0, this.j());
            cuc $$2 = crj.this.m.a(1);
            if (!$$2.e()) {
               crj.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crj.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avh.Av, avi.e, 1.0F, 1.0F);
                  crj.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cuc> j() {
            return List.of(crj.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crd($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crd($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyk<czf>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean b(cmk $$0) {
      return a(this.t, $$0, dfj.oc);
   }

   @Override
   public boolean a(cmk $$0, int $$1) {
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
   public void a(bpz $$0) {
      cuc $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private static cyy c(bpz $$0) {
      return new cyy($$0.a(0));
   }

   private void a(bpz $$0, cuc $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cuc.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyo.f, c($$0), this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyk<czf> $$0 = this.w.get(this.u.b());
         cuc $$1 = $$0.b().a(c(this.o), this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cuc.l);
         }
      } else {
         this.n.f(cuc.l);
      }

      this.d();
   }

   @Override
   public cqp<?> a() {
      return cqp.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cuc $$0, crd $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         ctx $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dQ(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cuc.l;
            }
         } else if (this.v.r().a(cyo.f, new cyy($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
