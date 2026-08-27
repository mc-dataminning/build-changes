import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class amw extends bjl {
   private final Set<ana> h = Sets.newHashSet();
   private final Set<ana> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public amw(vd $$0, bjl.a $$1, bjl.b $$2) {
      super(aui.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(zh::b);
      }
   }

   @Override
   public void a(bjl.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(zh::d);
      }
   }

   @Override
   public void a(bjl.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(zh::d);
      }
   }

   @Override
   public bjl a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(zh::e);
      }

      return this;
   }

   @Override
   public bjl b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(zh::e);
      }

      return this;
   }

   @Override
   public bjl c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(zh::e);
      }

      return this;
   }

   @Override
   public void a(vd $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(zh::c);
      }
   }

   private void a(Function<bjl, zh> $$0) {
      if (this.j) {
         zh $$1 = $$0.apply(this);

         for (ana $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(ana $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(zh.a(this));
      }
   }

   public void b(ana $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(zh.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ana $$0 : Lists.newArrayList(this.h)) {
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

         for (ana $$1 : this.h) {
            $$1.c.b($$0 ? zh.a(this) : zh.a(this.i()));
         }
      }
   }

   public Collection<ana> h() {
      return this.i;
   }
}
