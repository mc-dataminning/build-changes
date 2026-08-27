import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class aln extends bhr {
   private final Set<alr> h = Sets.newHashSet();
   private final Set<alr> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public aln(ui $$0, bhr.a $$1, bhr.b $$2) {
      super(asy.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(ye::b);
      }
   }

   @Override
   public void a(bhr.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(ye::d);
      }
   }

   @Override
   public void a(bhr.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(ye::d);
      }
   }

   @Override
   public bhr a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(ye::e);
      }

      return this;
   }

   @Override
   public bhr b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(ye::e);
      }

      return this;
   }

   @Override
   public bhr c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(ye::e);
      }

      return this;
   }

   @Override
   public void a(ui $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(ye::c);
      }
   }

   private void a(Function<bhr, ye> $$0) {
      if (this.j) {
         ye $$1 = $$0.apply(this);

         for (alr $$2 : this.h) {
            $$2.c.b($$1);
         }
      }
   }

   public void a(alr $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.c.b(ye.a(this));
      }
   }

   public void b(alr $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.c.b(ye.a(this.i()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (alr $$0 : Lists.newArrayList(this.h)) {
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

         for (alr $$1 : this.h) {
            $$1.c.b($$0 ? ye.a(this) : ye.a(this.i()));
         }
      }
   }

   public Collection<alr> h() {
      return this.i;
   }
}
