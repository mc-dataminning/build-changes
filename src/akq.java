import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class akq extends bgu {
   private final Set<aku> h = Sets.newHashSet();
   private final Set<aku> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public akq(tl $$0, bgu.a $$1, bgu.b $$2) {
      super(asb.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(xh::b);
      }
   }

   @Override
   public void a(bgu.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(xh::d);
      }
   }

   @Override
   public void a(bgu.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(xh::d);
      }
   }

   @Override
   public bgu a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(xh::e);
      }

      return this;
   }

   @Override
   public bgu b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(xh::e);
      }

      return this;
   }

   @Override
   public bgu c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(xh::e);
      }

      return this;
   }

   @Override
   public void a(tl $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(xh::c);
      }
   }

   private void a(Function<bgu, xh> $$0) {
      if (this.j) {
         xh $$1 = $$0.apply(this);

         for (aku $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(aku $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(xh.a(this));
      }
   }

   public void b(aku $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(xh.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aku $$0 : Lists.newArrayList(this.h)) {
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

         for (aku $$1 : this.h) {
            $$1.c.b($$0 ? xh.a(this) : xh.a(this.i()));
         }
      }
   }

   public Collection<aku> h() {
      return this.i;
   }
}
