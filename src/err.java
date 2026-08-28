import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class err extends epg {
   public static final MapCodec<err> d = a(err::new);

   public err(epg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<epg.b> a(epg.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (js<dis> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awy.X)) {
            return Optional.empty();
         }
      }

      return a($$0, eel.a.c, $$1x -> a($$1x, $$0));
   }

   private static epk a(dgw $$0, efk $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jo $$4 = jo.c.a.a($$1);
      return new erq.h($$1, $$2, $$3, $$4);
   }

   private static void a(epy $$0, epg.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static epv a(dgw $$0, long $$1, epv $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         efk $$3 = new efk(new eem(efa.a()));
         $$3.c($$1, $$0.h, $$0.i);
         epk $$4 = $$2.c().get(0);
         eoy $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jo $$8 = jo.c.a.a($$3);
         jo $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         epk $$10 = new erq.h($$3, $$6, $$7, $$9);
         epy $$11 = new epy();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public epp<?> e() {
      return epp.j;
   }
}
