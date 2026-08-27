import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class ana extends bjq {
   private final Set<ane> h = Sets.newHashSet();
   private final Set<ane> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public ana(vf $$0, bjq.a $$1, bjq.b $$2) {
      super(aun.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(zk::b);
      }
   }

   @Override
   public void a(bjq.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(zk::d);
      }
   }

   @Override
   public void a(bjq.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(zk::d);
      }
   }

   @Override
   public bjq a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(zk::e);
      }

      return this;
   }

   @Override
   public bjq b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(zk::e);
      }

      return this;
   }

   @Override
   public bjq c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(zk::e);
      }

      return this;
   }

   @Override
   public void a(vf $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(zk::c);
      }
   }

   private void a(Function<bjq, zk> $$0) {
      if (this.j) {
         zk $$1 = $$0.apply(this);

         for (ane $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(ane $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(zk.a(this));
      }
   }

   public void b(ane $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(zk.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ane $$0 : Lists.newArrayList(this.h)) {
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

         for (ane $$1 : this.h) {
            $$1.c.b($$0 ? zk.a(this) : zk.a(this.i()));
         }
      }
   }

   public Collection<ane> h() {
      return this.i;
   }
}
