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

public class cwx {
   private final cwf a;
   private final dso b;
   private final ech c;

   public cwx(cwf $$0, dso $$1, ech $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwx a(aph $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cwx($$0, this.b, this.c);
      }
   }

   public List<eco> a(cvl $$0, Predicate<ecg> $$1) {
      Map<ecg, LongSet> $$2 = this.a.a($$0.e, $$0.f, dof.e).h();
      Builder<eco> $$3 = ImmutableList.builder();

      for (Entry<ecg, LongSet> $$4 : $$2.entrySet()) {
         ecg $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eco> a(jd $$0, ecg $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dof.e).b($$1);
      Builder<eco> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ecg $$0, LongSet $$1, Consumer<eco> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jd $$4 = jd.a(new cvl($$3), this.a.am());
         eco $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dof.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eco a(jd $$0, ecg $$1, dox $$2) {
      return $$2.a($$1);
   }

   public void a(jd $$0, ecg $$1, eco $$2, dox $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jd $$0, ecg $$1, long $$2, dox $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eco a(ib $$0, ecg $$1) {
      for (eco $$2 : this.a(jd.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eco.b;
   }

   public eco a(ib $$0, ajb<ecg> $$1) {
      ecg $$2 = this.b().d(ki.aE).a($$1);
      return $$2 == null ? eco.b : this.b($$0, $$2);
   }

   public eco a(ib $$0, aut<ecg> $$1) {
      ix<ecg> $$2 = this.b().d(ki.aE);

      for (eco $$3 : this.a(new cvl($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eco.b;
   }

   public eco b(ib $$0, ecg $$1) {
      for (eco $$2 : this.a(jd.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eco.b;
   }

   public boolean a(ib $$0, eco $$1) {
      for (eck $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ib $$0) {
      jd $$1 = jd.a($$0);
      return this.a.a($$1.a(), $$1.c(), dof.e).w();
   }

   public Map<ecg, LongSet> b(ib $$0) {
      jd $$1 = jd.a($$0);
      return this.a.a($$1.a(), $$1.c(), dof.e).h();
   }

   public eci a(cvl $$0, ecg $$1, edd $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eco $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iy b() {
      return this.a.I_();
   }
}
