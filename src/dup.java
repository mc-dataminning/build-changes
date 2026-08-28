import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dup {
   private static final Logger d = LogUtils.getLogger();
   private final dur<?> e;
   @Nullable
   protected dha o;
   protected final jh p;
   protected boolean q;
   private dxn f;
   private kq g = kq.a;

   public dup(dur<?> $$0, jh $$1, dxn $$2) {
      this.e = $$0;
      this.p = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dxn $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.p + ", got " + $$0);
      }
   }

   public boolean b(dxn $$0) {
      return this.e.a($$0);
   }

   public static jh b(ux $$0) {
      return new jh($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dha i() {
      return this.o;
   }

   public void a(dha $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   protected void a(ux $$0, js.a $$1) {
   }

   public final void c(ux $$0, js.a $$1) {
      this.a($$0, $$1);
      dup.a.a.parse($$1.a(vl.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ux $$0, js.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ux $$0, js.a $$1) {
   }

   public final ux b(js.a $$0) {
      ux $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ux c(js.a $$0) {
      ux $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ux d(js.a $$0) {
      ux $$1 = new ux();
      this.b($$1, $$0);
      dup.a.a.encodeStart($$0.a(vl.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ux)$$1x));
      return $$1;
   }

   public final ux e(js.a $$0) {
      ux $$1 = new ux();
      this.b($$1, $$0);
      return $$1;
   }

   public final ux f(js.a $$0) {
      ux $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ux $$0) {
      alz $$1 = dur.a(this.q());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ux $$0, dur<?> $$1) {
      $$0.a("id", dur.a($$1).toString());
   }

   public void a(cxk $$0, js.a $$1) {
      ux $$2 = this.e($$1);
      this.a($$2);
      $$0.c();
      cvq.a($$0, this.q(), $$2);
      $$0.b(this.r());
   }

   private void d(ux $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static dup a(jh $$0, dxn $$1, ux $$2, js.a $$3) {
      String $$4 = $$2.l("id");
      alz $$5 = alz.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return ma.j.b($$5).map($$3x -> {
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

   protected static void a(dha $$0, jh $$1, dxn $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public jh aB_() {
      return this.p;
   }

   public dxn m() {
      return this.f;
   }

   @Nullable
   public aac<acr> ay_() {
      return null;
   }

   public ux a(js.a $$0) {
      return new ux();
   }

   public boolean n() {
      return this.q;
   }

   public void aw_() {
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
      return ma.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean p() {
      return false;
   }

   public dur<?> q() {
      return this.e;
   }

   @Deprecated
   public void c(dxn $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(dup.b $$0) {
   }

   public final void a(cxk $$0) {
      this.a($$0.d(), $$0.e());
   }

   public final void a(kq $$0, kr $$1) {
      final Set<kt<?>> $$2 = new HashSet<>();
      $$2.add(ku.Y);
      final kq $$3 = kv.a($$0, $$1);
      this.a(new dup.b() {
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
   public void a(ux $$0) {
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
   public static xv a(String $$0, js.a $$1) {
      try {
         return xv.a.a($$0, $$1);
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
