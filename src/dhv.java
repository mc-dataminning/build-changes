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
   private final eeh b;
   private final eoe c;

   public dhv(dha $$0, eeh $$1, eoe $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhv a(asf $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhv($$0, this.b, this.c);
      }
   }

   public List<eol> a(dgf $$0, Predicate<eod> $$1) {
      Map<eod, LongSet> $$2 = this.a.a($$0.h, $$0.i, eak.e).h();
      Builder<eol> $$3 = ImmutableList.builder();

      for (Entry<eod, LongSet> $$4 : $$2.entrySet()) {
         eod $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eol> a(kj $$0, eod $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), eak.e).b($$1);
      Builder<eol> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eod $$0, LongSet $$1, Consumer<eol> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new dgf($$3), this.a.ap());
         eol $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), eak.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eol a(kj $$0, eod $$1, eaf $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, eod $$1, eol $$2, eaf $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, eod $$1, long $$2, eaf $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public eol a(jh $$0, eod $$1) {
      for (eol $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eol.b;
   }

   public eol a(jh $$0, aya<eod> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eol a(jh $$0, ju<eod> $$1) {
      return this.a($$0, $$1::a);
   }

   public eol a(jh $$0, Predicate<jq<eod>> $$1) {
      kd<eod> $$2 = this.b().e(mb.aU);

      for (eol $$3 : this.a(new dgf($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eol.b;
   }

   public eol b(jh $$0, eod $$1) {
      for (eol $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eol.b;
   }

   public boolean a(jh $$0, eol $$1) {
      for (eoh $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), eak.e).y();
   }

   public Map<eod, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), eak.e).h();
   }

   public eof a(dgf $$0, eod $$1, epa $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eol $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.K_();
   }
}
