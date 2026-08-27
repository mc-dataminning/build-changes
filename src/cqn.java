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

public class cqn {
   private final cpw a;
   private final dlq b;
   private final dvj c;

   public cqn(cpw $$0, dlq $$1, dvj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqn a(aky $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqn($$0, this.b, this.c);
      }
   }

   public List<dvq> a(cpc $$0, Predicate<dvi> $$1) {
      Map<dvi, LongSet> $$2 = this.a.a($$0.e, $$0.f, dhk.e).h();
      Builder<dvq> $$3 = ImmutableList.builder();

      for (Entry<dvi, LongSet> $$4 : $$2.entrySet()) {
         dvi $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvq> a(hz $$0, dvi $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dhk.e).b($$1);
      Builder<dvq> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dvi $$0, LongSet $$1, Consumer<dvq> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hz $$4 = hz.a(new cpc($$3), this.a.al());
         dvq $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dhk.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvq a(hz $$0, dvi $$1, dic $$2) {
      return $$2.a($$1);
   }

   public void a(hz $$0, dvi $$1, dvq $$2, dic $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hz $$0, dvi $$1, long $$2, dic $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvq a(gw $$0, dvi $$1) {
      for (dvq $$2 : this.a(hz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvq.b;
   }

   public dvq a(gw $$0, aew<dvi> $$1) {
      dvi $$2 = this.b().d(je.az).a($$1);
      return $$2 == null ? dvq.b : this.b($$0, $$2);
   }

   public dvq a(gw $$0, aqi<dvi> $$1) {
      ht<dvi> $$2 = this.b().d(je.az);

      for (dvq $$3 : this.a(new cpc($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvq.b;
   }

   public dvq b(gw $$0, dvi $$1) {
      for (dvq $$2 : this.a(hz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvq.b;
   }

   public boolean a(gw $$0, dvq $$1) {
      for (dvm $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhk.e).w();
   }

   public Map<dvi, LongSet> b(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhk.e).h();
   }

   public dvk a(cpc $$0, dvi $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvq $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hu b() {
      return this.a.G_();
   }
}
