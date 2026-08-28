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

public class djw {
   private final djb a;
   private final ehe b;
   private final erc c;

   public djw(djb $$0, ehe $$1, erc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djw a(ary $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new djw($$0, this.b, this.c);
      }
   }

   public List<erj> a(dih $$0, Predicate<erb> $$1) {
      Map<erb, LongSet> $$2 = this.a.a($$0.h, $$0.i, edf.e).h();
      Builder<erj> $$3 = ImmutableList.builder();

      for (Entry<erb, LongSet> $$4 : $$2.entrySet()) {
         erb $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<erj> a(jx $$0, erb $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), edf.e).b($$1);
      Builder<erj> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(erb $$0, LongSet $$1, Consumer<erj> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jx $$4 = jx.a(new dih($$3), this.a.aq());
         erj $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), edf.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public erj a(jx $$0, erb $$1, eda $$2) {
      return $$2.a($$1);
   }

   public void a(jx $$0, erb $$1, erj $$2, eda $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jx $$0, erb $$1, long $$2, eda $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public erj a(iu $$0, erb $$1) {
      for (erj $$2 : this.a(jx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return erj.b;
   }

   public erj a(iu $$0, axr<erb> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public erj a(iu $$0, ji<erb> $$1) {
      return this.a($$0, $$1::a);
   }

   public erj a(iu $$0, Predicate<je<erb>> $$1) {
      jr<erb> $$2 = this.b().f(mg.be);

      for (erj $$3 : this.a(new dih($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return erj.b;
   }

   public erj b(iu $$0, erb $$1) {
      for (erj $$2 : this.a(jx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return erj.b;
   }

   public boolean a(iu $$0, erj $$1) {
      for (erf $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), edf.e).y();
   }

   public Map<erb, LongSet> b(iu $$0) {
      jx $$1 = jx.a($$0);
      return this.a.a($$1.a(), $$1.c(), edf.e).h();
   }

   public erd a(dih $$0, erb $$1, ery $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(erj $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public js b() {
      return this.a.F_();
   }
}
