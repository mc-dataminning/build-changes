import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxs extends dwa {
   public static final Codec<dxs> d = a(dxs::new);

   public dxs(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return a($$0, dlk.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(dws $$0, dwa.a $$1) {
      cqg $$2 = $$1.h();
      dmj $$3 = $$1.f();
      ht $$4 = new ht($$2.d(), 90, $$2.e());
      dal $$5 = dal.a($$3);
      dxr.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public dwj<?> e() {
      return dwj.e;
   }
}
