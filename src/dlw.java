import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlw extends djy implements dnv {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dlw::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dys<jm> b = dmr.a;
   public static final dym c = dyl.c;
   private final boolean e;

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(boolean $$0, dxu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      dvh $$2 = new dvh($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dvh $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dhi $$0, jh $$1, dvh $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dvh.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof dvh $$5) {
         dgi $$6 = $$5.b();
         boolean $$7 = !bbb.b($$6.m());
         dvh.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dvh.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dvh.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dxv $$0, ash $$1, jh $$2, dgi $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      dux $$5 = $$1.c_($$2);
      if ($$5 instanceof dvh && $$3.gG()) {
         $$3.a((dvh)$$5);
         return btj.a;
      } else {
         return btj.e;
      }
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      dux $$3 = $$1.c_($$2);
      return $$3 instanceof dvh ? ((dvh)$$3).b().k() : 0;
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, bwg $$3, cxp $$4) {
      if ($$0.c_($$1) instanceof dvh $$6) {
         dgi $$8 = $$6.b();
         if ($$0 instanceof ash $$9) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$9.N().b(dhe.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ash $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dhe $$4 = $$0.N();
      int $$5 = $$4.c(dhe.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dxv $$6 = $$0.a_($$3);
         dkm $$7 = $$6.b();
         if (!$$6.a(dko.lc) || !($$0.c_($$3) instanceof dvh $$9) || $$9.t() != dvh.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dgi $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dhe.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
