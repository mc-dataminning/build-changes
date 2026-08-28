import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkw extends diz implements dmw {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dkw::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dxv<jn> b = dlr.a;
   public static final dxp c = dxo.g;
   private final boolean e;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(boolean $$0, dwx.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      duk $$2 = new duk($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof duk $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgj $$0, ji $$1, duk $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == duk.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof duk $$5) {
         dfj $$6 = $$5.b();
         boolean $$7 = !azw.b($$6.m());
         duk.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == duk.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == duk.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dwy $$0, ard $$1, ji $$2, dfj $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      dua $$5 = $$1.c_($$2);
      if ($$5 instanceof duk && $$3.gG()) {
         $$3.a((duk)$$5);
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      dua $$3 = $$1.c_($$2);
      return $$3 instanceof duk ? ((duk)$$3).b().k() : 0;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      if ($$0.c_($$1) instanceof duk $$6) {
         dfj $$8 = $$6.b();
         if ($$0 instanceof ard $$9) {
            if (!$$4.b(kv.Y)) {
               $$8.a($$9.O().b(dgf.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji.a $$3 = $$1.k();
      dgf $$4 = $$0.O();
      int $$5 = $$4.c(dgf.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dwy $$6 = $$0.a_($$3);
         djn $$7 = $$6.b();
         if (!$$6.a(djp.lj) || !($$0.c_($$3) instanceof duk $$9) || $$9.s() != duk.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dfj $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dgf.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
