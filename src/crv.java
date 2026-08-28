import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class crv extends cqz {
   static final ale p = ale.b("item/empty_slot_lapis_lazuli");
   private final brl q = new brz(2) {
      @Override
      public void e() {
         super.e();
         crv.this.a(this);
      }
   };
   private final crm r;
   private final azn s = azn.a();
   private final crt t = crt.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public crv(int $$0, cnw $$1) {
      this($$0, $$1, crm.a);
   }

   public crv(int $$0, cnw $$1, crm $$2) {
      super(csi.n, $$0);
      this.r = $$2;
      this.a(new csw(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new csw(this.q, 1, 35, 47) {
         @Override
         public boolean a(cvs $$0) {
            return $$0.a(cvw.oC);
         }

         @Override
         public Pair<ale, ale> b() {
            return Pair.of(csc.B, crv.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(crt.a(this.m, 0));
      this.a(crt.a(this.m, 1));
      this.a(crt.a(this.m, 2));
      this.a(this.t).a($$1.k.gl());
      this.a(crt.a(this.n, 0));
      this.a(crt.a(this.n, 1));
      this.a(crt.a(this.n, 2));
      this.a(crt.a(this.o, 0));
      this.a(crt.a(this.o, 1));
      this.a(crt.a(this.o, 2));
   }

   @Override
   public void a(brl $$0) {
      if ($$0 == this.q) {
         cvs $$1 = $$0.a(0);
         if (!$$1.f() && $$1.C()) {
            this.r.a(($$1x, $$2x) -> {
               jt<jo<dbn>> $$3 = $$1x.G_().e(lw.aN).t();
               int $$4 = 0;

               for (jf $$5 : djy.c) {
                  if (djy.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = dbp.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<dbq> $$8 = this.a($$1x.G_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dbq $$9 = $$8.get(this.s.a($$8.size()));
                        this.n[$$7] = $$3.a($$9.a);
                        this.o[$$7] = $$9.b;
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
   public boolean a(cnx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cvs $$2 = this.q.a(0);
         cvs $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.K() < $$4) && !$$0.fR()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cm < $$4 || $$0.cm < this.m[$$1]) && !$$0.ge().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cvs $$7 = $$2;
               List<dbq> $$8 = this.a($$5.G_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cvw.qQ)) {
                     $$7 = $$2.a((dei)cvw.uy);
                     this.q.a(0, $$7);
                  }

                  for (dbq $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (bun)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cvs.k);
                  }

                  $$0.a(awq.ak);
                  if ($$0 instanceof ark) {
                     an.j.a((ark)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gl());
                  this.a(this.q);
                  $$5.a(null, $$6, awg.hY, awh.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.b($$0.aj() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dbq> a(kc $$0, cvs $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<js.c<dbn>> $$4 = $$0.e(lw.aN).a(awy.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dbq> $$5 = dbp.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cvw.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cvs $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.K();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cnx $$0) {
      return a(this.r, $$0, dho.fr);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cvs.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cvs.k;
            }
         } else if ($$4.a(cvw.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cvs.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cvs.k;
            }

            cvs $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
