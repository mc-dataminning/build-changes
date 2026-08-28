import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekl extends eim {
   public static final MapCodec<ekl> d = a(ekl::new);

   public ekl(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      return a($$0, dxw.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eje $$0, eim.a $$1) {
      dbh $$2 = $$1.h();
      dyv $$3 = $$1.f();
      iz $$4 = new iz($$2.d(), 90, $$2.e());
      dlo $$5 = dlo.a($$3);
      ekk.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eiv<?> e() {
      return eiv.e;
   }
}
