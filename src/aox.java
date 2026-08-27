import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aox extends bmb {
   private final Set<apb> h = Sets.newHashSet();
   private final Set<apb> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aox(vs $$0, bmb.a $$1, bmb.b $$2) {
      super(awm.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(aas::b);
      }
   }

   @Override
   public void a(bmb.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(aas::d);
      }
   }

   @Override
   public void a(bmb.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(aas::d);
      }
   }

   @Override
   public bmb a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(aas::e);
      }

      return this;
   }

   @Override
   public bmb b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(aas::e);
      }

      return this;
   }

   @Override
   public bmb c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(aas::e);
      }

      return this;
   }

   @Override
   public void a(vs $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(aas::c);
      }
   }

   private void a(Function<bmb, aas> $$0) {
      if (this.j) {
         aas $$1 = $$0.apply(this);

         for (apb $$2 : this.h) {
            $$2.d.b($$1);
         }
      }
   }

   public void a(apb $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.d.b(aas.a(this));
      }
   }

   public void b(apb $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.d.b(aas.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (apb $$0 : Lists.newArrayList(this.h)) {
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

         for (apb $$1 : this.h) {
            $$1.d.b($$0 ? aas.a(this) : aas.a(this.i()));
         }
      }
   }

   public Collection<apb> h() {
      return this.i;
   }
}
