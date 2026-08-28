import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cve {
   static final akv a = a("items");
   private final wp b;
   akv c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cve.f g;
   private final int h;
   private final cve.h i;
   @Nullable
   private cwp j;
   private Collection<cwp> k = cwq.a();
   private Set<cwp> l = cwq.a();
   private final Supplier<cwp> m;
   private final cve.b n;

   cve(cve.f $$0, int $$1, cve.h $$2, wp $$3, Supplier<cwp> $$4, cve.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static akv a(String $$0) {
      return akv.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cve.a a(cve.f $$0, int $$1) {
      return new cve.a($$0, $$1);
   }

   public wp a() {
      return this.b;
   }

   public cwp b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public akv c() {
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

   public cve.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cve.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cve.h k() {
      return this.i;
   }

   public void a(cve.d $$0) {
      cve.c $$1 = new cve.c(this, $$0.a);
      aku<cve> $$2 = mb.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cwp> l() {
      return this.k;
   }

   public Collection<cwp> m() {
      return this.l;
   }

   public boolean a(cwp $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cve.b a = ($$0, $$1) -> {
      };
      private final cve.f b;
      private final int c;
      private wp d = wp.i();
      private Supplier<cwp> e = () -> cwp.j;
      private cve.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cve.h j = cve.h.a;
      private akv k = cve.a;

      public a(cve.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cve.a a(wp $$0) {
         this.d = $$0;
         return this;
      }

      public cve.a a(Supplier<cwp> $$0) {
         this.e = $$0;
         return this;
      }

      public cve.a a(cve.b $$0) {
         this.f = $$0;
         return this;
      }

      public cve.a a() {
         this.i = true;
         return this;
      }

      public cve.a b() {
         this.h = false;
         return this;
      }

      public cve.a c() {
         this.g = false;
         return this;
      }

      protected cve.a a(cve.h $$0) {
         this.j = $$0;
         return this;
      }

      public cve.a a(akv $$0) {
         this.k = $$0;
         return this;
      }

      public cve d() {
         if ((this.j == cve.h.c || this.j == cve.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cve $$0 = new cve(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cve.d var1, cve.e var2);
   }

   static class c implements cve.e {
      public final Collection<cwp> a = cwq.a();
      public final Set<cwp> b = cwq.a();
      private final cve c;
      private final crt d;

      public c(cve $$0, crt $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cwp $$0, cve.g $$1) {
         if ($$0.M() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cve.g.c;
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

   public static record d(crt a, boolean b, jt.a c) {

      public boolean a(crt $$0, boolean $$1, jt.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cwp var1, cve.g var2);

      default void a(cwp $$0) {
         this.a($$0, cve.g.a);
      }

      default void a(dgh $$0, cve.g $$1) {
         this.a(new cwp($$0), $$1);
      }

      default void a(dgh $$0) {
         this.a(new cwp($$0), cve.g.a);
      }

      default void a(Collection<cwp> $$0, cve.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cwp> $$0) {
         this.a($$0, cve.g.a);
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
