import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlv extends djx implements dnu {
   public static final MapCodec<dlv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dlv::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dyr<jm> b = dmq.a;
   public static final dyl c = dyk.c;
   private final boolean e;

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(boolean $$0, dxt.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      dvg $$2 = new dvg($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dvg $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dhh $$0, jh $$1, dvg $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dvg.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof dvg $$5) {
         dgh $$6 = $$5.b();
         boolean $$7 = !bbb.b($$6.m());
         dvg.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dvg.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dvg.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dxu $$0, ash $$1, jh $$2, dgh $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      duw $$5 = $$1.c_($$2);
      if ($$5 instanceof dvg && $$3.gE()) {
         $$3.a((dvg)$$5);
         return bti.a;
      } else {
         return bti.e;
      }
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      duw $$3 = $$1.c_($$2);
      return $$3 instanceof dvg ? ((dvg)$$3).b().k() : 0;
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, bwf $$3, cxo $$4) {
      if ($$0.c_($$1) instanceof dvg $$6) {
         dgh $$8 = $$6.b();
         if ($$0 instanceof ash $$9) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$9.N().b(dhd.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ash $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dhd $$4 = $$0.N();
      int $$5 = $$4.c(dhd.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dxu $$6 = $$0.a_($$3);
         dkl $$7 = $$6.b();
         if (!$$6.a(dkn.lc) || !($$0.c_($$3) instanceof dvg $$9) || $$9.t() != dvg.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dgh $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dhd.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
