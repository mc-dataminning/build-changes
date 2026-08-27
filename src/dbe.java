import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dbe extends czm {
   public static final MapCodec<dbe> a = b(dbe::new);
   private static final int d = 6;
   public static final int b = 3;
   public static final List<dnq> c = List.of(dnp.bp, dnp.bq, dnp.br, dnp.bs, dnp.bt, dnp.bu);

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public dbe(dmy.d $$0) {
      super($$0);
      dmz $$1 = this.E.b().a(ddv.aE, ih.c);

      for (dnq $$2 : c) {
         $$1 = $$1.a($$2, Boolean.valueOf(false));
      }

      this.k($$1);
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.c_($$3) instanceof dkp $$7) {
         if (!$$0.a(auv.av)) {
            return bne.d;
         } else {
            OptionalInt $$9 = this.a($$6, $$1);
            if ($$9.isEmpty()) {
               return bne.e;
            } else if ($$1.c(c.get($$9.getAsInt()))) {
               return bne.d;
            } else {
               a($$2, $$3, $$4, $$7, $$0, $$9.getAsInt());
               return bne.a($$2.B);
            }
         }
      } else {
         return bne.e;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.c_($$2) instanceof dkp $$5) {
         OptionalInt $$7 = this.a($$4, $$0);
         if ($$7.isEmpty()) {
            return bnc.d;
         } else if (!$$0.c(c.get($$7.getAsInt()))) {
            return bnc.b;
         } else {
            a($$1, $$2, $$3, $$5, $$7.getAsInt());
            return bnc.a($$1.B);
         }
      } else {
         return bnc.d;
      }
   }

   private OptionalInt a(epn $$0, dmz $$1) {
      return a($$0, $$1.c(ddv.aE)).map($$0x -> {
         int $$1x = $$0x.j >= 0.5F ? 0 : 1;
         int $$2 = a($$0x.i);
         return OptionalInt.of($$2 + $$1x * 3);
      }).orElseGet(OptionalInt::empty);
   }

   private static Optional<epq> a(epn $$0, ih $$1) {
      ih $$2 = $$0.b();
      if ($$1 != $$2) {
         return Optional.empty();
      } else {
         ib $$3 = $$0.a().a($$2);
         epr $$4 = $$0.e().a((double)$$3.u(), (double)$$3.v(), (double)$$3.w());
         double $$5 = $$4.a();
         double $$6 = $$4.b();
         double $$7 = $$4.c();

         return switch ($$2) {
            case c -> Optional.of(new epq((float)(1.0 - $$5), (float)$$6));
            case d -> Optional.of(new epq((float)$$5, (float)$$6));
            case e -> Optional.of(new epq((float)$$7, (float)$$6));
            case f -> Optional.of(new epq((float)(1.0 - $$7), (float)$$6));
            case a, b -> Optional.empty();
         };
      }
   }

   private static int a(float $$0) {
      float $$1 = 0.0625F;
      float $$2 = 0.375F;
      if ($$0 < 0.375F) {
         return 0;
      } else {
         float $$3 = 0.6875F;
         return $$0 < 0.6875F ? 1 : 2;
      }
   }

   private static void a(cwz $$0, ib $$1, cis $$2, dkp $$3, cqk $$4, int $$5) {
      if (!$$0.B) {
         $$2.b(aui.c.b($$4.d()));
         atx $$6 = $$4.a(cqn.ut) ? aty.eV : aty.eU;
         $$3.a($$5, $$4.a(1));
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         if ($$2.f()) {
            $$4.g(1);
         }
      }
   }

   private static void a(cwz $$0, ib $$1, cis $$2, dkp $$3, int $$4) {
      if (!$$0.B) {
         cqk $$5 = $$3.a($$4, 1);
         atx $$6 = $$5.a(cqn.ut) ? aty.eY : aty.eX;
         $$0.a(null, $$1, $$6, atz.e, 1.0F, 1.0F);
         if (!$$2.fZ().e($$5)) {
            $$2.a($$5, false);
         }

         $$0.a($$2, drn.c, $$1);
      }
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkp($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(ddv.aE);
      c.forEach($$1 -> $$0.a($$1));
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof dkp $$6 && !$$6.ai_()) {
            for (int $$7 = 0; $$7 < 6; $$7++) {
               cqk $$8 = $$6.a($$7);
               if (!$$8.b()) {
                  bmy.a($$1, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), $$8);
               }
            }

            $$6.a();
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(ddv.aE, $$0.g().g());
   }

   @Override
   public dmz a(dmz $$0, dgm $$1) {
      return $$0.a(ddv.aE, $$1.a($$0.c(ddv.aE)));
   }

   @Override
   public dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(ddv.aE)));
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      if ($$1.x_()) {
         return 0;
      } else {
         return $$1.c_($$2) instanceof dkp $$3 ? $$3.j() + 1 : 0;
      }
   }
}
