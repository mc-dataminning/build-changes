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

public class dhf {
   private final dgk a;
   private final edr b;
   private final eno c;

   public dhf(dgk $$0, edr $$1, eno $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhf a(arl $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhf($$0, this.b, this.c);
      }
   }

   public List<env> a(dfp $$0, Predicate<enn> $$1) {
      Map<enn, LongSet> $$2 = this.a.a($$0.h, $$0.i, dzu.e).h();
      Builder<env> $$3 = ImmutableList.builder();

      for (Entry<enn, LongSet> $$4 : $$2.entrySet()) {
         enn $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<env> a(kk $$0, enn $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dzu.e).b($$1);
      Builder<env> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(enn $$0, LongSet $$1, Consumer<env> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kk $$4 = kk.a(new dfp($$3), this.a.ap());
         env $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dzu.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public env a(kk $$0, enn $$1, dzp $$2) {
      return $$2.a($$1);
   }

   public void a(kk $$0, enn $$1, env $$2, dzp $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kk $$0, enn $$1, long $$2, dzp $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public env a(ji $$0, enn $$1) {
      for (env $$2 : this.a(kk.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return env.b;
   }

   public env a(ji $$0, axf<enn> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public env a(ji $$0, jv<enn> $$1) {
      return this.a($$0, $$1::a);
   }

   public env a(ji $$0, Predicate<jr<enn>> $$1) {
      ke<enn> $$2 = this.b().e(mc.aU);

      for (env $$3 : this.a(new dfp($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return env.b;
   }

   public env b(ji $$0, enn $$1) {
      for (env $$2 : this.a(kk.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return env.b;
   }

   public boolean a(ji $$0, env $$1) {
      for (enr $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzu.e).y();
   }

   public Map<enn, LongSet> b(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzu.e).h();
   }

   public enp a(dfp $$0, enn $$1, eok $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(env $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kf b() {
      return this.a.K_();
   }
}
