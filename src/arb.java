import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arb extends bqj {
   private final Set<arf> h = Sets.newHashSet();
   private final Set<arf> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arb(xo $$0, bqj.a $$1, bqj.b $$2) {
      super(ayy.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acr::b);
      }
   }

   @Override
   public void a(bqj.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acr::d);
      }
   }

   @Override
   public void a(bqj.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acr::d);
      }
   }

   @Override
   public bqj a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public bqj b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public bqj c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acr::e);
      }

      return this;
   }

   @Override
   public void a(xo $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acr::c);
      }
   }

   private void a(Function<bqj, acr> $$0) {
      if (this.j) {
         acr $$1 = $$0.apply(this);

         for (arf $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(arf $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(acr.a(this));
      }
   }

   public void b(arf $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(acr.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arf $$0 : Lists.newArrayList(this.h)) {
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

         for (arf $$1 : this.h) {
            $$1.c.b($$0 ? acr.a(this) : acr.a(this.h()));
         }
      }
   }

   public Collection<arf> g() {
      return this.i;
   }
}
