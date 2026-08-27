import com.google.common.collect.Maps;
import java.util.Map;

public class ckw extends cmc implements cng {
   private static final Map<ckv, ckw> a = Maps.newEnumMap(ckv.class);
   private final ckv b;

   public ckw(ckv $$0, cmc.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bjl a(cmh $$0, cer $$1, blv $$2, bjk $$3) {
      if ($$2 instanceof bye $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, arc.hi, ard.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bjl.a($$1.dM().B);
      }

      return bjl.d;
   }

   public ckv d() {
      return this.b;
   }

   public static ckw a(ckv $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(csy $$0, dhm $$1, boolean $$2, cer $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aB_(), arc.hi, ard.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
