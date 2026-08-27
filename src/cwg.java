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

public class cwg {
   private final cvo a;
   private final drm b;
   private final ebf c;

   public cwg(cvo $$0, drm $$1, ebf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwg a(apc $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cwg($$0, this.b, this.c);
      }
   }

   public List<ebm> a(cuu $$0, Predicate<ebe> $$1) {
      Map<ebe, LongSet> $$2 = this.a.a($$0.e, $$0.f, dng.e).h();
      Builder<ebm> $$3 = ImmutableList.builder();

      for (Entry<ebe, LongSet> $$4 : $$2.entrySet()) {
         ebe $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ebm> a(jb $$0, ebe $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dng.e).b($$1);
      Builder<ebm> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ebe $$0, LongSet $$1, Consumer<ebm> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jb $$4 = jb.a(new cuu($$3), this.a.an());
         ebm $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dng.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ebm a(jb $$0, ebe $$1, dny $$2) {
      return $$2.a($$1);
   }

   public void a(jb $$0, ebe $$1, ebm $$2, dny $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jb $$0, ebe $$1, long $$2, dny $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ebm a(hz $$0, ebe $$1) {
      for (ebm $$2 : this.a(jb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ebm.b;
   }

   public ebm a(hz $$0, aix<ebe> $$1) {
      ebe $$2 = this.b().d(kg.aD).a($$1);
      return $$2 == null ? ebm.b : this.b($$0, $$2);
   }

   public ebm a(hz $$0, auo<ebe> $$1) {
      iv<ebe> $$2 = this.b().d(kg.aD);

      for (ebm $$3 : this.a(new cuu($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ebm.b;
   }

   public ebm b(hz $$0, ebe $$1) {
      for (ebm $$2 : this.a(jb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ebm.b;
   }

   public boolean a(hz $$0, ebm $$1) {
      for (ebi $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hz $$0) {
      jb $$1 = jb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dng.e).w();
   }

   public Map<ebe, LongSet> b(hz $$0) {
      jb $$1 = jb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dng.e).h();
   }

   public ebg a(cuu $$0, ebe $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(ebm $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iw b() {
      return this.a.I_();
   }
}
