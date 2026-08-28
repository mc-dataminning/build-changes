import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqy extends brz {
   private final Set<ard> h = Sets.newHashSet();
   private final Set<ard> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqy(wo $$0, brz.a $$1, brz.b $$2) {
      super(ayz.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abu::b);
      }
   }

   @Override
   public void a(brz.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abu::d);
      }
   }

   @Override
   public void a(brz.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abu::d);
      }
   }

   @Override
   public brz a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public brz b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public brz c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public void a(wo $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abu::c);
      }
   }

   private void a(Function<brz, abu> $$0) {
      if (this.j) {
         abu $$1 = $$0.apply(this);

         for (ard $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(ard $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(abu.a(this));
      }
   }

   public void b(ard $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(abu.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ard $$0 : Lists.newArrayList(this.h)) {
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

         for (ard $$1 : this.h) {
            $$1.f.b($$0 ? abu.a(this) : abu.a(this.h()));
         }
      }
   }

   public Collection<ard> g() {
      return this.i;
   }
}
