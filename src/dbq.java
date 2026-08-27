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

public class dbq {
   private final day a;
   private final dxr b;
   private final ehk c;

   public dbq(day $$0, dxr $$1, ehk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dbq a(aqt $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dbq($$0, this.b, this.c);
      }
   }

   public List<ehr> a(dae $$0, Predicate<ehj> $$1) {
      Map<ehj, LongSet> $$2 = this.a.a($$0.e, $$0.f, dtw.e).h();
      Builder<ehr> $$3 = ImmutableList.builder();

      for (Entry<ehj, LongSet> $$4 : $$2.entrySet()) {
         ehj $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ehr> a(jq $$0, ehj $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dtw.e).b($$1);
      Builder<ehr> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ehj $$0, LongSet $$1, Consumer<ehr> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jq $$4 = jq.a(new dae($$3), this.a.an());
         ehr $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dtw.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ehr a(jq $$0, ehj $$1, dtt $$2) {
      return $$2.a($$1);
   }

   public void a(jq $$0, ehj $$1, ehr $$2, dtt $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jq $$0, ehj $$1, long $$2, dtt $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ehr a(io $$0, ehj $$1) {
      for (ehr $$2 : this.a(jq.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ehr.b;
   }

   public ehr a(io $$0, awl<ehj> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ehr a(io $$0, jb<ehj> $$1) {
      return this.a($$0, $$1::a);
   }

   public ehr a(io $$0, Predicate<ix<ehj>> $$1) {
      jk<ehj> $$2 = this.b().d(lf.aJ);

      for (ehr $$3 : this.a(new dae($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ehr.b;
   }

   public ehr b(io $$0, ehj $$1) {
      for (ehr $$2 : this.a(jq.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ehr.b;
   }

   public boolean a(io $$0, ehr $$1) {
      for (ehn $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(io $$0) {
      jq $$1 = jq.a($$0);
      return this.a.a($$1.a(), $$1.c(), dtw.e).w();
   }

   public Map<ehj, LongSet> b(io $$0) {
      jq $$1 = jq.a($$0);
      return this.a.a($$1.a(), $$1.c(), dtw.e).h();
   }

   public ehl a(dae $$0, ehj $$1, eig $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ehr $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jl b() {
      return this.a.H_();
   }
}
