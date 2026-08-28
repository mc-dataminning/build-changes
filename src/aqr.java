import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aqr extends bqh {
   private final Set<aqv> h = Sets.newHashSet();
   private final Set<aqv> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aqr(wz $$0, bqh.a $$1, bqh.b $$2) {
      super(ayo.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(ace::b);
      }
   }

   @Override
   public void a(bqh.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(ace::d);
      }
   }

   @Override
   public void a(bqh.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(ace::d);
      }
   }

   @Override
   public bqh a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(ace::e);
      }

      return this;
   }

   @Override
   public bqh b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(ace::e);
      }

      return this;
   }

   @Override
   public bqh c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(ace::e);
      }

      return this;
   }

   @Override
   public void a(wz $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(ace::c);
      }
   }

   private void a(Function<bqh, ace> $$0) {
      if (this.j) {
         ace $$1 = $$0.apply(this);

         for (aqv $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(aqv $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(ace.a(this));
      }
   }

   public void b(aqv $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(ace.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (aqv $$0 : Lists.newArrayList(this.h)) {
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

         for (aqv $$1 : this.h) {
            $$1.c.b($$0 ? ace.a(this) : ace.a(this.h()));
         }
      }
   }

   public Collection<aqv> g() {
      return this.i;
   }
}
