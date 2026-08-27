import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cql {
   private final cql.a[] a;
   private WeakReference<cqn> b = new WeakReference<>(null);

   public cql(int $$0) {
      this.a = new cql.a[$$0];
   }

   public Optional<cqb> a(ctx $$0, ciz $$1) {
      if ($$1.aj_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cql.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ctx $$0) {
      cqn $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cqb> a(ciz $$0, ctx $$1) {
      Optional<cqm<cqb>> $$2 = $$1.r().a(cqp.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cqm::b).orElse(null));
      return $$2.map(cqm::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cql.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cng> $$0, @Nullable cqb $$1) {
      iq<cng> $$2 = iq.a($$0.size(), cng.f);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cql.a($$2, $$1);
   }

   static record a(iq<cng> a, @Nullable cqb b) {
      public boolean a(List<cng> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cng.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
