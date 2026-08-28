import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class crm extends cqq {
   static final alb p = alb.b("item/empty_slot_lapis_lazuli");
   private final brd q = new brr(2) {
      @Override
      public void e() {
         super.e();
         crm.this.a(this);
      }
   };
   private final crd r;
   private final azk s = azk.a();
   private final crk t = crk.a();
   public final int[] m = new int[3];
   public final int[] n = new int[]{-1, -1, -1};
   public final int[] o = new int[]{-1, -1, -1};

   public crm(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public crm(int $$0, cno $$1, crd $$2) {
      super(crz.n, $$0);
      this.r = $$2;
      this.a(new csn(this.q, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new csn(this.q, 1, 35, 47) {
         @Override
         public boolean a(cvl $$0) {
            return $$0.a(cvo.oC);
         }

         @Override
         public Pair<alb, alb> b() {
            return Pair.of(crt.B, crm.p);
         }
      });
      this.c($$1, 8, 84);
      this.a(crk.a(this.m, 0));
      this.a(crk.a(this.m, 1));
      this.a(crk.a(this.m, 2));
      this.a(this.t).a($$1.k.gk());
      this.a(crk.a(this.n, 0));
      this.a(crk.a(this.n, 1));
      this.a(crk.a(this.n, 2));
      this.a(crk.a(this.o, 0));
      this.a(crk.a(this.o, 1));
      this.a(crk.a(this.o, 2));
   }

   @Override
   public void a(brd $$0) {
      if ($$0 == this.q) {
         cvl $$1 = $$0.a(0);
         if (!$$1.f() && $$1.B()) {
            this.r.a(($$1x, $$2x) -> {
               js<jn<daw>> $$3 = $$1x.F_().d(lv.aL).t();
               int $$4 = 0;

               for (je $$5 : djh.c) {
                  if (djh.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.s.b((long)this.t.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.m[$$6] = day.a(this.s, $$6, $$4, $$1);
                  this.n[$$6] = -1;
                  this.o[$$6] = -1;
                  if (this.m[$$6] < $$6 + 1) {
                     this.m[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.m[$$7] > 0) {
                     List<daz> $$8 = this.a($$1x.F_(), $$1, $$7, this.m[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        daz $$9 = $$8.get(this.s.a($$8.size()));
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
   public boolean a(cnp $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.m.length) {
         cvl $$2 = this.q.a(0);
         cvl $$3 = this.q.a(1);
         int $$4 = $$1 + 1;
         if (($$3.f() || $$3.J() < $$4) && !$$0.fP()) {
            return false;
         } else if (this.m[$$1] <= 0 || $$2.f() || ($$0.cn < $$4 || $$0.cn < this.m[$$1]) && !$$0.gd().d) {
            return false;
         } else {
            this.r.a(($$5, $$6) -> {
               cvl $$7 = $$2;
               List<daz> $$8 = this.a($$5.F_(), $$2, $$1, this.m[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cvo.qQ)) {
                     $$7 = $$2.a((ddr)cvo.uy);
                     this.q.a(0, $$7);
                  }

                  for (daz $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, (buf)$$0);
                  if ($$3.f()) {
                     this.q.a(1, cvl.k);
                  }

                  $$0.a(awn.ak);
                  if ($$0 instanceof arh) {
                     an.j.a((arh)$$0, $$7, $$4);
                  }

                  this.q.e();
                  this.t.a($$0.gk());
                  this.a(this.q);
                  $$5.a(null, $$6, awd.hY, awe.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.b($$0.aj() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<daz> a(kb $$0, cvl $$1, int $$2, int $$3) {
      this.s.b((long)(this.t.b() + $$2));
      Optional<jr.c<daw>> $$4 = $$0.d(lv.aL).a(awv.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<daz> $$5 = day.b(this.s, $$1, $$3, $$4.get().a());
         if ($$1.a(cvo.qQ) && $$5.size() > 1) {
            $$5.remove(this.s.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cvl $$0 = this.q.a(1);
      return $$0.f() ? 0 : $$0.J();
   }

   public int m() {
      return this.t.b();
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.r.a(($$1, $$2) -> this.a($$0, this.q));
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.r, $$0, dgx.fr);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cvl.k;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cvl.k;
            }
         } else if ($$4.a(cvo.oC)) {
            if (!this.a($$4, 1, 2, true)) {
               return cvl.k;
            }
         } else {
            if (this.k.get(0).h() || !this.k.get(0).a($$4)) {
               return cvl.k;
            }

            cvl $$5 = $$4.c(1);
            $$4.h(1);
            this.k.get(0).e($$5);
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
