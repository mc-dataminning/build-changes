import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkv extends diy implements dmv {
   public static final MapCodec<dkv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dkv::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dxu<jn> b = dlq.a;
   public static final dxo c = dxn.g;
   private final boolean e;

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(boolean $$0, dww.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      duj $$2 = new duj($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof duj $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgi $$0, ji $$1, duj $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == duj.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof duj $$5) {
         dfi $$6 = $$5.b();
         boolean $$7 = !azw.b($$6.m());
         duj.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == duj.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == duj.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dwx $$0, arc $$1, ji $$2, dfi $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      dtz $$5 = $$1.c_($$2);
      if ($$5 instanceof duj && $$3.gG()) {
         $$3.a((duj)$$5);
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      dtz $$3 = $$1.c_($$2);
      return $$3 instanceof duj ? ((duj)$$3).b().k() : 0;
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvg $$3, cwp $$4) {
      if ($$0.c_($$1) instanceof duj $$6) {
         dfi $$8 = $$6.b();
         if ($$0 instanceof arc $$9) {
            if (!$$4.b(kv.Y)) {
               $$8.a($$9.O().b(dge.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.c;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arc $$0, ji $$1, jn $$2) {
      ji.a $$3 = $$1.k();
      dge $$4 = $$0.O();
      int $$5 = $$4.c(dge.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dwx $$6 = $$0.a_($$3);
         djm $$7 = $$6.b();
         if (!$$6.a(djo.lj) || !($$0.c_($$3) instanceof duj $$9) || $$9.s() != duj.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dfi $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dge.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
