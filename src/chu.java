import com.google.common.collect.Maps;
import java.util.Map;

public class chu extends cja implements cke {
   private static final Map<cht, chu> a = Maps.newEnumMap(cht.class);
   private final cht b;

   public chu(cht $$0, cja.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bgy a(cjf $$0, cbu $$1, bjg $$2, bgx $$3) {
      if ($$2 instanceof bvn $$4 && $$4.bv() && !$$4.y() && $$4.t() != this.b) {
         $$4.dL().a($$1, $$4, ape.gF, apf.h, 1.0F, 1.0F);
         if (!$$1.dL().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bgy.a($$1.dL().B);
      }

      return bgy.d;
   }

   public cht d() {
      return this.b;
   }

   public static chu a(cht $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(cpv $$0, ded $$1, boolean $$2, cbu $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.p(), ape.gF, apf.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
