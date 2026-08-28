import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqy extends bqf {
   private final Set<arc> h = Sets.newHashSet();
   private final Set<arc> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqy(xl $$0, bqf.a $$1, bqf.b $$2) {
      super(ayu.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aco::b);
      }
   }

   @Override
   public void a(bqf.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public void a(bqf.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public bqf a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public bqf b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public bqf c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public void a(xl $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aco::c);
      }
   }

   private void a(Function<bqf, aco> $$0) {
      if (this.j) {
         aco $$1 = $$0.apply(this);

         for (arc $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(arc $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(aco.a(this));
      }
   }

   public void b(arc $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(aco.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arc $$0 : Lists.newArrayList(this.h)) {
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

         for (arc $$1 : this.h) {
            $$1.c.b($$0 ? aco.a(this) : aco.a(this.h()));
         }
      }
   }

   public Collection<arc> g() {
      return this.i;
   }
}
