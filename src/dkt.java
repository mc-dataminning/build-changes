import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkt extends diw implements dmt {
   public static final MapCodec<dkt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dkt::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final dxs<jn> b = dlo.a;
   public static final dxm c = dxl.g;
   private final boolean e;

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(boolean $$0, dwu.d $$1) {
      super($$1);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      duh $$2 = new duh($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof duh $$7) {
            this.a($$1, $$2, $$7, $$1.C($$2));
         }
      }
   }

   private void a(dgg $$0, ji $$1, duh $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == duh.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.c_($$2) instanceof duh $$5) {
         dfg $$6 = $$5.b();
         boolean $$7 = !azv.b($$6.m());
         duh.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == duh.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == duh.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.c($$2, this);
      }
   }

   private void a(dwv $$0, arc $$1, ji $$2, dfg $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      dtx $$5 = $$1.c_($$2);
      if ($$5 instanceof duh && $$3.gG()) {
         $$3.a((duh)$$5);
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      dtx $$3 = $$1.c_($$2);
      return $$3 instanceof duh ? ((duh)$$3).b().k() : 0;
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, bvf $$3, cwn $$4) {
      if ($$0.c_($$1) instanceof duh $$6) {
         dfg $$8 = $$6.b();
         if ($$0 instanceof arc $$9) {
            if (!$$4.b(kv.Y)) {
               $$8.a($$9.O().b(dgc.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.C($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arc $$0, ji $$1, jn $$2) {
      ji.a $$3 = $$1.k();
      dgc $$4 = $$0.O();
      int $$5 = $$4.c(dgc.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dwv $$6 = $$0.a_($$3);
         djk $$7 = $$6.b();
         if (!$$6.a(djm.lj) || !($$0.c_($$3) instanceof duh $$9) || $$9.s() != duh.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dfg $$10 = $$9.b();
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
         int $$11 = Math.max($$4.c(dgc.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
