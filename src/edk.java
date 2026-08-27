import com.mojang.serialization.Codec;
import java.util.Optional;

public class edk extends ebl {
   public static final Codec<edk> d = a(edk::new);

   public edk(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      return a($$0, dqv.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ecd $$0, ebl.a $$1) {
      cuy $$2 = $$1.h();
      dru $$3 = $$1.f();
      hz $$4 = new hz($$2.d(), 90, $$2.e());
      dfe $$5 = dfe.a($$3);
      edj.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ebu<?> e() {
      return ebu.e;
   }
}
