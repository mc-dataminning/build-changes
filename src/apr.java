import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class apr extends bnv {
   private final Set<apv> h = Sets.newHashSet();
   private final Set<apv> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public apr(wi $$0, bnv.a $$1, bnv.b $$2) {
      super(axm.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abk::b);
      }
   }

   @Override
   public void a(bnv.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abk::d);
      }
   }

   @Override
   public void a(bnv.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abk::d);
      }
   }

   @Override
   public bnv a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abk::e);
      }

      return this;
   }

   @Override
   public bnv b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abk::e);
      }

      return this;
   }

   @Override
   public bnv c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abk::e);
      }

      return this;
   }

   @Override
   public void a(wi $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abk::c);
      }
   }

   private void a(Function<bnv, abk> $$0) {
      if (this.j) {
         abk $$1 = $$0.apply(this);

         for (apv $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(apv $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(abk.a(this));
      }
   }

   public void b(apv $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(abk.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (apv $$0 : Lists.newArrayList(this.h)) {
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

         for (apv $$1 : this.h) {
            $$1.d.b($$0 ? abk.a(this) : abk.a(this.h()));
         }
      }
   }

   public Collection<apv> g() {
      return this.i;
   }
}
