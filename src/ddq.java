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

public class ddq {
   private final dcx a;
   private final dzw b;
   private final ejs c;

   public ddq(dcx $$0, dzw $$1, ejs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ddq a(arb $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new ddq($$0, this.b, this.c);
      }
   }

   public List<ejz> a(dcd $$0, Predicate<ejr> $$1) {
      Map<ejr, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvz.e).h();
      Builder<ejz> $$3 = ImmutableList.builder();

      for (Entry<ejr, LongSet> $$4 : $$2.entrySet()) {
         ejr $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ejz> a(kf $$0, ejr $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvz.e).b($$1);
      Builder<ejz> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ejr $$0, LongSet $$1, Consumer<ejz> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kf $$4 = kf.a(new dcd($$3), this.a.ao());
         ejz $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvz.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ejz a(kf $$0, ejr $$1, dvu $$2) {
      return $$2.a($$1);
   }

   public void a(kf $$0, ejr $$1, ejz $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kf $$0, ejr $$1, long $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ejz a(jd $$0, ejr $$1) {
      for (ejz $$2 : this.a(kf.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ejz.b;
   }

   public ejz a(jd $$0, awu<ejr> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ejz a(jd $$0, jq<ejr> $$1) {
      return this.a($$0, $$1::a);
   }

   public ejz a(jd $$0, Predicate<jm<ejr>> $$1) {
      jz<ejr> $$2 = this.b().d(lu.aR);

      for (ejz $$3 : this.a(new dcd($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ejz.b;
   }

   public ejz b(jd $$0, ejr $$1) {
      for (ejz $$2 : this.a(kf.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ejz.b;
   }

   public boolean a(jd $$0, ejz $$1) {
      for (ejv $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jd $$0) {
      kf $$1 = kf.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvz.e).w();
   }

   public Map<ejr, LongSet> b(jd $$0) {
      kf $$1 = kf.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvz.e).h();
   }

   public ejt a(dcd $$0, ejr $$1, eko $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ejz $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ka b() {
      return this.a.H_();
   }
}
