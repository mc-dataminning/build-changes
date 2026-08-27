import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class amm extends bjb {
   private final Set<amq> h = Sets.newHashSet();
   private final Set<amq> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public amm(vb $$0, bjb.a $$1, bjb.b $$2) {
      super(aty.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(yy::b);
      }
   }

   @Override
   public void a(bjb.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(yy::d);
      }
   }

   @Override
   public void a(bjb.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(yy::d);
      }
   }

   @Override
   public bjb a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(yy::e);
      }

      return this;
   }

   @Override
   public bjb b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(yy::e);
      }

      return this;
   }

   @Override
   public bjb c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(yy::e);
      }

      return this;
   }

   @Override
   public void a(vb $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(yy::c);
      }
   }

   private void a(Function<bjb, yy> $$0) {
      if (this.j) {
         yy $$1 = $$0.apply(this);

         for (amq $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(amq $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(yy.a(this));
      }
   }

   public void b(amq $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(yy.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (amq $$0 : Lists.newArrayList(this.h)) {
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

         for (amq $$1 : this.h) {
            $$1.c.b($$0 ? yy.a(this) : yy.a(this.i()));
         }
      }
   }

   public Collection<amq> h() {
      return this.i;
   }
}
