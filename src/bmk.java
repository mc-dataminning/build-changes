import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bmk extends bmp<blh> {
   private static final int c = 100;
   private static final int d = 120;
   private static final int e = 5;
   private static final int f = 4;
   private static final Predicate<blh> g = $$0 -> $$0.eg() != null || $$0.dA() || $$0.bM();
   private final float h;
   private final Predicate<blh> i;

   public bmk(float $$0) {
      this($$0, g);
   }

   public bmk(float $$0, Predicate<blh> $$1) {
      super(ImmutableMap.of(btz.Y, bua.c, btz.x, bua.a), 100, 120);
      this.h = $$0;
      this.i = $$1;
   }

   protected boolean a(ama $$0, blh $$1) {
      return this.i.test($$1);
   }

   protected boolean a(ama $$0, blh $$1, long $$2) {
      return true;
   }

   protected void b(ama $$0, blh $$1, long $$2) {
      $$1.dN().a(btz.Y, true);
      $$1.dN().b(btz.m);
   }

   protected void c(ama $$0, blh $$1, long $$2) {
      bly<?> $$3 = $$1.dN();
      $$3.b(btz.Y);
   }

   protected void d(ama $$0, blh $$1, long $$2) {
      if ($$1.L().l()) {
         eji $$3 = this.a($$1, $$0);
         if ($$3 != null) {
            $$1.dN().a(btz.m, new buc($$3, this.h, 0));
         }
      }
   }

   @Nullable
   private eji a(blh $$0, ama $$1) {
      if ($$0.bM()) {
         Optional<eji> $$2 = this.a((cqy)$$1, (bki)$$0).map(eji::c);
         if ($$2.isPresent()) {
            return $$2.get();
         }
      }

      return bvr.a($$0, 5, 4);
   }

   private Optional<ht> a(cqy $$0, bki $$1) {
      ht $$2 = $$1.dl();
      if (!$$0.a_($$2).k($$0, $$2).c()) {
         return Optional.empty();
      } else {
         Predicate<ht> $$3;
         if (ati.f($$1.df()) == 2) {
            $$3 = $$1x -> ht.a($$1x).allMatch($$1xx -> $$0.b_($$1xx).a(arh.a));
         } else {
            $$3 = $$1x -> $$0.b_($$1x).a(arh.a);
         }

         return ht.a($$2, 5, 1, $$3);
      }
   }
}
