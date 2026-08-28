import com.google.common.collect.Maps;
import java.util.Map;

public class cxx extends cyu implements daa {
   private static final Map<cxw, cxx> a = Maps.newEnumMap(cxw.class);
   private final cxw b;

   public cxx(cxw $$0, cyu.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public bub a(cyy $$0, cqy $$1, bxc $$2, bua $$3) {
      if ($$2 instanceof cjs $$4 && $$4.bK() && !$$4.x() && $$4.t() != this.b) {
         $$4.dV().a($$1, $$4, awn.ii, awo.h, 1.0F, 1.0F);
         if (!$$1.dV().C) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return bub.a;
      }

      return bub.e;
   }

   public cxw a() {
      return this.b;
   }

   public static cxx a(cxw $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(div $$0, dyl $$1, boolean $$2, cqy $$3) {
      if ($$1.a($$0x -> $$0x.a(this.a()), $$2)) {
         $$0.a(null, $$1.aw_(), awn.ii, awo.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
