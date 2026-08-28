import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class egp implements egt {
   private final List<egs> b = Lists.newArrayList();
   private final Set<egs> c = Sets.newHashSet();
   private final List<egs> d = Lists.newArrayList();
   private boolean e;
   private final asb f;
   private final int g;
   private final egp.a h;

   public egp(asb $$0, int $$1, egp.a $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   @Override
   public boolean a() {
      return this.b.isEmpty();
   }

   @Override
   public void a(egs $$0) {
      if (this.e) {
         this.d.add($$0);
      } else {
         this.b.add($$0);
      }

      agx.a(this.f, $$0);
   }

   @Override
   public void b(egs $$0) {
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
   public boolean a(jg<egq> $$0, fgc $$1, egq.a $$2, egt.a $$3) {
      this.e = true;
      boolean $$4 = false;

      try {
         Iterator<egs> $$5 = this.b.iterator();

         while ($$5.hasNext()) {
            egs $$6 = $$5.next();
            if (this.c.remove($$6)) {
               $$5.remove();
            } else {
               Optional<fgc> $$7 = a(this.f, $$1, $$6);
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

   private static Optional<fgc> a(asb $$0, fgc $$1, egs $$2) {
      Optional<fgc> $$3 = $$2.a().a($$0);
      if ($$3.isEmpty()) {
         return Optional.empty();
      } else {
         double $$4 = iw.a($$3.get()).j(iw.a((jq)$$1));
         int $$5 = $$2.b() * $$2.b();
         return $$4 > (double)$$5 ? Optional.empty() : $$3;
      }
   }

   @FunctionalInterface
   public interface a {
      void apply(int var1);
   }
}
