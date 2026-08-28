import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dpn {
   private static final Logger d = LogUtils.getLogger();
   private final dpp<?> e;
   @Nullable
   protected dcd n;
   protected final ja o;
   protected boolean p;
   private dsh f;
   private kj g = kj.a;

   public dpn(dpp<?> $$0, ja $$1, dsh $$2) {
      this.e = $$0;
      this.o = $$1.i();
      this.f = $$2;
   }

   public static ja b(tx $$0) {
      return new ja($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dcd i() {
      return this.n;
   }

   public void a(dcd $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   protected void a(tx $$0, jl.a $$1) {
   }

   public final void c(tx $$0, jl.a $$1) {
      this.a($$0, $$1);
      dpn.a.a.parse($$1.a(ul.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(tx $$0, jl.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tx $$0, jl.a $$1) {
   }

   public final tx b(jl.a $$0) {
      tx $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tx c(jl.a $$0) {
      tx $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tx d(jl.a $$0) {
      tx $$1 = new tx();
      this.b($$1, $$0);
      dpn.a.a.encodeStart($$0.a(ul.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((tx)$$1x));
      return $$1;
   }

   public final tx e(jl.a $$0) {
      tx $$1 = new tx();
      this.b($$1, $$0);
      return $$1;
   }

   public final tx f(jl.a $$0) {
      tx $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tx $$0) {
      akk $$1 = dpp.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tx $$0, dpp<?> $$1) {
      $$0.a("id", dpp.a($$1).toString());
   }

   public void a(cua $$0, jl.a $$1) {
      tx $$2 = this.e($$1);
      this.a($$2);
      cry.a($$0, this.r(), $$2);
      $$0.b(this.s());
   }

   private void d(tx $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dpn a(ja $$0, dsh $$1, tx $$2, jl.a $$3) {
      String $$4 = $$2.l("id");
      akk $$5 = akk.a($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lq.j.b($$5).map($$3x -> {
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

   protected static void a(dcd $$0, ja $$1, dsh $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ja az_() {
      return this.o;
   }

   public dsh n() {
      return this.f;
   }

   @Nullable
   public zb<abn> av_() {
      return null;
   }

   public tx a(jl.a $$0) {
      return new tx();
   }

   public boolean o() {
      return this.p;
   }

   public void aw_() {
      this.p = true;
   }

   public void p() {
      this.p = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", () -> lq.j.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean q() {
      return false;
   }

   public dpp<?> r() {
      return this.e;
   }

   @Deprecated
   public void b(dsh $$0) {
      this.f = $$0;
   }

   protected void a(dpn.b $$0) {
   }

   public final void a(cua $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kj $$0, kk $$1) {
      final Set<km<?>> $$2 = new HashSet<>();
      $$2.add(kn.O);
      final kj $$3 = ko.a($$0, $$1);
      this.a(new dpn.b() {
         @Nullable
         @Override
         public <T> T a(km<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(km<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kk $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kj.a $$0) {
   }

   @Deprecated
   public void a(tx $$0) {
   }

   public final kj s() {
      kj.a $$0 = kj.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kj t() {
      return this.g;
   }

   public void a(kj $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wu a(String $$0, jl.a $$1) {
      try {
         return wu.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<kj> a = kj.b.optionalFieldOf("components", kj.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(km<T> var1);

      <T> T a(km<? extends T> var1, T var2);
   }
}
