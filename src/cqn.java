import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqn extends cps {
   static final akq n = akq.b("item/empty_slot_lapis_lazuli");
   private final bqj o = new bqz(2) {
      @Override
      public void e() {
         super.e();
         cqn.this.a(this);
      }
   };
   private final cqe p;
   private final ayv q = ayv.a();
   private final cql r = cql.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqn(int $$0, cmu $$1) {
      this($$0, $$1, cqe.a);
   }

   public cqn(int $$0, cmu $$1, cqe $$2) {
      super(cra.n, $$0);
      this.p = $$2;
      this.a(new cro(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cro(this.o, 1, 35, 47) {
         @Override
         public boolean a(cuo $$0) {
            return $$0.a(cur.oB);
         }

         @Override
         public Pair<akq, akq> b() {
            return Pair.of(cqu.x, cqn.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cro($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cro($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cql.a(this.k, 0));
      this.a(cql.a(this.k, 1));
      this.a(cql.a(this.k, 2));
      this.a(this.r).a($$1.l.gh());
      this.a(cql.a(this.l, 0));
      this.a(cql.a(this.l, 1));
      this.a(cql.a(this.l, 2));
      this.a(cql.a(this.m, 0));
      this.a(cql.a(this.m, 1));
      this.a(cql.a(this.m, 2));
   }

   @Override
   public void a(bqj $$0) {
      if ($$0 == this.o) {
         cuo $$1 = $$0.a(0);
         if (!$$1.e() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               jr<jm<daa>> $$3 = $$1x.H_().d(lu.aL).u();
               int $$4 = 0;

               for (jd $$5 : dii.c) {
                  if (dii.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.k[$$6] = dac.a(this.q, $$6, $$4, $$1);
                  this.l[$$6] = -1;
                  this.m[$$6] = -1;
                  if (this.k[$$6] < $$6 + 1) {
                     this.k[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.k[$$7] > 0) {
                     List<dad> $$8 = this.a($$1x.H_(), $$1, $$7, this.k[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        dad $$9 = $$8.get(this.q.a($$8.size()));
                        this.l[$$7] = $$3.a($$9.a);
                        this.m[$$7] = $$9.b;
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
   public boolean a(cmv $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cuo $$2 = this.o.a(0);
         cuo $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.e() || $$3.H() < $$4) && !$$0.fM()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.e() || ($$0.cq < $$4 || $$0.cq < this.k[$$1]) && !$$0.ga().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cuo $$7 = $$2;
               List<dad> $$8 = this.a($$5.H_(), $$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cur.qP)) {
                     $$7 = $$2.a((dct)cur.uw);
                     this.o.a(0, $$7);
                  }

                  for (dad $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, $$0);
                  if ($$3.e()) {
                     this.o.a(1, cuo.l);
                  }

                  $$0.a(avy.ak);
                  if ($$0 instanceof aqu) {
                     an.j.a((aqu)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gh());
                  this.a(this.o);
                  $$5.a(null, $$6, avo.hX, avp.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.a($$0.ah() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<dad> a(ka $$0, cuo $$1, int $$2, int $$3) {
      this.q.b((long)(this.r.b() + $$2));
      Optional<jq.c<daa>> $$4 = $$0.d(lu.aL).b(awg.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<dad> $$5 = dac.b(this.q, $$1, $$3, $$4.get().a());
         if ($$1.a(cur.qP) && $$5.size() > 1) {
            $$5.remove(this.q.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cuo $$0 = this.o.a(1);
      return $$0.e() ? 0 : $$0.H();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void a(cmv $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean b(cmv $$0) {
      return a(this.p, $$0, dfy.fr);
   }

   @Override
   public cuo b(cmv $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cuo.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cuo.l;
            }
         } else if ($$4.a(cur.oB)) {
            if (!this.a($$4, 1, 2, true)) {
               return cuo.l;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cuo.l;
            }

            cuo $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
