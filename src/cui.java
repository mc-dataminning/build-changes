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

public class cui {
   private final ctq a;
   private final dpo b;
   private final dzh c;

   public cui(ctq $$0, dpo $$1, dzh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cui a(ank $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cui($$0, this.b, this.c);
      }
   }

   public List<dzo> a(csw $$0, Predicate<dzg> $$1) {
      Map<dzg, LongSet> $$2 = this.a.a($$0.e, $$0.f, dli.e).h();
      Builder<dzo> $$3 = ImmutableList.builder();

      for (Entry<dzg, LongSet> $$4 : $$2.entrySet()) {
         dzg $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dzo> a(iz $$0, dzg $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dli.e).b($$1);
      Builder<dzo> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dzg $$0, LongSet $$1, Consumer<dzo> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iz $$4 = iz.a(new csw($$3), this.a.an());
         dzo $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dli.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dzo a(iz $$0, dzg $$1, dma $$2) {
      return $$2.a($$1);
   }

   public void a(iz $$0, dzg $$1, dzo $$2, dma $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iz $$0, dzg $$1, long $$2, dma $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dzo a(hx $$0, dzg $$1) {
      for (dzo $$2 : this.a(iz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dzo.b;
   }

   public dzo a(hx $$0, ahf<dzg> $$1) {
      dzg $$2 = this.b().d(ke.aD).a($$1);
      return $$2 == null ? dzo.b : this.b($$0, $$2);
   }

   public dzo a(hx $$0, asw<dzg> $$1) {
      it<dzg> $$2 = this.b().d(ke.aD);

      for (dzo $$3 : this.a(new csw($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dzo.b;
   }

   public dzo b(hx $$0, dzg $$1) {
      for (dzo $$2 : this.a(iz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dzo.b;
   }

   public boolean a(hx $$0, dzo $$1) {
      for (dzk $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dli.e).w();
   }

   public Map<dzg, LongSet> b(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dli.e).h();
   }

   public dzi a(csw $$0, dzg $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dzo $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iu b() {
      return this.a.I_();
   }
}
