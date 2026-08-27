import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cff extends cen {
   static final aey n = new aey("item/empty_slot_lapis_lazuli");
   private final bgt o = new bhh(2) {
      @Override
      public void e() {
         super.e();
         cff.this.a(this);
      }
   };
   private final cey p;
   private final ase q = ase.a();
   private final cfd r = cfd.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cff(int $$0, cbv $$1) {
      this($$0, $$1, cey.a);
   }

   public cff(int $$0, cbv $$1, cey $$2) {
      super(cfs.m, $$0);
      this.p = $$2;
      this.a(new cgf(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cgf(this.o, 1, 35, 47) {
         @Override
         public boolean a(cjh $$0) {
            return $$0.a(cjk.nM);
         }

         @Override
         public Pair<aey, aey> b() {
            return Pair.of(cfm.v, cff.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cgf($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cgf($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cfd.a(this.k, 0));
      this.a(cfd.a(this.k, 1));
      this.a(cfd.a(this.k, 2));
      this.a(this.r).a($$1.m.fZ());
      this.a(cfd.a(this.l, 0));
      this.a(cfd.a(this.l, 1));
      this.a(cfd.a(this.l, 2));
      this.a(cfd.a(this.m, 0));
      this.a(cfd.a(this.m, 1));
      this.a(cfd.a(this.m, 2));
   }

   @Override
   public void a(bgt $$0) {
      if ($$0 == this.o) {
         cjh $$1 = $$0.a(0);
         if (!$$1.b() && $$1.D()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (gw $$4 : cvf.b) {
                  if (cvf.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cns.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cnt> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cnt $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = jd.g.a($$8.a);
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
   public boolean b(cbw $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cjh $$2 = this.o.a(0);
         cjh $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.L() < $$4) && !$$0.fS().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cf < $$4 || $$0.cf < this.k[$$1]) && !$$0.fS().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cjh $$7 = $$2;
               List<cnt> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cjk.qb);
                  if ($$9) {
                     $$7 = new cjh(cjk.tC);
                     qy $$10 = $$2.v();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.o.a(0, $$7);
                  }

                  for (cnt $$11 : $$8) {
                     if ($$9) {
                        cid.a($$7, $$11);
                     } else {
                        $$7.a($$11.a, $$11.b);
                     }
                  }

                  if (!$$0.fS().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cjh.b);
                     }
                  }

                  $$0.a(app.ak);
                  if ($$0 instanceof akt) {
                     al.i.a((akt)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.fZ());
                  this.a(this.o);
                  $$5.a(null, $$6, apf.gQ, apg.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ab() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cnt> a(cjh $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cnt> $$3 = cns.b(this.q, $$0, $$2, false);
      if ($$0.a(cjk.qb) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cjh $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.L();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cbw $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cbw $$0) {
      return a(this.p, $$0, csy.fr);
   }

   @Override
   public cjh a(cbw $$0, int $$1) {
      cjh $$2 = cjh.b;
      cgf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjh $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cjh.b;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cjh.b;
            }
         } else if ($$4.a(cjk.nM)) {
            if (!this.a($$4, 1, 2, true)) {
               return cjh.b;
            }
         } else {
            if (this.i.get(0).f() || !this.i.get(0).a($$4)) {
               return cjh.b;
            }

            cjh $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).d($$5);
         }

         if ($$4.b()) {
            $$3.d(cjh.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjh.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
