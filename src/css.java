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

public class css {
   private final csb a;
   private final dnp b;
   private final dxi c;

   public css(csb $$0, dnp $$1, dxi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public css a(aml $$0) {
      if ($$0.D() != this.a) {
         throw new IllegalStateException("Using invalid structure manager (source level: " + $$0.D() + ", region: " + $$0);
      } else {
         return new css($$0, this.b, this.c);
      }
   }

   public List<dxp> a(crh $$0, Predicate<dxh> $$1) {
      Map<dxh, LongSet> $$2 = this.a.a($$0.e, $$0.f, djj.e).h();
      Builder<dxp> $$3 = ImmutableList.builder();

      for (Entry<dxh, LongSet> $$4 : $$2.entrySet()) {
         dxh $$5 = $$4.getKey();
         if ($$1.test($$5)) {
            this.a($$5, $$4.getValue(), $$3::add);
         }
      }

      return $$3.build();
   }

   public List<dxp> a(iu $$0, dxh $$1) {
      LongSet $$2 = this.a.a($$0.a(), $$0.c(), djj.e).b($$1);
      Builder<dxp> $$3 = ImmutableList.builder();
      this.a($$1, $$2, $$3::add);
      return $$3.build();
   }

   public void a(dxh $$0, LongSet $$1, Consumer<dxp> $$2) {
      LongIterator var4 = $$1.iterator();

      while (var4.hasNext()) {
         long $$3 = (Long)var4.next();
         iu $$4 = iu.a(new crh($$3), this.a.am());
         dxp $$5 = this.a($$4, $$0, this.a.a($$4.a(), $$4.c(), djj.d));
         if ($$5 != null && $$5.b()) {
            $$2.accept($$5);
         }
      }
   }

   @Nullable
   public dxp a(iu $$0, dxh $$1, dkb $$2) {
      return $$2.a($$1);
   }

   public void a(iu $$0, dxh $$1, dxp $$2, dkb $$3) {
      $$3.a($$1, $$2);
   }

   public void a(iu $$0, dxh $$1, long $$2, dkb $$3) {
      $$3.a($$1, $$2);
   }

   public boolean a() {
      return this.b.c();
   }

   public dxp a(ht $$0, dxh $$1) {
      for (dxp $$2 : this.a(iu.a($$0), $$1)) {
         if ($$2.a().b($$0)) {
            return $$2;
         }
      }

      return dxp.b;
   }

   public dxp a(ht $$0, agh<dxh> $$1) {
      dxh $$2 = this.b().d(jz.aB).a($$1);
      return $$2 == null ? dxp.b : this.b($$0, $$2);
   }

   public dxp a(ht $$0, arv<dxh> $$1) {
      io<dxh> $$2 = this.b().d(jz.aB);

      for (dxp $$3 : this.a(new crh($$0), $$2x -> $$2.c($$2.a($$2x)).map($$1xx -> $$1xx.a($$1)).orElse(false))) {
         if (this.a($$0, $$3)) {
            return $$3;
         }
      }

      return dxp.b;
   }

   public dxp b(ht $$0, dxh $$1) {
      for (dxp $$2 : this.a(iu.a($$0), $$1)) {
         if (this.a($$0, $$2)) {
            return $$2;
         }
      }

      return dxp.b;
   }

   public boolean a(ht $$0, dxp $$1) {
      for (dxl $$2 : $$1.i()) {
         if ($$2.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), djj.e).w();
   }

   public Map<dxh, LongSet> b(ht $$0) {
      iu $$1 = iu.a($$0);
      return this.a.a($$1.a(), $$1.c(), djj.e).h();
   }

   public dxj a(crh $$0, dxh $$1, boolean $$2) {
      return this.c.a($$0, $$1, $$2);
   }

   public void a(dxp $$0) {
      $$0.e();
      this.c.a($$0.c(), $$0.h());
   }

   public ip b() {
      return this.a.H_();
   }
}
