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

public class cne {
   private final cmn a;
   private final dii b;
   private final dsb c;

   public cne(cmn $$0, dii $$1, dsb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public cne a(aim $$0) {
      if ($$0.C() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.C() + ", region: " + $$0);
      } else {
         return new cne($$0, this.b, this.c);
      }
   }

   public List<dsi> a(clt $$0, Predicate<dsa> $$1) {
      Map<dsa, LongSet> $$2 = this.a.a($$0.e, $$0.f, dec.e).h();
      Builder<dsi> $$3 = ImmutableList.builder();

      for (Entry<dsa, LongSet> $$4 : $$2.entrySet()) {
         dsa $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dsi> a(hx $$0, dsa $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dec.e).b($$1);
      Builder<dsi> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dsa $$0, LongSet $$1, Consumer<dsi> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         hx $$4 = hx.a(new clt($$3), this.a.al());
         dsi $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dec.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dsi a(hx $$0, dsa $$1, deu $$2) {
      return $$2.a($$1);
   }

   public void a(hx $$0, dsa $$1, dsi $$2, deu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(hx $$0, dsa $$1, long $$2, deu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dsi a(gu $$0, dsa $$1) {
      for (dsi $$2 : this.a(hx.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dsi.b;
   }

   public dsi a(gu $$0, acp<dsa> $$1) {
      dsa $$2 = this.b().d(jc.az).a($$1);
      return $$2 == null ? dsi.b : this.b($$0, $$2);
   }

   public dsi a(gu $$0, anl<dsa> $$1) {
      hr<dsa> $$2 = this.b().d(jc.az);

      for (dsi $$3 : this.a(new clt($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dsi.b;
   }

   public dsi b(gu $$0, dsa $$1) {
      for (dsi $$2 : this.a(hx.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dsi.b;
   }

   public boolean a(gu $$0, dsi $$1) {
      for (dse $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dec.e).w();
   }

   public Map<dsa, LongSet> b(gu $$0) {
      hx $$1 = hx.a($$0);
      return this.a.a($$1.a(), $$1.c(), dec.e).h();
   }

   public dsc a(clt $$0, dsa $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dsi $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public hs b() {
      return this.a.B_();
   }
}
