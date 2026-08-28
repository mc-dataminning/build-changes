import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doy extends dna implements dra {
   public static final MapCodec<doy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, doy::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final eco<jc> b = dps.a;
   public static final ech c = ecg.f;
   private final boolean e;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(boolean $$0, ebp.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jc.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      dyz $$2 = new dyz($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dyz $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(dkj $$0, iw $$1, dyz $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dyz.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.c_($$2) instanceof dyz $$5) {
         dji $$6 = $$5.a();
         boolean $$7 = !bay.b($$6.m());
         dyz.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dyz.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dyz.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(ebq $$0, asb $$1, iw $$2, dji $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      dyo $$5 = $$1.c_($$2);
      if ($$5 instanceof dyz && $$3.gH()) {
         $$3.a((dyz)$$5);
         return bvc.a;
      } else {
         return bvc.e;
      }
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      dyo $$3 = $$1.c_($$2);
      return $$3 instanceof dyz ? ((dyz)$$3).a().k() : 0;
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
      if ($$0.c_($$1) instanceof dyz $$6) {
         dji $$8 = $$6.a();
         if ($$0 instanceof asb $$9) {
            if (!$$4.c(kl.aa)) {
               $$8.a($$9.O().c(dkf.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebq a(ded $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(asb $$0, iw $$1, jc $$2) {
      iw.a $$3 = $$1.k();
      dkf $$4 = $$0.O();
      int $$5 = $$4.d(dkf.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         ebq $$6 = $$0.a_($$3);
         dno $$7 = $$6.b();
         if (!$$6.a(dnq.ln) || !($$0.c_($$3) instanceof dyz $$9) || $$9.s() != dyz.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dji $$10 = $$9.a();
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
         int $$11 = Math.max($$4.d(dkf.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
