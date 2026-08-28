import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arm extends btt {
   private final Set<arr> h = Sets.newHashSet();
   private final Set<arr> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arm(wy $$0, btt.a $$1, btt.b $$2) {
      super(azm.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acd::b);
      }
   }

   @Override
   public void a(btt.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acd::d);
      }
   }

   @Override
   public void a(btt.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acd::d);
      }
   }

   @Override
   public btt a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acd::e);
      }

      return this;
   }

   @Override
   public btt b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acd::e);
      }

      return this;
   }

   @Override
   public btt c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acd::e);
      }

      return this;
   }

   @Override
   public void a(wy $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acd::c);
      }
   }

   private void a(Function<btt, acd> $$0) {
      if (this.j) {
         acd $$1 = $$0.apply(this);

         for (arr $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(arr $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(acd.a(this));
      }
   }

   public void b(arr $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(acd.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arr $$0 : Lists.newArrayList(this.h)) {
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

         for (arr $$1 : this.h) {
            $$1.f.b($$0 ? acd.a(this) : acd.a(this.h()));
         }
      }
   }

   public Collection<arr> g() {
      return this.i;
   }
}
