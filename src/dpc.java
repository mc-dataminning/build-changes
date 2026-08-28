import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dpc {
   private static final Logger d = LogUtils.getLogger();
   private final dpe<?> e;
   @Nullable
   protected dbt n;
   protected final iz o;
   protected boolean p;
   private drx f;
   private ki g = ki.a;

   public dpc(dpe<?> $$0, iz $$1, drx $$2) {
      this.e = $$0;
      this.o = $$1.i();
      this.f = $$2;
   }

   public static iz b(ur $$0) {
      return new iz($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dbt i() {
      return this.n;
   }

   public void a(dbt $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   protected void a(ur $$0, jk.a $$1) {
   }

   public final void c(ur $$0, jk.a $$1) {
      this.a($$0, $$1);
      dpc.a.a.parse($$1.a(vf.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ur $$0, jk.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ur $$0, jk.a $$1) {
   }

   public final ur b(jk.a $$0) {
      ur $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ur c(jk.a $$0) {
      ur $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ur d(jk.a $$0) {
      ur $$1 = new ur();
      this.b($$1, $$0);
      dpc.a.a.encodeStart($$0.a(vf.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ur)$$1x));
      return $$1;
   }

   public final ur e(jk.a $$0) {
      ur $$1 = new ur();
      this.b($$1, $$0);
      return $$1;
   }

   public final ur f(jk.a $$0) {
      ur $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ur $$0) {
      alb $$1 = dpe.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ur $$0, dpe<?> $$1) {
      $$0.a("id", dpe.a($$1).toString());
   }

   public void a(cuk $$0, jk.a $$1) {
      ur $$2 = this.e($$1);
      this.a($$2);
      csi.a($$0, this.r(), $$2);
      $$0.b(this.s());
   }

   private void d(ur $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dpc a(iz $$0, drx $$1, ur $$2, jk.a $$3) {
      String $$4 = $$2.l("id");
      alb $$5 = alb.a($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lp.k.b($$5).map($$3x -> {
            try {
               return $$3x.a($$0, $$1);
            } catch (Throwable var5x) {
               d.error("Failed to create block entity {}", $$4, var5x);
               return null;
            }
         }).map($$3x -> {
            try {
               $$3x.c($$2, $$3);
               return $$3x;
            } catch (Throwable var5x) {
               d.error("Failed to load data for block entity {}", $$4, var5x);
               return null;
            }
         }).orElseGet(() -> {
            d.warn("Skipping BlockEntity with id {}", $$4);
            return null;
         });
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.f);
      }
   }

   protected static void a(dbt $$0, iz $$1, drx $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public iz aA_() {
      return this.o;
   }

   public drx n() {
      return this.f;
   }

   @Nullable
   public zs<ace> aw_() {
      return null;
   }

   public ur a(jk.a $$0) {
      return new ur();
   }

   public boolean o() {
      return this.p;
   }

   public void ax_() {
      this.p = true;
   }

   public void p() {
      this.p = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> lp.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean q() {
      return false;
   }

   public dpe<?> r() {
      return this.e;
   }

   @Deprecated
   public void b(drx $$0) {
      this.f = $$0;
   }

   protected void a(dpc.b $$0) {
   }

   public final void a(cuk $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(ki $$0, kj $$1) {
      final Set<kl<?>> $$2 = new HashSet<>();
      final ki $$3 = kn.a($$0, $$1);
      this.a(new dpc.b() {
         @Nullable
         @Override
         public <T> T a(kl<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kl<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kj $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(ki.a $$0) {
   }

   @Deprecated
   public void a(ur $$0) {
   }

   public final ki s() {
      ki.a $$0 = ki.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public ki t() {
      return this.g;
   }

   public void a(ki $$0) {
      this.g = $$0;
   }

   static class a {
      public static final Codec<ki> a = ki.b.optionalFieldOf("components", ki.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(kl<T> var1);

      <T> T a(kl<? extends T> var1, T var2);
   }
}
