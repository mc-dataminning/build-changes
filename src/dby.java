import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dby extends czm {
   public static final MapCodec<dby> a = b(dby::new);
   public static final dnz b = dnp.aT;
   public static final dnq c = dnp.p;
   protected static final eqk d = daa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d;
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   private static void d(dmz $$0, cwz $$1, ib $$2) {
      int $$3 = $$1.a(cxi.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * aww.b($$4));
      }

      $$3 = aww.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bnc.a;
         } else {
            dmz $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(drn.c, $$2, drn.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bnc.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.c;
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dki.q, dby::a) : null;
   }

   private static void a(cwz $$0, ib $$1, dmz $$2, dkv $$3) {
      if ($$0.X() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }
}
