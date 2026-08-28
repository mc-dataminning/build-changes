import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dvl {
   private static final Logger d = LogUtils.getLogger();
   private final dvn<?> e;
   @Nullable
   protected dhp n;
   protected final jj o;
   protected boolean p;
   private dym f;
   private kt g = kt.a;

   public dvl(dvn<?> $$0, jj $$1, dym $$2) {
      this.e = $$0;
      this.o = $$1.j();
      this.a($$2);
      this.f = $$2;
   }

   private void a(dym $$0) {
      if (!this.b($$0)) {
         throw new IllegalStateException("Invalid block entity " + this.k() + " state at " + this.o + ", got " + $$0);
      }
   }

   public boolean b(dym $$0) {
      return this.e.a($$0);
   }

   public static jj b(tw $$0) {
      return new jj($$0.h("x"), $$0.h("y"), $$0.h("z"));
   }

   @Nullable
   public dhp i() {
      return this.n;
   }

   public void a(dhp $$0) {
      this.n = $$0;
   }

   public boolean l() {
      return this.n != null;
   }

   protected void a(tw $$0, ju.a $$1) {
   }

   public final void c(tw $$0, ju.a $$1) {
      this.a($$0, $$1);
      dvl.a.a.parse($$1.a(uk.a), $$0).resultOrPartial($$0x -> d.warn("Failed to load components: {}", $$0x)).ifPresent($$0x -> this.g = $$0x);
   }

   public final void d(tw $$0, ju.a $$1) {
      this.a($$0, $$1);
   }

   protected void b(tw $$0, ju.a $$1) {
   }

   public final tw b(ju.a $$0) {
      tw $$1 = this.d($$0);
      this.d($$1);
      return $$1;
   }

   public final tw c(ju.a $$0) {
      tw $$1 = this.d($$0);
      this.c($$1);
      return $$1;
   }

   public final tw d(ju.a $$0) {
      tw $$1 = new tw();
      this.b($$1, $$0);
      dvl.a.a.encodeStart($$0.a(uk.a), this.g).resultOrPartial($$0x -> d.warn("Failed to save components: {}", $$0x)).ifPresent($$1x -> $$1.a((tw)$$1x));
      return $$1;
   }

   public final tw e(ju.a $$0) {
      tw $$1 = new tw();
      this.b($$1, $$0);
      return $$1;
   }

   public final tw f(ju.a $$0) {
      tw $$1 = this.e($$0);
      this.d($$1);
      return $$1;
   }

   private void c(tw $$0) {
      ald $$1 = dvn.a(this.p());
      if ($$1 == null) {
         throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
      } else {
         $$0.a("id", $$1.toString());
      }
   }

   public static void a(tw $$0, dvn<?> $$1) {
      $$0.a("id", dvn.a($$1).toString());
   }

   private void d(tw $$0) {
      this.c($$0);
      $$0.a("x", this.o.u());
      $$0.a("y", this.o.v());
      $$0.a("z", this.o.w());
   }

   @Nullable
   public static dvl a(jj $$0, dym $$1, tw $$2, ju.a $$3) {
      String $$4 = $$2.l("id");
      ald $$5 = ald.c($$4);
      if ($$5 == null) {
         d.error("Block entity has invalid type: {}", $$4);
         return null;
      } else {
         return md.j.b($$5).map($$3x -> {
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

   protected static void a(dhp $$0, jj $$1, dym $$2) {
      $$0.q($$1);
      if (!$$2.l()) {
         $$0.b($$1, $$2.b());
      }
   }

   public jj aw_() {
      return this.o;
   }

   public dym m() {
      return this.f;
   }

   @Nullable
   public zc<abr> at_() {
      return null;
   }

   public tw a(ju.a $$0) {
      return new tw();
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

   public void a(jj $$0, dym $$1) {
      if (this instanceof btj $$2 && this.n != null) {
         btm.a(this.n, $$0, $$2);
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
      return md.j.b(this.p()) + " // " + this.getClass().getCanonicalName();
   }

   public dvn<?> p() {
      return this.e;
   }

   @Deprecated
   public void c(dym $$0) {
      this.a($$0);
      this.f = $$0;
   }

   protected void a(kr $$0) {
   }

   public final void a(cxy $$0) {
      this.a($$0.c(), $$0.d());
   }

   public final void a(kt $$0, ku $$1) {
      final Set<kw<?>> $$2 = new HashSet<>();
      $$2.add(kx.aa);
      $$2.add(kx.ao);
      final kt $$3 = ky.a($$0, $$1);
      this.a(new kr() {
         @Nullable
         @Override
         public <T> T a(kw<? extends T> $$0) {
            $$2.add($$0);
            return $$3.a($$0);
         }

         @Override
         public <T> T a(kw<? extends T> $$0, T $$1) {
            $$2.add($$0);
            return $$3.a($$0, $$1);
         }
      });
      ku $$4 = $$1.a($$2::contains);
      this.g = $$4.e().a();
   }

   protected void a(kt.a $$0) {
   }

   @Deprecated
   public void a(tw $$0) {
   }

   public final kt q() {
      kt.a $$0 = kt.a();
      $$0.a(this.g);
      this.a($$0);
      return $$0.a();
   }

   public kt r() {
      return this.g;
   }

   public void a(kt $$0) {
      this.g = $$0;
   }

   @Nullable
   public static wv a(@Nullable ut $$0, ju.a $$1) {
      return $$0 == null
         ? null
         : (wv)wx.a.parse($$1.a(uk.a), $$0).resultOrPartial($$0x -> d.warn("Failed to parse custom name, discarding: {}", $$0x)).orElse(null);
   }

   static class a {
      public static final Codec<kt> a = kt.b.optionalFieldOf("components", kt.a).codec();

      private a() {
      }
   }
}
