import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bks extends bkx<bjp> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<bjp> g = $$0 -> $$0.eg() != null || $$0.dA() || $$0.bM();
   private final float h;
   private final Predicate<bjp> i;

   public bks(float $$0) {
      this($$0, g);
   }

   public bks(float $$0, Predicate<bjp> $$1) {
      super(ImmutableMap.of(bsh.Y, bsi.c, bsh.x, bsi.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(akq $$0, bjp $$1) {
      return this.i.test($$1);
   }

   protected boolean a(akq $$0, bjp $$1, long $$2) {
      return true;
   }

   protected void b(akq $$0, bjp $$1, long $$2) {
      $$1.dN().a(bsh.Y, true);
      $$1.dN().b(bsh.m);
   }

   protected void c(akq $$0, bjp $$1, long $$2) {
      bkg<?> $$3 = $$1.dN();
      $$3.b(bsh.Y);
   }

   protected void d(akq $$0, bjp $$1, long $$2) {
      if ($$1.L().l()) {
         ehn $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dN().a(bsh.m, new bsk($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ehn a(bjp $$0, akq $$1) {
      if ($$0.bM()) {
         Optional<ehn> $$2 = this.a((cpb)$$1, (biq)$$0).map(ehn::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return btz.a($$0, 5, 4);
   }

   private Optional<gw> a(cpb $$0, biq $$1) {
      gw $$2 = $$1.dl();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<gw> $$3;
         if (arw.f($$1.df()) == 2) {
            $$3 = $$1x -> gw.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(apx.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(apx.a);
         }

         return gw.a($$2, 5, 1, $$3);
      }
   }
}
