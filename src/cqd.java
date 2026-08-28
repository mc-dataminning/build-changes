import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqd extends cpi {
   static final akk n = new akk("item/empty_slot_lapis_lazuli");
   private final bqa o = new bqq(2) {
      @Override
      public void e() {
         super.e();
         cqd.this.a(this);
      }
   };
   private final cpu p;
   private final ayo q = ayo.a();
   private final cqb r = cqb.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqd(int $$0, cmk $$1) {
      this($$0, $$1, cpu.a);
   }

   public cqd(int $$0, cmk $$1, cpu $$2) {
      super(cqq.n, $$0);
      this.p = $$2;
      this.a(new cre(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cre(this.o, 1, 35, 47) {
         @Override
         public boolean a(cud $$0) {
            return $$0.a(cug.oB);
         }

         @Override
         public Pair<akk, akk> b() {
            return Pair.of(cqk.x, cqd.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cre($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cre($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cqb.a(this.k, 0));
      this.a(cqb.a(this.k, 1));
      this.a(cqb.a(this.k, 2));
      this.a(this.r).a($$1.l.gi());
      this.a(cqb.a(this.l, 0));
      this.a(cqb.a(this.l, 1));
      this.a(cqb.a(this.l, 2));
      this.a(cqb.a(this.m, 0));
      this.a(cqb.a(this.m, 1));
      this.a(cqb.a(this.m, 2));
   }

   @Override
   public void a(bqa $$0) {
      if ($$0 == this.o) {
         cud $$1 = $$0.a(0);
         if (!$$1.e() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               jo<jj<czm>> $$3 = $$1x.H_().d(lr.aK).u();
               int $$4 = 0;

               for (ja $$5 : dhu.c) {
                  if (dhu.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.k[$$6] = czo.a(this.q, $$6, $$4, $$1);
                  this.l[$$6] = -1;
                  this.m[$$6] = -1;
                  if (this.k[$$6] < $$6 + 1) {
                     this.k[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.k[$$7] > 0) {
                     List<czp> $$8 = this.a($$1x.H_(), $$1, $$7, this.k[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        czp $$9 = $$8.get(this.q.a($$8.size()));
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
   public boolean a(cml $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cud $$2 = this.o.a(0);
         cud $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.e() || $$3.H() < $$4) && !$$0.fN()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.e() || ($$0.cr < $$4 || $$0.cr < this.k[$$1]) && !$$0.gb().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cud $$7 = $$2;
               List<czp> $$8 = this.a($$5.H_(), $$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cug.qP)) {
                     $$7 = $$2.a((dcf)cug.uw);
                     this.o.a(0, $$7);
                  }

                  for (czp $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, $$0);
                  if ($$3.e()) {
                     this.o.a(1, cud.l);
                  }

                  $$0.a(avr.ak);
                  if ($$0 instanceof aqn) {
                     am.j.a((aqn)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gi());
                  this.a(this.o);
                  $$5.a(null, $$6, avh.hX, avi.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ah() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<czp> a(jx $$0, cud $$1, int $$2, int $$3) {
      this.q.b((long)(this.r.b() + $$2));
      Optional<jn.c<czm>> $$4 = $$0.d(lr.aK).b(avz.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<czp> $$5 = czo.b(this.q, $$1, $$3, $$4.get().a());
         if ($$1.a(cug.qP) && $$5.size() > 1) {
            $$5.remove(this.q.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cud $$0 = this.o.a(1);
      return $$0.e() ? 0 : $$0.H();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean b(cml $$0) {
      return a(this.p, $$0, dfk.fr);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cud.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cud.l;
            }
         } else if ($$4.a(cug.oB)) {
            if (!this.a($$4, 1, 2, true)) {
               return cud.l;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cud.l;
            }

            cud $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
