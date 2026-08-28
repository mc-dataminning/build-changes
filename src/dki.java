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

public class dki {
   private final djn a;
   private final ehq b;
   private final ero c;

   public dki(djn $$0, ehq $$1, ero $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dki a(ary $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dki($$0, this.b, this.c);
      }
   }

   public List<erv> a(dir $$0, Predicate<ern> $$1) {
      Map<ern, LongSet> $$2 = this.a.a($$0.h, $$0.i, edr.e).h();
      Builder<erv> $$3 = ImmutableList.builder();

      for (Entry<ern, LongSet> $$4 : $$2.entrySet()) {
         ern $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<erv> a(jy $$0, ern $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), edr.e).b($$1);
      Builder<erv> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ern $$0, LongSet $$1, Consumer<erv> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jy $$4 = jy.a(new dir($$3), this.a.aq());
         erv $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), edr.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public erv a(jy $$0, ern $$1, edm $$2) {
      return $$2.a($$1);
   }

   public void a(jy $$0, ern $$1, erv $$2, edm $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jy $$0, ern $$1, long $$2, edm $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public erv a(iv $$0, ern $$1) {
      for (erv $$2 : this.a(jy.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return erv.b;
   }

   public erv a(iv $$0, axr<ern> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public erv a(iv $$0, jj<ern> $$1) {
      return this.a($$0, $$1::a);
   }

   public erv a(iv $$0, Predicate<jf<ern>> $$1) {
      js<ern> $$2 = this.b().f(mh.be);

      for (erv $$3 : this.a(new dir($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return erv.b;
   }

   public erv b(iv $$0, ern $$1) {
      for (erv $$2 : this.a(jy.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return erv.b;
   }

   public boolean a(iv $$0, erv $$1) {
      for (err $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), edr.e).y();
   }

   public Map<ern, LongSet> b(iv $$0) {
      jy $$1 = jy.a($$0);
      return this.a.a($$1.a(), $$1.c(), edr.e).h();
   }

   public erp a(dir $$0, ern $$1, esk $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(erv $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jt b() {
      return this.a.F_();
   }
}
