import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dnq implements dnu {
   private final List<dnt> b = Lists.newArrayList();
   private final Set<dnt> c = Sets.newHashSet();
   private final List<dnt> d = Lists.newArrayList();
   private boolean e;
   private final and f;
   private final int g;
   private final dnq.a h;

   public dnq(and $$0, int $$1, dnq.a $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(dnt $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      adi.a(this.f, $$0);
   }

   @Override
   public void b(dnt $$0) {
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
   public boolean a(dnr $$0, elt $$1, dnr.a $$2, dnu.a $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<dnt> $$5 = this.b.iterator();

         while ($$5.hasNext()) {
            dnt $$6 = $$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<elt> $$7 = a(this.f, $$1, $$6);
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

   private static Optional<elt> a(and $$0, elt $$1, dnt $$2) {
      Optional<elt> $$3 = $$2.a().a($$0);
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
