import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqj extends bpx {
   private final Set<aqn> h = Sets.newHashSet();
   private final Set<aqn> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqj(wu $$0, bpx.a $$1, bpx.b $$2) {
      super(ayg.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abx::b);
      }
   }

   @Override
   public void a(bpx.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abx::d);
      }
   }

   @Override
   public void a(bpx.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abx::d);
      }
   }

   @Override
   public bpx a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abx::e);
      }

      return this;
   }

   @Override
   public bpx b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abx::e);
      }

      return this;
   }

   @Override
   public bpx c(boolean $$0) {
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

   private void a(Function<bpx, abx> $$0) {
      if (this.j) {
         abx $$1 = $$0.apply(this);

         for (aqn $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(aqn $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(abx.a(this));
      }
   }

   public void b(aqn $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(abx.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aqn $$0 : Lists.newArrayList(this.h)) {
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

         for (aqn $$1 : this.h) {
            $$1.c.b($$0 ? abx.a(this) : abx.a(this.h()));
         }
      }
   }

   public Collection<aqn> g() {
      return this.i;
   }
}
