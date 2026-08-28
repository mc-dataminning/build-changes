import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arm extends btw {
   private final Set<arr> h = Sets.newHashSet();
   private final Set<arr> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arm(wy $$0, btw.a $$1, btw.b $$2) {
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
   public void a(btw.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acd::d);
      }
   }

   @Override
   public void a(btw.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acd::d);
      }
   }

   @Override
   public btw a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acd::e);
      }

      return this;
   }

   @Override
   public btw b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acd::e);
      }

      return this;
   }

   @Override
   public btw c(boolean $$0) {
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

   private void a(Function<btw, acd> $$0) {
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
         $$0.f.b(acd.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arr $$0 : Lists.newArrayList(this.h)) {
            this.b($$0);
         }
      }
   }

   public boolean g() {
      return this.j;
   }

   public void d(boolean $$0) {
      if ($$0 != this.j) {
         this.j = $$0;

         for (arr $$1 : this.h) {
            $$1.f.b($$0 ? acd.a(this) : acd.a(this.i()));
         }
      }
   }

   public Collection<arr> h() {
      return this.i;
   }
}
