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

public class dhd {
   private final dgi a;
   private final edp b;
   private final enm c;

   public dhd(dgi $$0, edp $$1, enm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhd a(arl $$0) {
      if ($$0.a() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.a() + ", region: " + $$0);
      } else {
         return new dhd($$0, this.b, this.c);
      }
   }

   public List<ent> a(dfn $$0, Predicate<enl> $$1) {
      Map<enl, LongSet> $$2 = this.a.a($$0.h, $$0.i, dzs.e).h();
      Builder<ent> $$3 = ImmutableList.builder();

      for (Entry<enl, LongSet> $$4 : $$2.entrySet()) {
         enl $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ent> a(kk $$0, enl $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dzs.e).b($$1);
      Builder<ent> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(enl $$0, LongSet $$1, Consumer<ent> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         kk $$4 = kk.a(new dfn($$3), this.a.ap());
         ent $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dzs.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ent a(kk $$0, enl $$1, dzn $$2) {
      return $$2.a($$1);
   }

   public void a(kk $$0, enl $$1, ent $$2, dzn $$3) {
      $$3.a($$1, $$2);
   }

   public void a(kk $$0, enl $$1, long $$2, dzn $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.d();
   }

   public ent a(ji $$0, enl $$1) {
      for (ent $$2 : this.a(kk.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ent.b;
   }

   public ent a(ji $$0, axf<enl> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ent a(ji $$0, jv<enl> $$1) {
      return this.a($$0, $$1::a);
   }

   public ent a(ji $$0, Predicate<jr<enl>> $$1) {
      ke<enl> $$2 = this.b().e(mc.aU);

      for (ent $$3 : this.a(new dfn($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ent.b;
   }

   public ent b(ji $$0, enl $$1) {
      for (ent $$2 : this.a(kk.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ent.b;
   }

   public boolean a(ji $$0, ent $$1) {
      for (enp $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzs.e).y();
   }

   public Map<enl, LongSet> b(ji $$0) {
      kk $$1 = kk.a($$0);
      return this.a.a($$1.a(), $$1.c(), dzs.e).h();
   }

   public enn a(dfn $$0, enl $$1, eoi $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ent $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public kf b() {
      return this.a.K_();
   }
}
