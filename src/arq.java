import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arq extends buj {
   private final Set<arv> h = Sets.newHashSet();
   private final Set<arv> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arq(xc $$0, buj.a $$1, buj.b $$2) {
      super(azq.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(ach::b);
      }
   }

   @Override
   public void a(buj.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(ach::d);
      }
   }

   @Override
   public void a(buj.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(ach::d);
      }
   }

   @Override
   public buj a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(ach::e);
      }

      return this;
   }

   @Override
   public buj b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(ach::e);
      }

      return this;
   }

   @Override
   public buj c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(ach::e);
      }

      return this;
   }

   @Override
   public void a(xc $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(ach::c);
      }
   }

   private void a(Function<buj, ach> $$0) {
      if (this.j) {
         ach $$1 = $$0.apply(this);

         for (arv $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(arv $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(ach.a(this));
      }
   }

   public void b(arv $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(ach.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arv $$0 : Lists.newArrayList(this.h)) {
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

         for (arv $$1 : this.h) {
            $$1.f.b($$0 ? ach.a(this) : ach.a(this.i()));
         }
      }
   }

   public Collection<arv> h() {
      return this.i;
   }
}
