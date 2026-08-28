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

public class dkv {
   private final dka a;
   private final eid b;
   private final ese c;

   public dkv(dka $$0, eid $$1, ese $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dkv a(asc $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dkv($$0, this.b, this.c);
      }
   }

   public List<esl> a(dje $$0, Predicate<esd> $$1) {
      Map<esd, LongSet> $$2 = this.a.a($$0.h, $$0.i, eee.e).h();
      Builder<esl> $$3 = ImmutableList.builder();

      for (Entry<esd, LongSet> $$4 : $$2.entrySet()) {
         esd $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<esl> a(jz $$0, esd $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), eee.e).b($$1);
      Builder<esl> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(esd $$0, LongSet $$1, Consumer<esl> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jz $$4 = jz.a(new dje($$3), this.a.aq());
         esl $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), eee.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public esl a(jz $$0, esd $$1, edz $$2) {
      return $$2.a($$1);
   }

   public void a(jz $$0, esd $$1, esl $$2, edz $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jz $$0, esd $$1, long $$2, edz $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public esl a(iw $$0, esd $$1) {
      for (esl $$2 : this.a(jz.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return esl.b;
   }

   public esl a(iw $$0, axv<esd> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public esl a(iw $$0, jk<esd> $$1) {
      return this.a($$0, $$1::a);
   }

   public esl a(iw $$0, Predicate<jg<esd>> $$1) {
      jt<esd> $$2 = this.b().f(mi.be);

      for (esl $$3 : this.a(new dje($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return esl.b;
   }

   public esl b(iw $$0, esd $$1) {
      for (esl $$2 : this.a(jz.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return esl.b;
   }

   public boolean a(iw $$0, esl $$1) {
      for (esh $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(iw $$0) {
      jz $$1 = jz.a($$0);
      return this.a.a($$1.a(), $$1.c(), eee.e).y();
   }

   public Map<esd, LongSet> b(iw $$0) {
      jz $$1 = jz.a($$0);
      return this.a.a($$1.a(), $$1.c(), eee.e).h();
   }

   public esf a(dje $$0, esd $$1, eta $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(esl $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ju b() {
      return this.a.J_();
   }
}
