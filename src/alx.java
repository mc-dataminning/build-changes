import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class alx extends big {
   private final Set<amb> h = Sets.newHashSet();
   private final Set<amb> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public alx(ur $$0, big.a $$1, big.b $$2) {
      super(ati.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(yn::b);
      }
   }

   @Override
   public void a(big.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(yn::d);
      }
   }

   @Override
   public void a(big.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(yn::d);
      }
   }

   @Override
   public big a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(yn::e);
      }

      return this;
   }

   @Override
   public big b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(yn::e);
      }

      return this;
   }

   @Override
   public big c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(yn::e);
      }

      return this;
   }

   @Override
   public void a(ur $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(yn::c);
      }
   }

   private void a(Function<big, yn> $$0) {
      if (this.j) {
         yn $$1 = $$0.apply(this);

         for (amb $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(amb $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(yn.a(this));
      }
   }

   public void b(amb $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(yn.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (amb $$0 : Lists.newArrayList(this.h)) {
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

         for (amb $$1 : this.h) {
            $$1.c.b($$0 ? yn.a(this) : yn.a(this.i()));
         }
      }
   }

   public Collection<amb> h() {
      return this.i;
   }
}
