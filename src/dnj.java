import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnj extends dlm implements dpl {
   public static final MapCodec<dnj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("automatic").forGetter($$0x -> $$0x.e), t()).apply($$0, dnj::new)
   );
   private static final Logger d = LogUtils.getLogger();
   public static final eax<ja> b = doe.a;
   public static final eaq c = eap.f;
   private final boolean e;

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(boolean $$0, dzy.d $$1) {
      super($$1);
      this.l(this.B.b().b(b, ja.c).b(c, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      dxi $$2 = new dxi($$0, $$1);
      $$2.b(this.e);
      return $$2;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if (!$$1.C) {
         if ($$1.c_($$2) instanceof dxi $$7) {
            this.a($$1, $$2, $$7, $$1.D($$2));
         }
      }
   }

   private void a(div $$0, iu $$1, dxi $$2, boolean $$3) {
      boolean $$4 = $$2.c();
      if ($$3 != $$4) {
         $$2.a($$3);
         if ($$3) {
            if ($$2.d() || $$2.s() == dxi.a.a) {
               return;
            }

            $$2.k();
            $$0.a($$1, this, 1);
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.c_($$2) instanceof dxi $$5) {
         dhw $$6 = $$5.a();
         boolean $$7 = !bal.b($$6.m());
         dxi.a $$8 = $$5.s();
         boolean $$9 = $$5.j();
         if ($$8 == dxi.a.b) {
            $$5.k();
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }

            if ($$5.c() || $$5.d()) {
               $$1.a($$2, this, 1);
            }
         } else if ($$8 == dxi.a.c) {
            if ($$9) {
               this.a($$0, $$1, $$2, $$6, $$7);
            } else if ($$5.t()) {
               $$6.a(0);
            }
         }

         $$1.b($$2, this);
      }
   }

   private void a(dzz $$0, arq $$1, iu $$2, dhw $$3, boolean $$4) {
      if ($$4) {
         $$3.a($$1);
      } else {
         $$3.a(0);
      }

      a($$1, $$2, $$0.c(b));
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      dwx $$5 = $$1.c_($$2);
      if ($$5 instanceof dxi && $$3.gF()) {
         $$3.a((dxi)$$5);
         return bub.a;
      } else {
         return bub.e;
      }
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      dwx $$3 = $$1.c_($$2);
      return $$3 instanceof dxi ? ((dxi)$$3).a().k() : 0;
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, bxc $$3, cyy $$4) {
      if ($$0.c_($$1) instanceof dxi $$6) {
         dhw $$8 = $$6.a();
         if ($$0 instanceof arq $$9) {
            if (!$$4.c(kj.aa)) {
               $$8.a($$9.O().c(dir.p));
               $$6.b(this.e);
            }

            boolean $$10 = $$0.D($$1);
            this.a($$0, $$1, $$6, $$10);
         }
      }
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, $$0.d().g());
   }

   private static void a(arq $$0, iu $$1, ja $$2) {
      iu.a $$3 = $$1.k();
      dir $$4 = $$0.O();
      int $$5 = $$4.d(dir.y);

      while ($$5-- > 0) {
         $$3.c($$2);
         dzz $$6 = $$0.a_($$3);
         dma $$7 = $$6.b();
         if (!$$6.a(dmc.lk) || !($$0.c_($$3) instanceof dxi $$9) || $$9.s() != dxi.a.a) {
            break;
         }

         if ($$9.c() || $$9.d()) {
            dhw $$10 = $$9.a();
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
         int $$11 = Math.max($$4.d(dir.y), 0);
         d.warn("Command Block chain tried to execute more than {} steps!", $$11);
      }
   }
}
