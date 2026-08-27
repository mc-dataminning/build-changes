import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flt implements aky {
   private Map<czp<?>, flu<?>> d = ImmutableMap.of();
   private final eov e;
   private final fea f;
   public cmm a;
   public emz b;
   public eeg c;
   private final Supplier<fko> g;
   private final Supplier<fpw> h;
   private final Supplier<fow> i;

   public flt(eov $$0, fea $$1, Supplier<fko> $$2, Supplier<fpw> $$3, Supplier<fow> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends czn> flu<E> a(E $$0) {
      return (flu<E>)this.d.get($$0.u());
   }

   public void a(cmm $$0, emz $$1, eeg $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends czn> void a(E $$0, float $$1, eij $$2, fjx $$3) {
      flu<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends czn> void a(flu<T> $$0, T $$1, float $$2, eij $$3, fjx $$4) {
      cmm $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fjv.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fum.d);
   }

   public <E extends czn> boolean a(E $$0, eij $$1, fjx $$2, int $$3, int $$4) {
      flu<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(czn $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cmm $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(akx $$0) {
      flv.a $$1 = new flv.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = flw.a($$1);
   }
}
