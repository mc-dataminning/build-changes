import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djn extends dhq implements dll {
   public static final MapCodec<djn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, djn::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dwd b = dkh.a;
   public static final dwa c = dvz.c;
   private final boolean e;

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   public djn(boolean $$0, dvi.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      dsw $$2 = new dsw($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dsw $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dfb $$0, jh $$1, dsw $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dsw.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.c_($$2) instanceof dsw $$5) {
         deb $$6 = $$5.b();
         boolean $$7 = !bah.b($$6.m());
         dsw.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dsw.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dsw.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dvj $$0, dfb $$1, jh $$2, deb $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      dsm $$5 = $$1.c_($$2);
      if ($$5 instanceof dsw && $$3.gH()) {
         $$3.a((dsw)$$5);
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      dsm $$3 = $$1.c_($$2);
      return $$3 instanceof dsw ? ((dsw)$$3).b().k() : 0;
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      if ($$0.c_($$1) instanceof dsw $$6) {
         deb $$8 = $$6.b();
         if (!$$0.C) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$0.ac().b(dex.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(dfb $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dex $$4 = $$0.ac();
      int $$5 = $$4.c(dex.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dvj $$6 = $$0.a_($$3);
         die $$7 = $$6.b();
         if (!$$6.a(dig.kH) || !($$0.c_($$3) instanceof dsw $$9) || $$9.t() != dsw.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            deb $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dex.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
