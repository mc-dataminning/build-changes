import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public abstract class cur extends cvz {
   public static final int a = 3;
   public static final djg b = djf.r;

   @Override
   protected abstract MapCodec<? extends cur> a();

   protected cur(dio.d $$0) {
      super($$0);
   }

   protected abstract Iterable<elb> b(dip var1);

   public static boolean c(dip $$0) {
      return $$0.b(b) && ($$0.a(arr.ae) || $$0.a(arr.bj)) && $$0.c(b);
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      if (!$$0.B && $$3.bN() && this.d($$1)) {
         a($$0, $$1, $$2.a(), true);
      }
   }

   protected boolean d(dip $$0) {
      return !$$0.c(b);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(b)) {
         this.b($$0).forEach($$3x -> a($$1, $$3x.b((double)$$2.u(), (double)$$2.v(), (double)$$2.w()), $$3));
      }
   }

   private static void a(csy $$0, elb $$1, auf $$2) {
      float $$3 = $$2.i();
      if ($$3 < 0.3F) {
         $$0.a(jv.ab, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
         if ($$3 < 0.17F) {
            $$0.a($$1.c + 0.5, $$1.d + 0.5, $$1.e + 0.5, arc.dl, ard.e, 1.0F + $$2.i(), $$2.i() * 0.7F + 0.3F, false);
         }
      }

      $$0.a(jv.aG, $$1.c, $$1.d, $$1.e, 0.0, 0.0, 0.0);
   }

   public static void a(@Nullable cer $$0, dip $$1, csz $$2, hv $$3) {
      a($$2, $$1, $$3, false);
      if ($$1.b() instanceof cur) {
         ((cur)$$1.b())
            .b($$1)
            .forEach($$2x -> $$2.a(jv.ab, (double)$$3.u() + $$2x.a(), (double)$$3.v() + $$2x.b(), (double)$$3.w() + $$2x.c(), 0.0, 0.1F, 0.0));
      }

      $$2.a(null, $$3, arc.dn, ard.e, 1.0F, 1.0F);
      $$2.a($$0, dmz.c, $$3);
   }

   private static void a(csz $$0, dip $$1, hv $$2, boolean $$3) {
      $$0.a($$2, $$1.a(b, Boolean.valueOf($$3)), 11);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_() && $$0.c(b)) {
         a(null, $$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
