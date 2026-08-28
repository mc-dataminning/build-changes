import com.google.common.collect.Lists;
import java.util.List;

public class cru extends cpt {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqe t;
   private final cql u = cql.a();
   private final dbx v;
   private List<cyw<czo>> w = Lists.newArrayList();
   private cuo x = cuo.l;
   long y;
   final cro m;
   final cro n;
   Runnable z = () -> {
   };
   public final bqm o = new brc(1) {
      @Override
      public void e() {
         super.e();
         cru.this.a(this);
         cru.this.z.run();
      }
   };
   final crj A = new crj();

   public cru(int $$0, cmv $$1) {
      this($$0, $$1, cqe.a);
   }

   public cru(int $$0, cmv $$1, final cqe $$2) {
      super(cra.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new cro(this.o, 0, 20, 33));
      this.n = this.a(new cro(this.A, 1, 143, 33) {
         @Override
         public boolean a(cuo $$0) {
            return false;
         }

         @Override
         public void a(cmw $$0, cuo $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            cru.this.A.a($$0, this.j());
            cuo $$2 = cru.this.m.a(1);
            if (!$$2.e()) {
               cru.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (cru.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avz.As, awa.e, 1.0F, 1.0F);
                  cru.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cuo> j() {
            return List.of(cru.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cro($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cro($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyw<czo>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cmw $$0) {
      return a(this.t, $$0, dfa.oc);
   }

   @Override
   public boolean b(cmw $$0, int $$1) {
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
   public void a(bqm $$0) {
      cuo $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bqm $$0, cuo $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cuo.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyz.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyw<czo> $$0 = this.w.get(this.u.b());
         cuo $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cuo.l);
         }
      } else {
         this.n.f(cuo.l);
      }

      this.d();
   }

   @Override
   public cra<?> a() {
      return cra.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cuo $$0, cro $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cuo a(cmw $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         cuj $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cuo.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cuo.l;
            }
         } else if (this.v.r().a(cyz.f, new brc($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cuo.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cuo.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmw $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
