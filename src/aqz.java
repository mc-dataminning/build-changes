import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqz extends bsb {
   private final Set<are> h = Sets.newHashSet();
   private final Set<are> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqz(wp $$0, bsb.a $$1, bsb.b $$2) {
      super(ayz.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abv::b);
      }
   }

   @Override
   public void a(bsb.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abv::d);
      }
   }

   @Override
   public void a(bsb.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abv::d);
      }
   }

   @Override
   public bsb a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abv::e);
      }

      return this;
   }

   @Override
   public bsb b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abv::e);
      }

      return this;
   }

   @Override
   public bsb c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abv::e);
      }

      return this;
   }

   @Override
   public void a(wp $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abv::c);
      }
   }

   private void a(Function<bsb, abv> $$0) {
      if (this.j) {
         abv $$1 = $$0.apply(this);

         for (are $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(are $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(abv.a(this));
      }
   }

   public void b(are $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(abv.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (are $$0 : Lists.newArrayList(this.h)) {
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

         for (are $$1 : this.h) {
            $$1.f.b($$0 ? abv.a(this) : abv.a(this.h()));
         }
      }
   }

   public Collection<are> g() {
      return this.i;
   }
}
