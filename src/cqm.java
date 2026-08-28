import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cqm extends cps {
   static final ale n = new ale("item/empty_slot_lapis_lazuli");
   private final bql o = new brb(2) {
      @Override
      public void e() {
         super.e();
         cqm.this.a(this);
      }
   };
   private final cqd p;
   private final azf q = azf.a();
   private final cqk r = cqk.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqm(int $$0, cmu $$1) {
      this($$0, $$1, cqd.a);
   }

   public cqm(int $$0, cmu $$1, cqd $$2) {
      super(cqz.n, $$0);
      this.p = $$2;
      this.a(new crn(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new crn(this.o, 1, 35, 47) {
         @Override
         public boolean a(cun $$0) {
            return $$0.a(cuq.oA);
         }

         @Override
         public Pair<ale, ale> c() {
            return Pair.of(cqt.x, cqm.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crn($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crn($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cqk.a(this.k, 0));
      this.a(cqk.a(this.k, 1));
      this.a(cqk.a(this.k, 2));
      this.a(this.r).a($$1.l.gk());
      this.a(cqk.a(this.l, 0));
      this.a(cqk.a(this.l, 1));
      this.a(cqk.a(this.l, 2));
      this.a(cqk.a(this.m, 0));
      this.a(cqk.a(this.m, 1));
      this.a(cqk.a(this.m, 2));
   }

   @Override
   public void a(bql $$0) {
      if ($$0 == this.o) {
         cun $$1 = $$0.a(0);
         if (!$$1.e() && $$1.A()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (iz $$4 : dhj.c) {
                  if (dhj.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = czz.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<daa> $$7 = this.a($$1x.J(), $$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        daa $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = lp.f.a($$8.a);
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
   public boolean b(cmv $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cun $$2 = this.o.a(0);
         cun $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.e() || $$3.I() < $$4) && !$$0.fP()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.e() || ($$0.co < $$4 || $$0.co < this.k[$$1]) && !$$0.gd().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cun $$7 = $$2;
               List<daa> $$8 = this.a($$5.J(), $$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cuq.qP)) {
                     $$7 = $$2.a(cuq.uw, 1);
                     this.o.a(0, $$7);
                  }

                  for (daa $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fP()) {
                     $$3.h($$4);
                     if ($$3.e()) {
                        this.o.a(1, cun.l);
                     }
                  }

                  $$0.a(awj.ak);
                  if ($$0 instanceof arf) {
                     am.j.a((arf)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gk());
                  this.a(this.o);
                  $$5.a(null, $$6, avz.hX, awa.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.af() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<daa> a(cpj $$0, cun $$1, int $$2, int $$3) {
      this.q.b((long)(this.r.b() + $$2));
      List<daa> $$4 = czz.b($$0, this.q, $$1, $$3, false);
      if ($$1.a(cuq.qP) && $$4.size() > 1) {
         $$4.remove(this.q.a($$4.size()));
      }

      return $$4;
   }

   public int l() {
      cun $$0 = this.o.a(1);
      return $$0.e() ? 0 : $$0.I();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cmv $$0) {
      return a(this.p, $$0, dez.fr);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cun.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cun.l;
            }
         } else if ($$4.a(cuq.oA)) {
            if (!this.a($$4, 1, 2, true)) {
               return cun.l;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cun.l;
            }

            cun $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cun.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
