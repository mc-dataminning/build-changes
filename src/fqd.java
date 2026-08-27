import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqd implements anv {
   private Map<dcx<?>, fqe<?>> d = ImmutableMap.of();
   private final esd e;
   private final fhy f;
   public cpv a;
   public eqg b;
   public ehl c;
   private final Supplier<foy> g;
   private final Supplier<fuf> h;
   private final Supplier<ftf> i;

   public fqd(esd $$0, fhy $$1, Supplier<foy> $$2, Supplier<fuf> $$3, Supplier<ftf> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcv> fqe<E> a(E $$0) {
      return (fqe<E>)this.d.get($$0.u());
   }

   public void a(cpv $$0, eqg $$1, ehl $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcv> void a(E $$0, float $$1, elp $$2, foe $$3) {
      fqe<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcv> void a(fqe<T> $$0, T $$1, float $$2, elp $$3, foe $$4) {
      cpv $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = foc.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyv.d);
   }

   public <E extends dcv> boolean a(E $$0, elp $$1, foe $$2, int $$3, int $$4) {
      fqe<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcv $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpv $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anu $$0) {
      fqf.a $$1 = new fqf.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fqg.a($$1);
   }
}
