import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ecj implements ecn {
   private final List<ecm> b = Lists.newArrayList();
   private final Set<ecm> c = Sets.newHashSet();
   private final List<ecm> d = Lists.newArrayList();
   private boolean e;
   private final arx f;
   private final int g;
   private final ecj.a h;

   public ecj(arx $$0, int $$1, ecj.a $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(ecm $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      agy.a(this.f, $$0);
   }

   @Override
   public void b(ecm $$0) {
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
   public boolean a(jq<eck> $$0, fbr $$1, eck.a $$2, ecn.a $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<ecm> $$5 = this.b.iterator();

         while ($$5.hasNext()) {
            ecm $$6 = $$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<fbr> $$7 = a(this.f, $$1, $$6);
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

   private static Optional<fbr> a(arx $$0, fbr $$1, ecm $$2) {
      Optional<fbr> $$3 = $$2.a().a($$0);
      if ($$3.isEmpty()) {
         return Optional.empty();
      } else {
         double $$4 = jh.a($$3.get()).j(jh.a((ka)$$1));
         int $$5 = $$2.b() * $$2.b();
         return $$4 > (double)$$5 ? Optional.empty() : $$3;
      }
   }

   @FunctionalInterface
   public interface a {
      void apply(int var1);
   }
}
