import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akf extends bge {
   private final Set<akj> h = Sets.newHashSet();
   private final Set<akj> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akf(te $$0, bge.a $$1, bge.b $$2) {
      super(aro.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(wz::b);
      }
   }

   @Override
   public void a(bge.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(wz::d);
      }
   }

   @Override
   public void a(bge.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(wz::d);
      }
   }

   @Override
   public bge a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(wz::e);
      }

      return this;
   }

   @Override
   public bge b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(wz::e);
      }

      return this;
   }

   @Override
   public bge c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(wz::e);
      }

      return this;
   }

   @Override
   public void a(te $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(wz::c);
      }
   }

   private void a(Function<bge, wz> $$0) {
      if (this.j) {
         wz $$1 = $$0.apply(this);

         for (akj $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(akj $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(wz.a(this));
      }
   }

   public void b(akj $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(wz.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (akj $$0 : Lists.newArrayList(this.h)) {
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

         for (akj $$1 : this.h) {
            $$1.c.b($$0 ? wz.a(this) : wz.a(this.i()));
         }
      }
   }

   public Collection<akj> h() {
      return this.i;
   }
}
