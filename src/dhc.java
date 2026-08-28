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

public class dhc {
   private final dgh a;
   private final edo b;
   private final enl c;

   public dhc(dgh $$0, edo $$1, enl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhc a(ark $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhc($$0, this.b, this.c);
      }
   }

   public List<ens> a(dfm $$0, Predicate<enk> $$1) {
      Map<enk, LongSet> $$2 = this.a.a($$0.h, $$0.i, dzr.e).h();
      Builder<ens> $$3 = ImmutableList.builder();

      for (Entry<enk, LongSet> $$4 : $$2.entrySet()) {
         enk $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ens> a(kk $$0, enk $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dzr.e).b($$1);
      Builder<ens> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(enk $$0, LongSet $$1, Consumer<ens> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kk $$4 = kk.a(new dfm($$3), this.a.ap());
         ens $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dzr.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ens a(kk $$0, enk $$1, dzm $$2) {
      return $$2.a($$1);
   }

   public void a(kk $$0, enk $$1, ens $$2, dzm $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kk $$0, enk $$1, long $$2, dzm $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public ens a(ji $$0, enk $$1) {
      for (ens $$2 : this.a(kk.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ens.b;
   }

   public ens a(ji $$0, axe<enk> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ens a(ji $$0, jv<enk> $$1) {
      return this.a($$0, $$1::a);
   }

   public ens a(ji $$0, Predicate<jr<enk>> $$1) {
      ke<enk> $$2 = this.b().e(mc.aU);

      for (ens $$3 : this.a(new dfm($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ens.b;
   }

   public ens b(ji $$0, enk $$1) {
      for (ens $$2 : this.a(kk.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ens.b;
   }

   public boolean a(ji $$0, ens $$1) {
      for (eno $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzr.e).y();
   }

   public Map<enk, LongSet> b(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzr.e).h();
   }

   public enm a(dfm $$0, enk $$1, eoh $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ens $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kf b() {
      return this.a.K_();
   }
}
