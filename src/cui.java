import com.google.common.collect.ImmutableList;
import java.util.List;

public class cui extends ctb {
   private static final int m = -1;
   private static final int n = 4;
   private static final int o = 31;
   private static final int p = 31;
   private static final int q = 40;
   private final cto r;
   final ctv s = ctv.a();
   private List<jq<dum>> t = List.of();
   Runnable u = () -> {
   };
   private final jr<dum> v;
   final cuy w;
   final cuy x;
   private final cuy y;
   private final cuy z;
   long A;
   private final btb B = new btp(3) {
      @Override
      public void e() {
         super.e();
         cui.this.a(this);
         cui.this.u.run();
      }
   };
   private final btb C = new btp(1) {
      @Override
      public void e() {
         super.e();
         cui.this.u.run();
      }
   };

   public cui(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public cui(int $$0, cpv $$1, final cto $$2) {
      super(cuk.s, $$0);
      this.r = $$2;
      this.w = this.a(new cuy(this.B, 0, 13, 26) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.h() instanceof cvr;
         }
      });
      this.x = this.a(new cuy(this.B, 1, 33, 26) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.h() instanceof cwm;
         }
      });
      this.y = this.a(new cuy(this.B, 2, 23, 45) {
         @Override
         public boolean a(cxo $$0) {
            return $$0.h() instanceof cvs;
         }
      });
      this.z = this.a(new cuy(this.C, 0, 143, 57) {
         @Override
         public boolean a(cxo $$0) {
            return false;
         }

         @Override
         public void a(cpw $$0, cxo $$1) {
            cui.this.w.a(1);
            cui.this.x.a(1);
            if (!cui.this.w.h() || !cui.this.x.h()) {
               cui.this.s.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.ac();
               if (cui.this.A != $$2xx) {
                  $$0x.a(null, $$1x, axf.AS, axg.e, 1.0F, 1.0F);
                  cui.this.A = $$2xx;
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
   public boolean b(cpw $$0) {
      return a(this.r, $$0, dkn.oo);
   }

   @Override
   public boolean a(cpw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.t.size()) {
         this.s.a($$1);
         this.a(this.t.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<jq<dum>> c(cxo $$0) {
      if ($$0.f()) {
         return this.v.a(axs.a).<List<jq<dum>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.h() instanceof cvs $$1 ? this.v.a($$1.b()).<List<jq<dum>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.t.size();
   }

   @Override
   public void a(btb $$0) {
      cxo $$1 = this.w.g();
      cxo $$2 = this.x.g();
      cxo $$3 = this.y.g();
      if (!$$1.f() && !$$2.f()) {
         int $$4 = this.s.b();
         boolean $$5 = this.e($$4);
         List<jq<dum>> $$6 = this.t;
         this.t = this.c($$3);
         jq<dum> $$7;
         if (this.t.size() == 1) {
            this.s.a(0);
            $$7 = this.t.get(0);
         } else if (!$$5) {
            this.s.a(-1);
            $$7 = null;
         } else {
            jq<dum> $$9 = $$6.get($$4);
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
            dun $$13 = $$1.a(ku.ai, dun.a);
            boolean $$14 = $$13.b().size() >= 6;
            if ($$14) {
               this.s.a(-1);
               this.z.f(cxo.k);
            } else {
               this.a($$7);
            }
         } else {
            this.z.f(cxo.k);
         }

         this.d();
      } else {
         this.z.f(cxo.k);
         this.t = List.of();
         this.s.a(-1);
      }
   }

   public List<jq<dum>> l() {
      return this.t;
   }

   public int m() {
      return this.s.b();
   }

   public void a(Runnable $$0) {
      this.u = $$0;
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.k;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == this.z.d) {
            if (!this.a($$4, 4, 40, true)) {
               return cxo.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.x.d && $$1 != this.w.d && $$1 != this.y.d) {
            if ($$4.h() instanceof cvr) {
               if (!this.a($$4, this.w.d, this.w.d + 1, false)) {
                  return cxo.k;
               }
            } else if ($$4.h() instanceof cwm) {
               if (!this.a($$4, this.x.d, this.x.d + 1, false)) {
                  return cxo.k;
               }
            } else if ($$4.h() instanceof cvs) {
               if (!this.a($$4, this.y.d, this.y.d + 1, false)) {
                  return cxo.k;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cxo.k;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cxo.k;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cxo.k;
         }

         if ($$4.f()) {
            $$3.e(cxo.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxo.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.B));
   }

   private void a(jq<dum> $$0) {
      cxo $$1 = this.w.g();
      cxo $$2 = this.x.g();
      cxo $$3 = cxo.k;
      if (!$$1.f() && !$$2.f()) {
         $$3 = $$1.c(1);
         cwl $$4 = ((cwm)$$2.h()).b();
         $$3.a(ku.ai, dun.a, $$2x -> new dun.a().a($$2x).a($$0, $$4).a());
      }

      if (!cxo.a($$3, this.z.g())) {
         this.z.f($$3);
      }
   }

   public cuy n() {
      return this.w;
   }

   public cuy o() {
      return this.x;
   }

   public cuy p() {
      return this.y;
   }

   public cuy q() {
      return this.z;
   }
}
