import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsy implements apm {
   private Map<dfk<?>, fsz<?>> d = ImmutableMap.of();
   private final eur e;
   private final fkp f;
   public csf a;
   public est b;
   public ejx c;
   private final Supplier<frt> g;
   private final Supplier<fxa> h;
   private final Supplier<fwa> i;

   public fsy(eur $$0, fkp $$1, Supplier<frt> $$2, Supplier<fxa> $$3, Supplier<fwa> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dfi> fsz<E> a(E $$0) {
      return (fsz<E>)this.d.get($$0.v());
   }

   public void a(csf $$0, est $$1, ejx $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dfi> void a(E $$0, float $$1, eob $$2, fqz $$3) {
      fsz<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dfi> void a(fsz<T> $$0, T $$1, float $$2, eob $$3, fqz $$4) {
      csf $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fqx.a($$5, $$1.aC_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gbq.d);
   }

   public <E extends dfi> boolean a(E $$0, eob $$1, fqz $$2, int $$3, int $$4) {
      fsz<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dfi $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable csf $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(apl $$0) {
      fta.a $$1 = new fta.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = ftb.a($$1);
   }
}
