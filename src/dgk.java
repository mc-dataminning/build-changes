import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dgk extends den implements dij {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dgk::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dsy b = dhe.a;
   public static final dsv c = dsu.c;
   private final boolean e;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(boolean $$0, dsd.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      dpt $$2 = new dpt($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dpt $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dpt.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dpt $$5) {
         dbb $$6 = $$5.b();
         boolean $$7 = !azv.b($$6.m());
         dpt.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dpt.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dpt.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dse $$0, dca $$1, iz $$2, dbb $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      dpj $$5 = $$1.c_($$2);
      if ($$5 instanceof dpt && $$3.gz()) {
         $$3.a((dpt)$$5);
         return bqw.a($$1.B);
      } else {
         return bqw.e;
      }
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      dpj $$3 = $$1.c_($$2);
      return $$3 instanceof dpt ? ((dpt)$$3).b().k() : 0;
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      if ($$0.c_($$1) instanceof dpt $$6) {
         dbb $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(km.O)) {
               $$7.a($$0.ab().b(dbw.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dpt.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(dca $$0, iz $$1, je $$2) {
      iz.a $$3 = $$1.j();
      dbw $$4 = $$0.ab();
      int $$5 = $$4.c(dbw.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dse $$6 = $$0.a_($$3);
         dfb $$7 = $$6.b();
         if (!$$6.a(dfd.kH) || !($$0.c_($$3) instanceof dpt $$9) || $$9.l() != dpt.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dbb $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.u()) {
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
