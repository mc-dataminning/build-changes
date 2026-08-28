import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class epy extends enn {
   public static final MapCodec<epy> d = a(epy::new);

   public epy(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jr<dhl> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awo.X)) {
            return Optional.empty();
         }
      }

      return a($$0, ect.a.c, $$1x -> a($$1x, $$0));
   }

   private static enr a(dfp $$0, eds $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jn $$4 = jn.c.a.a($$1);
      return new epx.h($$1, $$2, $$3, $$4);
   }

   private static void a(eof $$0, enn.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eoc a(dfp $$0, long $$1, eoc $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         eds $$3 = new eds(new ecu(edi.a()));
         $$3.c($$1, $$0.h, $$0.i);
         enr $$4 = $$2.c().get(0);
         enf $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jn $$8 = jn.c.a.a($$3);
         jn $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         enr $$10 = new epx.h($$3, $$6, $$7, $$9);
         eof $$11 = new eof();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public enw<?> e() {
      return enw.j;
   }
}
