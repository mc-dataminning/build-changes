import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cev extends ced {
   static final aer n = new aer("item/empty_slot_lapis_lazuli");
   private final bgj o = new bgx(2) {
      @Override
      public void e() {
         super.e();
         cev.this.a(this);
      }
   };
   private final ceo p;
   private final aru q = aru.a();
   private final cet r = cet.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cev(int $$0, cbl $$1) {
      this($$0, $$1, ceo.a);
   }

   public cev(int $$0, cbl $$1, ceo $$2) {
      super(cfi.m, $$0);
      this.p = $$2;
      this.a(new cfv(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cfv(this.o, 1, 35, 47) {
         @Override
         public boolean a(cix $$0) {
            return $$0.a(cja.nM);
         }

         @Override
         public Pair<aer, aer> b() {
            return Pair.of(cfc.v, cev.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cfv($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cfv($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cet.a(this.k, 0));
      this.a(cet.a(this.k, 1));
      this.a(cet.a(this.k, 2));
      this.a(this.r).a($$1.m.fY());
      this.a(cet.a(this.l, 0));
      this.a(cet.a(this.l, 1));
      this.a(cet.a(this.l, 2));
      this.a(cet.a(this.m, 0));
      this.a(cet.a(this.m, 1));
      this.a(cet.a(this.m, 2));
   }

   @Override
   public void a(bgj $$0) {
      if ($$0 == this.o) {
         cix $$1 = $$0.a(0);
         if (!$$1.b() && $$1.D()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (gu $$4 : cut.b) {
                  if (cut.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cng.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cnh> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cnh $$8 = $$7.get(this.q.a($$7.size()));
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
   public boolean b(cbm $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cix $$2 = this.o.a(0);
         cix $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.b() || $$3.L() < $$4) && !$$0.fR().d) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.b() || ($$0.cd < $$4 || $$0.cd < this.k[$$1]) && !$$0.fR().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cix $$7 = $$2;
               List<cnh> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  boolean $$9 = $$2.a(cja.qb);
                  if ($$9) {
                     $$7 = new cix(cja.tC);
                     qr $$10 = $$2.v();
                     if ($$10 != null) {
                        $$7.c($$10.h());
                     }

                     this.o.a(0, $$7);
                  }

                  for (cnh $$11 : $$8) {
                     if ($$9) {
                        cht.a($$7, $$11);
                     } else {
                        $$7.a($$11.a, $$11.b);
                     }
                  }

                  if (!$$0.fR().d) {
                     $$3.h($$4);
                     if ($$3.b()) {
                        this.o.a(1, cix.b);
                     }
                  }

                  $$0.a(apg.ak);
                  if ($$0 instanceof akl) {
                     ai.i.a((akl)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.fY());
                  this.a(this.o);
                  $$5.a(null, $$6, aow.gQ, aox.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ab() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cnh> a(cix $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cnh> $$3 = cng.b(this.q, $$0, $$2, false);
      if ($$0.a(cja.qb) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      cix $$0 = this.o.a(1);
      return $$0.b() ? 0 : $$0.L();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cbm $$0) {
      return a(this.p, $$0, csm.fr);
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cix.b;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cix.b;
            }
         } else if ($$4.a(cja.nM)) {
            if (!this.a($$4, 1, 2, true)) {
               return cix.b;
            }
         } else {
            if (this.i.get(0).f() || !this.i.get(0).a($$4)) {
               return cix.b;
            }

            cix $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).d($$5);
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
