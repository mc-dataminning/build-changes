import com.mojang.serialization.MapCodec;

public class dfa extends cwi {
   public static final MapCodec<dfa> a = b(dfa::new);
   protected static final elu b = cvz.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   protected dfa(dio.d $$0) {
      super($$0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof amp && $$3 instanceof cgl) {
         $$1.a(new hv($$2), true, $$3);
      }
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      edz $$3 = $$1.b_($$2);
      edz $$4 = $$1.b_($$2.c());
      return ($$3.a() == eea.c || $$0.b() instanceof czw) && $$4.a() == eea.a;
   }
}
