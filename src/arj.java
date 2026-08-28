import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arj extends btg {
   private final Set<aro> h = Sets.newHashSet();
   private final Set<aro> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arj(wv $$0, btg.a $$1, btg.b $$2) {
      super(azk.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aca::b);
      }
   }

   @Override
   public void a(btg.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aca::d);
      }
   }

   @Override
   public void a(btg.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aca::d);
      }
   }

   @Override
   public btg a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public btg b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public btg c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public void a(wv $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aca::c);
      }
   }

   private void a(Function<btg, aca> $$0) {
      if (this.j) {
         aca $$1 = $$0.apply(this);

         for (aro $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(aro $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(aca.a(this));
      }
   }

   public void b(aro $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(aca.a(this.h()));
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
            $$1.f.b($$0 ? aca.a(this) : aca.a(this.h()));
         }
      }
   }

   public Collection<aro> g() {
      return this.i;
   }
}
