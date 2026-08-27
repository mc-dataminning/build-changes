import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctr {
   private final csz a;
   private final dow b;
   private final dyp c;

   public ctr(csz $$0, dow $$1, dyp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ctr a(amw $$0) {
      if ($$0.D() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.D() + ", region: " + $$0);
      } else {
         return new ctr($$0, this.b, this.c);
      }
   }

   public List<dyw> a(csf $$0, Predicate<dyo> $$1) {
      Map<dyo, LongSet> $$2 = this.a.a($$0.e, $$0.f, dkq.e).h();
      Builder<dyw> $$3 = ImmutableList.builder();

      for (Entry<dyo, LongSet> $$4 : $$2.entrySet()) {
         dyo $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dyw> a(ix $$0, dyo $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dkq.e).b($$1);
      Builder<dyw> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dyo $$0, LongSet $$1, Consumer<dyw> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         ix $$4 = ix.a(new csf($$3), this.a.am());
         dyw $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dkq.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dyw a(ix $$0, dyo $$1, dli $$2) {
      return $$2.a($$1);
   }

   public void a(ix $$0, dyo $$1, dyw $$2, dli $$3) {
      $$3.a($$1, $$2);
   }

   public void a(ix $$0, dyo $$1, long $$2, dli $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dyw a(hv $$0, dyo $$1) {
      for (dyw $$2 : this.a(ix.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dyw.b;
   }

   public dyw a(hv $$0, ags<dyo> $$1) {
      dyo $$2 = this.b().d(kc.aC).a($$1);
      return $$2 == null ? dyw.b : this.b($$0, $$2);
   }

   public dyw a(hv $$0, asg<dyo> $$1) {
      ir<dyo> $$2 = this.b().d(kc.aC);

      for (dyw $$3 : this.a(new csf($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dyw.b;
   }

   public dyw b(hv $$0, dyo $$1) {
      for (dyw $$2 : this.a(ix.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dyw.b;
   }

   public boolean a(hv $$0, dyw $$1) {
      for (dys $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hv $$0) {
      ix $$1 = ix.a($$0);
      return this.a.a($$1.a(), $$1.c(), dkq.e).w();
   }

   public Map<dyo, LongSet> b(hv $$0) {
      ix $$1 = ix.a($$0);
      return this.a.a($$1.a(), $$1.c(), dkq.e).h();
   }

   public dyq a(csf $$0, dyo $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dyw $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public is b() {
      return this.a.I_();
   }
}
