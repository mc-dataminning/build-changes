import com.mojang.serialization.Codec;
import java.util.Optional;

public class efd extends ede {
   public static final Codec<efd> d = a(efd::new);

   public efd(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      return a($$0, dso.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(edw $$0, ede.a $$1) {
      cwi $$2 = $$1.h();
      dtn $$3 = $$1.f();
      ib $$4 = new ib($$2.d(), 90, $$2.e());
      dgo $$5 = dgo.a($$3);
      efc.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public edn<?> e() {
      return edn.e;
   }
}
