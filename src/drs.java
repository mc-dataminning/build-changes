import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class drs {
   private static final Logger d = LogUtils.getLogger();
   private final dru<?> e;
   @Nullable
   protected deg o;
   protected final je p;
   protected boolean q;
   private duo f;
   private kn g = kn.a;

   public drs(dru<?> $$0, je $$1, duo $$2) {
      this.e = $$0;
      this.p = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(duo $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.p + ", got " + $$0);
      }
   }

   public boolean b(duo $$0) {
      return this.e.a($$0);
   }

   public static je b(uf $$0) {
      return new je($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public deg i() {
      return this.o;
   }

   public void a(deg $$0) {
      this.o = $$0;
   }

   public boolean l() {
      return this.o != null;
   }

   protected void a(uf $$0, jp.a $$1) {
   }

   public final void c(uf $$0, jp.a $$1) {
      this.a($$0, $$1);
      drs.a.a.parse($$1.a(ut.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(uf $$0, jp.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(uf $$0, jp.a $$1) {
   }

   public final uf b(jp.a $$0) {
      uf $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final uf c(jp.a $$0) {
      uf $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final uf d(jp.a $$0) {
      uf $$1 = new uf();
      this.b($$1, $$0);
      drs.a.a.encodeStart($$0.a(ut.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((uf)$$1x));
      return $$1;
   }

   public final uf e(jp.a $$0) {
      uf $$1 = new uf();
      this.b($$1, $$0);
      return $$1;
   }

   public final uf f(jp.a $$0) {
      uf $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(uf $$0) {
      alc $$1 = dru.a(this.q());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(uf $$0, dru<?> $$1) {
      $$0.a("id", dru.a($$1).toString());
   }

   public void a(cvp $$0, jp.a $$1) {
      uf $$2 = this.e($$1);
      this.a($$2);
      $$0.c();
      ctr.a($$0, this.q(), $$2);
      $$0.b(this.r());
   }

   private void d(uf $$0) {
      this.c($$0);
      $$0.a("x", this.p.u());
      $$0.a("y", this.p.v());
      $$0.a("z", this.p.w());
   }

   @Nullable
   public static drs a(je $$0, duo $$1, uf $$2, jp.a $$3) {
      String $$4 = $$2.l("id");
      alc $$5 = alc.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return lu.j.b($$5).map($$3x -> {
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

   protected static void a(deg $$0, je $$1, duo $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public je aB_() {
      return this.p;
   }

   public duo m() {
      return this.f;
   }

   @Nullable
   public zk<abz> ay_() {
      return null;
   }

   public uf a(jp.a $$0) {
      return new uf();
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
      return lu.j.b(this.q()) + " // " + this.getClass().getCanonicalName();
   }

   public boolean p() {
      return false;
   }

   public dru<?> q() {
      return this.e;
   }

   @Deprecated
   public void c(duo $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(drs.b $$0) {
   }

   public final void a(cvp $$0) {
      this.a($$0.d(), $$0.e());
   }

   public final void a(kn $$0, ko $$1) {
      final Set<kq<?>> $$2 = new HashSet<>();
      $$2.add(kr.T);
      final kn $$3 = ks.a($$0, $$1);
      this.a(new drs.b() {
         @Nullable
         @Override
         public <T> T a(kq<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kq<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      ko $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kn.a $$0) {
   }

   @Deprecated
   public void a(uf $$0) {
   }

   public final kn r() {
      kn.a $$0 = kn.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kn s() {
      return this.g;
   }

   public void a(kn $$0) {
      this.g = $$0;
   }

   @Nullable
   public static xd a(String $$0, jp.a $$1) {
      try {
         return xd.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<kn> a = kn.b.optionalFieldOf("components", kn.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(kq<T> var1);

      <T> T a(kq<? extends T> var1, T var2);
   }
}
