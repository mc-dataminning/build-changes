import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnp extends dlr implements dpr {
   public static final MapCodec<dnp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dnp::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final ebf<ja> b = doj.a;
   public static final eay c = eax.f;
   private final boolean e;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(boolean $$0, eag.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      dxq $$2 = new dxq($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dxq $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(dja $$0, iu $$1, dxq $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dxq.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxq $$5) {
         dib $$6 = $$5.a();
         boolean $$7 = !bal.b($$6.m());
         dxq.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dxq.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dxq.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(eah $$0, arq $$1, iu $$2, dib $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      dxf $$5 = $$1.c_($$2);
      if ($$5 instanceof dxq && $$3.gG()) {
         $$3.a((dxq)$$5);
         return bud.a;
      } else {
         return bud.e;
      }
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      dxf $$3 = $$1.c_($$2);
      return $$3 instanceof dxq ? ((dxq)$$3).a().k() : 0;
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, bxe $$3, czd $$4) {
      if ($$0.c_($$1) instanceof dxq $$6) {
         dib $$8 = $$6.a();
         if ($$0 instanceof arq $$9) {
            if (!$$4.c(kj.aa)) {
               $$8.a($$9.O().c(diw.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arq $$0, iu $$1, ja $$2) {
      iu.a $$3 = $$1.k();
      diw $$4 = $$0.O();
      int $$5 = $$4.d(diw.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         eah $$6 = $$0.a_($$3);
         dmf $$7 = $$6.b();
         if (!$$6.a(dmh.ln) || !($$0.c_($$3) instanceof dxq $$9) || $$9.s() != dxq.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dib $$10 = $$9.a();
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
         int $$11 = Math.max($$4.d(diw.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
