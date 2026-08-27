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

public class cqt {
   private final cqc a;
   private final dlk b;
   private final dvd c;

   public cqt(cqc $$0, dlk $$1, dvd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqt a(ala $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqt($$0, this.b, this.c);
      }
   }

   public List<dvk> a(cpi $$0, Predicate<dvc> $$1) {
      Map<dvc, LongSet> $$2 = this.a.a($$0.e, $$0.f, dhe.e).h();
      Builder<dvk> $$3 = ImmutableList.builder();

      for (Entry<dvc, LongSet> $$4 : $$2.entrySet()) {
         dvc $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvk> a(hw $$0, dvc $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dhe.e).b($$1);
      Builder<dvk> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dvc $$0, LongSet $$1, Consumer<dvk> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hw $$4 = hw.a(new cpi($$3), this.a.al());
         dvk $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dhe.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvk a(hw $$0, dvc $$1, dhw $$2) {
      return $$2.a($$1);
   }

   public void a(hw $$0, dvc $$1, dvk $$2, dhw $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hw $$0, dvc $$1, long $$2, dhw $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvk a(gw $$0, dvc $$1) {
      for (dvk $$2 : this.a(hw.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvk.b;
   }

   public dvk a(gw $$0, aey<dvc> $$1) {
      dvc $$2 = this.b().d(jc.aA).a($$1);
      return $$2 == null ? dvk.b : this.b($$0, $$2);
   }

   public dvk a(gw $$0, aqk<dvc> $$1) {
      hq<dvc> $$2 = this.b().d(jc.aA);

      for (dvk $$3 : this.a(new cpi($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvk.b;
   }

   public dvk b(gw $$0, dvc $$1) {
      for (dvk $$2 : this.a(hw.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvk.b;
   }

   public boolean a(gw $$0, dvk $$1) {
      for (dvg $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gw $$0) {
      hw $$1 = hw.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhe.e).w();
   }

   public Map<dvc, LongSet> b(gw $$0) {
      hw $$1 = hw.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhe.e).h();
   }

   public dve a(cpi $$0, dvc $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvk $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hr b() {
      return this.a.G_();
   }
}
