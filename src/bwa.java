import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwa<E extends buv> extends bwf<E> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private final float g;
   private final Function<buv, axl<bsl>> h;

   public bwa(float $$0) {
      this($$0, $$0x -> awx.F);
   }

   public bwa(float $$0, Function<buv, axl<bsl>> $$1) {
      super(Map.of(cdq.Z, cdr.c, cdq.x, cdr.c), 100, 120);
      this.g = $$0;
      this.h = $$1;
   }

   protected boolean a(arj $$0, E $$1) {
      return $$1.dY().c(cdq.x).map($$1x -> $$1x.a(this.h.apply($$1))).orElse(false) || $$1.dY().a(cdq.Z);
   }

   protected boolean a(arj $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arj $$0, E $$1, long $$2) {
      $$1.dY().a(cdq.Z, true);
      $$1.dY().b(cdq.m);
   }

   protected void c(arj $$0, E $$1, long $$2) {
      bvo<?> $$3 = $$1.dY();
      $$3.b(cdq.Z);
   }

   protected void d(arj $$0, E $$1, long $$2) {
      if ($$1.P().m()) {
         eyw $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dY().a(cdq.m, new cdt($$3, this.g, 0));
         }
      }
   }

   @Nullable
   private eyw a(E $$0, arj $$1) {
      if ($$0.bV()) {
         Optional<eyw> $$2 = this.a((ddo)$$1, $$0).map(eyw::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return cfk.a($$0, 5, 4);
   }

   private Optional<jf> a(ddo $$0, btr $$1) {
      jf $$2 = $$1.ds();
      if (!$$0.a_($$2).g($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<jf> $$3;
         if (azf.f($$1.dn()) == 2) {
            $$3 = $$1x -> jf.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(axb.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(axb.a);
         }

         return jf.a($$2, 5, 1, $$3);
      }
   }
}
