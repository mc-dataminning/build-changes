import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

public class arl extends bsa {
   private final Set<arq> h = Sets.newHashSet();
   private final Set<arq> i = Collections.unmodifiableSet(this.h);
   private boolean j = true;

   public arl(xj $$0, bsa.a $$1, bsa.b $$2) {
      super(azm.a(), $$0, $$1, $$2);
   }

   @Override
   public void a(float $$0) {
      if ($$0 != this.b) {
         super.a($$0);
         this.a(acp::b);
      }
   }

   @Override
   public void a(bsa.a $$0) {
      if ($$0 != this.c) {
         super.a($$0);
         this.a(acp::d);
      }
   }

   @Override
   public void a(bsa.b $$0) {
      if ($$0 != this.d) {
         super.a($$0);
         this.a(acp::d);
      }
   }

   @Override
   public bsa a(boolean $$0) {
      if ($$0 != this.e) {
         super.a($$0);
         this.a(acp::e);
      }

      return this;
   }

   @Override
   public bsa b(boolean $$0) {
      if ($$0 != this.f) {
         super.b($$0);
         this.a(acp::e);
      }

      return this;
   }

   @Override
   public bsa c(boolean $$0) {
      if ($$0 != this.g) {
         super.c($$0);
         this.a(acp::e);
      }

      return this;
   }

   @Override
   public void a(xj $$0) {
      if (!Objects.equal($$0, this.a)) {
         super.a($$0);
         this.a(acp::c);
      }
   }

   private void a(Function<bsa, acp> $$0) {
      if (this.j) {
         acp $$1 = $$0.apply(this);

         for (arq $$2 : this.h) {
            $$2.f.b($$1);
         }
      }
   }

   public void a(arq $$0) {
      if (this.h.add($$0) && this.j) {
         $$0.f.b(acp.a(this));
      }
   }

   public void b(arq $$0) {
      if (this.h.remove($$0) && this.j) {
         $$0.f.b(acp.a(this.h()));
      }
   }

   public void b() {
      if (!this.h.isEmpty()) {
         for (arq $$0 : Lists.newArrayList(this.h)) {
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

         for (arq $$1 : this.h) {
            $$1.f.b($$0 ? acp.a(this) : acp.a(this.h()));
         }
      }
   }

   public Collection<arq> g() {
      return this.i;
   }
}
