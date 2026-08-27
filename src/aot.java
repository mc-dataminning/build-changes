import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aot extends blm {
   private final Set<aox> h = Sets.newHashSet();
   private final Set<aox> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aot(vq $$0, blm.a $$1, blm.b $$2) {
      super(awi.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aaq::b);
      }
   }

   @Override
   public void a(blm.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aaq::d);
      }
   }

   @Override
   public void a(blm.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aaq::d);
      }
   }

   @Override
   public blm a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aaq::e);
      }

      return this;
   }

   @Override
   public blm b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aaq::e);
      }

      return this;
   }

   @Override
   public blm c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aaq::e);
      }

      return this;
   }

   @Override
   public void a(vq $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aaq::c);
      }
   }

   private void a(Function<blm, aaq> $$0) {
      if (this.j) {
         aaq $$1 = $$0.apply(this);

         for (aox $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aox $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(aaq.a(this));
      }
   }

   public void b(aox $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(aaq.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aox $$0 : Lists.newArrayList(this.h)) {
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

         for (aox $$1 : this.h) {
            $$1.d.b($$0 ? aaq.a(this) : aaq.a(this.i()));
         }
      }
   }

   public Collection<aox> h() {
      return this.i;
   }
}
