import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akk extends bgj {
   private final Set<ako> h = Sets.newHashSet();
   private final Set<ako> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akk(ti $$0, bgj.a $$1, bgj.b $$2) {
      super(ars.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(xd::b);
      }
   }

   @Override
   public void a(bgj.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(xd::d);
      }
   }

   @Override
   public void a(bgj.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(xd::d);
      }
   }

   @Override
   public bgj a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(xd::e);
      }

      return this;
   }

   @Override
   public bgj b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(xd::e);
      }

      return this;
   }

   @Override
   public bgj c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(xd::e);
      }

      return this;
   }

   @Override
   public void a(ti $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(xd::c);
      }
   }

   private void a(Function<bgj, xd> $$0) {
      if (this.j) {
         xd $$1 = $$0.apply(this);

         for (ako $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(ako $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(xd.a(this));
      }
   }

   public void b(ako $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(xd.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ako $$0 : Lists.newArrayList(this.h)) {
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

         for (ako $$1 : this.h) {
            $$1.c.b($$0 ? xd.a(this) : xd.a(this.i()));
         }
      }
   }

   public Collection<ako> h() {
      return this.i;
   }
}
