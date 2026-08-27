import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpk implements ann {
   private Map<dco<?>, fpl<?>> d = ImmutableMap.of();
   private final eru e;
   private final fhj f;
   public cpm a;
   public epx b;
   public ehc c;
   private final Supplier<foe> g;
   private final Supplier<ftm> h;
   private final Supplier<fsm> i;

   public fpk(eru $$0, fhj $$1, Supplier<foe> $$2, Supplier<ftm> $$3, Supplier<fsm> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcm> fpl<E> a(E $$0) {
      return (fpl<E>)this.d.get($$0.u());
   }

   public void a(cpm $$0, epx $$1, ehc $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcm> void a(E $$0, float $$1, elg $$2, fnl $$3) {
      fpl<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcm> void a(fpl<T> $$0, T $$1, float $$2, elg $$3, fnl $$4) {
      cpm $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fnj.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyc.d);
   }

   public <E extends dcm> boolean a(E $$0, elg $$1, fnl $$2, int $$3, int $$4) {
      fpl<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcm $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpm $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anm $$0) {
      fpm.a $$1 = new fpm.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fpn.a($$1);
   }
}
