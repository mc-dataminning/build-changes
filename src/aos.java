import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aos extends blk {
   private final Set<aow> h = Sets.newHashSet();
   private final Set<aow> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aos(vq $$0, blk.a $$1, blk.b $$2) {
      super(awh.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aaq::b);
      }
   }

   @Override
   public void a(blk.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aaq::d);
      }
   }

   @Override
   public void a(blk.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aaq::d);
      }
   }

   @Override
   public blk a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aaq::e);
      }

      return this;
   }

   @Override
   public blk b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aaq::e);
      }

      return this;
   }

   @Override
   public blk c(boolean $$0) {
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

   private void a(Function<blk, aaq> $$0) {
      if (this.j) {
         aaq $$1 = $$0.apply(this);

         for (aow $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aow $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(aaq.a(this));
      }
   }

   public void b(aow $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(aaq.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aow $$0 : Lists.newArrayList(this.h)) {
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

         for (aow $$1 : this.h) {
            $$1.d.b($$0 ? aaq.a(this) : aaq.a(this.i()));
         }
      }
   }

   public Collection<aow> h() {
      return this.i;
   }
}
