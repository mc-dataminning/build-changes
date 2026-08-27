import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgl extends den implements dio {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgl::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dtw b = dhg.a;
   public static final dtt c = dts.c;
   private final boolean e;

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dgl(boolean $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      dqm $$2 = new dqm($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dqm $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dqm.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.c_($$2) instanceof dqm $$5) {
         dbb $$6 = $$5.b();
         boolean $$7 = !azh.b($$6.m());
         dqm.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dqm.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dqm.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dtc $$0, dca $$1, ir $$2, dbb $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      dqc $$5 = $$1.c_($$2);
      if ($$5 instanceof dqm && $$3.gK()) {
         $$3.a((dqm)$$5);
         return bqa.a($$1.C);
      } else {
         return bqa.d;
      }
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      dqc $$3 = $$1.c_($$2);
      return $$3 instanceof dqm ? ((dqm)$$3).b().k() : 0;
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      if ($$0.c_($$1) instanceof dqm $$6) {
         dbb $$7 = $$6.b();
         if (!$$0.C) {
            if (!$$4.b(ke.O)) {
               $$7.a($$0.ab().b(dbw.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dqm.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(dca $$0, ir $$1, iw $$2) {
      ir.a $$3 = $$1.j();
      dbw $$4 = $$0.ab();
      int $$5 = $$4.c(dbw.x);

      while ($$5-- > 0) {
         $$3.d($$2);
         dtc $$6 = $$0.a_($$3);
         dfc $$7 = $$6.b();
         if (!$$6.a(dfe.lF) || !($$0.c_($$3) instanceof dqm $$9) || $$9.l() != dqm.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbb $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(dbw.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
