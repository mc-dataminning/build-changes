import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ecg extends dzo {
   public static final Codec<ecg> d = a(ecg::new);

   public ecg(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return Optional.of(new dzo.b($$0.h().l(), (Consumer<eag>)($$1 -> a($$1, $$0))));
   }

   private static void a(eag $$0, dzo.a $$1) {
      int $$2 = 0;

      ecf.m $$3;
      do {
         $$0.b();
         $$1.f().c($$1.g() + (long)($$2++), $$1.h().e, $$1.h().f);
         ecf.a();
         $$3 = new ecf.m($$1.f(), $$1.h().a(2), $$1.h().b(2));
         $$0.a($$3);
         $$3.a($$3, $$0, $$1.f());
         List<dzs> $$4 = $$3.c;

         while (!$$4.isEmpty()) {
            int $$5 = $$1.f().a($$4.size());
            dzs $$6 = $$4.remove($$5);
            $$6.a($$3, $$0, $$1.f());
         }

         $$0.a($$1.b().e(), $$1.b().f(), $$1.f(), 10);
      } while ($$0.c() || $$3.b == null);
   }

   @Override
   public dzx<?> e() {
      return dzx.n;
   }
}
