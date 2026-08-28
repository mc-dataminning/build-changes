import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dua {
   private static final Logger d = LogUtils.getLogger();
   private final duc<?> e;
   @Nullable
   protected dgj n;
   protected final ji o;
   protected boolean p;
   private dwy f;
   private kr g = kr.a;

   public dua(duc<?> $$0, ji $$1, dwy $$2) {
      this.e = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dwy $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(dwy $$0) {
      return this.e.a($$0);
   }

   public static ji b(tq $$0) {
      return new ji($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dgj i() {
      return this.n;
   }

   public void a(dgj $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(tq $$0, jt.a $$1) {
   }

   public final void c(tq $$0, jt.a $$1) {
      this.a($$0, $$1);
      dua.a.a.parse($$1.a(ue.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(tq $$0, jt.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tq $$0, jt.a $$1) {
   }

   public final tq b(jt.a $$0) {
      tq $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tq c(jt.a $$0) {
      tq $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tq d(jt.a $$0) {
      tq $$1 = new tq();
      this.b($$1, $$0);
      dua.a.a.encodeStart($$0.a(ue.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((tq)$$1x));
      return $$1;
   }

   public final tq e(jt.a $$0) {
      tq $$1 = new tq();
      this.b($$1, $$0);
      return $$1;
   }

   public final tq f(jt.a $$0) {
      tq $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tq $$0) {
      akv $$1 = duc.a(this.p());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tq $$0, duc<?> $$1) {
      $$0.a("id", duc.a($$1).toString());
   }

   private void d(tq $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dua a(ji $$0, dwy $$1, tq $$2, jt.a $$3) {
      String $$4 = $$2.l("id");
      akv $$5 = akv.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return mb.j.b($$5).map($$3x -> {
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

   protected static void a(dgj $$0, ji $$1, dwy $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.c($$1, $$2.b());
      }
   }

   public ji aA_() {
      return this.o;
   }

   public dwy m() {
      return this.f;
   }

   @Nullable
   public yw<abl> ax_() {
      return null;
   }

   public tq a(jt.a $$0) {
      return new tq();
   }

   public boolean n() {
      return this.p;
   }

   public void av_() {
      this.p = true;
   }

   public void o() {
      this.p = false;
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
      return mb.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public duc<?> p() {
      return this.e;
   }

   @Deprecated
   public void c(dwy $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(dua.b $$0) {
   }

   public final void a(cwq $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kr $$0, ks $$1) {
      final Set<ku<?>> $$2 = new HashSet<>();
      $$2.add(kv.Y);
      $$2.add(kv.am);
      final kr $$3 = kw.a($$0, $$1);
      this.a(new dua.b() {
         @Nullable
         @Override
         public <T> T a(ku<T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(ku<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      ks $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kr.a $$0) {
   }

   @Deprecated
   public void a(tq $$0) {
   }

   public final kr q() {
      kr.a $$0 = kr.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kr r() {
      return this.g;
   }

   public void a(kr $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wp a(String $$0, jt.a $$1) {
      try {
         return wp.a.a($$0, $$1);
      } catch (Exception var3) {
         d.warn("Failed to parse custom name from string '{}', discarding", $$0, var3);
         return null;
      }
   }

   static class a {
      public static final Codec<kr> a = kr.b.optionalFieldOf("components", kr.a).codec();

      private a() {
      }
   }

   protected interface b {
      @Nullable
      <T> T a(ku<T> var1);

      <T> T a(ku<? extends T> var1, T var2);
   }
}
