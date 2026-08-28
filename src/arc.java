import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arc extends bql {
   private final Set<arg> h = Sets.newHashSet();
   private final Set<arg> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arc(xp $$0, bql.a $$1, bql.b $$2) {
      super(ayz.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acs::b);
      }
   }

   @Override
   public void a(bql.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acs::d);
      }
   }

   @Override
   public void a(bql.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acs::d);
      }
   }

   @Override
   public bql a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acs::e);
      }

      return this;
   }

   @Override
   public bql b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acs::e);
      }

      return this;
   }

   @Override
   public bql c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acs::e);
      }

      return this;
   }

   @Override
   public void a(xp $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acs::c);
      }
   }

   private void a(Function<bql, acs> $$0) {
      if (this.j) {
         acs $$1 = $$0.apply(this);

         for (arg $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(arg $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(acs.a(this));
      }
   }

   public void b(arg $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(acs.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arg $$0 : Lists.newArrayList(this.h)) {
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

         for (arg $$1 : this.h) {
            $$1.c.b($$0 ? acs.a(this) : acs.a(this.h()));
         }
      }
   }

   public Collection<arg> g() {
      return this.i;
   }
}
