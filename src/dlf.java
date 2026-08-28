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

public class dlf {
   private final dkk a;
   private final ein b;
   private final eso c;

   public dlf(dkk $$0, ein $$1, eso $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dlf a(asj $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dlf($$0, this.b, this.c);
      }
   }

   public List<esv> a(djo $$0, Predicate<esn> $$1) {
      Map<esn, LongSet> $$2 = this.a.a($$0.h, $$0.i, eeo.e).h();
      Builder<esv> $$3 = ImmutableList.builder();

      for (Entry<esn, LongSet> $$4 : $$2.entrySet()) {
         esn $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<esv> a(jz $$0, esn $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), eeo.e).b($$1);
      Builder<esv> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(esn $$0, LongSet $$1, Consumer<esv> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jz $$4 = jz.a(new djo($$3), this.a.aq());
         esv $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), eeo.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public esv a(jz $$0, esn $$1, eej $$2) {
      return $$2.a($$1);
   }

   public void a(jz $$0, esn $$1, esv $$2, eej $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jz $$0, esn $$1, long $$2, eej $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public esv a(iw $$0, esn $$1) {
      for (esv $$2 : this.a(jz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return esv.b;
   }

   public esv a(iw $$0, ayc<esn> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public esv a(iw $$0, jk<esn> $$1) {
      return this.a($$0, $$1::a);
   }

   public esv a(iw $$0, Predicate<jg<esn>> $$1) {
      jt<esn> $$2 = this.b().f(mi.be);

      for (esv $$3 : this.a(new djo($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return esv.b;
   }

   public esv b(iw $$0, esn $$1) {
      for (esv $$2 : this.a(jz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return esv.b;
   }

   public boolean a(iw $$0, esv $$1) {
      for (esr $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iw $$0) {
      jz $$1 = jz.a($$0);
      return this.a.a($$1.a(), $$1.c(), eeo.e).y();
   }

   public Map<esn, LongSet> b(iw $$0) {
      jz $$1 = jz.a($$0);
      return this.a.a($$1.a(), $$1.c(), eeo.e).h();
   }

   public esp a(djo $$0, esn $$1, etk $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(esv $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ju b() {
      return this.a.J_();
   }
}
