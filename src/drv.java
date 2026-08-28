import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class drv {
   private static final Logger d = LogUtils.getLogger();
   private final drx<?> e;
   @Nullable
   protected dej o;
   protected final jf p;
   protected boolean q;
   private dus f;
   private ko g = ko.a;

   public drv(drx<?> $$0, jf $$1, dus $$2) {
      this.e = $$0;
      this.p = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dus $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.p + ", got " + $$0);
      }
   }

   public boolean b(dus $$0) {
      return this.e.a($$0);
   }

   public static jf b(ug $$0) {
      return new jf($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dej i() {
      return this.o;
   }

   public void a(dej $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   protected void a(ug $$0, jq.a $$1) {
   }

   public final void c(ug $$0, jq.a $$1) {
      this.a($$0, $$1);
      drv.a.a.parse($$1.a(uu.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ug $$0, jq.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ug $$0, jq.a $$1) {
   }

   public final ug b(jq.a $$0) {
      ug $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ug c(jq.a $$0) {
      ug $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ug d(jq.a $$0) {
      ug $$1 = new ug();
      this.b($$1, $$0);
      drv.a.a.encodeStart($$0.a(uu.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ug)$$1x));
      return $$1;
   }

   public final ug e(jq.a $$0) {
      ug $$1 = new ug();
      this.b($$1, $$0);
      return $$1;
   }

   public final ug f(jq.a $$0) {
      ug $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ug $$0) {
      ale $$1 = drx.a(this.q());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ug $$0, drx<?> $$1) {
      $$0.a("id", drx.a($$1).toString());
   }

   public void a(cvs $$0, jq.a $$1) {
      ug $$2 = this.e($$1);
      this.a($$2);
      $$0.c();
      ctu.a($$0, this.q(), $$2);
      $$0.b(this.r());
   }

   private void d(ug $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static drv a(jf $$0, dus $$1, ug $$2, jq.a $$3) {
      String $$4 = $$2.l("id");
      ale $$5 = ale.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lv.j.b($$5).map($$3x -> {
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

   protected static void a(dej $$0, jf $$1, dus $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public jf aC_() {
      return this.p;
   }

   public dus m() {
      return this.f;
   }

   @Nullable
   public zl<aca> az_() {
      return null;
   }

   public ug a(jq.a $$0) {
      return new ug();
   }

   public boolean n() {
      return this.q;
   }

   public void ax_() {
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
      return lv.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean p() {
      return false;
   }

   public drx<?> q() {
      return this.e;
   }

   @Deprecated
   public void c(dus $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(drv.b $$0) {
   }

   public final void a(cvs $$0) {
      this.a($$0.d(), $$0.e());
   }

   public final void a(ko $$0, kp $$1) {
      final Set<kr<?>> $$2 = new HashSet<>();
      $$2.add(ks.T);
      final ko $$3 = kt.a($$0, $$1);
      this.a(new drv.b() {
         @Nullable
         @Override
         public <T> T a(kr<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kr<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kp $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(ko.a $$0) {
   }

   @Deprecated
   public void a(ug $$0) {
   }

   public final ko r() {
      ko.a $$0 = ko.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public ko s() {
      return this.g;
   }

   public void a(ko $$0) {
      this.g = $$0;
   }

   @Nullable
   public static xe a(String $$0, jq.a $$1) {
      try {
         return xe.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<ko> a = ko.b.optionalFieldOf("components", ko.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(kr<T> var1);

      <T> T a(kr<? extends T> var1, T var2);
   }
}
