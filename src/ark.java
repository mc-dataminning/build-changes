import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class ark extends brt {
   private final Set<aro> h = Sets.newHashSet();
   private final Set<aro> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public ark(xi $$0, brt.a $$1, brt.b $$2) {
      super(azk.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aco::b);
      }
   }

   @Override
   public void a(brt.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public void a(brt.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public brt a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public brt b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public brt c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public void a(xi $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aco::c);
      }
   }

   private void a(Function<brt, aco> $$0) {
      if (this.j) {
         aco $$1 = $$0.apply(this);

         for (aro $$2 : this.h) {
            $$2.g.b($$1);
         }
      }
   }

   public void a(aro $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.g.b(aco.a(this));
      }
   }

   public void b(aro $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.g.b(aco.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aro $$0 : Lists.newArrayList(this.h)) {
            this.b($$0);
         }
      }
   }

   public boolean f() {
      return this.j;
   }

   public void d(boolean $$0) {
      if ($$0 != this.j) {
         this.j = $$0;

         for (aro $$1 : this.h) {
            $$1.g.b($$0 ? aco.a(this) : aco.a(this.h()));
         }
      }
   }

   public Collection<aro> g() {
      return this.i;
   }
}
