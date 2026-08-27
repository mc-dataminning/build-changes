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

public class dct {
   private final dcb a;
   private final dzs b;
   private final eju c;

   public dct(dcb $$0, dzs $$1, eju $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dct a(ara $$0) {
      if ($$0.E() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.E() + ", region: " + $$0);
      } else {
         return new dct($$0, this.b, this.c);
      }
   }

   public List<ekb> a(dbh $$0, Predicate<ejt> $$1) {
      Map<ejt, LongSet> $$2 = this.a.a($$0.e, $$0.f, dvx.e).i();
      Builder<ekb> $$3 = ImmutableList.builder();

      for (Entry<ejt, LongSet> $$4 : $$2.entrySet()) {
         ejt $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<ekb> a(jt $$0, ejt $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), dvx.e).b($$1);
      Builder<ekb> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(ejt $$0, LongSet $$1, Consumer<ekb> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         jt $$4 = jt.a(new dbh($$3), this.a.ao());
         ekb $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), dvx.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public ekb a(jt $$0, ejt $$1, dvu $$2) {
      return $$2.a($$1);
   }

   public void a(jt $$0, ejt $$1, ekb $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public void a(jt $$0, ejt $$1, long $$2, dvu $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public ekb a(ir $$0, ejt $$1) {
      for (ekb $$2 : this.a(jt.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return ekb.b;
   }

   public ekb a(ir $$0, awt<ejt> $$1) {
      return this.a($$0, $$1x -> $$1x.a($$1));
   }

   public ekb a(ir $$0, je<ejt> $$1) {
      return this.a($$0, $$1::a);
   }

   public ekb a(ir $$0, Predicate<ja<ejt>> $$1) {
      jn<ejt> $$2 = this.b().d(li.aJ);

      for (ekb $$3 : this.a(new dbh($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1::test).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return ekb.b;
   }

   public ekb b(ir $$0, ejt $$1) {
      for (ekb $$2 : this.a(jt.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return ekb.b;
   }

   public boolean a(ir $$0, ekb $$1) {
      for (ejx $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ir $$0) {
      jt $$1 = jt.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvx.e).x();
   }

   public Map<ejt, LongSet> b(ir $$0) {
      jt $$1 = jt.a($$0);
      return this.a.a($$1.a(), $$1.c(), dvx.e).i();
   }

   public ejv a(dbh $$0, ejt $$1, ekq $$2, boolean $$3) {
      return this.c.a($$0, $$1, $$2, $$3);
   }

   public void a(ekb $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public jo b() {
      return this.a.I_();
   }
}
