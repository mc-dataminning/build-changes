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

public class cub {
   private final ctj a;
   private final dph b;
   private final dza c;

   public cub(ctj $$0, dph $$1, dza $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cub a(ang $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cub($$0, this.b, this.c);
      }
   }

   public List<dzh> a(csp $$0, Predicate<dyz> $$1) {
      Map<dyz, LongSet> $$2 = this.a.a($$0.e, $$0.f, dlb.e).h();
      Builder<dzh> $$3 = ImmutableList.builder();

      for (Entry<dyz, LongSet> $$4 : $$2.entrySet()) {
         dyz $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dzh> a(iz $$0, dyz $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dlb.e).b($$1);
      Builder<dzh> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dyz $$0, LongSet $$1, Consumer<dzh> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iz $$4 = iz.a(new csp($$3), this.a.an());
         dzh $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dlb.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dzh a(iz $$0, dyz $$1, dlt $$2) {
      return $$2.a($$1);
   }

   public void a(iz $$0, dyz $$1, dzh $$2, dlt $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iz $$0, dyz $$1, long $$2, dlt $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dzh a(hx $$0, dyz $$1) {
      for (dzh $$2 : this.a(iz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dzh.b;
   }

   public dzh a(hx $$0, ahc<dyz> $$1) {
      dyz $$2 = this.b().d(ke.aD).a($$1);
      return $$2 == null ? dzh.b : this.b($$0, $$2);
   }

   public dzh a(hx $$0, asq<dyz> $$1) {
      it<dyz> $$2 = this.b().d(ke.aD);

      for (dzh $$3 : this.a(new csp($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dzh.b;
   }

   public dzh b(hx $$0, dyz $$1) {
      for (dzh $$2 : this.a(iz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dzh.b;
   }

   public boolean a(hx $$0, dzh $$1) {
      for (dzd $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlb.e).w();
   }

   public Map<dyz, LongSet> b(hx $$0) {
      iz $$1 = iz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dlb.e).h();
   }

   public dzb a(csp $$0, dyz $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dzh $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iu b() {
      return this.a.I_();
   }
}
