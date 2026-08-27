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

public class cxs {
   private final cxa a;
   private final dtk b;
   private final edd c;

   public cxs(cxa $$0, dtk $$1, edd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cxs a(apm $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cxs($$0, this.b, this.c);
      }
   }

   public List<edk> a(cwg $$0, Predicate<edc> $$1) {
      Map<edc, LongSet> $$2 = this.a.a($$0.e, $$0.f, dpa.e).h();
      Builder<edk> $$3 = ImmutableList.builder();

      for (Entry<edc, LongSet> $$4 : $$2.entrySet()) {
         edc $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<edk> a(je $$0, edc $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dpa.e).b($$1);
      Builder<edk> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(edc $$0, LongSet $$1, Consumer<edk> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         je $$4 = je.a(new cwg($$3), this.a.am());
         edk $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dpa.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public edk a(je $$0, edc $$1, dps $$2) {
      return $$2.a($$1);
   }

   public void a(je $$0, edc $$1, edk $$2, dps $$3) {
      $$3.a($$1, $$2);
   }

   public void a(je $$0, edc $$1, long $$2, dps $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public edk a(ib $$0, edc $$1) {
      for (edk $$2 : this.a(je.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return edk.b;
   }

   public edk a(ib $$0, ajg<edc> $$1) {
      edc $$2 = this.b().d(kj.aE).a($$1);
      return $$2 == null ? edk.b : this.b($$0, $$2);
   }

   public edk a(ib $$0, avd<edc> $$1) {
      iy<edc> $$2 = this.b().d(kj.aE);

      for (edk $$3 : this.a(new cwg($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return edk.b;
   }

   public edk b(ib $$0, edc $$1) {
      for (edk $$2 : this.a(je.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return edk.b;
   }

   public boolean a(ib $$0, edk $$1) {
      for (edg $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dpa.e).w();
   }

   public Map<edc, LongSet> b(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dpa.e).h();
   }

   public ede a(cwg $$0, edc $$1, edz $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(edk $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iz b() {
      return this.a.H_();
   }
}
