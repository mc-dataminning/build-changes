import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlo extends djq implements dnn {
   public static final MapCodec<dlo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dlo::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dyk<jm> b = dmj.a;
   public static final dye c = dyd.c;
   private final boolean e;

   @Override
   public MapCodec<dlo> a() {
      return a;
   }

   public dlo(boolean $$0, dxm.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      duz $$2 = new duz($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof duz $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dha $$0, jh $$1, duz $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.t() == duz.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.c_($$2) instanceof duz $$5) {
         dga $$6 = $$5.b();
         boolean $$7 = !bbb.b($$6.m());
         duz.a $$8 = $$5.t();
         boolean $$9 = $$5.j();
         if ($$8 == duz.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == duz.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.u()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dxn $$0, ash $$1, jh $$2, dga $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      dup $$5 = $$1.c_($$2);
      if ($$5 instanceof duz && $$3.gE()) {
         $$3.a((duz)$$5);
         return bte.a;
      } else {
         return bte.e;
      }
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      dup $$3 = $$1.c_($$2);
      return $$3 instanceof duz ? ((duz)$$3).b().k() : 0;
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, bwb $$3, cxk $$4) {
      if ($$0.c_($$1) instanceof duz $$6) {
         dga $$8 = $$6.b();
         if ($$0 instanceof ash $$9) {
            if (!$$4.b(ku.Y)) {
               $$8.a($$9.N().b(dgw.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ash $$0, jh $$1, jm $$2) {
      jh.a $$3 = $$1.k();
      dgw $$4 = $$0.N();
      int $$5 = $$4.c(dgw.x);

      while ($$5-- > 0) {
         $$3.c($$2);
         dxn $$6 = $$0.a_($$3);
         dke $$7 = $$6.b();
         if (!$$6.a(dkg.lc) || !($$0.c_($$3) instanceof duz $$9) || $$9.t() != duz.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dga $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dgw.x), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
