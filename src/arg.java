import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arg extends bri {
   private final Set<ark> h = Sets.newHashSet();
   private final Set<ark> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arg(xe $$0, bri.a $$1, bri.b $$2) {
      super(azf.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(ack::b);
      }
   }

   @Override
   public void a(bri.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(ack::d);
      }
   }

   @Override
   public void a(bri.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(ack::d);
      }
   }

   @Override
   public bri a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(ack::e);
      }

      return this;
   }

   @Override
   public bri b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(ack::e);
      }

      return this;
   }

   @Override
   public bri c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(ack::e);
      }

      return this;
   }

   @Override
   public void a(xe $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(ack::c);
      }
   }

   private void a(Function<bri, ack> $$0) {
      if (this.j) {
         ack $$1 = $$0.apply(this);

         for (ark $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(ark $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(ack.a(this));
      }
   }

   public void b(ark $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(ack.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (ark $$0 : Lists.newArrayList(this.h)) {
            this.b($$0);
         }
      }
   }

   public boolean f() {
      return this.j;
   }

   public void d(boolean $$0) {
      if ($$0 != this.j) {
         this.j = $$0;

         for (ark $$1 : this.h) {
            $$1.c.b($$0 ? ack.a(this) : ack.a(this.h()));
         }
      }
   }

   public Collection<ark> g() {
      return this.i;
   }
}
