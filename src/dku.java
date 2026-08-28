import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dku extends dor {
   public static final MapCodec<dku> a = b(dku::new);
   public static final eam<ja> b = dpt.e;
   private static final Map<ja.a, feq> c = fen.a(
      fen.a(dlu.b(12.0, 0.0, 4.0), dlu.a(8.0, 10.0, 4.0, 5.0), dlu.a(4.0, 8.0, 5.0, 10.0), dlu.a(10.0, 16.0, 10.0, 16.0))
   );
   private static final ww d = ww.c("container.repair");
   private static final float e = 2.0F;
   private static final int f = 40;

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   public dku(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c));
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awv.aC);
      }

      return bty.a;
   }

   @Nullable
   @Override
   protected bua b(dzo $$0, dip $$1, iu $$2) {
      return new bug(($$2x, $$3, $$4) -> new cun($$2x, $$3, cux.a($$1, $$2)), d);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c.get($$0.c(b).o());
   }

   @Override
   protected void a(cmw $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, dzo $$3, cmw $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dip $$0, iu $$1, cmw $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bup a(bwa $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dzo e(dzo $$0) {
      if ($$0.a(dlw.hp)) {
         return dlw.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dlw.hq) ? dlw.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   public int b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
