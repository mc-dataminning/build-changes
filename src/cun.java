import com.google.common.collect.Maps;
import java.util.Map;

public class cun extends cvn implements cww {
   private static final Map<cum, cun> a = Maps.newEnumMap(cum.class);
   private final cum b;

   public cun(cum $$0, cvn.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public brs a(cvs $$0, cnx $$1, bun $$2, brr $$3) {
      if ($$2 instanceof cgz $$4 && $$4.bI() && !$$4.y() && $$4.t() != this.b) {
         $$4.dS().a($$1, $$4, awg.hN, awh.h, 1.0F, 1.0F);
         if (!$$1.dS().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return brs.a;
      }

      return brs.e;
   }

   public cum c() {
      return this.b;
   }

   public static cun a(cum $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dej $$0, dth $$1, boolean $$2, cnx $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aC_(), awg.hN, awh.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
