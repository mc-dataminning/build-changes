import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class apc extends bms {
   private final Set<apg> h = Sets.newHashSet();
   private final Set<apg> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public apc(vu $$0, bms.a $$1, bms.b $$2) {
      super(aww.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aaw::b);
      }
   }

   @Override
   public void a(bms.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aaw::d);
      }
   }

   @Override
   public void a(bms.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aaw::d);
      }
   }

   @Override
   public bms a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aaw::e);
      }

      return this;
   }

   @Override
   public bms b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aaw::e);
      }

      return this;
   }

   @Override
   public bms c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aaw::e);
      }

      return this;
   }

   @Override
   public void a(vu $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aaw::c);
      }
   }

   private void a(Function<bms, aaw> $$0) {
      if (this.j) {
         aaw $$1 = $$0.apply(this);

         for (apg $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(apg $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(aaw.a(this));
      }
   }

   public void b(apg $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(aaw.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (apg $$0 : Lists.newArrayList(this.h)) {
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

         for (apg $$1 : this.h) {
            $$1.d.b($$0 ? aaw.a(this) : aaw.a(this.i()));
         }
      }
   }

   public Collection<apg> h() {
      return this.i;
   }
}
