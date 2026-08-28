import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dwx {
   private static final Logger d = LogUtils.getLogger();
   private final dwz<?> e;
   @Nullable
   protected div n;
   protected final iu o;
   protected boolean p;
   private dzz f;
   private kg g = kg.a;

   public dwx(dwz<?> $$0, iu $$1, dzz $$2) {
      this.e = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dzz $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(dzz $$0) {
      return this.e.a($$0);
   }

   public static iu b(tz $$0) {
      return new iu($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public div i() {
      return this.n;
   }

   public void a(div $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(tz $$0, jg.a $$1) {
   }

   public final void c(tz $$0, jg.a $$1) {
      this.a($$0, $$1);
      this.g = $$0.<kg>a(dwx.a.a, $$1.a(un.a)).orElse(kg.a);
   }

   public final void d(tz $$0, jg.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tz $$0, jg.a $$1) {
   }

   public final tz b(jg.a $$0) {
      tz $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tz c(jg.a $$0) {
      tz $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tz d(jg.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      $$1.a(dwx.a.a, $$0.a(un.a), this.g);
      return $$1;
   }

   public final tz e(jg.a $$0) {
      tz $$1 = new tz();
      this.b($$1, $$0);
      return $$1;
   }

   public final tz f(jg.a $$0) {
      tz $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tz $$0) {
      alg $$1 = dwz.a(this.p());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tz $$0, dwz<?> $$1) {
      $$0.a("id", dwz.a($$1).toString());
   }

   private void d(tz $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dwx a(iu $$0, dzz $$1, tz $$2, jg.a $$3) {
      String $$4 = $$2.l("id");
      alg $$5 = alg.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return mf.j.b($$5).map($$3x -> {
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

   protected static void a(div $$0, iu $$1, dzz $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public iu aw_() {
      return this.o;
   }

   public dzz m() {
      return this.f;
   }

   @Nullable
   public zf<abu> at_() {
      return null;
   }

   public tz a(jg.a $$0) {
      return new tz();
   }

   public boolean n() {
      return this.p;
   }

   public void ar_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
   }

   public void a(iu $$0, dzz $$1) {
      if (this instanceof btu $$2 && this.n != null) {
         btx.a(this.n, $$0, $$2);
      }
   }

   public boolean a_(int $$0, int $$1) {
      return false;
   }

   public void a(p $$0) {
      $$0.a("Name", this::k);
      if (this.n != null) {
         p.a($$0, this.n, this.o, this.m());
         p.a($$0, this.n, this.o, this.n.a_(this.o));
      }
   }

   private String k() {
      return mf.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public dwz<?> p() {
      return this.e;
   }

   @Deprecated
   public void c(dzz $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(ke $$0) {
   }

   public final void a(cyy $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kg $$0, kh $$1) {
      final Set<ki<?>> $$2 = new HashSet<>();
      $$2.add(kj.aa);
      $$2.add(kj.aq);
      final kg $$3 = kk.a($$0, $$1);
      this.a(new ke() {
         @Nullable
         @Override
         public <T> T a(ki<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(ki<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      kh $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kg.a $$0) {
   }

   @Deprecated
   public void a(tz $$0) {
   }

   public final kg q() {
      kg.a $$0 = kg.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kg r() {
      return this.g;
   }

   public void a(kg $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wy a(@Nullable uw $$0, jg.a $$1) {
      return $$0 == null
         ? null
         : (wy)xa.a.parse($$1.a(un.a), $$0).resultOrPartial($$0x -> d.warn("Failed to parse custom name, discarding: {}", $$0x)).orElse(null);
   }

   static class a {
      public static final MapCodec<kg> a = kg.b.optionalFieldOf("components", kg.a);

      private a() {
      }
   }
}
