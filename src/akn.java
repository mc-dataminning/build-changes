import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akn extends bgo {
   private final Set<akr> h = Sets.newHashSet();
   private final Set<akr> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akn(tl $$0, bgo.a $$1, bgo.b $$2) {
      super(arw.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(xg::b);
      }
   }

   @Override
   public void a(bgo.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(xg::d);
      }
   }

   @Override
   public void a(bgo.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(xg::d);
      }
   }

   @Override
   public bgo a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(xg::e);
      }

      return this;
   }

   @Override
   public bgo b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(xg::e);
      }

      return this;
   }

   @Override
   public bgo c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(xg::e);
      }

      return this;
   }

   @Override
   public void a(tl $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(xg::c);
      }
   }

   private void a(Function<bgo, xg> $$0) {
      if (this.j) {
         xg $$1 = $$0.apply(this);

         for (akr $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(akr $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(xg.a(this));
      }
   }

   public void b(akr $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(xg.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (akr $$0 : Lists.newArrayList(this.h)) {
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

         for (akr $$1 : this.h) {
            $$1.c.b($$0 ? xg.a(this) : xg.a(this.i()));
         }
      }
   }

   public Collection<akr> h() {
      return this.i;
   }
}
