import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuh implements apt {
   private Map<dgf<?>, fui<?>> d = ImmutableMap.of();
   private final evu e;
   private final flu f;
   public csy a;
   public etv b;
   public ekz c;
   private final Supplier<ftc> g;
   private final Supplier<fym> h;
   private final Supplier<fxm> i;

   public fuh(evu $$0, flu $$1, Supplier<ftc> $$2, Supplier<fym> $$3, Supplier<fxm> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dgd> fui<E> a(E $$0) {
      return (fui<E>)this.d.get($$0.v());
   }

   public void a(csy $$0, etv $$1, ekz $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dgd> void a(E $$0, float $$1, epd $$2, fsi $$3) {
      fui<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.n() && $$0.v().a($$0.r())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dgd> void a(fui<T> $$0, T $$1, float $$2, epd $$3, fsi $$4) {
      csy $$5 = $$1.i();
      int $$6;
      if ($$5 != null) {
         $$6 = fsg.a($$5, $$1.aB_());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gdf.d);
   }

   public <E extends dgd> boolean a(E $$0, epd $$1, fsi $$2, int $$3, int $$4) {
      fui<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dgd $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable csy $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aps $$0) {
      fuj.a $$1 = new fuj.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fuk.a($$1);
   }
}
