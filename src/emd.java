import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class emd extends ejt {
   public static final Codec<emd> d = a(emd::new);

   public emd(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ja<dcz> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awd.ab)) {
            return Optional.empty();
         }
      }

      return a($$0, dyu.a.c, $$1x -> a($$1x, $$0));
   }

   private static ejx a(dbh $$0, dzt $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      iw $$4 = iw.c.a.a($$1);
      return new emc.h($$1, $$2, $$3, $$4);
   }

   private static void a(ekl $$0, ejt.b $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eki a(dbh $$0, long $$1, eki $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dzt $$3 = new dzt(new dyv(dzj.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ejx $$4 = $$2.c().get(0);
         ejl $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         iw $$8 = iw.c.a.a($$3);
         iw $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ejx $$10 = new emc.h($$3, $$6, $$7, $$9);
         ekl $$11 = new ekl();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ekc<?> f() {
      return ekc.j;
   }
}
