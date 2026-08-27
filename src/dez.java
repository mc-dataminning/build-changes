import com.mojang.serialization.MapCodec;

public class dez extends cyo {
   public static final MapCodec<dez> h = b(dez::new);
   public static final dmd<ie.a> i = dlv.I;

   @Override
   public MapCodec<? extends dez> a() {
      return h;
   }

   public dez(dle.d $$0) {
      super($$0);
      this.k(this.o().a(i, ie.a.b));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return b($$0, $$1);
   }

   public static dlf b(dlf $$0, dfa $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ie.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ie.a.c);
               case c:
                  return $$0.a(i, ie.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(i);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
