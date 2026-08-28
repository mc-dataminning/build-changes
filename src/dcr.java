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

public class dcr {
   private final dbz a;
   private final dys b;
   private final eil c;

   public dcr(dbz $$0, dys $$1, eil $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dcr a(arm $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dcr($$0, this.b, this.c);
      }
   }

   public List<eis> a(dbf $$0, Predicate<eik> $$1) {
      Map<eik, LongSet> $$2 = this.a.a($$0.e, $$0.f, dux.e).h();
      Builder<eis> $$3 = ImmutableList.builder();

      for (Entry<eik, LongSet> $$4 : $$2.entrySet()) {
         eik $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<eis> a(kb $$0, eik $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dux.e).b($$1);
      Builder<eis> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(eik $$0, LongSet $$1, Consumer<eis> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kb $$4 = kb.a(new dbf($$3), this.a.ao());
         eis $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dux.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public eis a(kb $$0, eik $$1, duu $$2) {
      return $$2.a($$1);
   }

   public void a(kb $$0, eik $$1, eis $$2, duu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kb $$0, eik $$1, long $$2, duu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public eis a(iz $$0, eik $$1) {
      for (eis $$2 : this.a(kb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return eis.b;
   }

   public eis a(iz $$0, axf<eik> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public eis a(iz $$0, jm<eik> $$1) {
      return this.a($$0, $$1::a);
   }

   public eis a(iz $$0, Predicate<ji<eik>> $$1) {
      jv<eik> $$2 = this.b().d(lq.aJ);

      for (eis $$3 : this.a(new dbf($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return eis.b;
   }

   public eis b(iz $$0, eik $$1) {
      for (eis $$2 : this.a(kb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return eis.b;
   }

   public boolean a(iz $$0, eis $$1) {
      for (eio $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dux.e).w();
   }

   public Map<eik, LongSet> b(iz $$0) {
      kb $$1 = kb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dux.e).h();
   }

   public eim a(dbf $$0, eik $$1, ejh $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(eis $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jw b() {
      return this.a.H_();
   }
}
