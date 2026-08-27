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

public class crr {
   private final cra a;
   private final dmi b;
   private final dwb c;

   public crr(cra $$0, dmi $$1, dwb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public crr a(alx $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new crr($$0, this.b, this.c);
      }
   }

   public List<dwi> a(cqg $$0, Predicate<dwa> $$1) {
      Map<dwa, LongSet> $$2 = this.a.a($$0.e, $$0.f, dic.e).h();
      Builder<dwi> $$3 = ImmutableList.builder();

      for (Entry<dwa, LongSet> $$4 : $$2.entrySet()) {
         dwa $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dwi> a(iu $$0, dwa $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dic.e).b($$1);
      Builder<dwi> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dwa $$0, LongSet $$1, Consumer<dwi> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iu $$4 = iu.a(new cqg($$3), this.a.al());
         dwi $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dic.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dwi a(iu $$0, dwa $$1, diu $$2) {
      return $$2.a($$1);
   }

   public void a(iu $$0, dwa $$1, dwi $$2, diu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iu $$0, dwa $$1, long $$2, diu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dwi a(ht $$0, dwa $$1) {
      for (dwi $$2 : this.a(iu.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dwi.b;
   }

   public dwi a(ht $$0, afv<dwa> $$1) {
      dwa $$2 = this.b().d(jz.aA).a($$1);
      return $$2 == null ? dwi.b : this.b($$0, $$2);
   }

   public dwi a(ht $$0, arh<dwa> $$1) {
      io<dwa> $$2 = this.b().d(jz.aA);

      for (dwi $$3 : this.a(new cqg($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dwi.b;
   }

   public dwi b(ht $$0, dwa $$1) {
      for (dwi $$2 : this.a(iu.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dwi.b;
   }

   public boolean a(ht $$0, dwi $$1) {
      for (dwe $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), dic.e).w();
   }

   public Map<dwa, LongSet> b(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), dic.e).h();
   }

   public dwc a(cqg $$0, dwa $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dwi $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ip b() {
      return this.a.H_();
   }
}
