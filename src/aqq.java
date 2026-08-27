import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqq extends bpq {
   private final Set<aqu> j = Sets.newHashSet();
   private final Set<aqu> k = Collections.unmodifiableSet(this.j);
   private boolean l = true;

   public aqq(brv $$0, bpq.a $$1, bpq.b $$2) {
      super($$0.cE(), $$0.P_(), $$1, $$2, $$0.ds(), -1);
   }

   public aqq(xe $$0, bpq.a $$1, bpq.b $$2) {
      super(aym.a(), $$0, $$1, $$2, ewu.b, 0);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(ach::b);
      }
   }

   @Override
   public void a(bpq.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(ach::e);
      }
   }

   @Override
   public void a(bpq.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(ach::e);
      }
   }

   @Override
   public bpq a(boolean $$0) {
      if ($$0 != this.g) {
         super.a($$0);
         this.a(ach::f);
      }

      return this;
   }

   @Override
   public bpq b(boolean $$0) {
      if ($$0 != this.h) {
         super.b($$0);
         this.a(ach::f);
      }

      return this;
   }

   @Override
   public bpq c(boolean $$0) {
      if ($$0 != this.i) {
         super.c($$0);
         this.a(ach::f);
      }

      return this;
   }

   @Override
   public void a(ewu $$0, int $$1) {
      if ($$0.g(this.e) > 1.0 || $$1 != this.f) {
         super.a($$0, $$1);
         this.a(ach::d);
      }
   }

   @Override
   public void a(xe $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(ach::c);
      }
   }

   private void a(Function<bpq, ach> $$0) {
      if (this.l) {
         ach $$1 = $$0.apply(this);

         for (aqu $$2 : this.j) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aqu $$0) {
      if (this.j.add($$0) && this.l) {
         $$0.d.b(ach.a(this));
      }
   }

   public void b(aqu $$0) {
      if (this.j.remove($$0) && this.l) {
         $$0.d.b(ach.a(this.h()));
      }
   }

   public void b() {
      if (!this.j.isEmpty()) {
         for (aqu $$0 : Lists.newArrayList(this.j)) {
            this.b($$0);
         }
      }
   }

   public boolean f() {
      return this.l;
   }

   public void d(boolean $$0) {
      if ($$0 != this.l) {
         this.l = $$0;

         for (aqu $$1 : this.j) {
            $$1.d.b($$0 ? ach.a(this) : ach.a(this.h()));
         }
      }
   }

   public Collection<aqu> g() {
      return this.k;
   }
}
