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

public class cqd {
   private final cpm a;
   private final dlg b;
   private final duz c;

   public cqd(cpm $$0, dlg $$1, duz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cqd a(akr $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cqd($$0, this.b, this.c);
      }
   }

   public List<dvg> a(cos $$0, Predicate<duy> $$1) {
      Map<duy, LongSet> $$2 = this.a.a($$0.e, $$0.f, dha.e).h();
      Builder<dvg> $$3 = ImmutableList.builder();

      for (Entry<duy, LongSet> $$4 : $$2.entrySet()) {
         duy $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dvg> a(hx $$0, duy $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dha.e).b($$1);
      Builder<dvg> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(duy $$0, LongSet $$1, Consumer<dvg> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hx $$4 = hx.a(new cos($$3), this.a.al());
         dvg $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dha.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dvg a(hx $$0, duy $$1, dhs $$2) {
      return $$2.a($$1);
   }

   public void a(hx $$0, duy $$1, dvg $$2, dhs $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hx $$0, duy $$1, long $$2, dhs $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dvg a(gu $$0, duy $$1) {
      for (dvg $$2 : this.a(hx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dvg.b;
   }

   public dvg a(gu $$0, aeq<duy> $$1) {
      duy $$2 = this.b().d(jc.az).a($$1);
      return $$2 == null ? dvg.b : this.b($$0, $$2);
   }

   public dvg a(gu $$0, aqa<duy> $$1) {
      hr<duy> $$2 = this.b().d(jc.az);

      for (dvg $$3 : this.a(new cos($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dvg.b;
   }

   public dvg b(gu $$0, duy $$1) {
      for (dvg $$2 : this.a(hx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dvg.b;
   }

   public boolean a(gu $$0, dvg $$1) {
      for (dvc $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dha.e).w();
   }

   public Map<duy, LongSet> b(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dha.e).h();
   }

   public dva a(cos $$0, duy $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dvg $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hs b() {
      return this.a.B_();
   }
}
