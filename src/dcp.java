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

public class dcp {
   private final dbx a;
   private final dyq b;
   private final eij c;

   public dcp(dbx $$0, dyq $$1, eij $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcp a(arl $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcp($$0, this.b, this.c);
      }
   }

   public List<eiq> a(dbd $$0, Predicate<eii> $$1) {
      Map<eii, LongSet> $$2 = this.a.a($$0.e, $$0.f, duv.e).h();
      Builder<eiq> $$3 = ImmutableList.builder();

      for (Entry<eii, LongSet> $$4 : $$2.entrySet()) {
         eii $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eiq> a(kb $$0, eii $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), duv.e).b($$1);
      Builder<eiq> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eii $$0, LongSet $$1, Consumer<eiq> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kb $$4 = kb.a(new dbd($$3), this.a.ao());
         eiq $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), duv.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eiq a(kb $$0, eii $$1, dus $$2) {
      return $$2.a($$1);
   }

   public void a(kb $$0, eii $$1, eiq $$2, dus $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kb $$0, eii $$1, long $$2, dus $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eiq a(iz $$0, eii $$1) {
      for (eiq $$2 : this.a(kb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eiq.b;
   }

   public eiq a(iz $$0, axe<eii> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eiq a(iz $$0, jm<eii> $$1) {
      return this.a($$0, $$1::a);
   }

   public eiq a(iz $$0, Predicate<ji<eii>> $$1) {
      jv<eii> $$2 = this.b().d(lq.aJ);

      for (eiq $$3 : this.a(new dbd($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eiq.b;
   }

   public eiq b(iz $$0, eii $$1) {
      for (eiq $$2 : this.a(kb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eiq.b;
   }

   public boolean a(iz $$0, eiq $$1) {
      for (eim $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duv.e).w();
   }

   public Map<eii, LongSet> b(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duv.e).h();
   }

   public eik a(dbd $$0, eii $$1, ejf $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eiq $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jw b() {
      return this.a.H_();
   }
}
