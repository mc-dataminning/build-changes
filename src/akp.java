import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akp extends bgq {
   private final Set<akt> h = Sets.newHashSet();
   private final Set<akt> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akp(tn $$0, bgq.a $$1, bgq.b $$2) {
      super(ary.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(xi::b);
      }
   }

   @Override
   public void a(bgq.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(xi::d);
      }
   }

   @Override
   public void a(bgq.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(xi::d);
      }
   }

   @Override
   public bgq a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(xi::e);
      }

      return this;
   }

   @Override
   public bgq b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(xi::e);
      }

      return this;
   }

   @Override
   public bgq c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(xi::e);
      }

      return this;
   }

   @Override
   public void a(tn $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(xi::c);
      }
   }

   private void a(Function<bgq, xi> $$0) {
      if (this.j) {
         xi $$1 = $$0.apply(this);

         for (akt $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(akt $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(xi.a(this));
      }
   }

   public void b(akt $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(xi.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (akt $$0 : Lists.newArrayList(this.h)) {
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

         for (akt $$1 : this.h) {
            $$1.c.b($$0 ? xi.a(this) : xi.a(this.i()));
         }
      }
   }

   public Collection<akt> h() {
      return this.i;
   }
}
