import com.google.common.collect.ImmutableList;
import java.util.List;

public class cue extends csx {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final ctk r;
   final ctr s = ctr.a();
   private List<jq<duf>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<duf> v;
   final cuu w;
   final cuu x;
   private final cuu y;
   private final cuu z;
   long A;
   private final bsx B = new btl(3) {
      @Override
      public void e() {
         super.e();
         cue.this.a(this);
         cue.this.u.run();
      }
   };
   private final bsx C = new btl(1) {
      @Override
      public void e() {
         super.e();
         cue.this.u.run();
      }
   };

   public cue(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public cue(int $$0, cpr $$1, final ctk $$2) {
      super(cug.s, $$0);
      this.r = $$2;
      this.w = this.a(new cuu(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.h() instanceof cvn;
         }
      });
      this.x = this.a(new cuu(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.h() instanceof cwi;
         }
      });
      this.y = this.a(new cuu(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxk $$0) {
            return $$0.h() instanceof cvo;
         }
      });
      this.z = this.a(new cuu(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxk $$0) {
            return false;
         }

         @Override
         public void a(cps $$0, cxk $$1) {
            cue.this.w.a(1);
            cue.this.x.a(1);
            if (!cue.this.w.h() || !cue.this.x.h()) {
               cue.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (cue.this.A != $$2xx) {
                  $$0x.a(null, $$1x, axf.AR, axg.e, 1.0F, 1.0F);
                  cue.this.A = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });
      this.c($$1, 8, 84);
      this.a(this.s);
      this.v = $$1.k.dX().e(mb.d);
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.r, $$0, dkg.oo);
   }

   @Override
   public boolean a(cps $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<duf>> c(cxk $$0) {
      if ($$0.f()) {
         return this.v.a(axs.a).<List<jq<duf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cvo $$1 ? this.v.a($$1.b()).<List<jq<duf>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(bsx $$0) {
      cxk $$1 = this.w.g();
      cxk $$2 = this.x.g();
      cxk $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<duf>> $$6 = this.t;
         this.t = this.c($$3);
         jq<duf> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<duf> $$9 = $$6.get($$4);
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
            dug $$13 = $$1.a(ku.ai, dug.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxk.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxk.k);
         }

         this.d();
      } else {
         this.z.f(cxk.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<duf>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cvn) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxk.k;
               }
            } else if ($$4.h() instanceof cwi) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxk.k;
               }
            } else if ($$4.h() instanceof cvo) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<duf> $$0) {
      cxk $$1 = this.w.g();
      cxk $$2 = this.x.g();
      cxk $$3 = cxk.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwh $$4 = ((cwi)$$2.h()).b();
         $$3.a(ku.ai, dug.a, $$2x -> new dug.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxk.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cuu n() {
      return this.w;
   }

   public cuu o() {
      return this.x;
   }

   public cuu p() {
      return this.y;
   }

   public cuu q() {
      return this.z;
   }
}
