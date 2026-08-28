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

public class dcs {
   private final dca a;
   private final dyt b;
   private final eim c;

   public dcs(dca $$0, dyt $$1, eim $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcs a(arm $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcs($$0, this.b, this.c);
      }
   }

   public List<eit> a(dbg $$0, Predicate<eil> $$1) {
      Map<eil, LongSet> $$2 = this.a.a($$0.e, $$0.f, duy.e).h();
      Builder<eit> $$3 = ImmutableList.builder();

      for (Entry<eil, LongSet> $$4 : $$2.entrySet()) {
         eil $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eit> a(kb $$0, eil $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), duy.e).b($$1);
      Builder<eit> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eil $$0, LongSet $$1, Consumer<eit> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kb $$4 = kb.a(new dbg($$3), this.a.ao());
         eit $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), duy.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eit a(kb $$0, eil $$1, duv $$2) {
      return $$2.a($$1);
   }

   public void a(kb $$0, eil $$1, eit $$2, duv $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kb $$0, eil $$1, long $$2, duv $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eit a(iz $$0, eil $$1) {
      for (eit $$2 : this.a(kb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eit.b;
   }

   public eit a(iz $$0, axf<eil> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eit a(iz $$0, jm<eil> $$1) {
      return this.a($$0, $$1::a);
   }

   public eit a(iz $$0, Predicate<ji<eil>> $$1) {
      jv<eil> $$2 = this.b().d(lq.aJ);

      for (eit $$3 : this.a(new dbg($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eit.b;
   }

   public eit b(iz $$0, eil $$1) {
      for (eit $$2 : this.a(kb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eit.b;
   }

   public boolean a(iz $$0, eit $$1) {
      for (eip $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duy.e).w();
   }

   public Map<eil, LongSet> b(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), duy.e).h();
   }

   public ein a(dbg $$0, eil $$1, eji $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eit $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jw b() {
      return this.a.H_();
   }
}
