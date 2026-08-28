import com.google.common.collect.Maps;
import java.util.Map;

public class cwe extends cxc implements cyk {
   private static final Map<cwd, cwe> a = Maps.newEnumMap(cwd.class);
   private final cwd b;

   public cwe(cwd $$0, cxc.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bta a(cxg $$0, cpo $$1, bvx $$2, bsz $$3) {
      if ($$2 instanceof cik $$4 && $$4.bL() && !$$4.x() && $$4.t() != this.b) {
         $$4.dW().a($$1, $$4, awv.ih, aww.h, 1.0F, 1.0F);
         if (!$$1.dW().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bta.a;
      }

      return bta.e;
   }

   public cwd b() {
      return this.b;
   }

   public static cwe a(cwd $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dgz $$0, dwd $$1, boolean $$2, cpo $$3) {
      if ($$1.a($$0x -> $$0x.a(this.b()), $$2)) {
         $$0.a(null, $$1.aB_(), awv.ih, aww.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
