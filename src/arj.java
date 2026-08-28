import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arj extends bro {
   private final Set<arn> h = Sets.newHashSet();
   private final Set<arn> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arj(xh $$0, bro.a $$1, bro.b $$2) {
      super(azj.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acn::b);
      }
   }

   @Override
   public void a(bro.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acn::d);
      }
   }

   @Override
   public void a(bro.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acn::d);
      }
   }

   @Override
   public bro a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acn::e);
      }

      return this;
   }

   @Override
   public bro b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acn::e);
      }

      return this;
   }

   @Override
   public bro c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acn::e);
      }

      return this;
   }

   @Override
   public void a(xh $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acn::c);
      }
   }

   private void a(Function<bro, acn> $$0) {
      if (this.j) {
         acn $$1 = $$0.apply(this);

         for (arn $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(arn $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(acn.a(this));
      }
   }

   public void b(arn $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(acn.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arn $$0 : Lists.newArrayList(this.h)) {
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

         for (arn $$1 : this.h) {
            $$1.d.b($$0 ? acn.a(this) : acn.a(this.h()));
         }
      }
   }

   public Collection<arn> g() {
      return this.i;
   }
}
