import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dln extends djq implements dno {
   public static final MapCodec<dln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dln::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dyo<jn> b = dmi.a;
   public static final dyh c = dyg.f;
   private final boolean e;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(boolean $$0, dxp.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      dvc $$2 = new dvc($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dvc $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgz $$0, ji $$1, dvc $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dvc.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.c_($$2) instanceof dvc $$5) {
         dga $$6 = $$5.b();
         boolean $$7 = !azw.b($$6.m());
         dvc.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dvc.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dvc.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(dxq $$0, ard $$1, ji $$2, dga $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      dus $$5 = $$1.c_($$2);
      if ($$5 instanceof dvc && $$3.gI()) {
         $$3.a((dvc)$$5);
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      dus $$3 = $$1.c_($$2);
      return $$3 instanceof dvc ? ((dvc)$$3).b().k() : 0;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      if ($$0.c_($$1) instanceof dvc $$6) {
         dga $$8 = $$6.b();
         if ($$0 instanceof ard $$9) {
            if (!$$4.b(kv.aa)) {
               $$8.a($$9.O().b(dgv.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ard $$0, ji $$1, jn $$2) {
      ji.a $$3 = $$1.k();
      dgv $$4 = $$0.O();
      int $$5 = $$4.c(dgv.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dxq $$6 = $$0.a_($$3);
         dke $$7 = $$6.b();
         if (!$$6.a(dkg.lj) || !($$0.c_($$3) instanceof dvc $$9) || $$9.s() != dvc.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dga $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dgv.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
