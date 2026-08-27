import com.google.common.collect.ImmutableList;
import java.util.List;

public class cmt extends clo {
   private static final int k = -1;
   private static final int l = 4;
   private static final int m = 31;
   private static final int n = 31;
   private static final int o = 40;
   private final clz p;
   final cmg q = cmg.a();
   private List<il<djx>> r = List.of();
   Runnable s = () -> {
   };
   final cnj t;
   final cnj u;
   private final cnj v;
   private final cnj w;
   long x;
   private final bmv y = new bnl(3) {
      @Override
      public void e() {
         super.e();
         cmt.this.a(this);
         cmt.this.s.run();
      }
   };
   private final bmv z = new bnl(1) {
      @Override
      public void e() {
         super.e();
         cmt.this.s.run();
      }
   };

   public cmt(int $$0, cir $$1) {
      this($$0, $$1, clz.a);
   }

   public cmt(int $$0, cir $$1, final clz $$2) {
      super(cmv.s, $$0);
      this.p = $$2;
      this.t = this.a(new cnj(this.y, 0, 13, 26) {
         @Override
         public boolean a(cqk $$0) {
            return $$0.d() instanceof coc;
         }
      });
      this.u = this.a(new cnj(this.y, 1, 33, 26) {
         @Override
         public boolean a(cqk $$0) {
            return $$0.d() instanceof cpc;
         }
      });
      this.v = this.a(new cnj(this.y, 2, 23, 45) {
         @Override
         public boolean a(cqk $$0) {
            return $$0.d() instanceof cod;
         }
      });
      this.w = this.a(new cnj(this.z, 0, 143, 57) {
         @Override
         public boolean a(cqk $$0) {
            return false;
         }

         @Override
         public void a(cis $$0, cqk $$1) {
            cmt.this.t.a(1);
            cmt.this.u.a(1);
            if (!cmt.this.t.h() || !cmt.this.u.h()) {
               cmt.this.q.a(-1);
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xx = $$0x.X();
               if (cmt.this.x != $$2xx) {
                  $$0x.a(null, $$1x, aty.zP, atz.e, 1.0F, 1.0F);
                  cmt.this.x = $$2xx;
               }
            });
            super.a($$0, $$1);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnj($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnj($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.q);
   }

   @Override
   public boolean a(cis $$0) {
      return a(this.p, $$0, dac.nT);
   }

   @Override
   public boolean b(cis $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.r.size()) {
         this.q.a($$1);
         this.a(this.r.get($$1));
         return true;
      } else {
         return false;
      }
   }

   private List<il<djx>> c(cqk $$0) {
      if ($$0.b()) {
         return ki.am.b(aul.a).<List<il<djx>>>map(ImmutableList::copyOf).orElse(ImmutableList.of());
      } else {
         return $$0.d() instanceof cod $$1 ? ki.am.b($$1.b()).<List<il<djx>>>map(ImmutableList::copyOf).orElse(ImmutableList.of()) : List.of();
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.r.size();
   }

   @Override
   public void a(bmv $$0) {
      cqk $$1 = this.t.g();
      cqk $$2 = this.u.g();
      cqk $$3 = this.v.g();
      if (!$$1.b() && !$$2.b()) {
         int $$4 = this.q.b();
         boolean $$5 = this.e($$4);
         List<il<djx>> $$6 = this.r;
         this.r = this.c($$3);
         il<djx> $$7;
         if (this.r.size() == 1) {
            this.q.a(0);
            $$7 = this.r.get(0);
         } else if (!$$5) {
            this.q.a(-1);
            $$7 = null;
         } else {
            il<djx> $$9 = $$6.get($$4);
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
            ta $$13 = cof.a($$1);
            boolean $$14 = $$13 != null && $$13.b("Patterns", 9) && !$$1.b() && $$13.c("Patterns", 10).size() >= 6;
            if ($$14) {
               this.q.a(-1);
               this.w.f(cqk.h);
            } else {
               this.a($$7);
            }
         } else {
            this.w.f(cqk.h);
         }

         this.d();
      } else {
         this.w.f(cqk.h);
         this.r = List.of();
         this.q.a(-1);
      }
   }

   public List<il<djx>> l() {
      return this.r;
   }

   public int m() {
      return this.q.b();
   }

   public void a(Runnable $$0) {
      this.s = $$0;
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == this.w.e) {
            if (!this.a($$4, 4, 40, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != this.u.e && $$1 != this.t.e && $$1 != this.v.e) {
            if ($$4.d() instanceof coc) {
               if (!this.a($$4, this.t.e, this.t.e + 1, false)) {
                  return cqk.h;
               }
            } else if ($$4.d() instanceof cpc) {
               if (!this.a($$4, this.u.e, this.u.e + 1, false)) {
                  return cqk.h;
               }
            } else if ($$4.d() instanceof cod) {
               if (!this.a($$4, this.v.e, this.v.e + 1, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.y));
   }

   private void a(il<djx> $$0) {
      cqk $$1 = this.t.g();
      cqk $$2 = this.u.g();
      cqk $$3 = cqk.h;
      if (!$$1.b() && !$$2.b()) {
         $$3 = $$1.c(1);
         cpb $$4 = ((cpc)$$2.d()).c();
         ta $$5 = cof.a($$3);
         tg $$6;
         if ($$5 != null && $$5.b("Patterns", 9)) {
            $$6 = $$5.c("Patterns", 10);
         } else {
            $$6 = new tg();
            if ($$5 == null) {
               $$5 = new ta();
            }

            $$5.a("Patterns", $$6);
         }

         ta $$8 = new ta();
         $$8.a("Pattern", $$0.a().a());
         $$8.a("Color", $$4.a());
         $$6.add($$8);
         cof.a($$3, dki.t, $$5);
      }

      if (!cqk.a($$3, this.w.g())) {
         this.w.f($$3);
      }
   }

   public cnj n() {
      return this.t;
   }

   public cnj o() {
      return this.u;
   }

   public cnj p() {
      return this.v;
   }

   public cnj q() {
      return this.w;
   }
}
