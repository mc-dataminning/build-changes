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

public class dbs {
   private final dba a;
   private final dxt b;
   private final ehm c;

   public dbs(dba $$0, dxt $$1, ehm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dbs a(aqu $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dbs($$0, this.b, this.c);
      }
   }

   public List<eht> a(dag $$0, Predicate<ehl> $$1) {
      Map<ehl, LongSet> $$2 = this.a.a($$0.e, $$0.f, dty.e).h();
      Builder<eht> $$3 = ImmutableList.builder();

      for (Entry<ehl, LongSet> $$4 : $$2.entrySet()) {
         ehl $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eht> a(jq $$0, ehl $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dty.e).b($$1);
      Builder<eht> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ehl $$0, LongSet $$1, Consumer<eht> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jq $$4 = jq.a(new dag($$3), this.a.an());
         eht $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dty.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eht a(jq $$0, ehl $$1, dtv $$2) {
      return $$2.a($$1);
   }

   public void a(jq $$0, ehl $$1, eht $$2, dtv $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jq $$0, ehl $$1, long $$2, dtv $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eht a(io $$0, ehl $$1) {
      for (eht $$2 : this.a(jq.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eht.b;
   }

   public eht a(io $$0, awm<ehl> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eht a(io $$0, jb<ehl> $$1) {
      return this.a($$0, $$1::a);
   }

   public eht a(io $$0, Predicate<ix<ehl>> $$1) {
      jk<ehl> $$2 = this.b().d(lf.aJ);

      for (eht $$3 : this.a(new dag($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eht.b;
   }

   public eht b(io $$0, ehl $$1) {
      for (eht $$2 : this.a(jq.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eht.b;
   }

   public boolean a(io $$0, eht $$1) {
      for (ehp $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(io $$0) {
      jq $$1 = jq.a($$0);
      return this.a.a($$1.a(), $$1.c(), dty.e).w();
   }

   public Map<ehl, LongSet> b(io $$0) {
      jq $$1 = jq.a($$0);
      return this.a.a($$1.a(), $$1.c(), dty.e).h();
   }

   public ehn a(dag $$0, ehl $$1, eii $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eht $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jl b() {
      return this.a.H_();
   }
}
