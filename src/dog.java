import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dog {
   private static final Logger d = LogUtils.getLogger();
   private final doi<?> e;
   @Nullable
   protected dax n;
   protected final io o;
   protected boolean p;
   private drb f;
   private jx g = jx.a;

   public dog(doi<?> $$0, io $$1, drb $$2) {
      this.e = $$0;
      this.o = $$1.i();
      this.f = $$2;
   }

   public static io b(ud $$0) {
      return new io($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dax i() {
      return this.n;
   }

   public void a(dax $$0) {
      this.n = $$0;
   }

   public boolean m() {
      return this.n != null;
   }

   protected void a(ud $$0, iz.a $$1) {
   }

   public final void c(ud $$0, iz.a $$1) {
      this.a($$0, $$1);
      dog.a.a.parse($$1.a(ur.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(ud $$0, iz.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ud $$0, iz.a $$1) {
   }

   public final ud b(iz.a $$0) {
      ud $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ud c(iz.a $$0) {
      ud $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ud d(iz.a $$0) {
      ud $$1 = new ud();
      this.b($$1, $$0);
      dog.a.a.encodeStart($$0.a(ur.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((ud)$$1x));
      return $$1;
   }

   public final ud e(iz.a $$0) {
      ud $$1 = new ud();
      this.b($$1, $$0);
      return $$1;
   }

   private void c(ud $$0) {
      akm $$1 = doi.a(this.r());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(ud $$0, doi<?> $$1) {
      $$0.a("id", doi.a($$1).toString());
   }

   public void a(cto $$0, iz.a $$1) {
      ud $$2 = this.e($$1);
      this.a($$2);
      crm.a($$0, this.r(), $$2);
      $$0.a(this.s());
   }

   private void d(ud $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dog a(io $$0, drb $$1, ud $$2, iz.a $$3) {
      String $$4 = $$2.l("id");
      akm $$5 = akm.a($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return le.k.b($$5).map($$3x -> {
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

   protected static void a(dax $$0, io $$1, drb $$2) {
      $$0.q($$1);
      if (!$$2.i()) {
         $$0.c($$1, $$2.b());
      }
   }

   public io az_() {
      return this.o;
   }

   public drb n() {
      return this.f;
   }

   @Nullable
   public ze<abq> av_() {
      return null;
   }

   public ud a(iz.a $$0) {
      return new ud();
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
      $$0.a("Name", () -> le.k.b(this.r()) + " // " + this.getClass().getCanonicalName());
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.n());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   public boolean q() {
      return false;
   }

   public doi<?> r() {
      return this.e;
   }

   @Deprecated
   public void b(drb $$0) {
      this.f = $$0;
   }

   protected void a(dog.b $$0) {
   }

   public final void a(cto $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(jx $$0, jy $$1) {
      final Set<ka<?>> $$2 = new HashSet<>();
      final jx $$3 = kc.a($$0, $$1);
      this.a(new dog.b() {
         @Nullable
         @Override
         public <T> T a(ka<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(ka<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      jy $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(jx.a $$0) {
   }

   @Deprecated
   public void a(ud $$0) {
   }

   public final jx s() {
      jx.a $$0 = jx.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public jx t() {
      return this.g;
   }

   public void a(jx $$0) {
      this.g = $$0;
   }

   static class a {
      public static final Codec<jx> a = jx.b.optionalFieldOf("components", jx.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(ka<T> var1);

      <T> T a(ka<? extends T> var1, T var2);
   }
}
