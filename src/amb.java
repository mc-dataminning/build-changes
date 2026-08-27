import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class amb extends bin {
   private final Set<amf> h = Sets.newHashSet();
   private final Set<amf> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public amb(ur $$0, bin.a $$1, bin.b $$2) {
      super(atm.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(yn::b);
      }
   }

   @Override
   public void a(bin.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(yn::d);
      }
   }

   @Override
   public void a(bin.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(yn::d);
      }
   }

   @Override
   public bin a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(yn::e);
      }

      return this;
   }

   @Override
   public bin b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(yn::e);
      }

      return this;
   }

   @Override
   public bin c(boolean $$0) {
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

   private void a(Function<bin, yn> $$0) {
      if (this.j) {
         yn $$1 = $$0.apply(this);

         for (amf $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(amf $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(yn.a(this));
      }
   }

   public void b(amf $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(yn.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (amf $$0 : Lists.newArrayList(this.h)) {
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

         for (amf $$1 : this.h) {
            $$1.c.b($$0 ? yn.a(this) : yn.a(this.i()));
         }
      }
   }

   public Collection<amf> h() {
      return this.i;
   }
}
