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

public class dhe {
   private final dgj a;
   private final edq b;
   private final enn c;

   public dhe(dgj $$0, edq $$1, enn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhe a(ark $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhe($$0, this.b, this.c);
      }
   }

   public List<enu> a(dfo $$0, Predicate<enm> $$1) {
      Map<enm, LongSet> $$2 = this.a.a($$0.h, $$0.i, dzt.e).h();
      Builder<enu> $$3 = ImmutableList.builder();

      for (Entry<enm, LongSet> $$4 : $$2.entrySet()) {
         enm $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<enu> a(kk $$0, enm $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dzt.e).b($$1);
      Builder<enu> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(enm $$0, LongSet $$1, Consumer<enu> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kk $$4 = kk.a(new dfo($$3), this.a.ap());
         enu $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dzt.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public enu a(kk $$0, enm $$1, dzo $$2) {
      return $$2.a($$1);
   }

   public void a(kk $$0, enm $$1, enu $$2, dzo $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kk $$0, enm $$1, long $$2, dzo $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public enu a(ji $$0, enm $$1) {
      for (enu $$2 : this.a(kk.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return enu.b;
   }

   public enu a(ji $$0, axf<enm> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public enu a(ji $$0, jv<enm> $$1) {
      return this.a($$0, $$1::a);
   }

   public enu a(ji $$0, Predicate<jr<enm>> $$1) {
      ke<enm> $$2 = this.b().e(mc.aU);

      for (enu $$3 : this.a(new dfo($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return enu.b;
   }

   public enu b(ji $$0, enm $$1) {
      for (enu $$2 : this.a(kk.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return enu.b;
   }

   public boolean a(ji $$0, enu $$1) {
      for (enq $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzt.e).y();
   }

   public Map<enm, LongSet> b(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzt.e).h();
   }

   public eno a(dfo $$0, enm $$1, eoj $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(enu $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kf b() {
      return this.a.K_();
   }
}
