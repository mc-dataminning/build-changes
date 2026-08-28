import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class div extends dgy implements dku {
   public static final MapCodec<div> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, div::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dvm b = djp.a;
   public static final dvj c = dvi.c;
   private final boolean e;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   public div(boolean $$0, dur.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jk.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      dsf $$2 = new dsf($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dsf $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dej $$0, jf $$1, dsf $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dsf.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.c_($$2) instanceof dsf $$5) {
         ddj $$6 = $$5.b();
         boolean $$7 = !bac.b($$6.m());
         dsf.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dsf.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dsf.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dus $$0, dej $$1, jf $$2, ddj $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      drv $$5 = $$1.c_($$2);
      if ($$5 instanceof dsf && $$3.gA()) {
         $$3.a((dsf)$$5);
         return brs.a;
      } else {
         return brs.e;
      }
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      drv $$3 = $$1.c_($$2);
      return $$3 instanceof dsf ? ((dsf)$$3).b().k() : 0;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      if ($$0.c_($$1) instanceof dsf $$6) {
         ddj $$8 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(ks.T)) {
               $$8.a($$0.ac().b(def.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.d().g());
   }

   private static void a(dej $$0, jf $$1, jk $$2) {
      jf.a $$3 = $$1.k();
      def $$4 = $$0.ac();
      int $$5 = $$4.c(def.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dus $$6 = $$0.a_($$3);
         dhm $$7 = $$6.b();
         if (!$$6.a(dho.kH) || !($$0.c_($$3) instanceof dsf $$9) || $$9.t() != dsf.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            ddj $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(def.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
