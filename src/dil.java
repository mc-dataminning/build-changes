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

public class dil {
   private final dhq a;
   private final efj b;
   private final eph c;

   public dil(dhq $$0, efj $$1, eph $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dil a(arv $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dil($$0, this.b, this.c);
      }
   }

   public List<epo> a(dgw $$0, Predicate<epg> $$1) {
      Map<epg, LongSet> $$2 = this.a.a($$0.h, $$0.i, ebk.e).h();
      Builder<epo> $$3 = ImmutableList.builder();

      for (Entry<epg, LongSet> $$4 : $$2.entrySet()) {
         epg $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<epo> a(kl $$0, epg $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), ebk.e).b($$1);
      Builder<epo> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(epg $$0, LongSet $$1, Consumer<epo> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kl $$4 = kl.a(new dgw($$3), this.a.aq());
         epo $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), ebk.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public epo a(kl $$0, epg $$1, ebf $$2) {
      return $$2.a($$1);
   }

   public void a(kl $$0, epg $$1, epo $$2, ebf $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kl $$0, epg $$1, long $$2, ebf $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public epo a(jj $$0, epg $$1) {
      for (epo $$2 : this.a(kl.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return epo.b;
   }

   public epo a(jj $$0, axp<epg> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public epo a(jj $$0, jw<epg> $$1) {
      return this.a($$0, $$1::a);
   }

   public epo a(jj $$0, Predicate<js<epg>> $$1) {
      kf<epg> $$2 = this.b().f(me.aZ);

      for (epo $$3 : this.a(new dgw($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return epo.b;
   }

   public epo b(jj $$0, epg $$1) {
      for (epo $$2 : this.a(kl.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return epo.b;
   }

   public boolean a(jj $$0, epo $$1) {
      for (epk $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jj $$0) {
      kl $$1 = kl.a($$0);
      return this.a.a($$1.a(), $$1.c(), ebk.e).y();
   }

   public Map<epg, LongSet> b(jj $$0) {
      kl $$1 = kl.a($$0);
      return this.a.a($$1.a(), $$1.c(), ebk.e).h();
   }

   public epi a(dgw $$0, epg $$1, eqd $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(epo $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kg b() {
      return this.a.F_();
   }
}
