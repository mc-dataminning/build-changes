import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dgh {
   public static final MapCodec<dit> a = b(dit::new);
   public static final dva b = duq.aT;
   public static final dur c = duq.p;
   protected static final eyx d = dgv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   public dit(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d;
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b);
   }

   private static void d(dua $$0, dds $$1, je $$2) {
      int $$3 = $$1.a(deb.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azc.b($$4));
      }

      $$3 = azc.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$3.go()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.B) {
            dua $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dyx.c, $$2, dyx.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return brk.a;
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return !$$0.B && $$0.B_().g() ? a($$2, drg.q, dit::a) : null;
   }

   private static void a(dds $$0, je $$1, dua $$2, drt $$3) {
      if ($$0.aa() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c);
   }
}
