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

public class dcm {
   private final dbu a;
   private final dyn b;
   private final eig c;

   public dcm(dbu $$0, dyn $$1, eig $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcm a(ari $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcm($$0, this.b, this.c);
      }
   }

   public List<ein> a(dba $$0, Predicate<eif> $$1) {
      Map<eif, LongSet> $$2 = this.a.a($$0.e, $$0.f, dus.e).h();
      Builder<ein> $$3 = ImmutableList.builder();

      for (Entry<eif, LongSet> $$4 : $$2.entrySet()) {
         eif $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ein> a(kb $$0, eif $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dus.e).b($$1);
      Builder<ein> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eif $$0, LongSet $$1, Consumer<ein> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kb $$4 = kb.a(new dba($$3), this.a.ao());
         ein $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dus.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ein a(kb $$0, eif $$1, dup $$2) {
      return $$2.a($$1);
   }

   public void a(kb $$0, eif $$1, ein $$2, dup $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kb $$0, eif $$1, long $$2, dup $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ein a(iz $$0, eif $$1) {
      for (ein $$2 : this.a(kb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ein.b;
   }

   public ein a(iz $$0, axb<eif> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ein a(iz $$0, jm<eif> $$1) {
      return this.a($$0, $$1::a);
   }

   public ein a(iz $$0, Predicate<ji<eif>> $$1) {
      jv<eif> $$2 = this.b().d(lq.aJ);

      for (ein $$3 : this.a(new dba($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ein.b;
   }

   public ein b(iz $$0, eif $$1) {
      for (ein $$2 : this.a(kb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ein.b;
   }

   public boolean a(iz $$0, ein $$1) {
      for (eij $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dus.e).w();
   }

   public Map<eif, LongSet> b(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dus.e).h();
   }

   public eih a(dba $$0, eif $$1, ejc $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ein $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jw b() {
      return this.a.H_();
   }
}
