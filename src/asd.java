import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class asd extends bsu {
   private final Set<asi> h = Sets.newHashSet();
   private final Set<asi> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public asd(xv $$0, bsu.a $$1, bsu.b $$2) {
      super(bae.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(adb::b);
      }
   }

   @Override
   public void a(bsu.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(adb::d);
      }
   }

   @Override
   public void a(bsu.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(adb::d);
      }
   }

   @Override
   public bsu a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(adb::e);
      }

      return this;
   }

   @Override
   public bsu b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(adb::e);
      }

      return this;
   }

   @Override
   public bsu c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(adb::e);
      }

      return this;
   }

   @Override
   public void a(xv $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(adb::c);
      }
   }

   private void a(Function<bsu, adb> $$0) {
      if (this.j) {
         adb $$1 = $$0.apply(this);

         for (asi $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(asi $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(adb.a(this));
      }
   }

   public void b(asi $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(adb.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (asi $$0 : Lists.newArrayList(this.h)) {
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

         for (asi $$1 : this.h) {
            $$1.f.b($$0 ? adb.a(this) : adb.a(this.h()));
         }
      }
   }

   public Collection<asi> g() {
      return this.i;
   }
}
