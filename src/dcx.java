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

public class dcx {
   private final dce a;
   private final dyx b;
   private final eir c;

   public dcx(dce $$0, dyx $$1, eir $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcx a(aqr $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcx($$0, this.b, this.c);
      }
   }

   public List<eiy> a(dbk $$0, Predicate<eiq> $$1) {
      Map<eiq, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvc.e).h();
      Builder<eiy> $$3 = ImmutableList.builder();

      for (Entry<eiq, LongSet> $$4 : $$2.entrySet()) {
         eiq $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eiy> a(kc $$0, eiq $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvc.e).b($$1);
      Builder<eiy> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eiq $$0, LongSet $$1, Consumer<eiy> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kc $$4 = kc.a(new dbk($$3), this.a.ao());
         eiy $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvc.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eiy a(kc $$0, eiq $$1, duz $$2) {
      return $$2.a($$1);
   }

   public void a(kc $$0, eiq $$1, eiy $$2, duz $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kc $$0, eiq $$1, long $$2, duz $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eiy a(ja $$0, eiq $$1) {
      for (eiy $$2 : this.a(kc.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eiy.b;
   }

   public eiy a(ja $$0, awk<eiq> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eiy a(ja $$0, jn<eiq> $$1) {
      return this.a($$0, $$1::a);
   }

   public eiy a(ja $$0, Predicate<jj<eiq>> $$1) {
      jw<eiq> $$2 = this.b().d(lr.aQ);

      for (eiy $$3 : this.a(new dbk($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eiy.b;
   }

   public eiy b(ja $$0, eiq $$1) {
      for (eiy $$2 : this.a(kc.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eiy.b;
   }

   public boolean a(ja $$0, eiy $$1) {
      for (eiu $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvc.e).w();
   }

   public Map<eiq, LongSet> b(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvc.e).h();
   }

   public eis a(dbk $$0, eiq $$1, ejn $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eiy $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jx b() {
      return this.a.H_();
   }
}
