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

public class cuq {
   private final cty a;
   private final dpw b;
   private final dzp c;

   public cuq(cty $$0, dpw $$1, dzp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cuq a(anl $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cuq($$0, this.b, this.c);
      }
   }

   public List<dzw> a(cte $$0, Predicate<dzo> $$1) {
      Map<dzo, LongSet> $$2 = this.a.a($$0.e, $$0.f, dlq.e).h();
      Builder<dzw> $$3 = ImmutableList.builder();

      for (Entry<dzo, LongSet> $$4 : $$2.entrySet()) {
         dzo $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dzw> a(iz $$0, dzo $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dlq.e).b($$1);
      Builder<dzw> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dzo $$0, LongSet $$1, Consumer<dzw> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iz $$4 = iz.a(new cte($$3), this.a.an());
         dzw $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dlq.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dzw a(iz $$0, dzo $$1, dmi $$2) {
      return $$2.a($$1);
   }

   public void a(iz $$0, dzo $$1, dzw $$2, dmi $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iz $$0, dzo $$1, long $$2, dmi $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dzw a(hx $$0, dzo $$1) {
      for (dzw $$2 : this.a(iz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dzw.b;
   }

   public dzw a(hx $$0, ahg<dzo> $$1) {
      dzo $$2 = this.b().d(ke.aD).a($$1);
      return $$2 == null ? dzw.b : this.b($$0, $$2);
   }

   public dzw a(hx $$0, asx<dzo> $$1) {
      it<dzo> $$2 = this.b().d(ke.aD);

      for (dzw $$3 : this.a(new cte($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dzw.b;
   }

   public dzw b(hx $$0, dzo $$1) {
      for (dzw $$2 : this.a(iz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dzw.b;
   }

   public boolean a(hx $$0, dzw $$1) {
      for (dzs $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlq.e).w();
   }

   public Map<dzo, LongSet> b(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlq.e).h();
   }

   public dzq a(cte $$0, dzo $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dzw $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iu b() {
      return this.a.I_();
   }
}
