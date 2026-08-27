import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class def extends dbt {
   public static final MapCodec<def> a = b(def::new);
   public static final dqi b = dpy.aT;
   public static final dpz c = dpy.p;
   protected static final etc d = dch.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

   @Override
   public MapCodec<def> a() {
      return a;
   }

   public def(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d;
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b);
   }

   private static void d(dpi $$0, czg $$1, id $$2) {
      int $$3 = $$1.a(czp.a, $$2) - $$1.B_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * axm.b($$4));
      }

      $$3 = axm.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$3.gl()) {
         if ($$1.B) {
            return bof.a;
         } else {
            dpi $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(dub.c, $$2, dub.a.a($$3, $$5));
            d($$5, $$1, $$2);
            return bof.b;
         }
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return !$$0.B && $$0.D_().g() ? a($$2, dmq.q, def::a) : null;
   }

   private static void a(czg $$0, id $$1, dpi $$2, dnd $$3) {
      if ($$0.Y() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }
}
