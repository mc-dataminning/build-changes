import com.google.common.collect.Maps;
import java.util.Map;

public class cln extends cmt implements cnx {
   private static final Map<clm, cln> a = Maps.newEnumMap(clm.class);
   private final clm b;

   public cln(clm $$0, cmt.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bkb a(cmy $$0, cfi $$1, bml $$2, bka $$3) {
      if ($$2 instanceof byu $$4 && $$4.bx() && !$$4.A() && $$4.w() != this.b) {
         $$4.dM().a($$1, $$4, ars.hi, art.h, 1.0F, 1.0F);
         if (!$$1.dM().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bkb.a($$1.dM().B);
      }

      return bkb.d;
   }

   public clm d() {
      return this.b;
   }

   public static cln a(clm $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(ctp $$0, die $$1, boolean $$2, cfi $$3) {
      if ($$1.a($$0x -> $$0x.a(this.d()), $$2)) {
         $$0.a(null, $$1.aB_(), ars.hi, art.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
