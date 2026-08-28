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

public class dfw {
   private final dfc a;
   private final ecd b;
   private final ely c;

   public dfw(dfc $$0, ecd $$1, ely $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfw a(arv $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dfw($$0, this.b, this.c);
      }
   }

   public List<emf> a(deh $$0, Predicate<elx> $$1) {
      Map<elx, LongSet> $$2 = this.a.a($$0.g, $$0.h, dyg.e).h();
      Builder<emf> $$3 = ImmutableList.builder();

      for (Entry<elx, LongSet> $$4 : $$2.entrySet()) {
         elx $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<emf> a(kj $$0, elx $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dyg.e).b($$1);
      Builder<emf> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(elx $$0, LongSet $$1, Consumer<emf> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new deh($$3), this.a.an());
         emf $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dyg.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public emf a(kj $$0, elx $$1, dyb $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, elx $$1, emf $$2, dyb $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, elx $$1, long $$2, dyb $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public emf a(jh $$0, elx $$1) {
      for (emf $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return emf.b;
   }

   public emf a(jh $$0, axq<elx> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public emf a(jh $$0, ju<elx> $$1) {
      return this.a($$0, $$1::a);
   }

   public emf a(jh $$0, Predicate<jq<elx>> $$1) {
      kd<elx> $$2 = this.b().e(lz.aS);

      for (emf $$3 : this.a(new deh($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return emf.b;
   }

   public emf b(jh $$0, elx $$1) {
      for (emf $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return emf.b;
   }

   public boolean a(jh $$0, emf $$1) {
      for (emb $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyg.e).v();
   }

   public Map<elx, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyg.e).h();
   }

   public elz a(deh $$0, elx $$1, emu $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(emf $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.H_();
   }
}
