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

public class cqc {
   private final cpl a;
   private final dlf b;
   private final duy c;

   public cqc(cpl $$0, dlf $$1, duy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqc a(akp $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqc($$0, this.b, this.c);
      }
   }

   public List<dvf> a(cor $$0, Predicate<dux> $$1) {
      Map<dux, LongSet> $$2 = this.a.a($$0.e, $$0.f, dgz.e).h();
      Builder<dvf> $$3 = ImmutableList.builder();

      for (Entry<dux, LongSet> $$4 : $$2.entrySet()) {
         dux $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvf> a(hy $$0, dux $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dgz.e).b($$1);
      Builder<dvf> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dux $$0, LongSet $$1, Consumer<dvf> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hy $$4 = hy.a(new cor($$3), this.a.al());
         dvf $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dgz.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvf a(hy $$0, dux $$1, dhr $$2) {
      return $$2.a($$1);
   }

   public void a(hy $$0, dux $$1, dvf $$2, dhr $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hy $$0, dux $$1, long $$2, dhr $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvf a(gv $$0, dux $$1) {
      for (dvf $$2 : this.a(hy.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvf.b;
   }

   public dvf a(gv $$0, aeo<dux> $$1) {
      dux $$2 = this.b().d(jd.az).a($$1);
      return $$2 == null ? dvf.b : this.b($$0, $$2);
   }

   public dvf a(gv $$0, apy<dux> $$1) {
      hs<dux> $$2 = this.b().d(jd.az);

      for (dvf $$3 : this.a(new cor($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvf.b;
   }

   public dvf b(gv $$0, dux $$1) {
      for (dvf $$2 : this.a(hy.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvf.b;
   }

   public boolean a(gv $$0, dvf $$1) {
      for (dvb $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gv $$0) {
      hy $$1 = hy.a($$0);
      return this.a.a($$1.a(), $$1.c(), dgz.e).w();
   }

   public Map<dux, LongSet> b(gv $$0) {
      hy $$1 = hy.a($$0);
      return this.a.a($$1.a(), $$1.c(), dgz.e).h();
   }

   public duz a(cor $$0, dux $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvf $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ht b() {
      return this.a.B_();
   }
}
