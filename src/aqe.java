import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqe extends bpc {
   private final Set<aqi> h = Sets.newHashSet();
   private final Set<aqi> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqe(wu $$0, bpc.a $$1, bpc.b $$2) {
      super(axz.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(abw::b);
      }
   }

   @Override
   public void a(bpc.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(abw::d);
      }
   }

   @Override
   public void a(bpc.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(abw::d);
      }
   }

   @Override
   public bpc a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(abw::e);
      }

      return this;
   }

   @Override
   public bpc b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(abw::e);
      }

      return this;
   }

   @Override
   public bpc c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(abw::e);
      }

      return this;
   }

   @Override
   public void a(wu $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(abw::c);
      }
   }

   private void a(Function<bpc, abw> $$0) {
      if (this.j) {
         abw $$1 = $$0.apply(this);

         for (aqi $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aqi $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(abw.a(this));
      }
   }

   public void b(aqi $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(abw.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aqi $$0 : Lists.newArrayList(this.h)) {
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

         for (aqi $$1 : this.h) {
            $$1.d.b($$0 ? abw.a(this) : abw.a(this.h()));
         }
      }
   }

   public Collection<aqi> g() {
      return this.i;
   }
}
