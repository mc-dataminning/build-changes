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

public class czq {
   private final cyy a;
   private final dvp b;
   private final efi c;

   public czq(cyy $$0, dvp $$1, efi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public czq a(apz $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new czq($$0, this.b, this.c);
      }
   }

   public List<efp> a(cye $$0, Predicate<efh> $$1) {
      Map<efh, LongSet> $$2 = this.a.a($$0.e, $$0.f, dru.e).h();
      Builder<efp> $$3 = ImmutableList.builder();

      for (Entry<efh, LongSet> $$4 : $$2.entrySet()) {
         efh $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<efp> a(je $$0, efh $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dru.e).b($$1);
      Builder<efp> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(efh $$0, LongSet $$1, Consumer<efp> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         je $$4 = je.a(new cye($$3), this.a.an());
         efp $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dru.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public efp a(je $$0, efh $$1, drr $$2) {
      return $$2.a($$1);
   }

   public void a(je $$0, efh $$1, efp $$2, drr $$3) {
      $$3.a($$1, $$2);
   }

   public void a(je $$0, efh $$1, long $$2, drr $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public efp a(ib $$0, efh $$1) {
      for (efp $$2 : this.a(je.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return efp.b;
   }

   public efp a(ib $$0, avr<efh> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public efp a(ib $$0, ip<efh> $$1) {
      return this.a($$0, $$1::a);
   }

   public efp a(ib $$0, Predicate<il<efh>> $$1) {
      iy<efh> $$2 = this.b().d(ks.aF);

      for (efp $$3 : this.a(new cye($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return efp.b;
   }

   public efp b(ib $$0, efh $$1) {
      for (efp $$2 : this.a(je.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return efp.b;
   }

   public boolean a(ib $$0, efp $$1) {
      for (efl $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dru.e).w();
   }

   public Map<efh, LongSet> b(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dru.e).h();
   }

   public efj a(cye $$0, efh $$1, ege $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(efp $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iz b() {
      return this.a.H_();
   }
}
