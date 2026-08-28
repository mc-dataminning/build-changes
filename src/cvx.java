import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cvx {
   static final aku a = a("items");
   private final wp b;
   aku c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cvx.f g;
   private final int h;
   private final cvx.h i;
   @Nullable
   private cxh j;
   private Collection<cxh> k = cxi.a();
   private Set<cxh> l = cxi.a();
   private final Supplier<cxh> m;
   private final cvx.b n;

   cvx(cvx.f $$0, int $$1, cvx.h $$2, wp $$3, Supplier<cxh> $$4, cvx.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static aku a(String $$0) {
      return aku.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cvx.a a(cvx.f $$0, int $$1) {
      return new cvx.a($$0, $$1);
   }

   public wp a() {
      return this.b;
   }

   public cxh b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public aku c() {
      return this.c;
   }

   public boolean d() {
      return this.e;
   }

   public boolean e() {
      return this.d;
   }

   public int f() {
      return this.h;
   }

   public cvx.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cvx.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cvx.h k() {
      return this.i;
   }

   public void a(cvx.d $$0) {
      cvx.c $$1 = new cvx.c(this, $$0.a);
      akt<cvx> $$2 = mb.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cxh> l() {
      return this.k;
   }

   public Collection<cxh> m() {
      return this.l;
   }

   public boolean a(cxh $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cvx.b a = ($$0, $$1) -> {
      };
      private final cvx.f b;
      private final int c;
      private wp d = wp.i();
      private Supplier<cxh> e = () -> cxh.k;
      private cvx.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cvx.h j = cvx.h.a;
      private aku k = cvx.a;

      public a(cvx.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cvx.a a(wp $$0) {
         this.d = $$0;
         return this;
      }

      public cvx.a a(Supplier<cxh> $$0) {
         this.e = $$0;
         return this;
      }

      public cvx.a a(cvx.b $$0) {
         this.f = $$0;
         return this;
      }

      public cvx.a a() {
         this.i = true;
         return this;
      }

      public cvx.a b() {
         this.h = false;
         return this;
      }

      public cvx.a c() {
         this.g = false;
         return this;
      }

      protected cvx.a a(cvx.h $$0) {
         this.j = $$0;
         return this;
      }

      public cvx.a a(aku $$0) {
         this.k = $$0;
         return this;
      }

      public cvx d() {
         if ((this.j == cvx.h.c || this.j == cvx.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cvx $$0 = new cvx(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.f = this.i;
            $$0.e = this.h;
            $$0.d = this.g;
            $$0.c = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(cvx.d var1, cvx.e var2);
   }

   static class c implements cvx.e {
      public final Collection<cxh> a = cxi.a();
      public final Set<cxh> b = cxi.a();
      private final cvx c;
      private final csn d;

      public c(cvx $$0, csn $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cxh $$0, cvx.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cvx.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.K().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.h().a(this.d)) {
                  switch ($$1) {
                     case a:
                        this.a.add($$0);
                        this.b.add($$0);
                        break;
                     case b:
                        this.a.add($$0);
                        break;
                     case c:
                        this.b.add($$0);
                  }
               }
            }
         }
      }
   }

   public static record d(csn a, boolean b, jt.a c) {

      public boolean a(csn $$0, boolean $$1, jt.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cxh var1, cvx.g var2);

      default void a(cxh $$0) {
         this.a($$0, cvx.g.a);
      }

      default void a(dgy $$0, cvx.g $$1) {
         this.a(new cxh($$0), $$1);
      }

      default void a(dgy $$0) {
         this.a(new cxh($$0), cvx.g.a);
      }

      default void a(Collection<cxh> $$0, cvx.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cxh> $$0) {
         this.a($$0, cvx.g.a);
      }
   }

   public static enum f {
      a,
      b;
   }

   protected static enum g {
      a,
      b,
      c;
   }

   public static enum h {
      a,
      b,
      c,
      d;
   }
}
