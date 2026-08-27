import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aic extends bdn {
   private final Set<aig> h = Sets.newHashSet();
   private final Set<aig> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aic(sw $$0, bdn.a $$1, bdn.b $$2) {
      super(apa.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(vc::b);
      }
   }

   @Override
   public void a(bdn.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(vc::d);
      }
   }

   @Override
   public void a(bdn.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(vc::d);
      }
   }

   @Override
   public bdn a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(vc::e);
      }

      return this;
   }

   @Override
   public bdn b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(vc::e);
      }

      return this;
   }

   @Override
   public bdn c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(vc::e);
      }

      return this;
   }

   @Override
   public void a(sw $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(vc::c);
      }
   }

   private void a(Function<bdn, vc> $$0) {
      if (this.j) {
         vc $$1 = $$0.apply(this);

         for (aig $$2 : this.h) {
            $$2.c.a($$1);
         }
      }
   }

   public void a(aig $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.a(vc.a(this));
      }
   }

   public void b(aig $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.a(vc.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aig $$0 : Lists.newArrayList(this.h)) {
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

         for (aig $$1 : this.h) {
            $$1.c.a($$0 ? vc.a(this) : vc.a(this.i()));
         }
      }
   }

   public Collection<aig> h() {
      return this.i;
   }
}
