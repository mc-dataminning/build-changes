import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dsy {
   private static final Logger d = LogUtils.getLogger();
   private final dta<?> e;
   @Nullable
   protected dfm o;
   protected final jh p;
   protected boolean q;
   private dvv f;
   private kq g = kq.a;

   public dsy(dta<?> $$0, jh $$1, dvv $$2) {
      this.e = $$0;
      this.p = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dvv $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.p + ", got " + $$0);
      }
   }

   public boolean b(dvv $$0) {
      return this.e.a($$0);
   }

   public static jh b(ul $$0) {
      return new jh($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dfm i() {
      return this.o;
   }

   public void a(dfm $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   protected void a(ul $$0, js.a $$1) {
   }

   public final void c(ul $$0, js.a $$1) {
      this.a($$0, $$1);
      dsy.a.a.parse($$1.a(uz.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ul $$0, js.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ul $$0, js.a $$1) {
   }

   public final ul b(js.a $$0) {
      ul $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ul c(js.a $$0) {
      ul $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ul d(js.a $$0) {
      ul $$1 = new ul();
      this.b($$1, $$0);
      dsy.a.a.encodeStart($$0.a(uz.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ul)$$1x));
      return $$1;
   }

   public final ul e(js.a $$0) {
      ul $$1 = new ul();
      this.b($$1, $$0);
      return $$1;
   }

   public final ul f(js.a $$0) {
      ul $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ul $$0) {
      alj $$1 = dta.a(this.q());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ul $$0, dta<?> $$1) {
      $$0.a("id", dta.a($$1).toString());
   }

   public void a(cwm $$0, js.a $$1) {
      ul $$2 = this.e($$1);
      this.a($$2);
      $$0.c();
      cus.a($$0, this.q(), $$2);
      $$0.b(this.r());
   }

   private void d(ul $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dsy a(jh $$0, dvv $$1, ul $$2, js.a $$3) {
      String $$4 = $$2.l("id");
      alj $$5 = alj.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lz.j.b($$5).map($$3x -> {
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
      if (this.o != null) {
         a(this.o, this.p, this.f);
      }
   }

   protected static void a(dfm $$0, jh $$1, dvv $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public jh aA_() {
      return this.p;
   }

   public dvv m() {
      return this.f;
   }

   @Nullable
   public zq<acf> ax_() {
      return null;
   }

   public ul a(js.a $$0) {
      return new ul();
   }

   public boolean n() {
      return this.q;
   }

   public void av_() {
      this.q = true;
   }

   public void o() {
      this.q = false;
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", this::k);
      if (this.o != null) {
         p.a($$0, this.o, this.p, this.m());
         p.a($$0, this.o, this.p, this.o.a_(this.p));
      }
   }

   private String k() {
      return lz.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean p() {
      return false;
   }

   public dta<?> q() {
      return this.e;
   }

   @Deprecated
   public void c(dvv $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(dsy.b $$0) {
   }

   public final void a(cwm $$0) {
      this.a($$0.d(), $$0.e());
   }

   public final void a(kq $$0, kr $$1) {
      final Set<kt<?>> $$2 = new HashSet<>();
      $$2.add(ku.Y);
      final kq $$3 = kv.a($$0, $$1);
      this.a(new dsy.b() {
         @Nullable
         @Override
         public <T> T a(kt<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kt<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kr $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kq.a $$0) {
   }

   @Deprecated
   public void a(ul $$0) {
   }

   public final kq r() {
      kq.a $$0 = kq.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kq s() {
      return this.g;
   }

   public void a(kq $$0) {
      this.g = $$0;
   }

   @Nullable
   public static xj a(String $$0, js.a $$1) {
      try {
         return xj.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<kq> a = kq.b.optionalFieldOf("components", kq.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(kt<T> var1);

      <T> T a(kt<? extends T> var1, T var2);
   }
}
