import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class ekj extends ekk<emo> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 2;
   private static final int ap = 2;
   private static final int aq = 19;

   public ekj(Codec<emo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emo> $$0) {
      this.a($$0.f(), $$0.e(), $$0.b(), $$0.d());
      return true;
   }

   private void a(emo $$0, iv $$1, dkw $$2, azx $$3) {
      this.a($$0, $$2, $$3, $$1.k());
      jb $$4 = jb.c.a.a($$3);
      int $$5 = $$0.c.a($$3) - 2;
      iv.a $$6 = $$1.a($$4, 2 + $$3.a(2)).k();
      this.a($$2, $$6);
      if (this.a($$2, $$5, $$6, $$4)) {
         this.a($$0, $$2, $$3, $$5, $$6, $$4);
      }
   }

   private void a(dkw $$0, iv.a $$1) {
      $$1.c(jb.b, 1);

      for (int $$2 = 0; $$2 < 6; $$2++) {
         if (this.a((djy)$$0, (iv)$$1)) {
            return;
         }

         $$1.c(jb.a);
      }
   }

   private void a(emo $$0, dkw $$1, azx $$2, iv.a $$3) {
      iv $$4 = a($$0, $$1, $$2, $$3, Function.identity());
      this.a($$1, $$2, Set.of($$4), $$0.d);
   }

   private boolean a(dkw $$0, int $$1, iv.a $$2, jb $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if (!elw.d($$0, $$2)) {
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

   private void a(emo $$0, dkw $$1, azx $$2, int $$3, iv.a $$4, jb $$5) {
      Set<iv> $$6 = new HashSet<>();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         $$6.add(a($$0, $$1, $$2, $$4, a($$5)));
         $$4.c($$5);
      }

      this.a($$1, $$2, $$6, $$0.e);
   }

   private boolean a(djy $$0, iv $$1) {
      return elw.d($$0, $$1) && this.b($$0, $$1);
   }

   private boolean b(djy $$0, iv $$1) {
      return $$0.a_($$1.e()).c($$0, $$1, jb.b);
   }

   private static iv a(emo $$0, dkw $$1, azx $$2, iv.a $$3, Function<ebe, ebe> $$4) {
      $$1.a($$3, $$4.apply($$0.b.a($$2, $$3)), 19);
      return $$3.j();
   }

   private void a(dkw $$0, azx $$1, Set<iv> $$2, List<epl> $$3) {
      if (!$$3.isEmpty()) {
         epl.a $$4 = new epl.a($$0, this.a($$0), $$1, $$2, Set.of(), Set.of());
         $$3.forEach($$1x -> $$1x.a($$4));
      }
   }

   private BiConsumer<iv, ebe> a(dkw $$0) {
      return ($$1, $$2) -> $$0.a($$1, $$2, 19);
   }

   private static Function<ebe, ebe> a(jb $$0) {
      return $$1 -> $$1.c(dtv.d, $$0.o());
   }
}
