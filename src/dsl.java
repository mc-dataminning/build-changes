import com.mojang.serialization.MapCodec;

public class dsl extends dlu {
   public static final MapCodec<dsl> c = b(dsl::new);
   public static final eam<ja.a> d = eae.K;

   @Override
   public MapCodec<? extends dsl> a() {
      return c;
   }

   public dsl(dzn.d $$0) {
      super($$0);
      this.l(this.m().b(d, ja.a.b));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return b($$0, $$1);
   }

   public static dzo b(dzo $$0, dsm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ja.a)$$0.c(d)) {
               case a:
                  return $$0.b(d, ja.a.c);
               case c:
                  return $$0.b(d, ja.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(d);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(d, $$0.k().o());
   }
}
