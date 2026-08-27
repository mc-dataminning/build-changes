import com.mojang.serialization.MapCodec;

public class dgn extends dac {
   public static final MapCodec<dgn> h = b(dgn::new);
   public static final dnz<ih.a> i = dnr.I;

   @Override
   public MapCodec<? extends dgn> a() {
      return h;
   }

   public dgn(dna.d $$0) {
      super($$0);
      this.k(this.o().a(i, ih.a.b));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return b($$0, $$1);
   }

   public static dnb b(dnb $$0, dgo $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ih.a)$$0.c(i)) {
               case a:
                  return $$0.a(i, ih.a.c);
               case c:
                  return $$0.a(i, ih.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(i);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(i, $$0.k().o());
   }
}
