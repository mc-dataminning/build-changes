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

public class dkt {
   private final djy a;
   private final eib b;
   private final esc c;

   public dkt(djy $$0, eib $$1, esc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dkt a(asa $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dkt($$0, this.b, this.c);
      }
   }

   public List<esj> a(djc $$0, Predicate<esb> $$1) {
      Map<esb, LongSet> $$2 = this.a.a($$0.h, $$0.i, eec.e).h();
      Builder<esj> $$3 = ImmutableList.builder();

      for (Entry<esb, LongSet> $$4 : $$2.entrySet()) {
         esb $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<esj> a(jy $$0, esb $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), eec.e).b($$1);
      Builder<esj> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(esb $$0, LongSet $$1, Consumer<esj> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jy $$4 = jy.a(new djc($$3), this.a.aq());
         esj $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), eec.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public esj a(jy $$0, esb $$1, edx $$2) {
      return $$2.a($$1);
   }

   public void a(jy $$0, esb $$1, esj $$2, edx $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jy $$0, esb $$1, long $$2, edx $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public esj a(iv $$0, esb $$1) {
      for (esj $$2 : this.a(jy.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return esj.b;
   }

   public esj a(iv $$0, axt<esb> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public esj a(iv $$0, jj<esb> $$1) {
      return this.a($$0, $$1::a);
   }

   public esj a(iv $$0, Predicate<jf<esb>> $$1) {
      js<esb> $$2 = this.b().f(mh.be);

      for (esj $$3 : this.a(new djc($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return esj.b;
   }

   public esj b(iv $$0, esb $$1) {
      for (esj $$2 : this.a(jy.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return esj.b;
   }

   public boolean a(iv $$0, esj $$1) {
      for (esf $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), eec.e).y();
   }

   public Map<esb, LongSet> b(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), eec.e).h();
   }

   public esd a(djc $$0, esb $$1, esy $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(esj $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jt b() {
      return this.a.J_();
   }
}
