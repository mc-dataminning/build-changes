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

public class cxu {
   private final cxc a;
   private final dtm b;
   private final edf c;

   public cxu(cxc $$0, dtm $$1, edf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cxu a(apm $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cxu($$0, this.b, this.c);
      }
   }

   public List<edm> a(cwi $$0, Predicate<ede> $$1) {
      Map<ede, LongSet> $$2 = this.a.a($$0.e, $$0.f, dpc.e).h();
      Builder<edm> $$3 = ImmutableList.builder();

      for (Entry<ede, LongSet> $$4 : $$2.entrySet()) {
         ede $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<edm> a(je $$0, ede $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dpc.e).b($$1);
      Builder<edm> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ede $$0, LongSet $$1, Consumer<edm> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         je $$4 = je.a(new cwi($$3), this.a.am());
         edm $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dpc.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public edm a(je $$0, ede $$1, dpu $$2) {
      return $$2.a($$1);
   }

   public void a(je $$0, ede $$1, edm $$2, dpu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(je $$0, ede $$1, long $$2, dpu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public edm a(ib $$0, ede $$1) {
      for (edm $$2 : this.a(je.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return edm.b;
   }

   public edm a(ib $$0, ajg<ede> $$1) {
      ede $$2 = this.b().d(kj.aE).a($$1);
      return $$2 == null ? edm.b : this.b($$0, $$2);
   }

   public edm a(ib $$0, avd<ede> $$1) {
      iy<ede> $$2 = this.b().d(kj.aE);

      for (edm $$3 : this.a(new cwi($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return edm.b;
   }

   public edm b(ib $$0, ede $$1) {
      for (edm $$2 : this.a(je.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return edm.b;
   }

   public boolean a(ib $$0, edm $$1) {
      for (edi $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dpc.e).w();
   }

   public Map<ede, LongSet> b(ib $$0) {
      je $$1 = je.a($$0);
      return this.a.a($$1.a(), $$1.c(), dpc.e).h();
   }

   public edg a(cwi $$0, ede $$1, eeb $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(edm $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iz b() {
      return this.a.H_();
   }
}
