import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class anb extends bjs {
   private final Set<anf> h = Sets.newHashSet();
   private final Set<anf> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public anb(vg $$0, bjs.a $$1, bjs.b $$2) {
      super(aup.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(zl::b);
      }
   }

   @Override
   public void a(bjs.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(zl::d);
      }
   }

   @Override
   public void a(bjs.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(zl::d);
      }
   }

   @Override
   public bjs a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(zl::e);
      }

      return this;
   }

   @Override
   public bjs b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(zl::e);
      }

      return this;
   }

   @Override
   public bjs c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(zl::e);
      }

      return this;
   }

   @Override
   public void a(vg $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(zl::c);
      }
   }

   private void a(Function<bjs, zl> $$0) {
      if (this.j) {
         zl $$1 = $$0.apply(this);

         for (anf $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(anf $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(zl.a(this));
      }
   }

   public void b(anf $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(zl.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (anf $$0 : Lists.newArrayList(this.h)) {
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

         for (anf $$1 : this.h) {
            $$1.c.b($$0 ? zl.a(this) : zl.a(this.i()));
         }
      }
   }

   public Collection<anf> h() {
      return this.i;
   }
}
