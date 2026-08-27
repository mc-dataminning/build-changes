import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsg implements ape {
   private Map<det<?>, fsh<?>> d = ImmutableMap.of();
   private final etz e;
   private final fjx f;
   public crs a;
   public esc b;
   public ejg c;
   private final Supplier<frb> g;
   private final Supplier<fwi> h;
   private final Supplier<fvi> i;

   public fsg(etz $$0, fjx $$1, Supplier<frb> $$2, Supplier<fwi> $$3, Supplier<fvi> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends der> fsh<E> a(E $$0) {
      return (fsh<E>)this.d.get($$0.u());
   }

   public void a(crs $$0, esc $$1, ejg $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends der> void a(E $$0, float $$1, enk $$2, fqh $$3) {
      fsh<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends der> void a(fsh<T> $$0, T $$1, float $$2, enk $$3, fqh $$4) {
      crs $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fqf.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gay.d);
   }

   public <E extends der> boolean a(E $$0, enk $$1, fqh $$2, int $$3, int $$4) {
      fsh<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(der $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable crs $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(apd $$0) {
      fsi.a $$1 = new fsi.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fsj.a($$1);
   }
}
