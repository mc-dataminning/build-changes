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

public class dgi {
   private final dfn a;
   private final eco b;
   private final emj c;

   public dgi(dfn $$0, eco $$1, emj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dgi a(arx $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dgi($$0, this.b, this.c);
      }
   }

   public List<emq> a(des $$0, Predicate<emi> $$1) {
      Map<emi, LongSet> $$2 = this.a.a($$0.g, $$0.h, dyr.e).h();
      Builder<emq> $$3 = ImmutableList.builder();

      for (Entry<emi, LongSet> $$4 : $$2.entrySet()) {
         emi $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<emq> a(kj $$0, emi $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dyr.e).b($$1);
      Builder<emq> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(emi $$0, LongSet $$1, Consumer<emq> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kj $$4 = kj.a(new des($$3), this.a.an());
         emq $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dyr.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public emq a(kj $$0, emi $$1, dym $$2) {
      return $$2.a($$1);
   }

   public void a(kj $$0, emi $$1, emq $$2, dym $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kj $$0, emi $$1, long $$2, dym $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public emq a(jh $$0, emi $$1) {
      for (emq $$2 : this.a(kj.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return emq.b;
   }

   public emq a(jh $$0, axs<emi> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public emq a(jh $$0, ju<emi> $$1) {
      return this.a($$0, $$1::a);
   }

   public emq a(jh $$0, Predicate<jq<emi>> $$1) {
      kd<emi> $$2 = this.b().e(ma.aS);

      for (emq $$3 : this.a(new des($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return emq.b;
   }

   public emq b(jh $$0, emi $$1) {
      for (emq $$2 : this.a(kj.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return emq.b;
   }

   public boolean a(jh $$0, emq $$1) {
      for (emm $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyr.e).v();
   }

   public Map<emi, LongSet> b(jh $$0) {
      kj $$1 = kj.a($$0);
      return this.a.a($$1.a(), $$1.c(), dyr.e).h();
   }

   public emk a(des $$0, emi $$1, enf $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(emq $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ke b() {
      return this.a.J_();
   }
}
