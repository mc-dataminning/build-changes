import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class elg extends eiw {
   public static final MapCodec<elg> d = a(elg::new);

   public elg(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jj<ddf> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avv.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dyf.a.c, $$1x -> a($$1x, $$0));
   }

   private static eja a(dbm $$0, dze $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jf $$4 = jf.c.a.a($$1);
      return new elf.h($$1, $$2, $$3, $$4);
   }

   private static void a(ejo $$0, eiw.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static ejl a(dbm $$0, long $$1, ejl $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dze $$3 = new dze(new dyg(dyu.a()));
         $$3.c($$1, $$0.e, $$0.f);
         eja $$4 = $$2.c().get(0);
         eio $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jf $$8 = jf.c.a.a($$3);
         jf $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         eja $$10 = new elf.h($$3, $$6, $$7, $$9);
         ejo $$11 = new ejo();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ejf<?> e() {
      return ejf.j;
   }
}
