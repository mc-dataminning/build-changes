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

public class djr {
   private final diw a;
   private final egw b;
   private final equ c;

   public djr(diw $$0, egw $$1, equ $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djr a(ary $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new djr($$0, this.b, this.c);
      }
   }

   public List<erb> a(dic $$0, Predicate<eqt> $$1) {
      Map<eqt, LongSet> $$2 = this.a.a($$0.h, $$0.i, ecx.e).h();
      Builder<erb> $$3 = ImmutableList.builder();

      for (Entry<eqt, LongSet> $$4 : $$2.entrySet()) {
         eqt $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<erb> a(jx $$0, eqt $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), ecx.e).b($$1);
      Builder<erb> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eqt $$0, LongSet $$1, Consumer<erb> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jx $$4 = jx.a(new dic($$3), this.a.aq());
         erb $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), ecx.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public erb a(jx $$0, eqt $$1, ecs $$2) {
      return $$2.a($$1);
   }

   public void a(jx $$0, eqt $$1, erb $$2, ecs $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jx $$0, eqt $$1, long $$2, ecs $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public erb a(iu $$0, eqt $$1) {
      for (erb $$2 : this.a(jx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return erb.b;
   }

   public erb a(iu $$0, axr<eqt> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public erb a(iu $$0, ji<eqt> $$1) {
      return this.a($$0, $$1::a);
   }

   public erb a(iu $$0, Predicate<je<eqt>> $$1) {
      jr<eqt> $$2 = this.b().f(mg.bd);

      for (erb $$3 : this.a(new dic($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return erb.b;
   }

   public erb b(iu $$0, eqt $$1) {
      for (erb $$2 : this.a(jx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return erb.b;
   }

   public boolean a(iu $$0, erb $$1) {
      for (eqx $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), ecx.e).y();
   }

   public Map<eqt, LongSet> b(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), ecx.e).h();
   }

   public eqv a(dic $$0, eqt $$1, erq $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(erb $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public js b() {
      return this.a.F_();
   }
}
