import com.google.common.collect.Maps;
import java.util.Map;

public class ctl extends cum implements cvt {
   private static final Map<ctk, ctl> a = Maps.newEnumMap(ctk.class);
   private final ctk b;

   public ctl(ctk $$0, cum.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqw a(cur $$0, cmz $$1, btr $$2, bqv $$3) {
      if ($$2 instanceof cgd $$4 && $$4.bD() && !$$4.y() && $$4.u() != this.b) {
         $$4.dP().a($$1, $$4, awa.hM, awb.h, 1.0F, 1.0F);
         if (!$$1.dP().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqw.a($$1.dP().B);
      }

      return bqw.e;
   }

   public ctk c() {
      return this.b;
   }

   public static ctl a(ctk $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dca $$0, dqt $$1, boolean $$2, cmz $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.ay_(), awa.hM, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
