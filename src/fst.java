import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fst implements api {
   private Map<dff<?>, fsu<?>> d = ImmutableMap.of();
   private final eum e;
   private final fkk f;
   public csa a;
   public eso b;
   public ejs c;
   private final Supplier<fro> g;
   private final Supplier<fwv> h;
   private final Supplier<fvv> i;

   public fst(eum $$0, fkk $$1, Supplier<fro> $$2, Supplier<fwv> $$3, Supplier<fvv> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dfd> fsu<E> a(E $$0) {
      return (fsu<E>)this.d.get($$0.u());
   }

   public void a(csa $$0, eso $$1, ejs $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dfd> void a(E $$0, float $$1, enw $$2, fqu $$3) {
      fsu<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dfd> void a(fsu<T> $$0, T $$1, float $$2, enw $$3, fqu $$4) {
      csa $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fqs.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, gbl.d);
   }

   public <E extends dfd> boolean a(E $$0, enw $$1, fqu $$2, int $$3, int $$4) {
      fsu<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dfd $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable csa $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(aph $$0) {
      fsv.a $$1 = new fsv.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fsw.a($$1);
   }
}
