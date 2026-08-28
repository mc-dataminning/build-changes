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

public class dkd {
   private final dji a;
   private final ehl b;
   private final erj c;

   public dkd(dji $$0, ehl $$1, erj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dkd a(ary $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dkd($$0, this.b, this.c);
      }
   }

   public List<erq> a(dio $$0, Predicate<eri> $$1) {
      Map<eri, LongSet> $$2 = this.a.a($$0.h, $$0.i, edm.e).h();
      Builder<erq> $$3 = ImmutableList.builder();

      for (Entry<eri, LongSet> $$4 : $$2.entrySet()) {
         eri $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<erq> a(jy $$0, eri $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), edm.e).b($$1);
      Builder<erq> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eri $$0, LongSet $$1, Consumer<erq> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jy $$4 = jy.a(new dio($$3), this.a.aq());
         erq $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), edm.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public erq a(jy $$0, eri $$1, edh $$2) {
      return $$2.a($$1);
   }

   public void a(jy $$0, eri $$1, erq $$2, edh $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jy $$0, eri $$1, long $$2, edh $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public erq a(iv $$0, eri $$1) {
      for (erq $$2 : this.a(jy.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return erq.b;
   }

   public erq a(iv $$0, axr<eri> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public erq a(iv $$0, jj<eri> $$1) {
      return this.a($$0, $$1::a);
   }

   public erq a(iv $$0, Predicate<jf<eri>> $$1) {
      js<eri> $$2 = this.b().f(mh.be);

      for (erq $$3 : this.a(new dio($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return erq.b;
   }

   public erq b(iv $$0, eri $$1) {
      for (erq $$2 : this.a(jy.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return erq.b;
   }

   public boolean a(iv $$0, erq $$1) {
      for (erm $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), edm.e).y();
   }

   public Map<eri, LongSet> b(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), edm.e).h();
   }

   public erk a(dio $$0, eri $$1, esf $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(erq $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jt b() {
      return this.a.F_();
   }
}
