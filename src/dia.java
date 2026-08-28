import com.mojang.serialization.MapCodec;

public class dia extends dhj {
   public static final MapCodec<dia> a = b(dia::new);
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dia> a() {
      return a;
   }

   public dia(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return !$$1.u($$2.e());
   }
}
