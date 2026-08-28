import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dom extends dmo implements dqo {
   public static final MapCodec<dom> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dom::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final ecc<jb> b = dpg.a;
   public static final ebv c = ebu.f;
   private final boolean e;

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(boolean $$0, ebd.d $$1) {
      super($$1);
      this.l(this.C.b().b(b, jb.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      dyn $$2 = new dyn($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dyn $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(djx $$0, iv $$1, dyn $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dyn.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.c_($$2) instanceof dyn $$5) {
         diw $$6 = $$5.a();
         boolean $$7 = !ban.b($$6.m());
         dyn.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dyn.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dyn.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(ebe $$0, ars $$1, iv $$2, diw $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      dyc $$5 = $$1.c_($$2);
      if ($$5 instanceof dyn && $$3.gG()) {
         $$3.a((dyn)$$5);
         return bur.a;
      } else {
         return bur.e;
      }
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      dyc $$3 = $$1.c_($$2);
      return $$3 instanceof dyn ? ((dyn)$$3).a().k() : 0;
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bxu $$3, czy $$4) {
      if ($$0.c_($$1) instanceof dyn $$6) {
         diw $$8 = $$6.a();
         if ($$0 instanceof ars $$9) {
            if (!$$4.c(kk.aa)) {
               $$8.a($$9.O().c(djt.q));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(ars $$0, iv $$1, jb $$2) {
      iv.a $$3 = $$1.k();
      djt $$4 = $$0.O();
      int $$5 = $$4.d(djt.z);

      while ($$5-- > 0) {
         $$3.c($$2);
         ebe $$6 = $$0.a_($$3);
         dnc $$7 = $$6.b();
         if (!$$6.a(dne.ln) || !($$0.c_($$3) instanceof dyn $$9) || $$9.s() != dyn.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            diw $$10 = $$9.a();
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
         int $$11 = Math.max($$4.d(djt.z), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
