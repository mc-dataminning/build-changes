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
   private final ejq c;

   public ddq(dcx $$0, dzw $$1, ejq $$2) {
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

   public List<ejx> a(dcd $$0, Predicate<ejp> $$1) {
      Map<ejp, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvz.e).h();
      Builder<ejx> $$3 = ImmutableList.builder();

      for (Entry<ejp, LongSet> $$4 : $$2.entrySet()) {
         ejp $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ejx> a(kf $$0, ejp $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvz.e).b($$1);
      Builder<ejx> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ejp $$0, LongSet $$1, Consumer<ejx> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kf $$4 = kf.a(new dcd($$3), this.a.ao());
         ejx $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvz.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ejx a(kf $$0, ejp $$1, dvu $$2) {
      return $$2.a($$1);
   }

   public void a(kf $$0, ejp $$1, ejx $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kf $$0, ejp $$1, long $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ejx a(jd $$0, ejp $$1) {
      for (ejx $$2 : this.a(kf.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ejx.b;
   }

   public ejx a(jd $$0, awu<ejp> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ejx a(jd $$0, jq<ejp> $$1) {
      return this.a($$0, $$1::a);
   }

   public ejx a(jd $$0, Predicate<jm<ejp>> $$1) {
      jz<ejp> $$2 = this.b().d(lu.aR);

      for (ejx $$3 : this.a(new dcd($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ejx.b;
   }

   public ejx b(jd $$0, ejp $$1) {
      for (ejx $$2 : this.a(kf.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ejx.b;
   }

   public boolean a(jd $$0, ejx $$1) {
      for (ejt $$2 : $$1.i()) {
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

   public Map<ejp, LongSet> b(jd $$0) {
      kf $$1 = kf.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvz.e).h();
   }

   public ejr a(dcd $$0, ejp $$1, ekm $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ejx $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ka b() {
      return this.a.H_();
   }
}
