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

public class dfb {
   private final deh a;
   private final ebi b;
   private final eld c;

   public dfb(deh $$0, ebi $$1, eld $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfb a(aro $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dfb($$0, this.b, this.c);
      }
   }

   public List<elk> a(ddm $$0, Predicate<elc> $$1) {
      Map<elc, LongSet> $$2 = this.a.a($$0.e, $$0.f, dxl.e).h();
      Builder<elk> $$3 = ImmutableList.builder();

      for (Entry<elc, LongSet> $$4 : $$2.entrySet()) {
         elc $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<elk> a(kg $$0, elc $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dxl.e).b($$1);
      Builder<elk> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(elc $$0, LongSet $$1, Consumer<elk> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kg $$4 = kg.a(new ddm($$3), this.a.ap());
         elk $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dxl.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public elk a(kg $$0, elc $$1, dxg $$2) {
      return $$2.a($$1);
   }

   public void a(kg $$0, elc $$1, elk $$2, dxg $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kg $$0, elc $$1, long $$2, dxg $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public elk a(je $$0, elc $$1) {
      for (elk $$2 : this.a(kg.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return elk.b;
   }

   public elk a(je $$0, axj<elc> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public elk a(je $$0, jr<elc> $$1) {
      return this.a($$0, $$1::a);
   }

   public elk a(je $$0, Predicate<jn<elc>> $$1) {
      ka<elc> $$2 = this.b().d(lv.aS);

      for (elk $$3 : this.a(new ddm($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return elk.b;
   }

   public elk b(je $$0, elc $$1) {
      for (elk $$2 : this.a(kg.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return elk.b;
   }

   public boolean a(je $$0, elk $$1) {
      for (elg $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(je $$0) {
      kg $$1 = kg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dxl.e).v();
   }

   public Map<elc, LongSet> b(je $$0) {
      kg $$1 = kg.a($$0);
      return this.a.a($$1.a(), $$1.c(), dxl.e).h();
   }

   public ele a(ddm $$0, elc $$1, elz $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(elk $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kb b() {
      return this.a.F_();
   }
}
