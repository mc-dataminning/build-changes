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

public class ddo {
   private final dcv a;
   private final dzt b;
   private final ejn c;

   public ddo(dcv $$0, dzt $$1, ejn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ddo a(ara $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new ddo($$0, this.b, this.c);
      }
   }

   public List<eju> a(dcb $$0, Predicate<ejm> $$1) {
      Map<ejm, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvx.e).h();
      Builder<eju> $$3 = ImmutableList.builder();

      for (Entry<ejm, LongSet> $$4 : $$2.entrySet()) {
         ejm $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eju> a(kf $$0, ejm $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvx.e).b($$1);
      Builder<eju> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ejm $$0, LongSet $$1, Consumer<eju> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kf $$4 = kf.a(new dcb($$3), this.a.ao());
         eju $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvx.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eju a(kf $$0, ejm $$1, dvs $$2) {
      return $$2.a($$1);
   }

   public void a(kf $$0, ejm $$1, eju $$2, dvs $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kf $$0, ejm $$1, long $$2, dvs $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eju a(jd $$0, ejm $$1) {
      for (eju $$2 : this.a(kf.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eju.b;
   }

   public eju a(jd $$0, awt<ejm> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eju a(jd $$0, jq<ejm> $$1) {
      return this.a($$0, $$1::a);
   }

   public eju a(jd $$0, Predicate<jm<ejm>> $$1) {
      jz<ejm> $$2 = this.b().d(lu.aR);

      for (eju $$3 : this.a(new dcb($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eju.b;
   }

   public eju b(jd $$0, ejm $$1) {
      for (eju $$2 : this.a(kf.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eju.b;
   }

   public boolean a(jd $$0, eju $$1) {
      for (ejq $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jd $$0) {
      kf $$1 = kf.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvx.e).w();
   }

   public Map<ejm, LongSet> b(jd $$0) {
      kf $$1 = kf.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvx.e).h();
   }

   public ejo a(dcb $$0, ejm $$1, ekj $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eju $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ka b() {
      return this.a.H_();
   }
}
