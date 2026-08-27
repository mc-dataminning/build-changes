import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpz implements anx {
   private Map<ddb<?>, fqa<?>> d = ImmutableMap.of();
   private final erx e;
   private final fht f;
   public cqb a;
   public eqa b;
   public ehf c;
   private final Supplier<fou> g;
   private final Supplier<fub> h;
   private final Supplier<ftb> i;

   public fpz(erx $$0, fht $$1, Supplier<fou> $$2, Supplier<fub> $$3, Supplier<ftb> $$4) {
      this.h = $$3;
      this.i = $$4;
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   @Nullable
   public <E extends dcz> fqa<E> a(E $$0) {
      return (fqa<E>)this.d.get($$0.u());
   }

   public void a(cqb $$0, eqa $$1, ehf $$2) {
      if (this.a != $$0) {
         this.a($$0);
      }

      this.b = $$1;
      this.c = $$2;
   }

   public <E extends dcz> void a(E $$0, float $$1, elj $$2, foa $$3) {
      fqa<E> $$4 = this.a($$0);
      if ($$4 != null) {
         if ($$0.l() && $$0.u().a($$0.q())) {
            if ($$4.a($$0, this.b.b())) {
               a($$0, () -> a($$4, $$0, $$1, $$2, $$3));
            }
         }
      }
   }

   private static <T extends dcz> void a(fqa<T> $$0, T $$1, float $$2, elj $$3, foa $$4) {
      cqb $$5 = $$1.k();
      int $$6;
      if ($$5 != null) {
         $$6 = fny.a($$5, $$1.p());
      } else {
         $$6 = 15728880;
      }

      $$0.a($$1, $$2, $$3, $$4, $$6, fyr.d);
   }

   public <E extends dcz> boolean a(E $$0, elj $$1, foa $$2, int $$3, int $$4) {
      fqa<E> $$5 = this.a($$0);
      if ($$5 == null) {
         return true;
      } else {
         a($$0, () -> $$5.a($$0, 0.0F, $$1, $$2, $$3, $$4));
         return false;
      }
   }

   private static void a(dcz $$0, Runnable $$1) {
      try {
         $$1.run();
      } catch (Throwable var5) {
         o $$3 = o.a(var5, "Rendering Block Entity");
         p $$4 = $$3.a("Block Entity Details");
         $$0.a($$4);
         throw new y($$3);
      }
   }

   public void a(@Nullable cqb $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.b = null;
      }
   }

   @Override
   public void a(anw $$0) {
      fqb.a $$1 = new fqb.a(this, this.g.get(), this.h.get(), this.i.get(), this.f, this.e);
      this.d = fqc.a($$1);
   }
}
