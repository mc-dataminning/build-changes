import com.google.common.collect.Maps;
import java.util.Map;

public class cuf extends cvg implements cwq {
   private static final Map<cue, cuf> a = Maps.newEnumMap(cue.class);
   private final cue b;

   public cuf(cue $$0, cvg.a $$1) {
      super($$1);
      this.b = $$0;
      a.put($$0, this);
   }

   @Override
   public brk a(cvl $$0, cnp $$1, buf $$2, brj $$3) {
      if ($$2 instanceof cgr $$4 && $$4.bI() && !$$4.y() && $$4.t() != this.b) {
         $$4.dS().a($$1, $$4, awd.hN, awe.h, 1.0F, 1.0F);
         if (!$$1.dS().B) {
            $$4.b(this.b);
            $$0.h(1);
         }

         return brk.a;
      }

      return brk.e;
   }

   public cue c() {
      return this.b;
   }

   public static cuf a(cue $$0) {
      return a.get($$0);
   }

   @Override
   public boolean a(dds $$0, dsq $$1, boolean $$2, cnp $$3) {
      if ($$1.a($$0x -> $$0x.a(this.c()), $$2)) {
         $$0.a(null, $$1.aD_(), awd.hN, awe.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
