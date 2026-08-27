import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqb extends bog {
   private final Set<aqf> h = Sets.newHashSet();
   private final Set<aqf> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqb(ws $$0, bog.a $$1, bog.b $$2) {
      super(axw.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abu::b);
      }
   }

   @Override
   public void a(bog.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abu::d);
      }
   }

   @Override
   public void a(bog.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abu::d);
      }
   }

   @Override
   public bog a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public bog b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public bog c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abu::e);
      }

      return this;
   }

   @Override
   public void a(ws $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abu::c);
      }
   }

   private void a(Function<bog, abu> $$0) {
      if (this.j) {
         abu $$1 = $$0.apply(this);

         for (aqf $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aqf $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(abu.a(this));
      }
   }

   public void b(aqf $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(abu.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aqf $$0 : Lists.newArrayList(this.h)) {
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

         for (aqf $$1 : this.h) {
            $$1.d.b($$0 ? abu.a(this) : abu.a(this.h()));
         }
      }
   }

   public Collection<aqf> g() {
      return this.i;
   }
}
