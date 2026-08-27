import com.google.common.collect.ImmutableList;
import java.util.List;

public class cnu extends cmp {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final cna p;
   final cnh q = cnh.a();
   private List<il<dlv>> r = List.of();
   Runnable s = () -> {
   };
   final cok t;
   final cok u;
   private final cok v;
   private final cok w;
   long x;
   private final bnt y = new boj(3) {
      @Override
      public void e() {
         super.e();
         cnu.this.a(this);
         cnu.this.s.run();
      }
   };
   private final bnt z = new boj(1) {
      @Override
      public void e() {
         super.e();
         cnu.this.s.run();
      }
   };

   public cnu(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cnu(int $$0, cjs $$1, final cna $$2) {
      super(cnw.s, $$0);
      this.p = $$2;
      this.t = this.a(new cok(this.y, 0, 13, 26) {
         @Override
         public boolean a(crj $$0) {
            return $$0.f() instanceof cpe;
         }
      });
      this.u = this.a(new cok(this.y, 1, 33, 26) {
         @Override
         public boolean a(crj $$0) {
            return $$0.f() instanceof cqd;
         }
      });
      this.v = this.a(new cok(this.y, 2, 23, 45) {
         @Override
         public boolean a(crj $$0) {
            return $$0.f() instanceof cpf;
         }
      });
      this.w = this.a(new cok(this.z, 0, 143, 57) {
         @Override
         public boolean a(crj $$0) {
            return false;
         }

         @Override
         public void a(cjt $$0, crj $$1) {
            cnu.this.t.a(1);
            cnu.this.u.a(1);
            if (!cnu.this.t.h() || !cnu.this.u.h()) {
               cnu.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.Y();
               if (cnu.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aum.zX, aun.e, 1.0F, 1.0F);
                  cnu.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.p, $$0, dca.nT);
   }

   @Override
   public boolean b(cjt $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<il<dlv>> c(crj $$0) {
      if ($$0.d()) {
         return kr.am.b(ava.a).<List<il<dlv>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.f() instanceof cpf $$1 ? kr.am.b($$1.b()).<List<il<dlv>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bnt $$0) {
      crj $$1 = this.t.g();
      crj $$2 = this.u.g();
      crj $$3 = this.v.g();
      if (!$$1.d() && !$$2.d()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<il<dlv>> $$6 = this.r;
         this.r = this.c($$3);
         il<dlv> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            il<dlv> $$9 = $$6.get($$4);
            int $$10 = this.r.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.q.a($$10);
            } else {
               $$7 = null;
               this.q.a(-1);
            }
         }

         if ($$7 != null) {
            dlw $$13 = $$1.a(jp.N, dlw.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(crj.i);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(crj.i);
         }

         this.d();
      } else {
         this.w.f(crj.i);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<il<dlv>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.f() instanceof cpe) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return crj.i;
               }
            } else if ($$4.f() instanceof cqd) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return crj.i;
               }
            } else if ($$4.f() instanceof cpf) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(il<dlv> $$0) {
      crj $$1 = this.t.g();
      crj $$2 = this.u.g();
      crj $$3 = crj.i;
      if (!$$1.d() && !$$2.d()) {
         $$3 = $$1.c(1);
         cqc $$4 = ((cqd)$$2.f()).c();
         $$3.a(jp.N, dlw.a, $$2x -> new dlw.a().a($$2x).a($$0, $$4).a());
      }

      if (!crj.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cok n() {
      return this.t;
   }

   public cok o() {
      return this.u;
   }

   public cok p() {
      return this.v;
   }

   public cok q() {
      return this.w;
   }
}
