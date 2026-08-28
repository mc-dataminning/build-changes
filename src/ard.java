import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class ard extends bra {
   private final Set<arh> h = Sets.newHashSet();
   private final Set<arh> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public ard(xd $$0, bra.a $$1, bra.b $$2) {
      super(azc.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acj::b);
      }
   }

   @Override
   public void a(bra.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acj::d);
      }
   }

   @Override
   public void a(bra.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acj::d);
      }
   }

   @Override
   public bra a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acj::e);
      }

      return this;
   }

   @Override
   public bra b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acj::e);
      }

      return this;
   }

   @Override
   public bra c(boolean $$0) {
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

   private void a(Function<bra, acj> $$0) {
      if (this.j) {
         acj $$1 = $$0.apply(this);

         for (arh $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(arh $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(acj.a(this));
      }
   }

   public void b(arh $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(acj.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arh $$0 : Lists.newArrayList(this.h)) {
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

         for (arh $$1 : this.h) {
            $$1.c.b($$0 ? acj.a(this) : acj.a(this.h()));
         }
      }
   }

   public Collection<arh> g() {
      return this.i;
   }
}
