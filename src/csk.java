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

public class csk {
   private final crt a;
   private final dnd b;
   private final dww c;

   public csk(crt $$0, dnd $$1, dww $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public csk a(amh $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new csk($$0, this.b, this.c);
      }
   }

   public List<dxd> a(cqz $$0, Predicate<dwv> $$1) {
      Map<dwv, LongSet> $$2 = this.a.a($$0.e, $$0.f, dix.e).h();
      Builder<dxd> $$3 = ImmutableList.builder();

      for (Entry<dwv, LongSet> $$4 : $$2.entrySet()) {
         dwv $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dxd> a(iu $$0, dwv $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dix.e).b($$1);
      Builder<dxd> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dwv $$0, LongSet $$1, Consumer<dxd> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iu $$4 = iu.a(new cqz($$3), this.a.al());
         dxd $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dix.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dxd a(iu $$0, dwv $$1, djp $$2) {
      return $$2.a($$1);
   }

   public void a(iu $$0, dwv $$1, dxd $$2, djp $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iu $$0, dwv $$1, long $$2, djp $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dxd a(ht $$0, dwv $$1) {
      for (dxd $$2 : this.a(iu.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dxd.b;
   }

   public dxd a(ht $$0, agf<dwv> $$1) {
      dwv $$2 = this.b().d(jz.aB).a($$1);
      return $$2 == null ? dxd.b : this.b($$0, $$2);
   }

   public dxd a(ht $$0, arr<dwv> $$1) {
      io<dwv> $$2 = this.b().d(jz.aB);

      for (dxd $$3 : this.a(new cqz($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dxd.b;
   }

   public dxd b(ht $$0, dwv $$1) {
      for (dxd $$2 : this.a(iu.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dxd.b;
   }

   public boolean a(ht $$0, dxd $$1) {
      for (dwz $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), dix.e).w();
   }

   public Map<dwv, LongSet> b(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), dix.e).h();
   }

   public dwx a(cqz $$0, dwv $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dxd $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ip b() {
      return this.a.H_();
   }
}
