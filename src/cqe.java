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

public class cqe {
   private final cpn a;
   private final dlh b;
   private final dva c;

   public cqe(cpn $$0, dlh $$1, dva $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqe a(akr $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqe($$0, this.b, this.c);
      }
   }

   public List<dvh> a(cot $$0, Predicate<duz> $$1) {
      Map<duz, LongSet> $$2 = this.a.a($$0.e, $$0.f, dhb.e).h();
      Builder<dvh> $$3 = ImmutableList.builder();

      for (Entry<duz, LongSet> $$4 : $$2.entrySet()) {
         duz $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvh> a(hx $$0, duz $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dhb.e).b($$1);
      Builder<dvh> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(duz $$0, LongSet $$1, Consumer<dvh> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hx $$4 = hx.a(new cot($$3), this.a.al());
         dvh $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dhb.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvh a(hx $$0, duz $$1, dht $$2) {
      return $$2.a($$1);
   }

   public void a(hx $$0, duz $$1, dvh $$2, dht $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hx $$0, duz $$1, long $$2, dht $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvh a(gu $$0, duz $$1) {
      for (dvh $$2 : this.a(hx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvh.b;
   }

   public dvh a(gu $$0, aeq<duz> $$1) {
      duz $$2 = this.b().d(jc.az).a($$1);
      return $$2 == null ? dvh.b : this.b($$0, $$2);
   }

   public dvh a(gu $$0, aqa<duz> $$1) {
      hr<duz> $$2 = this.b().d(jc.az);

      for (dvh $$3 : this.a(new cot($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvh.b;
   }

   public dvh b(gu $$0, duz $$1) {
      for (dvh $$2 : this.a(hx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvh.b;
   }

   public boolean a(gu $$0, dvh $$1) {
      for (dvd $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhb.e).w();
   }

   public Map<duz, LongSet> b(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dhb.e).h();
   }

   public dvb a(cot $$0, duz $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvh $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hs b() {
      return this.a.B_();
   }
}
