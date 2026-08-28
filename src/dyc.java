import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dyc {
   private static final Codec<dye<?>> d = mg.j.q();
   private static final Logger e = LogUtils.getLogger();
   private final dye<?> f;
   @Nullable
   protected djx n;
   protected final iv o;
   protected boolean p;
   private ebe g;
   private kh h = kh.a;

   public dyc(dye<?> $$0, iv $$1, ebe $$2) {
      this.f = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.g = $$2;
   }

   private void a(ebe $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(ebe $$0) {
      return this.f.a($$0);
   }

   public static iv b(tz $$0) {
      return new iv($$0.b("x", 0), $$0.b("y", 0), $$0.b("z", 0));
   }

   @Nullable
   public djx i() {
      return this.n;
   }

   public void a(djx $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(tz $$0, jh.a $$1) {
   }

   public final void c(tz $$0, jh.a $$1) {
      this.a($$0, $$1);
      this.h = $$0.<kh>a(dyc.a.a, $$1.a(un.a)).orElse(kh.a);
   }

   public final void d(tz $$0, jh.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tz $$0, jh.a $$1) {
   }

   public final tz b(jh.a $$0) {
      tz $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tz c(jh.a $$0) {
      tz $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tz d(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      $$1.a(dyc.a.a, $$0.a(un.a), this.h);
      return $$1;
   }

   public final tz e(jh.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   public final tz f(jh.a $$0) {
      tz $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tz $$0) {
      a($$0, this.p());
   }

   public static void a(tz $$0, dye<?> $$1) {
      $$0.a("id", d, $$1);
   }

   private void d(tz $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dyc a(iv $$0, ebe $$1, tz $$2, jh.a $$3) {
      dye<?> $$4 = $$2.<dye<?>>a("id", d).orElse(null);
      if ($$4 == null) {
         e.error("Skipping block entity with invalid type: {}", $$2.a("id"));
         return null;
      } else {
         dyc $$5;
         try {
            $$5 = $$4.a($$0, $$1);
         } catch (Throwable var8) {
            e.error("Failed to create block entity {}", $$4, var8);
            return null;
         }

         if ($$5 == null) {
            return null;
         } else {
            try {
               $$5.c($$2, $$3);
               return $$5;
            } catch (Throwable var7) {
               e.error("Failed to load data for block entity {}", $$4, var7);
               return null;
            }
         }
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.g);
      }
   }

   protected static void a(djx $$0, iv $$1, ebe $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public iv aB_() {
      return this.o;
   }

   public ebe m() {
      return this.g;
   }

   @Nullable
   public zh<abw> ay_() {
      return null;
   }

   public tz a(jh.a $$0) {
      return new tz();
   }

   public boolean n() {
      return this.p;
   }

   public void aw_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
   }

   public void a(iv $$0, ebe $$1) {
      if (this instanceof buk $$2 && this.n != null) {
         bun.a(this.n, $$0, $$2);
      }
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Name", this::k);
      if (this.n != null) {
         q.a($$0, this.n, this.o, this.m());
         q.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   private String k() {
      return mg.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public dye<?> p() {
      return this.f;
   }

   @Deprecated
   public void c(ebe $$0) {
      this.a($$0);
      this.g = $$0;
   }

   protected void a(kf $$0) {
   }

   public final void a(czy $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kh $$0, ki $$1) {
      final Set<kj<?>> $$2 = new HashSet<>();
      $$2.add(kk.aa);
      $$2.add(kk.aq);
      final kh $$3 = kl.a($$0, $$1);
      this.a(new kf() {
         @Nullable
         @Override
         public <T> T a(kj<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kj<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      ki $$4 = $$1.a($$2::contains);
      this.h = $$4.e().a();
   }

   protected void a(kh.a $$0) {
   }

   @Deprecated
   public void a(tz $$0) {
   }

   public final kh q() {
      kh.a $$0 = kh.a();
      $$0.a(this.h);
      this.a($$0);
      return $$0.a();
   }

   public kh r() {
      return this.h;
   }

   public void a(kh $$0) {
      this.h = $$0;
   }

   @Nullable
   public static xa a(@Nullable uy $$0, jh.a $$1) {
      return $$0 == null
         ? null
         : (xa)xc.a.parse($$1.a(un.a), $$0).resultOrPartial($$0x -> e.warn("Failed to parse custom name, discarding: {}", $$0x)).orElse(null);
   }

   static class a {
      public static final MapCodec<kh> a = kh.b.optionalFieldOf("components", kh.a);

      private a() {
      }
   }
}
