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

public class dhw {
   private final dhb a;
   private final eeg b;
   private final eod c;

   public dhw(dhb $$0, eeg $$1, eod $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhw a(asp $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhw($$0, this.b, this.c);
      }
   }

   public List<eok> a(dgg $$0, Predicate<eoc> $$1) {
      Map<eoc, LongSet> $$2 = this.a.a($$0.g, $$0.h, eaj.e).h();
      Builder<eok> $$3 = ImmutableList.builder();

      for (Entry<eoc, LongSet> $$4 : $$2.entrySet()) {
         eoc $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eok> a(kj $$0, eoc $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), eaj.e).b($$1);
      Builder<eok> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eoc $$0, LongSet $$1, Consumer<eok> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new dgg($$3), this.a.ao());
         eok $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), eaj.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eok a(kj $$0, eoc $$1, eae $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, eoc $$1, eok $$2, eae $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, eoc $$1, long $$2, eae $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public eok a(jh $$0, eoc $$1) {
      for (eok $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eok.b;
   }

   public eok a(jh $$0, ayk<eoc> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eok a(jh $$0, ju<eoc> $$1) {
      return this.a($$0, $$1::a);
   }

   public eok a(jh $$0, Predicate<jq<eoc>> $$1) {
      kd<eoc> $$2 = this.b().e(mb.aT);

      for (eok $$3 : this.a(new dgg($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eok.b;
   }

   public eok b(jh $$0, eoc $$1) {
      for (eok $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eok.b;
   }

   public boolean a(jh $$0, eok $$1) {
      for (eog $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), eaj.e).v();
   }

   public Map<eoc, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), eaj.e).h();
   }

   public eoe a(dgg $$0, eoc $$1, eoz $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eok $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.K_();
   }
}
