import com.google.common.collect.ImmutableList;
import java.util.List;

public class cua extends cst {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final ctg r;
   final ctn s = ctn.a();
   private List<jq<dug>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dug> v;
   final cuq w;
   final cuq x;
   private final cuq y;
   private final cuq z;
   long A;
   private final bst B = new bth(3) {
      @Override
      public void e() {
         super.e();
         cua.this.a(this);
         cua.this.u.run();
      }
   };
   private final bst C = new bth(1) {
      @Override
      public void e() {
         super.e();
         cua.this.u.run();
      }
   };

   public cua(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public cua(int $$0, cpn $$1, final ctg $$2) {
      super(cuc.s, $$0);
      this.r = $$2;
      this.w = this.a(new cuq(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.h() instanceof cvj;
         }
      });
      this.x = this.a(new cuq(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.h() instanceof cwe;
         }
      });
      this.y = this.a(new cuq(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxg $$0) {
            return $$0.h() instanceof cvk;
         }
      });
      this.z = this.a(new cuq(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxg $$0) {
            return false;
         }

         @Override
         public void a(cpo $$0, cxg $$1) {
            cua.this.w.a(1);
            cua.this.x.a(1);
            if (!cua.this.w.h() || !cua.this.x.h()) {
               cua.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ad();
               if (cua.this.A != $$2xx) {
                  $$0x.a(null, $$1x, awv.Bi, aww.e, 1.0F, 1.0F);
                  cua.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dY().e(mb.d);
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.r, $$0, dkf.ov);
   }

   @Override
   public boolean a(cpo $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dug>> c(cxg $$0) {
      if ($$0.f()) {
         return this.v.a(axi.a).<List<jq<dug>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cvk $$1 ? this.v.a($$1.b()).<List<jq<dug>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bst $$0) {
      cxg $$1 = this.w.g();
      cxg $$2 = this.x.g();
      cxg $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dug>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dug> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dug> $$9 = $$6.get($$4);
            int $$10 = this.t.indexOf($$9);
            if ($$10 != -1) {
               $$7 = $$9;
               this.s.a($$10);
            } else {
               $$7 = null;
               this.s.a(-1);
            }
         }

         if ($$7 != null) {
            duh $$13 = $$1.a(ku.ai, duh.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxg.j);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxg.j);
         }

         this.d();
      } else {
         this.z.f(cxg.j);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dug>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cvj) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxg.j;
               }
            } else if ($$4.h() instanceof cwe) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxg.j;
               }
            } else if ($$4.h() instanceof cvk) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dug> $$0) {
      cxg $$1 = this.w.g();
      cxg $$2 = this.x.g();
      cxg $$3 = cxg.j;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwd $$4 = ((cwe)$$2.h()).b();
         $$3.a(ku.ai, duh.a, $$2x -> new duh.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxg.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cuq n() {
      return this.w;
   }

   public cuq o() {
      return this.x;
   }

   public cuq p() {
      return this.y;
   }

   public cuq q() {
      return this.z;
   }
}
