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

public class die {
   private final dhj a;
   private final eeo b;
   private final eol c;

   public die(dhj $$0, eeo $$1, eol $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public die a(asp $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new die($$0, this.b, this.c);
      }
   }

   public List<eos> a(dgo $$0, Predicate<eok> $$1) {
      Map<eok, LongSet> $$2 = this.a.a($$0.h, $$0.i, ear.e).h();
      Builder<eos> $$3 = ImmutableList.builder();

      for (Entry<eok, LongSet> $$4 : $$2.entrySet()) {
         eok $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eos> a(kj $$0, eok $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), ear.e).b($$1);
      Builder<eos> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eok $$0, LongSet $$1, Consumer<eos> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new dgo($$3), this.a.ao());
         eos $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), ear.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eos a(kj $$0, eok $$1, eam $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, eok $$1, eos $$2, eam $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, eok $$1, long $$2, eam $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public eos a(jh $$0, eok $$1) {
      for (eos $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eos.b;
   }

   public eos a(jh $$0, ayk<eok> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eos a(jh $$0, ju<eok> $$1) {
      return this.a($$0, $$1::a);
   }

   public eos a(jh $$0, Predicate<jq<eok>> $$1) {
      kd<eok> $$2 = this.b().e(mb.aU);

      for (eos $$3 : this.a(new dgo($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eos.b;
   }

   public eos b(jh $$0, eok $$1) {
      for (eos $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eos.b;
   }

   public boolean a(jh $$0, eos $$1) {
      for (eoo $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), ear.e).y();
   }

   public Map<eok, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), ear.e).h();
   }

   public eom a(dgo $$0, eok $$1, eph $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eos $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.K_();
   }
}
