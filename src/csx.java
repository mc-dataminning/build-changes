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

public class csx {
   private final csg a;
   private final dnu b;
   private final dxn c;

   public csx(csg $$0, dnu $$1, dxn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public csx a(amp $$0) {
      if ($$0.D() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.D() + ", region: " + $$0);
      } else {
         return new csx($$0, this.b, this.c);
      }
   }

   public List<dxu> a(crm $$0, Predicate<dxm> $$1) {
      Map<dxm, LongSet> $$2 = this.a.a($$0.e, $$0.f, djo.e).h();
      Builder<dxu> $$3 = ImmutableList.builder();

      for (Entry<dxm, LongSet> $$4 : $$2.entrySet()) {
         dxm $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dxu> a(iy $$0, dxm $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), djo.e).b($$1);
      Builder<dxu> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dxm $$0, LongSet $$1, Consumer<dxu> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iy $$4 = iy.a(new crm($$3), this.a.am());
         dxu $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), djo.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dxu a(iy $$0, dxm $$1, dkg $$2) {
      return $$2.a($$1);
   }

   public void a(iy $$0, dxm $$1, dxu $$2, dkg $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iy $$0, dxm $$1, long $$2, dkg $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dxu a(hx $$0, dxm $$1) {
      for (dxu $$2 : this.a(iy.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dxu.b;
   }

   public dxu a(hx $$0, agl<dxm> $$1) {
      dxm $$2 = this.b().d(kd.aB).a($$1);
      return $$2 == null ? dxu.b : this.b($$0, $$2);
   }

   public dxu a(hx $$0, arz<dxm> $$1) {
      is<dxm> $$2 = this.b().d(kd.aB);

      for (dxu $$3 : this.a(new crm($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dxu.b;
   }

   public dxu b(hx $$0, dxm $$1) {
      for (dxu $$2 : this.a(iy.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dxu.b;
   }

   public boolean a(hx $$0, dxu $$1) {
      for (dxq $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hx $$0) {
      iy $$1 = iy.a($$0);
      return this.a.a($$1.a(), $$1.c(), djo.e).w();
   }

   public Map<dxm, LongSet> b(hx $$0) {
      iy $$1 = iy.a($$0);
      return this.a.a($$1.a(), $$1.c(), djo.e).h();
   }

   public dxo a(crm $$0, dxm $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dxu $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public it b() {
      return this.a.I_();
   }
}
