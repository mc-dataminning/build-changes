import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akh extends bgg {
   private final Set<akl> h = Sets.newHashSet();
   private final Set<akl> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akh(tf $$0, bgg.a $$1, bgg.b $$2) {
      super(arp.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(xa::b);
      }
   }

   @Override
   public void a(bgg.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(xa::d);
      }
   }

   @Override
   public void a(bgg.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(xa::d);
      }
   }

   @Override
   public bgg a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(xa::e);
      }

      return this;
   }

   @Override
   public bgg b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(xa::e);
      }

      return this;
   }

   @Override
   public bgg c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(xa::e);
      }

      return this;
   }

   @Override
   public void a(tf $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(xa::c);
      }
   }

   private void a(Function<bgg, xa> $$0) {
      if (this.j) {
         xa $$1 = $$0.apply(this);

         for (akl $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(akl $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(xa.a(this));
      }
   }

   public void b(akl $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(xa.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (akl $$0 : Lists.newArrayList(this.h)) {
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

         for (akl $$1 : this.h) {
            $$1.c.b($$0 ? xa.a(this) : xa.a(this.i()));
         }
      }
   }

   public Collection<akl> h() {
      return this.i;
   }
}
