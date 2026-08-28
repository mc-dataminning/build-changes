import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doo extends dmq implements dqq {
   public static final MapCodec<doo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, doo::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final ece<jc> b = dpi.a;
   public static final ebx c = ebw.f;
   private final boolean e;

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(boolean $$0, ebf.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dye a(iw $$0, ebg $$1) {
      dyp $$2 = new dyp($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dyp $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(djz $$0, iw $$1, dyp $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dyp.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.c_($$2) instanceof dyp $$5) {
         diy $$6 = $$5.a();
         boolean $$7 = !bap.b($$6.m());
         dyp.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dyp.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dyp.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(ebg $$0, aru $$1, iw $$2, diy $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      dye $$5 = $$1.c_($$2);
      if ($$5 instanceof dyp && $$3.gG()) {
         $$3.a((dyp)$$5);
         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      dye $$3 = $$1.c_($$2);
      return $$3 instanceof dyp ? ((dyp)$$3).a().k() : 0;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bxw $$3, daa $$4) {
      if ($$0.c_($$1) instanceof dyp $$6) {
         diy $$8 = $$6.a();
         if ($$0 instanceof aru $$9) {
            if (!$$4.c(kl.aa)) {
               $$8.a($$9.O().c(djv.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(aru $$0, iw $$1, jc $$2) {
      iw.a $$3 = $$1.k();
      djv $$4 = $$0.O();
      int $$5 = $$4.d(djv.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         ebg $$6 = $$0.a_($$3);
         dne $$7 = $$6.b();
         if (!$$6.a(dng.ln) || !($$0.c_($$3) instanceof dyp $$9) || $$9.s() != dyp.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            diy $$10 = $$9.a();
            if ($$9.k()) {
               if (!$$10.a($$0)) {
                  break;
               }

               $$0.b($$3, $$7);
            } else if ($$9.t()) {
               $$10.a(0);
            }
         }

         $$2 = $$6.c(b);
      }

      if ($$5 <= 0) {
         int $$11 = Math.max($$4.d(djv.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
