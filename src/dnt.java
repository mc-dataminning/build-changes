import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnt extends dlg {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final eao b = eae.aW;
   public static final eaf c = eae.s;
   private static final feq d = dlu.b(16.0, 0.0, 6.0);

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   protected boolean g_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   private static void d(dzo $$0, dip $$1, iu $$2) {
      int $$3 = $$1.a(diy.a, $$2) - $$1.z_();
      float $$4 = $$1.a(1.0F);
      boolean $$5 = $$0.c(c);
      if ($$5) {
         $$3 = 15 - $$3;
      } else if ($$3 > 0) {
         float $$6 = $$4 < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         $$4 += ($$6 - $$4) * 0.2F;
         $$3 = Math.round((float)$$3 * azk.b($$4));
      }

      $$3 = azk.a($$3, 0, 15);
      if ($$0.c(b) != $$3) {
         $$1.a($$2, $$0.b(b, Integer.valueOf($$3)), 3);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$3.gv()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         if (!$$1.C) {
            dzo $$5 = $$0.a(c);
            $$1.a($$2, $$5, 2);
            $$1.a(eeo.c, $$2, eeo.a.a($$3, $$5));
            d($$5, $$1, $$2);
         }

         return bty.a;
      }
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return !$$0.C && $$0.B_().g() ? a($$2, dwp.r, dnt::a) : null;
   }

   private static void a(dip $$0, iu $$1, dzo $$2, dxe $$3) {
      if ($$0.ae() % 20L == 0L) {
         d($$2, $$0, $$1);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }
}
