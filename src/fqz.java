import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqz implements aou {
   private Map<ddz<?>, fra<?>> d = ImmutableMap.of();
   private final esw e;
   private final fis f;
   public cqz a;
   public eqz b;
   public eid c;
   private final Supplier<fpu> g;
   private final Supplier<fvb> h;
   private final Supplier<fub> i;

   public fqz(esw $$0, fis $$1, Supplier<fpu> $$2, Supplier<fvb> $$3, Supplier<fub> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends ddx> fra<E> a(E $$0) {
      return (fra<E>)this.d.get($$0.u());
   }

   public void a(cqz $$0, eqz $$1, eid $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends ddx> void a(E $$0, float $$1, emh $$2, fpb $$3) {
      fra<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends ddx> void a(fra<T> $$0, T $$1, float $$2, emh $$3, fpb $$4) {
      cqz $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = foz.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fzr.d);
   }

   public <E extends ddx> boolean a(E $$0, emh $$1, fpb $$2, int $$3, int $$4) {
      fra<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(ddx $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cqz $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aot $$0) {
      frb.a $$1 = new frb.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = frc.a($$1);
   }
}
