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

public class djl {
   private final diq a;
   private final egl b;
   private final eqj c;

   public djl(diq $$0, egl $$1, eqj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djl a(arw $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new djl($$0, this.b, this.c);
      }
   }

   public List<eqq> a(dhw $$0, Predicate<eqi> $$1) {
      Map<eqi, LongSet> $$2 = this.a.a($$0.h, $$0.i, ecm.e).h();
      Builder<eqq> $$3 = ImmutableList.builder();

      for (Entry<eqi, LongSet> $$4 : $$2.entrySet()) {
         eqi $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eqq> a(jx $$0, eqi $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), ecm.e).b($$1);
      Builder<eqq> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eqi $$0, LongSet $$1, Consumer<eqq> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jx $$4 = jx.a(new dhw($$3), this.a.aq());
         eqq $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), ecm.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eqq a(jx $$0, eqi $$1, ech $$2) {
      return $$2.a($$1);
   }

   public void a(jx $$0, eqi $$1, eqq $$2, ech $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jx $$0, eqi $$1, long $$2, ech $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public eqq a(iu $$0, eqi $$1) {
      for (eqq $$2 : this.a(jx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eqq.b;
   }

   public eqq a(iu $$0, axp<eqi> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eqq a(iu $$0, ji<eqi> $$1) {
      return this.a($$0, $$1::a);
   }

   public eqq a(iu $$0, Predicate<je<eqi>> $$1) {
      jr<eqi> $$2 = this.b().f(mg.bc);

      for (eqq $$3 : this.a(new dhw($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eqq.b;
   }

   public eqq b(iu $$0, eqi $$1) {
      for (eqq $$2 : this.a(jx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eqq.b;
   }

   public boolean a(iu $$0, eqq $$1) {
      for (eqm $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), ecm.e).y();
   }

   public Map<eqi, LongSet> b(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), ecm.e).h();
   }

   public eqk a(dhw $$0, eqi $$1, erf $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eqq $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public js b() {
      return this.a.F_();
   }
}
