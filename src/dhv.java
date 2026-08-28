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

public class dhv {
   private final dha a;
   private final eem b;
   private final eok c;

   public dhv(dha $$0, eem $$1, eok $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhv a(arl $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhv($$0, this.b, this.c);
      }
   }

   public List<eor> a(dgg $$0, Predicate<eoj> $$1) {
      Map<eoj, LongSet> $$2 = this.a.a($$0.h, $$0.i, ean.e).h();
      Builder<eor> $$3 = ImmutableList.builder();

      for (Entry<eoj, LongSet> $$4 : $$2.entrySet()) {
         eoj $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eor> a(kk $$0, eoj $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), ean.e).b($$1);
      Builder<eor> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eoj $$0, LongSet $$1, Consumer<eor> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kk $$4 = kk.a(new dgg($$3), this.a.aq());
         eor $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), ean.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eor a(kk $$0, eoj $$1, eai $$2) {
      return $$2.a($$1);
   }

   public void a(kk $$0, eoj $$1, eor $$2, eai $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kk $$0, eoj $$1, long $$2, eai $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public eor a(ji $$0, eoj $$1) {
      for (eor $$2 : this.a(kk.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eor.b;
   }

   public eor a(ji $$0, axf<eoj> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eor a(ji $$0, jv<eoj> $$1) {
      return this.a($$0, $$1::a);
   }

   public eor a(ji $$0, Predicate<jr<eoj>> $$1) {
      ke<eoj> $$2 = this.b().e(mc.aW);

      for (eor $$3 : this.a(new dgg($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eor.b;
   }

   public eor b(ji $$0, eoj $$1) {
      for (eor $$2 : this.a(kk.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eor.b;
   }

   public boolean a(ji $$0, eor $$1) {
      for (eon $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), ean.e).y();
   }

   public Map<eoj, LongSet> b(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), ean.e).h();
   }

   public eol a(dgg $$0, eoj $$1, epg $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eor $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kf b() {
      return this.a.F_();
   }
}
