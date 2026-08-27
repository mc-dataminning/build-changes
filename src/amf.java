import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class amf extends bir {
   private final Set<amj> h = Sets.newHashSet();
   private final Set<amj> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public amf(uv $$0, bir.a $$1, bir.b $$2) {
      super(atq.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(yr::b);
      }
   }

   @Override
   public void a(bir.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(yr::d);
      }
   }

   @Override
   public void a(bir.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(yr::d);
      }
   }

   @Override
   public bir a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(yr::e);
      }

      return this;
   }

   @Override
   public bir b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(yr::e);
      }

      return this;
   }

   @Override
   public bir c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(yr::e);
      }

      return this;
   }

   @Override
   public void a(uv $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(yr::c);
      }
   }

   private void a(Function<bir, yr> $$0) {
      if (this.j) {
         yr $$1 = $$0.apply(this);

         for (amj $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(amj $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(yr.a(this));
      }
   }

   public void b(amj $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(yr.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (amj $$0 : Lists.newArrayList(this.h)) {
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

         for (amj $$1 : this.h) {
            $$1.c.b($$0 ? yr.a(this) : yr.a(this.i()));
         }
      }
   }

   public Collection<amj> h() {
      return this.i;
   }
}
