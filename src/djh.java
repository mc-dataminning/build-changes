import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djh extends dhk implements dlf {
   public static final MapCodec<djh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, djh::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dvx b = dkb.a;
   public static final dvu c = dvt.c;
   private final boolean e;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   public djh(boolean $$0, dvc.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jl.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      dsq $$2 = new dsq($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dsq $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dev $$0, jg $$1, dsq $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == dsq.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.c_($$2) instanceof dsq $$5) {
         ddv $$6 = $$5.b();
         boolean $$7 = !bag.b($$6.m());
         dsq.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == dsq.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dsq.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dvd $$0, dev $$1, jg $$2, ddv $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      dsg $$5 = $$1.c_($$2);
      if ($$5 instanceof dsq && $$3.gH()) {
         $$3.a((dsq)$$5);
         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      dsg $$3 = $$1.c_($$2);
      return $$3 instanceof dsq ? ((dsq)$$3).b().k() : 0;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, buv $$3, cvx $$4) {
      if ($$0.c_($$1) instanceof dsq $$6) {
         ddv $$8 = $$6.b();
         if (!$$0.C) {
            if (!$$4.b(kt.X)) {
               $$8.a($$0.ac().b(der.p));
               $$6.b(this.e);
            }

            boolean $$9 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$9);
         }
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvd a(czm $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(dev $$0, jg $$1, jl $$2) {
      jg.a $$3 = $$1.k();
      der $$4 = $$0.ac();
      int $$5 = $$4.c(der.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dvd $$6 = $$0.a_($$3);
         dhy $$7 = $$6.b();
         if (!$$6.a(dia.kH) || !($$0.c_($$3) instanceof dsq $$9) || $$9.t() != dsq.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            ddv $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(der.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
