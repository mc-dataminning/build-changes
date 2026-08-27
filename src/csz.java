import com.google.common.collect.Maps;
import java.util.Map;

public class csz extends cuc implements cvr {
   private static final Map<csy, csz> a = Maps.newEnumMap(csy.class);
   private final csy b;

   public csz(csy $$0, cuc.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bqa a(cuh $$0, cly $$1, bso $$2, bpz $$3) {
      if ($$2 instanceof cfa $$4 && $$4.bI() && !$$4.x() && $$4.t() != this.b) {
         $$4.dU().a($$1, $$4, avo.hM, avq.h, 1.0F, 1.0F);
         if (!$$1.dU().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bqa.a($$1.dU().C);
      }

      return bqa.d;
   }

   public csy c() {
      return this.b;
   }

   public static csz a(csy $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dca $$0, drr $$1, boolean $$2, cly $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.az_(), avo.hM, avq.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
