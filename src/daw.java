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

public class daw {
   private final dae a;
   private final dwx b;
   private final egq c;

   public daw(dae $$0, dwx $$1, egq $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public daw a(aqo $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new daw($$0, this.b, this.c);
      }
   }

   public List<egx> a(czk $$0, Predicate<egp> $$1) {
      Map<egp, LongSet> $$2 = this.a.a($$0.e, $$0.f, dtc.e).h();
      Builder<egx> $$3 = ImmutableList.builder();

      for (Entry<egp, LongSet> $$4 : $$2.entrySet()) {
         egp $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<egx> a(jp $$0, egp $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dtc.e).b($$1);
      Builder<egx> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(egp $$0, LongSet $$1, Consumer<egx> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jp $$4 = jp.a(new czk($$3), this.a.an());
         egx $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dtc.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public egx a(jp $$0, egp $$1, dsz $$2) {
      return $$2.a($$1);
   }

   public void a(jp $$0, egp $$1, egx $$2, dsz $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jp $$0, egp $$1, long $$2, dsz $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public egx a(in $$0, egp $$1) {
      for (egx $$2 : this.a(jp.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return egx.b;
   }

   public egx a(in $$0, awg<egp> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public egx a(in $$0, ja<egp> $$1) {
      return this.a($$0, $$1::a);
   }

   public egx a(in $$0, Predicate<iw<egp>> $$1) {
      jj<egp> $$2 = this.b().d(le.aJ);

      for (egx $$3 : this.a(new czk($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return egx.b;
   }

   public egx b(in $$0, egp $$1) {
      for (egx $$2 : this.a(jp.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return egx.b;
   }

   public boolean a(in $$0, egx $$1) {
      for (egt $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(in $$0) {
      jp $$1 = jp.a($$0);
      return this.a.a($$1.a(), $$1.c(), dtc.e).w();
   }

   public Map<egp, LongSet> b(in $$0) {
      jp $$1 = jp.a($$0);
      return this.a.a($$1.a(), $$1.c(), dtc.e).h();
   }

   public egr a(czk $$0, egp $$1, ehm $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(egx $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jk b() {
      return this.a.H_();
   }
}
