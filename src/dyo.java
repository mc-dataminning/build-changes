import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dyo {
   private static final Codec<dyq<?>> d = mh.j.q();
   private static final Logger e = LogUtils.getLogger();
   private final dyq<?> f;
   @Nullable
   protected dkj n;
   protected final iw o;
   protected boolean p;
   private ebq g;
   private ki h = ki.a;

   public dyo(dyq<?> $$0, iw $$1, ebq $$2) {
      this.f = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.g = $$2;
   }

   private void a(ebq $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(ebq $$0) {
      return this.f.a($$0);
   }

   public static iw a(djo $$0, ua $$1) {
      int $$2 = $$1.b("x", 0);
      int $$3 = $$1.b("y", 0);
      int $$4 = $$1.b("z", 0);
      int $$5 = jz.a($$2);
      int $$6 = jz.a($$4);
      if ($$5 != $$0.h || $$6 != $$0.i) {
         e.warn("Block entity {} found in a wrong chunk, expected position from chunk {}", $$1, $$0);
         $$2 = $$0.a(jz.b($$2));
         $$4 = $$0.b(jz.b($$4));
      }

      return new iw($$2, $$3, $$4);
   }

   @Nullable
   public dkj i() {
      return this.n;
   }

   public void a(dkj $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(ua $$0, ji.a $$1) {
   }

   public final void c(ua $$0, ji.a $$1) {
      this.a($$0, $$1);
      this.h = $$0.<ki>a(dyo.a.a, $$1.a(uo.a)).orElse(ki.a);
   }

   public final void d(ua $$0, ji.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(ua $$0, ji.a $$1) {
   }

   public final ua b(ji.a $$0) {
      ua $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final ua c(ji.a $$0) {
      ua $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final ua d(ji.a $$0) {
      ua $$1 = new ua();
      this.b($$1, $$0);
      $$1.a(dyo.a.a, $$0.a(uo.a), this.h);
      return $$1;
   }

   public final ua e(ji.a $$0) {
      ua $$1 = new ua();
      this.b($$1, $$0);
      return $$1;
   }

   public final ua f(ji.a $$0) {
      ua $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(ua $$0) {
      a($$0, this.p());
   }

   public static void a(ua $$0, dyq<?> $$1) {
      $$0.a("id", d, $$1);
   }

   private void d(ua $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dyo a(iw $$0, ebq $$1, ua $$2, ji.a $$3) {
      dyq<?> $$4 = $$2.<dyq<?>>a("id", d).orElse(null);
      if ($$4 == null) {
         e.error("Skipping block entity with invalid type: {}", $$2.a("id"));
         return null;
      } else {
         dyo $$5;
         try {
            $$5 = $$4.a($$0, $$1);
         } catch (Throwable var8) {
            e.error("Failed to create block entity {} for block {} at position {} ", new Object[]{$$4, $$0, $$1, var8});
            return null;
         }

         try {
            $$5.c($$2, $$3);
            return $$5;
         } catch (Throwable var7) {
            e.error("Failed to load data for block entity {} for block {} at position {}", new Object[]{$$4, $$0, $$1, var7});
            return null;
         }
      }
   }

   public void e() {
      if (this.n != null) {
         a(this.n, this.o, this.g);
      }
   }

   protected static void a(dkj $$0, iw $$1, ebq $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public iw aC_() {
      return this.o;
   }

   public ebq m() {
      return this.g;
   }

   @Nullable
   public zo<acf> az_() {
      return null;
   }

   public ua a(ji.a $$0) {
      return new ua();
   }

   public boolean n() {
      return this.p;
   }

   public void ax_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
   }

   public void a(iw $$0, ebq $$1) {
      if (this instanceof buv $$2 && this.n != null) {
         buy.a(this.n, $$0, $$2);
      }
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(q $$0) {
      $$0.a("Name", this::k);
      $$0.a("Cached block", this.m()::toString);
      if (this.n == null) {
         $$0.a("Block location", () -> this.o + " (world missing)");
      } else {
         $$0.a("Actual block", this.n.a_(this.o)::toString);
         q.a($$0, this.n, this.o);
      }
   }

   private String k() {
      return mh.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public dyq<?> p() {
      return this.f;
   }

   @Deprecated
   public void c(ebq $$0) {
      this.a($$0);
      this.g = $$0;
   }

   protected void a(kg $$0) {
   }

   public final void a(dak $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(ki $$0, kj $$1) {
      final Set<kk<?>> $$2 = new HashSet<>();
      $$2.add(kl.aa);
      $$2.add(kl.aq);
      final ki $$3 = km.a($$0, $$1);
      this.a(new kg() {
         @Nullable
         @Override
         public <T> T a(kk<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kk<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kj $$4 = $$1.a($$2::contains);
      this.h = $$4.e().a();
   }

   protected void a(ki.a $$0) {
   }

   @Deprecated
   public void a(ua $$0) {
   }

   public final ki q() {
      ki.a $$0 = ki.a();
      $$0.a(this.h);
      this.a($$0);
      return $$0.a();
   }

   public ki r() {
      return this.h;
   }

   public void a(ki $$0) {
      this.h = $$0;
   }

   @Nullable
   public static xg a(@Nullable va $$0, ji.a $$1) {
      return $$0 == null
         ? null
         : (xg)xi.a.parse($$1.a(uo.a), $$0).resultOrPartial($$0x -> e.warn("Failed to parse custom name, discarding: {}", $$0x)).orElse(null);
   }

   static class a {
      public static final MapCodec<ki> a = ki.b.optionalFieldOf("components", ki.a);

      private a() {
      }
   }
}
