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

public class dct {
   private final dcb a;
   private final dyu b;
   private final ein c;

   public dct(dcb $$0, dyu $$1, ein $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dct a(arm $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dct($$0, this.b, this.c);
      }
   }

   public List<eiu> a(dbh $$0, Predicate<eim> $$1) {
      Map<eim, LongSet> $$2 = this.a.a($$0.e, $$0.f, duz.e).h();
      Builder<eiu> $$3 = ImmutableList.builder();

      for (Entry<eim, LongSet> $$4 : $$2.entrySet()) {
         eim $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eiu> a(kb $$0, eim $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), duz.e).b($$1);
      Builder<eiu> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eim $$0, LongSet $$1, Consumer<eiu> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kb $$4 = kb.a(new dbh($$3), this.a.ao());
         eiu $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), duz.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eiu a(kb $$0, eim $$1, duw $$2) {
      return $$2.a($$1);
   }

   public void a(kb $$0, eim $$1, eiu $$2, duw $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kb $$0, eim $$1, long $$2, duw $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eiu a(iz $$0, eim $$1) {
      for (eiu $$2 : this.a(kb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eiu.b;
   }

   public eiu a(iz $$0, axf<eim> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eiu a(iz $$0, jm<eim> $$1) {
      return this.a($$0, $$1::a);
   }

   public eiu a(iz $$0, Predicate<ji<eim>> $$1) {
      jv<eim> $$2 = this.b().d(lq.aJ);

      for (eiu $$3 : this.a(new dbh($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eiu.b;
   }

   public eiu b(iz $$0, eim $$1) {
      for (eiu $$2 : this.a(kb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eiu.b;
   }

   public boolean a(iz $$0, eiu $$1) {
      for (eiq $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duz.e).w();
   }

   public Map<eim, LongSet> b(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duz.e).h();
   }

   public eio a(dbh $$0, eim $$1, ejj $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eiu $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jw b() {
      return this.a.H_();
   }
}
