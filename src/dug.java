import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dug extends dod implements dqp {
   public static final MapCodec<dug> c = b(dug::new);
   public static final eam<eak> d = dod.b;
   private static final feq e = dlu.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dug> a() {
      return c;
   }

   public dug(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dlw.ll);
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(dlw.bD);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = super.a($$0);
      if ($$1 != null) {
         evv $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axf.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      if ($$0.c(d) == eak.a) {
         dzo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == eak.b;
      } else {
         evv $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axf.a) && $$4.e() == 8;
      }
   }

   @Override
   protected evv b_(dzo $$0) {
      return evw.c.a(false);
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return false;
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      return false;
   }
}
