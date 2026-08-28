import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arn extends brx {
   private final Set<arr> h = Sets.newHashSet();
   private final Set<arr> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arn(xl $$0, brx.a $$1, brx.b $$2) {
      super(azn.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acr::b);
      }
   }

   @Override
   public void a(brx.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acr::d);
      }
   }

   @Override
   public void a(brx.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acr::d);
      }
   }

   @Override
   public brx a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public brx b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public brx c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public void a(xl $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acr::c);
      }
   }

   private void a(Function<brx, acr> $$0) {
      if (this.j) {
         acr $$1 = $$0.apply(this);

         for (arr $$2 : this.h) {
            $$2.g.b($$1);
         }
      }
   }

   public void a(arr $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.g.b(acr.a(this));
      }
   }

   public void b(arr $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.g.b(acr.a(this.h()));
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
            $$1.g.b($$0 ? acr.a(this) : acr.a(this.h()));
         }
      }
   }

   public Collection<arr> g() {
      return this.i;
   }
}
