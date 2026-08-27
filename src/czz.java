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

public class czz {
   private final czh a;
   private final dvy b;
   private final efr c;

   public czz(czh $$0, dvy $$1, efr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public czz a(aqb $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new czz($$0, this.b, this.c);
      }
   }

   public List<efy> a(cyn $$0, Predicate<efq> $$1) {
      Map<efq, LongSet> $$2 = this.a.a($$0.e, $$0.f, dsd.e).h();
      Builder<efy> $$3 = ImmutableList.builder();

      for (Entry<efq, LongSet> $$4 : $$2.entrySet()) {
         efq $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<efy> a(jg $$0, efq $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dsd.e).b($$1);
      Builder<efy> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(efq $$0, LongSet $$1, Consumer<efy> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jg $$4 = jg.a(new cyn($$3), this.a.an());
         efy $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dsd.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public efy a(jg $$0, efq $$1, dsa $$2) {
      return $$2.a($$1);
   }

   public void a(jg $$0, efq $$1, efy $$2, dsa $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jg $$0, efq $$1, long $$2, dsa $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public efy a(id $$0, efq $$1) {
      for (efy $$2 : this.a(jg.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return efy.b;
   }

   public efy a(id $$0, avt<efq> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public efy a(id $$0, ir<efq> $$1) {
      return this.a($$0, $$1::a);
   }

   public efy a(id $$0, Predicate<in<efq>> $$1) {
      ja<efq> $$2 = this.b().d(ku.aG);

      for (efy $$3 : this.a(new cyn($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return efy.b;
   }

   public efy b(id $$0, efq $$1) {
      for (efy $$2 : this.a(jg.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return efy.b;
   }

   public boolean a(id $$0, efy $$1) {
      for (efu $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(id $$0) {
      jg $$1 = jg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dsd.e).w();
   }

   public Map<efq, LongSet> b(id $$0) {
      jg $$1 = jg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dsd.e).h();
   }

   public efs a(cyn $$0, efq $$1, egn $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(efy $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jb b() {
      return this.a.H_();
   }
}
