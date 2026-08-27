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

public class cuh {
   private final ctp a;
   private final dpn b;
   private final dzg c;

   public cuh(ctp $$0, dpn $$1, dzg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cuh a(ank $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cuh($$0, this.b, this.c);
      }
   }

   public List<dzn> a(csv $$0, Predicate<dzf> $$1) {
      Map<dzf, LongSet> $$2 = this.a.a($$0.e, $$0.f, dlh.e).h();
      Builder<dzn> $$3 = ImmutableList.builder();

      for (Entry<dzf, LongSet> $$4 : $$2.entrySet()) {
         dzf $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dzn> a(iz $$0, dzf $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dlh.e).b($$1);
      Builder<dzn> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dzf $$0, LongSet $$1, Consumer<dzn> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iz $$4 = iz.a(new csv($$3), this.a.an());
         dzn $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dlh.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dzn a(iz $$0, dzf $$1, dlz $$2) {
      return $$2.a($$1);
   }

   public void a(iz $$0, dzf $$1, dzn $$2, dlz $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iz $$0, dzf $$1, long $$2, dlz $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dzn a(hx $$0, dzf $$1) {
      for (dzn $$2 : this.a(iz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dzn.b;
   }

   public dzn a(hx $$0, ahf<dzf> $$1) {
      dzf $$2 = this.b().d(ke.aD).a($$1);
      return $$2 == null ? dzn.b : this.b($$0, $$2);
   }

   public dzn a(hx $$0, asv<dzf> $$1) {
      it<dzf> $$2 = this.b().d(ke.aD);

      for (dzn $$3 : this.a(new csv($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dzn.b;
   }

   public dzn b(hx $$0, dzf $$1) {
      for (dzn $$2 : this.a(iz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dzn.b;
   }

   public boolean a(hx $$0, dzn $$1) {
      for (dzj $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlh.e).w();
   }

   public Map<dzf, LongSet> b(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlh.e).h();
   }

   public dzh a(csv $$0, dzf $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dzn $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iu b() {
      return this.a.I_();
   }
}
