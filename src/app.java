import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class app extends bnq {
   private final Set<apt> h = Sets.newHashSet();
   private final Set<apt> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public app(wg $$0, bnq.a $$1, bnq.b $$2) {
      super(axk.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abi::b);
      }
   }

   @Override
   public void a(bnq.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abi::d);
      }
   }

   @Override
   public void a(bnq.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abi::d);
      }
   }

   @Override
   public bnq a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abi::e);
      }

      return this;
   }

   @Override
   public bnq b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abi::e);
      }

      return this;
   }

   @Override
   public bnq c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abi::e);
      }

      return this;
   }

   @Override
   public void a(wg $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abi::c);
      }
   }

   private void a(Function<bnq, abi> $$0) {
      if (this.j) {
         abi $$1 = $$0.apply(this);

         for (apt $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(apt $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(abi.a(this));
      }
   }

   public void b(apt $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(abi.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (apt $$0 : Lists.newArrayList(this.h)) {
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

         for (apt $$1 : this.h) {
            $$1.d.b($$0 ? abi.a(this) : abi.a(this.h()));
         }
      }
   }

   public Collection<apt> g() {
      return this.i;
   }
}
