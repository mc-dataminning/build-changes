import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqj extends bpk {
   private final Set<aqn> h = Sets.newHashSet();
   private final Set<aqn> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqj(wx $$0, bpk.a $$1, bpk.b $$2) {
      super(ayd.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aca::b);
      }
   }

   @Override
   public void a(bpk.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aca::d);
      }
   }

   @Override
   public void a(bpk.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aca::d);
      }
   }

   @Override
   public bpk a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public bpk b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public bpk c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aca::e);
      }

      return this;
   }

   @Override
   public void a(wx $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aca::c);
      }
   }

   private void a(Function<bpk, aca> $$0) {
      if (this.j) {
         aca $$1 = $$0.apply(this);

         for (aqn $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(aqn $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(aca.a(this));
      }
   }

   public void b(aqn $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(aca.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aqn $$0 : Lists.newArrayList(this.h)) {
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

         for (aqn $$1 : this.h) {
            $$1.d.b($$0 ? aca.a(this) : aca.a(this.h()));
         }
      }
   }

   public Collection<aqn> g() {
      return this.i;
   }
}
