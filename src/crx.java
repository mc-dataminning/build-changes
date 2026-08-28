import com.google.common.collect.Lists;
import java.util.List;

public class crx extends cpw {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cqh t;
   private final cqo u = cqo.a();
   private final dca v;
   private List<cyz<czr>> w = Lists.newArrayList();
   private cur x = cur.l;
   long y;
   final crr m;
   final crr n;
   Runnable z = () -> {
   };
   public final bqp o = new brf(1) {
      @Override
      public void e() {
         super.e();
         crx.this.a(this);
         crx.this.z.run();
      }
   };
   final crm A = new crm();

   public crx(int $$0, cmy $$1) {
      this($$0, $$1, cqh.a);
   }

   public crx(int $$0, cmy $$1, final cqh $$2) {
      super(crd.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new crr(this.o, 0, 20, 33));
      this.n = this.a(new crr(this.A, 1, 143, 33) {
         @Override
         public boolean a(cur $$0) {
            return false;
         }

         @Override
         public void a(cmz $$0, cur $$1) {
            $$1.a($$0.dP(), $$0, $$1.I());
            crx.this.A.a($$0, this.j());
            cur $$2 = crx.this.m.a(1);
            if (!$$2.e()) {
               crx.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crx.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, awa.As, awb.e, 1.0F, 1.0F);
                  crx.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cur> j() {
            return List.of(crx.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crr($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crr($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyz<czr>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cmz $$0) {
      return a(this.t, $$0, dfd.oc);
   }

   @Override
   public boolean b(cmz $$0, int $$1) {
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
   public void a(bqp $$0) {
      cur $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private void a(bqp $$0, cur $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cur.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(czc.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyz<czr> $$0 = this.w.get(this.u.b());
         cur $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cur.l);
         }
      } else {
         this.n.f(cur.l);
      }

      this.d();
   }

   @Override
   public crd<?> a() {
      return crd.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cur $$0, crr $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         cum $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cur.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cur.l;
            }
         } else if (this.v.r().a(czc.f, new brf($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cur.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cur.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         }

         $$3.b();
         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
