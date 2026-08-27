import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpt implements ann {
   private Map<dcn<?>, fpu<?>> d = ImmutableMap.of();
   private final ert e;
   private final fho f;
   public cpl a;
   public epw b;
   public ehb c;
   private final Supplier<fon> g;
   private final Supplier<ftv> h;
   private final Supplier<fsv> i;

   public fpt(ert $$0, fho $$1, Supplier<fon> $$2, Supplier<ftv> $$3, Supplier<fsv> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcl> fpu<E> a(E $$0) {
      return (fpu<E>)this.d.get($$0.u());
   }

   public void a(cpl $$0, epw $$1, ehb $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcl> void a(E $$0, float $$1, elf $$2, fnu $$3) {
      fpu<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcl> void a(fpu<T> $$0, T $$1, float $$2, elf $$3, fnu $$4) {
      cpl $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fns.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyl.d);
   }

   public <E extends dcl> boolean a(E $$0, elf $$1, fnu $$2, int $$3, int $$4) {
      fpu<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcl $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpl $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anm $$0) {
      fpv.a $$1 = new fpv.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fpw.a($$1);
   }
}
