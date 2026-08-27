import com.google.common.collect.Lists;
import java.util.List;

public class cqw extends cov {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cpg t;
   private final cpn u = cpn.a();
   private final daz v;
   private List<cxy<cyq>> w = Lists.newArrayList();
   private ctq x = ctq.i;
   long y;
   final cqq m;
   final cqq n;
   Runnable z = () -> {
   };
   public final bpp o = new bqf(1) {
      @Override
      public void e() {
         super.e();
         cqw.this.a(this);
         cqw.this.z.run();
      }
   };
   final cql A = new cql();

   public cqw(int $$0, clx $$1) {
      this($$0, $$1, cpg.a);
   }

   public cqw(int $$0, clx $$1, final cpg $$2) {
      super(cqc.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new cqq(this.o, 0, 20, 33));
      this.n = this.a(new cqq(this.A, 1, 143, 33) {
         @Override
         public boolean a(ctq $$0) {
            return false;
         }

         @Override
         public void a(cly $$0, ctq $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            cqw.this.A.a($$0, this.j());
            ctq $$2 = cqw.this.m.a(1);
            if (!$$2.e()) {
               cqw.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Y();
               if (cqw.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avi.As, avj.e, 1.0F, 1.0F);
                  cqw.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<ctq> j() {
            return List.of(cqw.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqq($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cxy<cyq>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.t, $$0, dec.oc);
   }

   @Override
   public boolean b(cly $$0, int $$1) {
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
   public void a(bpp $$0) {
      ctq $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bpp $$0, ctq $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(ctq.i);
      if (!$$1.e()) {
         this.w = this.v.r().b(cyb.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cxy<cyq> $$0 = this.w.get(this.u.b());
         ctq $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(ctq.i);
         }
      } else {
         this.n.f(ctq.i);
      }

      this.d();
   }

   @Override
   public cqc<?> a() {
      return cqc.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(ctq $$0, cqq $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         ctl $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return ctq.i;
            }
         } else if (this.v.r().a(cyb.f, new bqf($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
