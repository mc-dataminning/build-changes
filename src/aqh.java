import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqh extends bpt {
   private final Set<aql> h = Sets.newHashSet();
   private final Set<aql> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqh(wu $$0, bpt.a $$1, bpt.b $$2) {
      super(aye.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abx::b);
      }
   }

   @Override
   public void a(bpt.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abx::d);
      }
   }

   @Override
   public void a(bpt.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abx::d);
      }
   }

   @Override
   public bpt a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abx::e);
      }

      return this;
   }

   @Override
   public bpt b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abx::e);
      }

      return this;
   }

   @Override
   public bpt c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abx::e);
      }

      return this;
   }

   @Override
   public void a(wu $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abx::c);
      }
   }

   private void a(Function<bpt, abx> $$0) {
      if (this.j) {
         abx $$1 = $$0.apply(this);

         for (aql $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(aql $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(abx.a(this));
      }
   }

   public void b(aql $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(abx.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aql $$0 : Lists.newArrayList(this.h)) {
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

         for (aql $$1 : this.h) {
            $$1.c.b($$0 ? abx.a(this) : abx.a(this.h()));
         }
      }
   }

   public Collection<aql> g() {
      return this.i;
   }
}
