import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dlw implements dma {
   private final List<dlz> b = Lists.newArrayList();
   private final Set<dlz> c = Sets.newHashSet();
   private final List<dlz> d = Lists.newArrayList();
   private boolean e;
   private final ami f;
   private final int g;
   private final dlw.a h;

   public dlw(ami $$0, int $$1, dlw.a $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(dlz $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      aco.a(this.f, $$0);
   }

   @Override
   public void b(dlz $$0) {
      if (this.e) {
         this.c.add($$0);
      } else {
         this.b.remove($$0);
      }

      if (this.b.isEmpty()) {
         this.h.apply(this.g);
      }
   }

   @Override
   public boolean a(dlx $$0, ejz $$1, dlx.a $$2, dma.a $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<dlz> $$5 = this.b.iterator();

         while ($$5.hasNext()) {
            dlz $$6 = $$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<ejz> $$7 = a(this.f, $$1, $$6);
               if ($$7.isPresent()) {
                  $$3.visit($$6, $$7.get());
                  $$4 = true;
               }
            }
         }
      } finally {
         this.e = false;
      }

      if (!this.d.isEmpty()) {
         this.b.addAll(this.d);
         this.d.clear();
      }

      if (!this.c.isEmpty()) {
         this.b.removeAll(this.c);
         this.c.clear();
      }

      return $$4;
   }

   private static Optional<ejz> a(ami $$0, ejz $$1, dlz $$2) {
      Optional<ejz> $$3 = $$2.a().a($$0);
      if ($$3.isEmpty()) {
         return Optional.empty();
      } else {
         double $$4 = hx.a($$3.get()).j(hx.a($$1));
         int $$5 = $$2.b() * $$2.b();
         return $$4 > (double)$$5 ? Optional.empty() : $$3;
      }
   }

   @FunctionalInterface
   public interface a {
      void apply(int var1);
   }
}
