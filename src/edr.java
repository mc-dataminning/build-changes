import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class edr extends ebl {
   public static final bkk<cxc.c> d = bkk.a(
      new cxc.c(bnw.j, 10, 2, 3), new cxc.c(bnw.bv, 5, 4, 4), new cxc.c(bnw.bo, 8, 5, 5), new cxc.c(bnw.aL, 2, 5, 5), new cxc.c(bnw.an, 3, 4, 4)
   );
   public static final Codec<edr> e = a(edr::new);

   public edr(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      cuy $$1 = $$0.h();
      hz $$2 = new hz($$1.d(), 64, $$1.e());
      return Optional.of(new ebl.b($$2, (Consumer<ecd>)($$1x -> a($$1x, $$0))));
   }

   private static void a(ecd $$0, ebl.a $$1) {
      edq.q $$2 = new edq.q($$1.f(), $$1.h().a(2), $$1.h().b(2));
      $$0.a($$2);
      $$2.a($$2, $$0, $$1.f());
      List<ebp> $$3 = $$2.d;

      while (!$$3.isEmpty()) {
         int $$4 = $$1.f().a($$3.size());
         ebp $$5 = $$3.remove($$4);
         $$5.a($$2, $$0, $$1.f());
      }

      $$0.a($$1.f(), 48, 70);
   }

   @Override
   public ebu<?> e() {
      return ebu.d;
   }
}
