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

public class dcz {
   private final dcg a;
   private final dzd b;
   private final eix c;

   public dcz(dcg $$0, dzd $$1, eix $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcz a(aqt $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcz($$0, this.b, this.c);
      }
   }

   public List<eje> a(dbm $$0, Predicate<eiw> $$1) {
      Map<eiw, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvh.e).h();
      Builder<eje> $$3 = ImmutableList.builder();

      for (Entry<eiw, LongSet> $$4 : $$2.entrySet()) {
         eiw $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eje> a(kc $$0, eiw $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvh.e).b($$1);
      Builder<eje> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eiw $$0, LongSet $$1, Consumer<eje> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kc $$4 = kc.a(new dbm($$3), this.a.ao());
         eje $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvh.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eje a(kc $$0, eiw $$1, dvc $$2) {
      return $$2.a($$1);
   }

   public void a(kc $$0, eiw $$1, eje $$2, dvc $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kc $$0, eiw $$1, long $$2, dvc $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eje a(ja $$0, eiw $$1) {
      for (eje $$2 : this.a(kc.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eje.b;
   }

   public eje a(ja $$0, awm<eiw> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eje a(ja $$0, jn<eiw> $$1) {
      return this.a($$0, $$1::a);
   }

   public eje a(ja $$0, Predicate<jj<eiw>> $$1) {
      jw<eiw> $$2 = this.b().d(lr.aQ);

      for (eje $$3 : this.a(new dbm($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eje.b;
   }

   public eje b(ja $$0, eiw $$1) {
      for (eje $$2 : this.a(kc.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eje.b;
   }

   public boolean a(ja $$0, eje $$1) {
      for (eja $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvh.e).w();
   }

   public Map<eiw, LongSet> b(ja $$0) {
      kc $$1 = kc.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvh.e).h();
   }

   public eiy a(dbm $$0, eiw $$1, ejt $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eje $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jx b() {
      return this.a.H_();
   }
}
