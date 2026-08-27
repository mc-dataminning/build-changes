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

public class dan {
   private final czv a;
   private final dwo b;
   private final egh c;

   public dan(czv $$0, dwo $$1, egh $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dan a(aql $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dan($$0, this.b, this.c);
      }
   }

   public List<ego> a(czb $$0, Predicate<egg> $$1) {
      Map<egg, LongSet> $$2 = this.a.a($$0.e, $$0.f, dst.e).h();
      Builder<ego> $$3 = ImmutableList.builder();

      for (Entry<egg, LongSet> $$4 : $$2.entrySet()) {
         egg $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ego> a(jo $$0, egg $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dst.e).b($$1);
      Builder<ego> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(egg $$0, LongSet $$1, Consumer<ego> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jo $$4 = jo.a(new czb($$3), this.a.an());
         ego $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dst.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ego a(jo $$0, egg $$1, dsq $$2) {
      return $$2.a($$1);
   }

   public void a(jo $$0, egg $$1, ego $$2, dsq $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jo $$0, egg $$1, long $$2, dsq $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ego a(im $$0, egg $$1) {
      for (ego $$2 : this.a(jo.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ego.b;
   }

   public ego a(im $$0, awd<egg> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ego a(im $$0, iz<egg> $$1) {
      return this.a($$0, $$1::a);
   }

   public ego a(im $$0, Predicate<iv<egg>> $$1) {
      ji<egg> $$2 = this.b().d(ld.aI);

      for (ego $$3 : this.a(new czb($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ego.b;
   }

   public ego b(im $$0, egg $$1) {
      for (ego $$2 : this.a(jo.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ego.b;
   }

   public boolean a(im $$0, ego $$1) {
      for (egk $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(im $$0) {
      jo $$1 = jo.a($$0);
      return this.a.a($$1.a(), $$1.c(), dst.e).w();
   }

   public Map<egg, LongSet> b(im $$0) {
      jo $$1 = jo.a($$0);
      return this.a.a($$1.a(), $$1.c(), dst.e).h();
   }

   public egi a(czb $$0, egg $$1, ehd $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ego $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jj b() {
      return this.a.H_();
   }
}
