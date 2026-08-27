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

public class cqi {
   private final cpr a;
   private final dll b;
   private final dve c;

   public cqi(cpr $$0, dll $$1, dve $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqi a(aku $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqi($$0, this.b, this.c);
      }
   }

   public List<dvl> a(cox $$0, Predicate<dvd> $$1) {
      Map<dvd, LongSet> $$2 = this.a.a($$0.e, $$0.f, dhf.e).h();
      Builder<dvl> $$3 = ImmutableList.builder();

      for (Entry<dvd, LongSet> $$4 : $$2.entrySet()) {
         dvd $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvl> a(hz $$0, dvd $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dhf.e).b($$1);
      Builder<dvl> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dvd $$0, LongSet $$1, Consumer<dvl> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hz $$4 = hz.a(new cox($$3), this.a.al());
         dvl $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dhf.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvl a(hz $$0, dvd $$1, dhx $$2) {
      return $$2.a($$1);
   }

   public void a(hz $$0, dvd $$1, dvl $$2, dhx $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hz $$0, dvd $$1, long $$2, dhx $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvl a(gw $$0, dvd $$1) {
      for (dvl $$2 : this.a(hz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvl.b;
   }

   public dvl a(gw $$0, aet<dvd> $$1) {
      dvd $$2 = this.b().d(je.az).a($$1);
      return $$2 == null ? dvl.b : this.b($$0, $$2);
   }

   public dvl a(gw $$0, aqd<dvd> $$1) {
      ht<dvd> $$2 = this.b().d(je.az);

      for (dvl $$3 : this.a(new cox($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvl.b;
   }

   public dvl b(gw $$0, dvd $$1) {
      for (dvl $$2 : this.a(hz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvl.b;
   }

   public boolean a(gw $$0, dvl $$1) {
      for (dvh $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhf.e).w();
   }

   public Map<dvd, LongSet> b(gw $$0) {
      hz $$1 = hz.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhf.e).h();
   }

   public dvf a(cox $$0, dvd $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvl $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hu b() {
      return this.a.B_();
   }
}
