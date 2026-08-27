import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dmy implements dnc {
   private final List<dnb> b = Lists.newArrayList();
   private final Set<dnb> c = Sets.newHashSet();
   private final List<dnb> d = Lists.newArrayList();
   private boolean e;
   private final amp f;
   private final int g;
   private final dmy.a h;

   public dmy(amp $$0, int $$1, dmy.a $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(dnb $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      acv.a(this.f, $$0);
   }

   @Override
   public void b(dnb $$0) {
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
   public boolean a(dmz $$0, elb $$1, dmz.a $$2, dnc.a $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<dnb> $$5 = this.b.iterator();

         while ($$5.hasNext()) {
            dnb $$6 = $$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<elb> $$7 = a(this.f, $$1, $$6);
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

   private static Optional<elb> a(amp $$0, elb $$1, dnb $$2) {
      Optional<elb> $$3 = $$2.a().a($$0);
      if ($$3.isEmpty()) {
         return Optional.empty();
      } else {
         double $$4 = hv.a($$3.get()).j(hv.a($$1));
         int $$5 = $$2.b() * $$2.b();
         return $$4 > (double)$$5 ? Optional.empty() : $$3;
      }
   }

   @FunctionalInterface
   public interface a {
      void apply(int var1);
   }
}
