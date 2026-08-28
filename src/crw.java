import com.google.common.collect.Lists;
import java.util.List;

public class crw extends cpv {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqg t;
   private final cqn u = cqn.a();
   private final dbz v;
   private List<cyy<czq>> w = Lists.newArrayList();
   private cuq x = cuq.l;
   long y;
   final crq m;
   final crq n;
   Runnable z = () -> {
   };
   public final bqo o = new bre(1) {
      @Override
      public void e() {
         super.e();
         crw.this.a(this);
         crw.this.z.run();
      }
   };
   final crl A = new crl();

   public crw(int $$0, cmx $$1) {
      this($$0, $$1, cqg.a);
   }

   public crw(int $$0, cmx $$1, final cqg $$2) {
      super(crc.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new crq(this.o, 0, 20, 33));
      this.n = this.a(new crq(this.A, 1, 143, 33) {
         @Override
         public boolean a(cuq $$0) {
            return false;
         }

         @Override
         public void a(cmy $$0, cuq $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            crw.this.A.a($$0, this.j());
            cuq $$2 = crw.this.m.a(1);
            if (!$$2.e()) {
               crw.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crw.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, awa.As, awb.e, 1.0F, 1.0F);
                  crw.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cuq> j() {
            return List.of(crw.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crq($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyy<czq>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cmy $$0) {
      return a(this.t, $$0, dfc.oc);
   }

   @Override
   public boolean b(cmy $$0, int $$1) {
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
   public void a(bqo $$0) {
      cuq $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bqo $$0, cuq $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cuq.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(czb.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyy<czq> $$0 = this.w.get(this.u.b());
         cuq $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cuq.l);
         }
      } else {
         this.n.f(cuq.l);
      }

      this.d();
   }

   @Override
   public crc<?> a() {
      return crc.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cuq $$0, crq $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         cul $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cuq.l;
            }
         } else if (this.v.r().a(czb.f, new bre($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cuq.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cuq.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmy $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
