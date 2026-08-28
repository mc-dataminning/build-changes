import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqp extends cpu {
   static final akr n = akr.b("item/empty_slot_lapis_lazuli");
   private final bqk o = new bra(2) {
      @Override
      public void e() {
         super.e();
         cqp.this.a(this);
      }
   };
   private final cqg p;
   private final ayw q = ayw.a();
   private final cqn r = cqn.a();
   public final int[] k = new int[3];
   public final int[] l = new int[]{-1, -1, -1};
   public final int[] m = new int[]{-1, -1, -1};

   public cqp(int $$0, cmw $$1) {
      this($$0, $$1, cqg.a);
   }

   public cqp(int $$0, cmw $$1, cqg $$2) {
      super(crc.n, $$0);
      this.p = $$2;
      this.a(new crq(this.o, 0, 15, 47) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a(new crq(this.o, 1, 35, 47) {
         @Override
         public boolean a(cuq $$0) {
            return $$0.a(cut.oB);
         }

         @Override
         public Pair<akr, akr> b() {
            return Pair.of(cqw.x, cqp.n);
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crq($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crq($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(cqn.a(this.k, 0));
      this.a(cqn.a(this.k, 1));
      this.a(cqn.a(this.k, 2));
      this.a(this.r).a($$1.l.gh());
      this.a(cqn.a(this.l, 0));
      this.a(cqn.a(this.l, 1));
      this.a(cqn.a(this.l, 2));
      this.a(cqn.a(this.m, 0));
      this.a(cqn.a(this.m, 1));
      this.a(cqn.a(this.m, 2));
   }

   @Override
   public void a(bqk $$0) {
      if ($$0 == this.o) {
         cuq $$1 = $$0.a(0);
         if (!$$1.e() && $$1.z()) {
            this.p.a(($$1x, $$2x) -> {
               jr<jm<dac>> $$3 = $$1x.H_().d(lu.aL).u();
               int $$4 = 0;

               for (jd $$5 : dik.c) {
                  if (dik.a($$1x, $$2x, $$5)) {
                     $$4++;
                  }
               }

               this.q.b((long)this.r.b());

               for (int $$6 = 0; $$6 < 3; $$6++) {
                  this.k[$$6] = dae.a(this.q, $$6, $$4, $$1);
                  this.l[$$6] = -1;
                  this.m[$$6] = -1;
                  if (this.k[$$6] < $$6 + 1) {
                     this.k[$$6] = 0;
                  }
               }

               for (int $$7 = 0; $$7 < 3; $$7++) {
                  if (this.k[$$7] > 0) {
                     List<daf> $$8 = this.a($$1x.H_(), $$1, $$7, this.k[$$7]);
                     if ($$8 != null && !$$8.isEmpty()) {
                        daf $$9 = $$8.get(this.q.a($$8.size()));
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
   public boolean a(cmx $$0, int $$1) {
      if ($$1 >= 0 && $$1 < this.k.length) {
         cuq $$2 = this.o.a(0);
         cuq $$3 = this.o.a(1);
         int $$4 = $$1 + 1;
         if (($$3.e() || $$3.H() < $$4) && !$$0.fM()) {
            return false;
         } else if (this.k[$$1] <= 0 || $$2.e() || ($$0.cq < $$4 || $$0.cq < this.k[$$1]) && !$$0.ga().d) {
            return false;
         } else {
            this.p.a(($$5, $$6) -> {
               cuq $$7 = $$2;
               List<daf> $$8 = this.a($$5.H_(), $$2, $$1, this.k[$$1]);
               if (!$$8.isEmpty()) {
                  $$0.a($$2, $$4);
                  if ($$2.a(cut.qP)) {
                     $$7 = $$2.a((dcv)cut.uw);
                     this.o.a(0, $$7);
                  }

                  for (daf $$9 : $$8) {
                     $$7.a($$9.a, $$9.b);
                  }

                  $$3.a($$4, $$0);
                  if ($$3.e()) {
                     this.o.a(1, cuq.l);
                  }

                  $$0.a(avz.ak);
                  if ($$0 instanceof aqv) {
                     an.j.a((aqv)$$0, $$7, $$4);
                  }

                  this.o.e();
                  this.r.a($$0.gh());
                  this.a(this.o);
                  $$5.a(null, $$6, avp.hX, avq.e, 1.0F, $$5.z.i() * 0.1F + 0.9F);
               }
            });
            return true;
         }
      } else {
         ad.b($$0.ah() + " pressed invalid button id: " + $$1);
         return false;
      }
   }

   private List<daf> a(ka $$0, cuq $$1, int $$2, int $$3) {
      this.q.b((long)(this.r.b() + $$2));
      Optional<jq.c<dac>> $$4 = $$0.d(lu.aL).b(awh.k);
      if ($$4.isEmpty()) {
         return List.of();
      } else {
         List<daf> $$5 = dae.b(this.q, $$1, $$3, $$4.get().a());
         if ($$1.a(cut.qP) && $$5.size() > 1) {
            $$5.remove(this.q.a($$5.size()));
         }

         return $$5;
      }
   }

   public int l() {
      cuq $$0 = this.o.a(1);
      return $$0.e() ? 0 : $$0.H();
   }

   public int m() {
      return this.r.b();
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.p.a(($$1, $$2) -> this.a($$0, this.o));
   }

   @Override
   public boolean b(cmx $$0) {
      return a(this.p, $$0, dga.fr);
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            if (!this.a($$4, 2, 38, true)) {
               return cuq.l;
            }
         } else if ($$1 == 1) {
            if (!this.a($$4, 2, 38, true)) {
               return cuq.l;
            }
         } else if ($$4.a(cut.oB)) {
            if (!this.a($$4, 1, 2, true)) {
               return cuq.l;
            }
         } else {
            if (this.i.get(0).h() || !this.i.get(0).a($$4)) {
               return cuq.l;
            }

            cuq $$5 = $$4.c(1);
            $$4.h(1);
            this.i.get(0).e($$5);
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }
}
