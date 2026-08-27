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

public class cqp {
   private final cpy a;
   private final dls b;
   private final dvl c;

   public cqp(cpy $$0, dls $$1, dvl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqp a(akz $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqp($$0, this.b, this.c);
      }
   }

   public List<dvs> a(cpe $$0, Predicate<dvk> $$1) {
      Map<dvk, LongSet> $$2 = this.a.a($$0.e, $$0.f, dhm.e).h();
      Builder<dvs> $$3 = ImmutableList.builder();

      for (Entry<dvk, LongSet> $$4 : $$2.entrySet()) {
         dvk $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvs> a(hz $$0, dvk $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dhm.e).b($$1);
      Builder<dvs> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dvk $$0, LongSet $$1, Consumer<dvs> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hz $$4 = hz.a(new cpe($$3), this.a.al());
         dvs $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dhm.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvs a(hz $$0, dvk $$1, die $$2) {
      return $$2.a($$1);
   }

   public void a(hz $$0, dvk $$1, dvs $$2, die $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hz $$0, dvk $$1, long $$2, die $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvs a(gw $$0, dvk $$1) {
      for (dvs $$2 : this.a(hz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvs.b;
   }

   public dvs a(gw $$0, aex<dvk> $$1) {
      dvk $$2 = this.b().d(je.az).a($$1);
      return $$2 == null ? dvs.b : this.b($$0, $$2);
   }

   public dvs a(gw $$0, aqj<dvk> $$1) {
      ht<dvk> $$2 = this.b().d(je.az);

      for (dvs $$3 : this.a(new cpe($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvs.b;
   }

   public dvs b(gw $$0, dvk $$1) {
      for (dvs $$2 : this.a(hz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvs.b;
   }

   public boolean a(gw $$0, dvs $$1) {
      for (dvo $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhm.e).w();
   }

   public Map<dvk, LongSet> b(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhm.e).h();
   }

   public dvm a(cpe $$0, dvk $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvs $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hu b() {
      return this.a.G_();
   }
}
