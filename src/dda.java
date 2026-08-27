import com.mojang.serialization.MapCodec;

public class dda extends cwp {
   public static final MapCodec<dda> h = b(dda::new);
   public static final dke<ic.a> i = djw.I;

   @Override
   public MapCodec<? extends dda> a() {
      return h;
   }

   public dda(djf.d $$0) {
      super($$0);
      this.k(this.o().a(i, ic.a.b));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return b($$0, $$1);
   }

   public static djg b(djg $$0, ddb $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ic.a.c);
               case c:
                  return $$0.a(i, ic.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(i);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
