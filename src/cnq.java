import com.mojang.datafixers.util.Pair;
import java.util.List;

public class cnq extends cmw {
   static final ajv n = new ajv("item/empty_slot_lapis_lazuli");
   private final bny o = new boo(2) {
      @Override
      public void e() {
         super.e();
         cnq.this.a(this);
      }
   };
   private final cnh p;
   private final axt q = axt.a();
   private final cno r = cno.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cnq(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public cnq(int $$0, cjz $$1, cnh $$2) {
      super(cod.n, $$0);
      this.p = $$2;
      this.a(new cos(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new cos(this.o, 1, 35, 47) {
         @Override
         public boolean a(crs $$0) {
            return $$0.a(crv.oz);
         }

         @Override
         public Pair<ajv, ajv> c() {
            return Pair.of(cnx.x, cnq.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cos($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cos($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cno.a(this.k, 0));
      this.a(cno.a(this.k, 1));
      this.a(cno.a(this.k, 2));
      this.a(this.r).a($$1.m.gh());
      this.a(cno.a(this.l, 0));
      this.a(cno.a(this.l, 1));
      this.a(cno.a(this.l, 2));
      this.a(cno.a(this.m, 0));
      this.a(cno.a(this.m, 1));
      this.a(cno.a(this.m, 2));
   }

   @Override
   public void a(bny $$0) {
      if ($$0 == this.o) {
         crs $$1 = $$0.a(0);
         if (!$$1.d() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               int $$3 = 0;

               for (id $$4 : det.c) {
                  if (det.a($$1x, $$2x, $$4)) {
                     $$3++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$5 = 0; $$5 < 3; $$5++) {
                  this.k[$$5] = cxa.a(this.q, $$5, $$3, $$1);
                  this.l[$$5] = -1;
                  this.m[$$5] = -1;
                  if (this.k[$$5] < $$5 + 1) {
                     this.k[$$5] = 0;
                  }
               }

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  if (this.k[$$6] > 0) {
                     List<cxb> $$7 = this.a($$1, $$6, this.k[$$6]);
                     if ($$7 != null && !$$7.isEmpty()) {
                        cxb $$8 = $$7.get(this.q.a($$7.size()));
                        this.l[$$6] = kt.f.a($$8.a);
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
   public boolean b(cka $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         crs $$2 = this.o.a(0);
         crs $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.d() || $$3.G() < $$4) && !$$0.fM()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.d() || ($$0.cn < $$4 || $$0.cn < this.k[$$1]) && !$$0.ga().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               crs $$7 = $$2;
               List<cxb> $$8 = this.a($$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(crv.qO)) {
                     $$7 = $$2.a(crv.uu, 1);
                     this.o.a(0, $$7);
                  }

                  for (cxb $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  if (!$$0.fM()) {
                     $$3.g($$4);
                     if ($$3.d()) {
                        this.o.a(1, crs.i);
                     }
                  }

                  $$0.a(auz.ak);
                  if ($$0 instanceof apv) {
                     am.j.a((apv)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gh());
                  this.a(this.o);
                  $$5.a(null, $$6, auo.hS, aup.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ac.a($$0.ad() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<cxb> a(crs $$0, int $$1, int $$2) {
      this.q.b((long)(this.r.b() + $$1));
      List<cxb> $$3 = cxa.b(this.q, $$0, $$2, false);
      if ($$0.a(crv.qO) && $$3.size() > 1) {
         $$3.remove(this.q.a($$3.size()));
      }

      return $$3;
   }

   public int l() {
      crs $$0 = this.o.a(1);
      return $$0.d() ? 0 : $$0.G();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.p, $$0, dcj.fr);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return crs.i;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return crs.i;
            }
         } else if ($$4.a(crv.oz)) {
            if (!this.a($$4, 1, 2, true)) {
               return crs.i;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return crs.i;
            }

            crs $$5 = $$4.c(1);
            $$4.g(1);
            this.i.get(0).e($$5);
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
