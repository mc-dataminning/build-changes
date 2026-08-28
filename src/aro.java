import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aro extends buh {
   private final Set<art> h = Sets.newHashSet();
   private final Set<art> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aro(xa $$0, buh.a $$1, buh.b $$2) {
      super(azo.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acf::b);
      }
   }

   @Override
   public void a(buh.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acf::d);
      }
   }

   @Override
   public void a(buh.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acf::d);
      }
   }

   @Override
   public buh a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acf::e);
      }

      return this;
   }

   @Override
   public buh b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acf::e);
      }

      return this;
   }

   @Override
   public buh c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acf::e);
      }

      return this;
   }

   @Override
   public void a(xa $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acf::c);
      }
   }

   private void a(Function<buh, acf> $$0) {
      if (this.j) {
         acf $$1 = $$0.apply(this);

         for (art $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(art $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(acf.a(this));
      }
   }

   public void b(art $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(acf.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (art $$0 : Lists.newArrayList(this.h)) {
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

         for (art $$1 : this.h) {
            $$1.f.b($$0 ? acf.a(this) : acf.a(this.i()));
         }
      }
   }

   public Collection<art> h() {
      return this.i;
   }
}
