import com.mojang.serialization.Codec;
import java.util.Optional;

public class els extends ejt {
   public static final Codec<els> d = a(els::new);

   public els(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      return a($$0, dyu.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(ekl $$0, ejt.b $$1) {
      dbh $$2 = $$1.h();
      dzt $$3 = $$1.f();
      ir $$4 = new ir($$2.d(), 90, $$2.e());
      dmd $$5 = dmd.a($$3);
      elr.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ekc<?> f() {
      return ekc.e;
   }
}
