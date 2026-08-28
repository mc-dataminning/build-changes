import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class art extends bsq {
   private final Set<ary> h = Sets.newHashSet();
   private final Set<ary> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public art(xk $$0, bsq.a $$1, bsq.b $$2) {
      super(azu.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acq::b);
      }
   }

   @Override
   public void a(bsq.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acq::d);
      }
   }

   @Override
   public void a(bsq.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acq::d);
      }
   }

   @Override
   public bsq a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acq::e);
      }

      return this;
   }

   @Override
   public bsq b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acq::e);
      }

      return this;
   }

   @Override
   public bsq c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acq::e);
      }

      return this;
   }

   @Override
   public void a(xk $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acq::c);
      }
   }

   private void a(Function<bsq, acq> $$0) {
      if (this.j) {
         acq $$1 = $$0.apply(this);

         for (ary $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(ary $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(acq.a(this));
      }
   }

   public void b(ary $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(acq.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ary $$0 : Lists.newArrayList(this.h)) {
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

         for (ary $$1 : this.h) {
            $$1.f.b($$0 ? acq.a(this) : acq.a(this.h()));
         }
      }
   }

   public Collection<ary> g() {
      return this.i;
   }
}
