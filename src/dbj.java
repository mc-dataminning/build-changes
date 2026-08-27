import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class dbj extends czm implements ddi {
   public static final MapCodec<dbj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, dbj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dnt b = dcd.a;
   public static final dnq c = dnp.c;
   private final boolean e;

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbj(boolean $$0, dmy.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, ih.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      dkq $$2 = new dkq($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dkq $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dkq.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.c_($$2) instanceof dkq $$5) {
         cwa $$6 = $$5.b();
         boolean $$7 = !axr.b($$6.m());
         dkq.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dkq.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dkq.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.s()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dmz $$0, cwz $$1, ib $$2, cwa $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      dkg $$5 = $$1.c_($$2);
      if ($$5 instanceof dkq && $$3.gw()) {
         $$3.a((dkq)$$5);
         return bnc.a($$1.B);
      } else {
         return bnc.d;
      }
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      dkg $$3 = $$1.c_($$2);
      return $$3 instanceof dkq ? ((dkq)$$3).b().k() : 0;
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if ($$0.c_($$1) instanceof dkq $$6) {
         cwa $$7 = $$6.b();
         if ($$4.B()) {
            $$7.b($$4.z());
         }

         if (!$$0.B) {
            if (cof.a($$4) == null) {
               $$7.a($$0.Z().b(cwv.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dkq.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(b, $$0.d().g());
   }

   private static void a(cwz $$0, ib $$1, ih $$2) {
      ib.a $$3 = $$1.j();
      cwv $$4 = $$0.Z();
      int $$5 = $$4.c(cwv.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dmz $$6 = $$0.a_($$3);
         daa $$7 = $$6.b();
         if (!$$6.a(dac.kH) || !($$0.c_($$3) instanceof dkq $$9) || $$9.l() != dkq.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cwa $$10 = $$9.b();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.c($$3, $$7);
            } else if ($$9.s()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.c(cwv.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
