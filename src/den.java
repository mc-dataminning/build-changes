import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public class den extends dcq implements dgm {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), u()).apply($$0, den::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final drb b = dfh.a;
   public static final dqy c = dqx.c;
   private final boolean e;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(boolean $$0, dqg.d $$1) {
      super($$1);
      this.k(this.E.b().a(b, is.c).a(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      dnw $$2 = new dnw($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B) {
         if ($$1.c_($$2) instanceof dnw $$7) {
            boolean $$8 = $$1.C($$2);
            boolean $$9 = $$7.c();
            $$7.a($$8);
            if (!$$9 && !$$7.d() && $$7.l() != dnw.a.a) {
               if ($$8) {
                  $$7.k();
                  $$1.a($$2, this, 1);
               }
            }
         }
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.c_($$2) instanceof dnw $$5) {
         cze $$6 = $$5.b();
         boolean $$7 = !ayu.b($$6.m());
         dnw.a $$8 = $$5.l();
         boolean $$9 = $$5.j();
         if ($$8 == dnw.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dnw.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dqh $$0, dad $$1, in $$2, cze $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      dnm $$5 = $$1.c_($$2);
      if ($$5 instanceof dnw && $$3.gx()) {
         $$3.a((dnw)$$5);
         return bpm.a($$1.B);
      } else {
         return bpm.d;
      }
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      dnm $$3 = $$1.c_($$2);
      return $$3 instanceof dnw ? ((dnw)$$3).b().k() : 0;
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
      if ($$0.c_($$1) instanceof dnw $$6) {
         cze $$7 = $$6.b();
         if (!$$0.B) {
            if (!$$4.b(ka.M)) {
               $$7.a($$0.aa().b(czz.p));
               $$6.b(this.e);
            }

            if ($$6.l() == dnw.a.a) {
               boolean $$8 = $$0.C($$1);
               $$6.a($$8);
            }
         }
      }
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dqh a(cwi $$0) {
      return this.n().a(b, $$0.d().g());
   }

   private static void a(dad $$0, in $$1, is $$2) {
      in.a $$3 = $$1.j();
      czz $$4 = $$0.aa();
      int $$5 = $$4.c(czz.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dqh $$6 = $$0.a_($$3);
         dde $$7 = $$6.b();
         if (!$$6.a(ddg.kH) || !($$0.c_($$3) instanceof dnw $$9) || $$9.l() != dnw.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            cze $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(czz.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
