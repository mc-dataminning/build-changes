import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ekv extends ekw<ena> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 2;
   private static final int ap = 2;
   private static final int aq = 19;

   public ekv(Codec<ena> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<ena> $$0) {
      this.a($$0.f(), $$0.e(), $$0.b(), $$0.d());
      return true;
   }

   private void a(ena $$0, iw $$1, dli $$2, bai $$3) {
      this.a($$0, $$2, $$3, $$1.k());
      jc $$4 = jc.c.a.a($$3);
      int $$5 = $$0.c.a($$3) - 2;
      iw.a $$6 = $$1.a($$4, 2 + $$3.a(2)).k();
      this.a($$2, $$6);
      if (this.a($$2, $$5, $$6, $$4)) {
         this.a($$0, $$2, $$3, $$5, $$6, $$4);
      }
   }

   private void a(dli $$0, iw.a $$1) {
      $$1.c(jc.b, 1);

      for (int $$2 = 0; $$2 < 6; $$2++) {
         if (this.a((dkk)$$0, (iw)$$1)) {
            return;
         }

         $$1.c(jc.a);
      }
   }

   private void a(ena $$0, dli $$1, bai $$2, iw.a $$3) {
      iw $$4 = this.a($$0, $$1, $$2, $$3, Function.identity());
      this.a($$1, $$2, Set.of($$4), $$0.d);
   }

   private boolean a(dli $$0, int $$1, iw.a $$2, jc $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if (!emi.d($$0, $$2)) {
            return false;
         }

         if (!this.b($$0, $$2)) {
            if (++$$4 > 2) {
               return false;
            }
         } else {
            $$4 = 0;
         }

         $$2.c($$3);
      }

      $$2.c($$3.g(), $$1);
      return true;
   }

   private void a(ena $$0, dli $$1, bai $$2, int $$3, iw.a $$4, jc $$5) {
      Set<iw> $$6 = new HashSet<>();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         $$6.add(this.a($$0, $$1, $$2, $$4, a($$5)));
         $$4.c($$5);
      }

      this.a($$1, $$2, $$6, $$0.e);
   }

   private boolean a(dkk $$0, iw $$1) {
      return emi.d($$0, $$1) && this.b($$0, $$1);
   }

   private boolean b(dkk $$0, iw $$1) {
      return $$0.a_($$1.e()).c($$0, $$1, jc.b);
   }

   private iw a(ena $$0, dli $$1, bai $$2, iw.a $$3, Function<ebq, ebq> $$4) {
      $$1.a($$3, $$4.apply($$0.b.a($$2, $$3)), 3);
      this.a($$1, (iw)$$3);
      return $$3.j();
   }

   private void a(dli $$0, bai $$1, Set<iw> $$2, List<epx> $$3) {
      if (!$$3.isEmpty()) {
         epx.a $$4 = new epx.a($$0, this.a($$0), $$1, $$2, Set.of(), Set.of());
         $$3.forEach($$1x -> $$1x.a($$4));
      }
   }

   private BiConsumer<iw, ebq> a(dli $$0) {
      return ($$1, $$2) -> $$0.a($$1, $$2, 19);
   }

   private static Function<ebq, ebq> a(jc $$0) {
      return $$1 -> $$1.c(duh.d, $$0.o());
   }
}
