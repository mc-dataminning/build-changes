import java.util.List;

public class cbx extends cbf {
   private final bdq n = new bee(2) {
      @Override
      public void e() {
         super.e();
         cbx.this.a(this);
      }
   };
   private final cbq o;
   private final apf p = apf.a();
   private final cbv q = cbv.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cbx(int $$0, byn $$1) {
      this($$0, $$1, cbq.a);
   }

   public cbx(int $$0, byn $$1, cbq $$2) {
      super(cck.m, $$0);
      this.o = $$2;
      this.a(new ccx(this.n, 0, 15, 47) {
         @Override
         public boolean a(cfz $$0) {
            return true;
         }

         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new ccx(this.n, 1, 35, 47) {
         @Override
         public boolean a(cfz $$0) {
            return $$0.a(cgc.nM);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ccx($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new ccx($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cbv.a(this.k, 0));
      this.a(cbv.a(this.k, 1));
      this.a(cbv.a(this.k, 2));
      this.a(this.q).a($$1.m.fV());
      this.a(cbv.a(this.l, 0));
      this.a(cbv.a(this.l, 1));
      this.a(cbv.a(this.l, 2));
      this.a(cbv.a(this.m, 0));
      this.a(cbv.a(this.m, 1));
      this.a(cbv.a(this.m, 2));
   }

   @Override
   public void a(bdq $$0) {
      if ($$0 == this.n) {
         cfz $$1 = $$0.a(0);
         if (!$$1.b() && $$1.D()) {
            this.o.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (gu $$4 : crv.b) {
                  if (crv.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.p.b((long)this.q.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cki.a(this.p, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<ckj> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        ckj $$8 = $$7.get(this.p.a($$7.size()));
                        this.l[$$6] = jb.g.a($$8.a);
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
   public boolean b(byo $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cfz $$2 = this.n.a(0);
         cfz $$3 = this.n.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.L() < $$4) && !$$0.fO().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.ce < $$4 || $$0.ce < this.k[$$1]) && !$$0.fO().d) {
            return false;
         } else {
            this.o.a(($$5, $$6) -> {
               cfz $$7 = $$2;
               List<ckj> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cgc.qb);
                  if ($$9) {
                     $$7 = new cfz(cgc.tC);
                     qr $$10 = $$2.v();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.n.a(0, $$7);
                  }

                  for (int $$11 = 0; $$11 < $$8.size(); $$11++) {
                     ckj $$12 = $$8.get($$11);
                     if ($$9) {
                        cev.a($$7, $$12);
                     } else {
                        $$7.a($$12.a, $$12.b);
                     }
                  }

                  if (!$$0.fO().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.n.a(1, cfz.b);
                     }
                  }

                  $$0.a(amr.ak);
                  if ($$0 instanceof aig) {
                     ai.i.a((aig)$$0, $$7, $$4);
                  }

                  this.n.e();
                  this.q.a($$0.fV());
                  this.a(this.n);
                  $$5.a(null, $$6, amh.gQ, ami.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.Z() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<ckj> a(cfz $$0, int $$1, int $$2) {
      this.p.b((long)(this.q.b() + $$1));
      List<ckj> $$3 = cki.b(this.p, $$0, $$2, false);
      if ($$0.a(cgc.qb) && $$3.size() > 1) {
         $$3.remove(this.p.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cfz $$0 = this.n.a(1);
      return $$0.b() ? 0 : $$0.L();
   }

   public int m() {
      return this.q.b();
   }

   @Override
   public void b(byo $$0) {
      super.b($$0);
      this.o.a(($$1, $$2) -> this.a($$0, this.n));
   }

   @Override
   public boolean a(byo $$0) {
      return a(this.o, $$0, cpo.fr);
   }

   @Override
   public cfz a(byo $$0, int $$1) {
      cfz $$2 = cfz.b;
      ccx $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cfz $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cfz.b;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cfz.b;
            }
         } else if ($$4.a(cgc.nM)) {
            if (!this.a($$4, 1, 2, true)) {
               return cfz.b;
            }
         } else {
            if (this.i.get(0).f() || !this.i.get(0).a($$4)) {
               return cfz.b;
            }

            cfz $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).d($$5);
         }

         if ($$4.b()) {
            $$3.d(cfz.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cfz.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
