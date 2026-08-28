import java.util.List;
import java.util.Optional;

public class cuj extends ctn {
   static final ald p = ald.b("container/slot/lapis_lazuli");
   private final btj q = new btx(2) {
      @Override
      public void e() {
         super.e();
         cuj.this.a(this);
      }
   };
   private final cua r;
   private final azs s = azs.a();
   private final cuh t = cuh.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public cuj(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cuj(int $$0, cqh $$1, cua $$2) {
      super(cuw.n, $$0);
      this.r = $$2;
      this.a(new cvk(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cvk(this.q, 1, 35, 47) {
         @Override
         public boolean a(cxy $$0) {
            return $$0.a(cyc.pk);
         }

         @Override
         public ald c() {
            return cuj.p;
         }
      });
      this.c($$1, 8, 84);
      this.a(cuh.a(this.m, 0));
      this.a(cuh.a(this.m, 1));
      this.a(cuh.a(this.m, 2));
      this.a(this.t).a($$1.k.gr());
      this.a(cuh.a(this.n, 0));
      this.a(cuh.a(this.n, 1));
      this.a(cuh.a(this.n, 2));
      this.a(cuh.a(this.o, 0));
      this.a(cuh.a(this.o, 1));
      this.a(cuh.a(this.o, 2));
   }

   @Override
   public void a(btj $$0) {
      if ($$0 == this.q) {
         cxy $$1 = $$0.a(0);
         if (!$$1.f() && $$1.E()) {
            this.r.a(($$1x, $$2x) -> {
               jx<js<deh>> $$3 = $$1x.F_().f(me.aS).t();
               int $$4 = 0;

               for (jj $$5 : dnh.b) {
                  if (dnh.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dej.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dek> $$8 = this.a($$1x.F_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dek $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.b());
                        this.o[$$7] = $$9.c();
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.m[$$2] = 0;
               this.n[$$2] = -1;
               this.o[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean a(cqi $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cxy $$2 = this.q.a(0);
         cxy $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.M() < $$4) && !$$0.fU()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cd < $$4 || $$0.cd < this.m[$$1]) && !$$0.fU()) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cxy $$7 = $$2;
               List<dek> $$8 = this.a($$5.F_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cyc.rA)) {
                     $$7 = $$2.a((dho)cyc.vz);
                     this.q.a(0, $$7);
                  }

                  for (dek $$9 : $$8) {
                     $$7.a($$9.b(), $$9.c());
                  }

                  $$3.a($$4, (bwr)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cxy.k);
                  }

                  $$0.a(awu.ak);
                  if ($$0 instanceof aro) {
                     ap.j.a((aro)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gr());
                  this.a(this.q);
                  $$5.a(null, $$6, awk.is, awl.e, 1.0F, $$5.A.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         af.b($$0.al() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dek> a(kg $$0, cxy $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jw.c<deh>> $$4 = $$0.f(me.aS).a(axc.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dek> $$5 = dej.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cyc.rA) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cxy $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.M();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.r, $$0, dkw.fM);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cxy.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cxy.k;
            }
         } else if ($$4.a(cyc.pk)) {
            if (!this.a($$4, 1, 2, true)) {
               return cxy.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cxy.k;
            }

            cxy $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
