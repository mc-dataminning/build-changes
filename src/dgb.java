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

public class dgb {
   private final dfg a;
   private final ech b;
   private final emc c;

   public dgb(dfg $$0, ech $$1, emc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dgb a(ary $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dgb($$0, this.b, this.c);
      }
   }

   public List<emj> a(del $$0, Predicate<emb> $$1) {
      Map<emb, LongSet> $$2 = this.a.a($$0.g, $$0.h, dyk.e).h();
      Builder<emj> $$3 = ImmutableList.builder();

      for (Entry<emb, LongSet> $$4 : $$2.entrySet()) {
         emb $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<emj> a(kj $$0, emb $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dyk.e).b($$1);
      Builder<emj> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(emb $$0, LongSet $$1, Consumer<emj> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new del($$3), this.a.an());
         emj $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dyk.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public emj a(kj $$0, emb $$1, dyf $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, emb $$1, emj $$2, dyf $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, emb $$1, long $$2, dyf $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public emj a(jh $$0, emb $$1) {
      for (emj $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return emj.b;
   }

   public emj a(jh $$0, axt<emb> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public emj a(jh $$0, ju<emb> $$1) {
      return this.a($$0, $$1::a);
   }

   public emj a(jh $$0, Predicate<jq<emb>> $$1) {
      kd<emb> $$2 = this.b().e(ma.aS);

      for (emj $$3 : this.a(new del($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return emj.b;
   }

   public emj b(jh $$0, emb $$1) {
      for (emj $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return emj.b;
   }

   public boolean a(jh $$0, emj $$1) {
      for (emf $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyk.e).v();
   }

   public Map<emb, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyk.e).h();
   }

   public emd a(del $$0, emb $$1, emy $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(emj $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.H_();
   }
}
