import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqf implements anw {
   private Map<dcz<?>, fqg<?>> d = ImmutableMap.of();
   private final esf e;
   private final fia f;
   public cpx a;
   public eqi b;
   public ehn c;
   private final Supplier<fpa> g;
   private final Supplier<fuh> h;
   private final Supplier<fth> i;

   public fqf(esf $$0, fia $$1, Supplier<fpa> $$2, Supplier<fuh> $$3, Supplier<fth> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcx> fqg<E> a(E $$0) {
      return (fqg<E>)this.d.get($$0.u());
   }

   public void a(cpx $$0, eqi $$1, ehn $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcx> void a(E $$0, float $$1, elr $$2, fog $$3) {
      fqg<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcx> void a(fqg<T> $$0, T $$1, float $$2, elr $$3, fog $$4) {
      cpx $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = foe.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyx.d);
   }

   public <E extends dcx> boolean a(E $$0, elr $$1, fog $$2, int $$3, int $$4) {
      fqg<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcx $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cpx $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anv $$0) {
      fqh.a $$1 = new fqh.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fqi.a($$1);
   }
}
