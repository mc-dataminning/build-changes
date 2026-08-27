import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpy implements anq {
   private Map<dcs<?>, fpz<?>> d = ImmutableMap.of();
   private final ery e;
   private final fht f;
   public cpq a;
   public eqb b;
   public ehg c;
   private final Supplier<fot> g;
   private final Supplier<fua> h;
   private final Supplier<fta> i;

   public fpy(ery $$0, fht $$1, Supplier<fot> $$2, Supplier<fua> $$3, Supplier<fta> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcq> fpz<E> a(E $$0) {
      return (fpz<E>)this.d.get($$0.u());
   }

   public void a(cpq $$0, eqb $$1, ehg $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcq> void a(E $$0, float $$1, elk $$2, fnz $$3) {
      fpz<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcq> void a(fpz<T> $$0, T $$1, float $$2, elk $$3, fnz $$4) {
      cpq $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fnx.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyq.d);
   }

   public <E extends dcq> boolean a(E $$0, elk $$1, fnz $$2, int $$3, int $$4) {
      fpz<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcq $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpq $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anp $$0) {
      fqa.a $$1 = new fqa.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fqb.a($$1);
   }
}
