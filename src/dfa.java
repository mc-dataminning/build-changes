import com.mojang.serialization.MapCodec;

public class dfa extends dii {
   public static final MapCodec<dfa> a = b(dfa::new);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(dra.d $$0) {
      super($$0);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         io $$4 = $$2.d();
         drb $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), it.b)) {
            ayg.a($$1, $$2, $$3, ky.H);
         }
      }
   }
}
