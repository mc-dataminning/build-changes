import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cmk extends clq {
   static final ajh n = new ajh("item/empty_slot_lapis_lazuli");
   private final bmw o = new bnm(2) {
      @Override
      public void e() {
         super.e();
         cmk.this.a(this);
      }
   };
   private final cmb p;
   private final axd q = axd.a();
   private final cmi r = cmi.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cmk(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public cmk(int $$0, cit $$1, cmb $$2) {
      super(cmx.n, $$0);
      this.p = $$2;
      this.a(new cnl(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cnl(this.o, 1, 35, 47) {
         @Override
         public boolean a(cqm $$0) {
            return $$0.a(cqp.oz);
         }

         @Override
         public Pair<ajh, ajh> c() {
            return Pair.of(cmr.v, cmk.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnl($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cmi.a(this.k, 0));
      this.a(cmi.a(this.k, 1));
      this.a(cmi.a(this.k, 2));
      this.a(this.r).a($$1.m.gh());
      this.a(cmi.a(this.l, 0));
      this.a(cmi.a(this.l, 1));
      this.a(cmi.a(this.l, 2));
      this.a(cmi.a(this.m, 0));
      this.a(cmi.a(this.m, 1));
      this.a(cmi.a(this.m, 2));
   }

   @Override
   public void a(bmw $$0) {
      if ($$0 == this.o) {
         cqm $$1 = $$0.a(0);
         if (!$$1.b() && $$1.E()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (ib $$4 : dco.c) {
                  if (dco.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cux.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cuy> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cuy $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = ki.f.a($$8.a);
                        this.m[$$6] = $$8.b;
                     }
                  }
               }

               this.d();
            });
         } else {
            for (int $$2 = 0; $$2 < 3; $$2++) {
               this.k[$$2] = 0;
               this.l[$$2] = -1;
               this.m[$$2] = -1;
            }
         }
      }
   }

   @Override
   public boolean b(ciu $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cqm $$2 = this.o.a(0);
         cqm $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.M() < $$4) && !$$0.fM()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cm < $$4 || $$0.cm < this.k[$$1]) && !$$0.ga().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cqm $$7 = $$2;
               List<cuy> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cqp.qO)) {
                     $$7 = $$2.a(cqp.uu, 1);
                     this.o.a(0, $$7);
                  }

                  for (cuy $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fM()) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cqm.h);
                     }
                  }

                  $$0.a(aui.ak);
                  if ($$0 instanceof apg) {
                     am.j.a((apg)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gh());
                  this.a(this.o);
                  $$5.a(null, $$6, aty.hQ, atz.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cuy> a(cqm $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cuy> $$3 = cux.b(this.q, $$0, $$2, false);
      if ($$0.a(cqp.qO) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cqm $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.M();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.p, $$0, dae.fr);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cqm.h;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cqm.h;
            }
         } else if ($$4.a(cqp.oz)) {
            if (!this.a($$4, 1, 2, true)) {
               return cqm.h;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cqm.h;
            }

            cqm $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
