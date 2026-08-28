import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class ark extends bto {
   private final Set<arp> h = Sets.newHashSet();
   private final Set<arp> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public ark(ww $$0, bto.a $$1, bto.b $$2) {
      super(azk.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acb::b);
      }
   }

   @Override
   public void a(bto.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acb::d);
      }
   }

   @Override
   public void a(bto.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acb::d);
      }
   }

   @Override
   public bto a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acb::e);
      }

      return this;
   }

   @Override
   public bto b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acb::e);
      }

      return this;
   }

   @Override
   public bto c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acb::e);
      }

      return this;
   }

   @Override
   public void a(ww $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acb::c);
      }
   }

   private void a(Function<bto, acb> $$0) {
      if (this.j) {
         acb $$1 = $$0.apply(this);

         for (arp $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(arp $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(acb.a(this));
      }
   }

   public void b(arp $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(acb.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arp $$0 : Lists.newArrayList(this.h)) {
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

         for (arp $$1 : this.h) {
            $$1.f.b($$0 ? acb.a(this) : acb.a(this.h()));
         }
      }
   }

   public Collection<arp> g() {
      return this.i;
   }
}
