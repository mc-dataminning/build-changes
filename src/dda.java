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

public class dda {
   private final dch a;
   private final dze b;
   private final eiy c;

   public dda(dch $$0, dze $$1, eiy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dda a(aqt $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dda($$0, this.b, this.c);
      }
   }

   public List<ejf> a(dbn $$0, Predicate<eix> $$1) {
      Map<eix, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvi.e).h();
      Builder<ejf> $$3 = ImmutableList.builder();

      for (Entry<eix, LongSet> $$4 : $$2.entrySet()) {
         eix $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ejf> a(kc $$0, eix $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvi.e).b($$1);
      Builder<ejf> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eix $$0, LongSet $$1, Consumer<ejf> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kc $$4 = kc.a(new dbn($$3), this.a.ao());
         ejf $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvi.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ejf a(kc $$0, eix $$1, dvd $$2) {
      return $$2.a($$1);
   }

   public void a(kc $$0, eix $$1, ejf $$2, dvd $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kc $$0, eix $$1, long $$2, dvd $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ejf a(ja $$0, eix $$1) {
      for (ejf $$2 : this.a(kc.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ejf.b;
   }

   public ejf a(ja $$0, awm<eix> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ejf a(ja $$0, jn<eix> $$1) {
      return this.a($$0, $$1::a);
   }

   public ejf a(ja $$0, Predicate<jj<eix>> $$1) {
      jw<eix> $$2 = this.b().d(lr.aQ);

      for (ejf $$3 : this.a(new dbn($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ejf.b;
   }

   public ejf b(ja $$0, eix $$1) {
      for (ejf $$2 : this.a(kc.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ejf.b;
   }

   public boolean a(ja $$0, ejf $$1) {
      for (ejb $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvi.e).w();
   }

   public Map<eix, LongSet> b(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvi.e).h();
   }

   public eiz a(dbn $$0, eix $$1, eju $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ejf $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jx b() {
      return this.a.H_();
   }
}
