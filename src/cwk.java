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

public class cwk {
   private final cvs a;
   private final drt b;
   private final ebm c;

   public cwk(cvs $$0, drt $$1, ebm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cwk a(apd $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new cwk($$0, this.b, this.c);
      }
   }

   public List<ebt> a(cuy $$0, Predicate<ebl> $$1) {
      Map<ebl, LongSet> $$2 = this.a.a($$0.e, $$0.f, dnk.e).h();
      Builder<ebt> $$3 = ImmutableList.builder();

      for (Entry<ebl, LongSet> $$4 : $$2.entrySet()) {
         ebl $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ebt> a(jb $$0, ebl $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dnk.e).b($$1);
      Builder<ebt> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ebl $$0, LongSet $$1, Consumer<ebt> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jb $$4 = jb.a(new cuy($$3), this.a.am());
         ebt $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dnk.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ebt a(jb $$0, ebl $$1, doc $$2) {
      return $$2.a($$1);
   }

   public void a(jb $$0, ebl $$1, ebt $$2, doc $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jb $$0, ebl $$1, long $$2, doc $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ebt a(hz $$0, ebl $$1) {
      for (ebt $$2 : this.a(jb.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ebt.b;
   }

   public ebt a(hz $$0, aix<ebl> $$1) {
      ebl $$2 = this.b().d(kg.aD).a($$1);
      return $$2 == null ? ebt.b : this.b($$0, $$2);
   }

   public ebt a(hz $$0, aup<ebl> $$1) {
      iv<ebl> $$2 = this.b().d(kg.aD);

      for (ebt $$3 : this.a(new cuy($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ebt.b;
   }

   public ebt b(hz $$0, ebl $$1) {
      for (ebt $$2 : this.a(jb.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ebt.b;
   }

   public boolean a(hz $$0, ebt $$1) {
      for (ebp $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(hz $$0) {
      jb $$1 = jb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dnk.e).w();
   }

   public Map<ebl, LongSet> b(hz $$0) {
      jb $$1 = jb.a($$0);
      return this.a.a($$1.a(), $$1.c(), dnk.e).h();
   }

   public ebn a(cuy $$0, ebl $$1, eci $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ebt $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public iw b() {
      return this.a.I_();
   }
}
