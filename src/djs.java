import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djs extends dhv implements dlq {
   public static final MapCodec<djs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, djs::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dwl<jm> b = dkm.a;
   public static final dwf c = dwe.c;
   private final boolean e;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   public djs(boolean $$0, dvn.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      dtb $$2 = new dtb($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dtb $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dff $$0, jh $$1, dtb $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dtb.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dtb $$5) {
         def $$6 = $$5.b();
         boolean $$7 = !bak.b($$6.m());
         dtb.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dtb.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dtb.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dvo $$0, dff $$1, jh $$2, def $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      dsr $$5 = $$1.c_($$2);
      if ($$5 instanceof dtb && $$3.gJ()) {
         $$3.a((dtb)$$5);
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      dsr $$3 = $$1.c_($$2);
      return $$3 instanceof dtb ? ((dtb)$$3).b().k() : 0;
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bve $$3, cwf $$4) {
      if ($$0.c_($$1) instanceof dtb $$6) {
         def $$8 = $$6.b();
         if (!$$0.C) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$0.ac().b(dfb.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(dff $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dfb $$4 = $$0.ac();
      int $$5 = $$4.c(dfb.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dvo $$6 = $$0.a_($$3);
         dij $$7 = $$6.b();
         if (!$$6.a(dil.kH) || !($$0.c_($$3) instanceof dtb $$9) || $$9.t() != dtb.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            def $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dfb.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
