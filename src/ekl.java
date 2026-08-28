import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ekl extends ekm<emq> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 2;
   private static final int ap = 2;
   private static final int aq = 19;

   public ekl(Codec<emq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emq> $$0) {
      this.a($$0.f(), $$0.e(), $$0.b(), $$0.d());
      return true;
   }

   private void a(emq $$0, iw $$1, dky $$2, azz $$3) {
      this.a($$0, $$2, $$3, $$1.k());
      jc $$4 = jc.c.a.a($$3);
      int $$5 = $$0.c.a($$3) - 2;
      iw.a $$6 = $$1.a($$4, 2 + $$3.a(2)).k();
      this.a($$2, $$6);
      if (this.a($$2, $$5, $$6, $$4)) {
         this.a($$0, $$2, $$3, $$5, $$6, $$4);
      }
   }

   private void a(dky $$0, iw.a $$1) {
      $$1.c(jc.b, 1);

      for (int $$2 = 0; $$2 < 6; $$2++) {
         if (this.a((dka)$$0, (iw)$$1)) {
            return;
         }

         $$1.c(jc.a);
      }
   }

   private void a(emq $$0, dky $$1, azz $$2, iw.a $$3) {
      iw $$4 = a($$0, $$1, $$2, $$3, Function.identity());
      this.a($$1, $$2, Set.of($$4), $$0.d);
   }

   private boolean a(dky $$0, int $$1, iw.a $$2, jc $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if (!ely.d($$0, $$2)) {
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

   private void a(emq $$0, dky $$1, azz $$2, int $$3, iw.a $$4, jc $$5) {
      Set<iw> $$6 = new HashSet<>();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         $$6.add(a($$0, $$1, $$2, $$4, a($$5)));
         $$4.c($$5);
      }

      this.a($$1, $$2, $$6, $$0.e);
   }

   private boolean a(dka $$0, iw $$1) {
      return ely.d($$0, $$1) && this.b($$0, $$1);
   }

   private boolean b(dka $$0, iw $$1) {
      return $$0.a_($$1.e()).c($$0, $$1, jc.b);
   }

   private static iw a(emq $$0, dky $$1, azz $$2, iw.a $$3, Function<ebg, ebg> $$4) {
      $$1.a($$3, $$4.apply($$0.b.a($$2, $$3)), 19);
      return $$3.j();
   }

   private void a(dky $$0, azz $$1, Set<iw> $$2, List<epn> $$3) {
      if (!$$3.isEmpty()) {
         epn.a $$4 = new epn.a($$0, this.a($$0), $$1, $$2, Set.of(), Set.of());
         $$3.forEach($$1x -> $$1x.a($$4));
      }
   }

   private BiConsumer<iw, ebg> a(dky $$0) {
      return ($$1, $$2) -> $$0.a($$1, $$2, 19);
   }

   private static Function<ebg, ebg> a(jc $$0) {
      return $$1 -> $$1.c(dtx.d, $$0.o());
   }
}
