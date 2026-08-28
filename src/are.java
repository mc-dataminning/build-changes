import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class are extends brf {
   private final Set<ari> h = Sets.newHashSet();
   private final Set<ari> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public are(xd $$0, brf.a $$1, brf.b $$2) {
      super(azd.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acj::b);
      }
   }

   @Override
   public void a(brf.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acj::d);
      }
   }

   @Override
   public void a(brf.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acj::d);
      }
   }

   @Override
   public brf a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acj::e);
      }

      return this;
   }

   @Override
   public brf b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acj::e);
      }

      return this;
   }

   @Override
   public brf c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acj::e);
      }

      return this;
   }

   @Override
   public void a(xd $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acj::c);
      }
   }

   private void a(Function<brf, acj> $$0) {
      if (this.j) {
         acj $$1 = $$0.apply(this);

         for (ari $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(ari $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(acj.a(this));
      }
   }

   public void b(ari $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(acj.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ari $$0 : Lists.newArrayList(this.h)) {
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

         for (ari $$1 : this.h) {
            $$1.c.b($$0 ? acj.a(this) : acj.a(this.h()));
         }
      }
   }

   public Collection<ari> g() {
      return this.i;
   }
}
