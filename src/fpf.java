import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpf implements anl {
   private Map<dcm<?>, fpg<?>> d = ImmutableMap.of();
   private final erv e;
   private final fhf f;
   public cpk a;
   public epy b;
   public ehd c;
   private final Supplier<fnz> g;
   private final Supplier<fth> h;
   private final Supplier<fsh> i;

   public fpf(erv $$0, fhf $$1, Supplier<fnz> $$2, Supplier<fth> $$3, Supplier<fsh> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dck> fpg<E> a(E $$0) {
      return (fpg<E>)this.d.get($$0.u());
   }

   public void a(cpk $$0, epy $$1, ehd $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dck> void a(E $$0, float $$1, elh $$2, fng $$3) {
      fpg<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dck> void a(fpg<T> $$0, T $$1, float $$2, elh $$3, fng $$4) {
      cpk $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fne.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fxx.d);
   }

   public <E extends dck> boolean a(E $$0, elh $$1, fng $$2, int $$3, int $$4) {
      fpg<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dck $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpk $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(ank $$0) {
      fph.a $$1 = new fph.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fpi.a($$1);
   }
}
