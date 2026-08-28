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

public class dfq {
   private final dew a;
   private final ebx b;
   private final els c;

   public dfq(dew $$0, ebx $$1, els $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfq a(aru $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dfq($$0, this.b, this.c);
      }
   }

   public List<elz> a(deb $$0, Predicate<elr> $$1) {
      Map<elr, LongSet> $$2 = this.a.a($$0.e, $$0.f, dya.e).h();
      Builder<elz> $$3 = ImmutableList.builder();

      for (Entry<elr, LongSet> $$4 : $$2.entrySet()) {
         elr $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<elz> a(ki $$0, elr $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dya.e).b($$1);
      Builder<elz> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(elr $$0, LongSet $$1, Consumer<elz> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         ki $$4 = ki.a(new deb($$3), this.a.ap());
         elz $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dya.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public elz a(ki $$0, elr $$1, dxv $$2) {
      return $$2.a($$1);
   }

   public void a(ki $$0, elr $$1, elz $$2, dxv $$3) {
      $$3.a($$1, $$2);
   }

   public void a(ki $$0, elr $$1, long $$2, dxv $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public elz a(jg $$0, elr $$1) {
      for (elz $$2 : this.a(ki.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return elz.b;
   }

   public elz a(jg $$0, axp<elr> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public elz a(jg $$0, jt<elr> $$1) {
      return this.a($$0, $$1::a);
   }

   public elz a(jg $$0, Predicate<jp<elr>> $$1) {
      kc<elr> $$2 = this.b().e(ly.aS);

      for (elz $$3 : this.a(new deb($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return elz.b;
   }

   public elz b(jg $$0, elr $$1) {
      for (elz $$2 : this.a(ki.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return elz.b;
   }

   public boolean a(jg $$0, elz $$1) {
      for (elv $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jg $$0) {
      ki $$1 = ki.a($$0);
      return this.a.a($$1.a(), $$1.c(), dya.e).v();
   }

   public Map<elr, LongSet> b(jg $$0) {
      ki $$1 = ki.a($$0);
      return this.a.a($$1.a(), $$1.c(), dya.e).h();
   }

   public elt a(deb $$0, elr $$1, emo $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(elz $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kd b() {
      return this.a.H_();
   }
}
