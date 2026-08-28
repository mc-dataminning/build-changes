import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlm extends djp implements dnm {
   public static final MapCodec<dlm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dlm::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dyl<jm> b = dmh.a;
   public static final dyf c = dye.g;
   private final boolean e;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(boolean $$0, dxn.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      dva $$2 = new dva($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dva $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgz $$0, jh $$1, dva $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dva.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.c_($$2) instanceof dva $$5) {
         dfz $$6 = $$5.b();
         boolean $$7 = !bar.b($$6.m());
         dva.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dva.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dva.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dxo $$0, arx $$1, jh $$2, dfz $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      duq $$5 = $$1.c_($$2);
      if ($$5 instanceof dva && $$3.gG()) {
         $$3.a((dva)$$5);
         return bta.a;
      } else {
         return bta.e;
      }
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      duq $$3 = $$1.c_($$2);
      return $$3 instanceof dva ? ((dva)$$3).b().k() : 0;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvx $$3, cxg $$4) {
      if ($$0.c_($$1) instanceof dva $$6) {
         dfz $$8 = $$6.b();
         if ($$0 instanceof arx $$9) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$9.O().b(dgv.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arx $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dgv $$4 = $$0.O();
      int $$5 = $$4.c(dgv.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dxo $$6 = $$0.a_($$3);
         dkd $$7 = $$6.b();
         if (!$$6.a(dkf.lj) || !($$0.c_($$3) instanceof dva $$9) || $$9.s() != dva.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dfz $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dgv.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
