import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arx extends bus {
   private final Set<asc> h = Sets.newHashSet();
   private final Set<asc> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arx(xg $$0, bus.a $$1, bus.b $$2) {
      super(azz.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aco::b);
      }
   }

   @Override
   public void a(bus.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public void a(bus.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aco::d);
      }
   }

   @Override
   public bus a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public bus b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public bus c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aco::e);
      }

      return this;
   }

   @Override
   public void a(xg $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aco::c);
      }
   }

   private void a(Function<bus, aco> $$0) {
      if (this.j) {
         aco $$1 = $$0.apply(this);

         for (asc $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(asc $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(aco.a(this));
      }
   }

   public void b(asc $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(aco.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (asc $$0 : Lists.newArrayList(this.h)) {
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

         for (asc $$1 : this.h) {
            $$1.f.b($$0 ? aco.a(this) : aco.a(this.i()));
         }
      }
   }

   public Collection<asc> h() {
      return this.i;
   }
}
