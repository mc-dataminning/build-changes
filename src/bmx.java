import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmx extends bnc<blu> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<blu> g = $$0 -> $$0.ei() != null || $$0.dC() || $$0.bN();
   private final float h;
   private final Predicate<blu> i;

   public bmx(float $$0) {
      this($$0, g);
   }

   public bmx(float $$0, Predicate<blu> $$1) {
      super(ImmutableMap.of(bum.Y, bun.c, bum.x, bun.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(ami $$0, blu $$1) {
      return this.i.test($$1);
   }

   protected boolean a(ami $$0, blu $$1, long $$2) {
      return true;
   }

   protected void b(ami $$0, blu $$1, long $$2) {
      $$1.dP().a(bum.Y, true);
      $$1.dP().b(bum.m);
   }

   protected void c(ami $$0, blu $$1, long $$2) {
      bml<?> $$3 = $$1.dP();
      $$3.b(bum.Y);
   }

   protected void d(ami $$0, blu $$1, long $$2) {
      if ($$1.N().l()) {
         ejz $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dP().a(bum.m, new bup($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private ejz a(blu $$0, ami $$1) {
      if ($$0.bN()) {
         Optional<ejz> $$2 = this.a((crl)$$1, (bkv)$$0).map(ejz::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bwe.a($$0, 5, 4);
   }

   private Optional<hx> a(crl $$0, bkv $$1) {
      hx $$2 = $$1.dn();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<hx> $$3;
         if (atq.f($$1.dh()) == 2) {
            $$3 = $$1x -> hx.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(arp.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(arp.a);
         }

         return hx.a($$2, 5, 1, $$3);
      }
   }
}
