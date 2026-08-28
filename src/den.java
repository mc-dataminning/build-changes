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

public class den {
   private final ddt a;
   private final eau b;
   private final ekp c;

   public den(ddt $$0, eau $$1, ekp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public den a(arn $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new den($$0, this.b, this.c);
      }
   }

   public List<ekw> a(dcy $$0, Predicate<eko> $$1) {
      Map<eko, LongSet> $$2 = this.a.a($$0.e, $$0.f, dwx.e).h();
      Builder<ekw> $$3 = ImmutableList.builder();

      for (Entry<eko, LongSet> $$4 : $$2.entrySet()) {
         eko $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ekw> a(kg $$0, eko $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dwx.e).b($$1);
      Builder<ekw> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eko $$0, LongSet $$1, Consumer<ekw> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kg $$4 = kg.a(new dcy($$3), this.a.ap());
         ekw $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dwx.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ekw a(kg $$0, eko $$1, dws $$2) {
      return $$2.a($$1);
   }

   public void a(kg $$0, eko $$1, ekw $$2, dws $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kg $$0, eko $$1, long $$2, dws $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ekw a(je $$0, eko $$1) {
      for (ekw $$2 : this.a(kg.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ekw.b;
   }

   public ekw a(je $$0, axi<eko> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ekw a(je $$0, jr<eko> $$1) {
      return this.a($$0, $$1::a);
   }

   public ekw a(je $$0, Predicate<jn<eko>> $$1) {
      ka<eko> $$2 = this.b().d(lv.aR);

      for (ekw $$3 : this.a(new dcy($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ekw.b;
   }

   public ekw b(je $$0, eko $$1) {
      for (ekw $$2 : this.a(kg.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ekw.b;
   }

   public boolean a(je $$0, ekw $$1) {
      for (eks $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(je $$0) {
      kg $$1 = kg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dwx.e).v();
   }

   public Map<eko, LongSet> b(je $$0) {
      kg $$1 = kg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dwx.e).h();
   }

   public ekq a(dcy $$0, eko $$1, ell $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ekw $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kb b() {
      return this.a.F_();
   }
}
