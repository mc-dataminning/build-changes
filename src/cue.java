import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cue {
   static final ale a = a("items");
   private final xe b;
   ale c = a;
   boolean d = true;
   boolean e = true;
   boolean f = false;
   private final cue.f g;
   private final int h;
   private final cue.h i;
   @Nullable
   private cvs j;
   private Collection<cvs> k = cvt.a();
   private Set<cvs> l = cvt.a();
   private final Supplier<cvs> m;
   private final cue.b n;

   cue(cue.f $$0, int $$1, cue.h $$2, xe $$3, Supplier<cvs> $$4, cue.b $$5) {
      this.g = $$0;
      this.h = $$1;
      this.b = $$3;
      this.m = $$4;
      this.n = $$5;
      this.i = $$2;
   }

   public static ale a(String $$0) {
      return ale.b("textures/gui/container/creative_inventory/tab_" + $$0 + ".png");
   }

   public static cue.a a(cue.f $$0, int $$1) {
      return new cue.a($$0, $$1);
   }

   public xe a() {
      return this.b;
   }

   public cvs b() {
      if (this.j == null) {
         this.j = this.m.get();
      }

      return this.j;
   }

   public ale c() {
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

   public cue.f g() {
      return this.g;
   }

   public boolean h() {
      return !this.k.isEmpty();
   }

   public boolean i() {
      return this.i != cue.h.a || this.h();
   }

   public boolean j() {
      return this.f;
   }

   public cue.h k() {
      return this.i;
   }

   public void a(cue.d $$0) {
      cue.c $$1 = new cue.c(this, $$0.a);
      ald<cue> $$2 = lv.al.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.k = $$1.a;
      this.l = $$1.b;
   }

   public Collection<cvs> l() {
      return this.k;
   }

   public Collection<cvs> m() {
      return this.l;
   }

   public boolean a(cvs $$0) {
      return this.l.contains($$0);
   }

   public static class a {
      private static final cue.b a = ($$0, $$1) -> {
      };
      private final cue.f b;
      private final int c;
      private xe d = xe.i();
      private Supplier<cvs> e = () -> cvs.k;
      private cue.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cue.h j = cue.h.a;
      private ale k = cue.a;

      public a(cue.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cue.a a(xe $$0) {
         this.d = $$0;
         return this;
      }

      public cue.a a(Supplier<cvs> $$0) {
         this.e = $$0;
         return this;
      }

      public cue.a a(cue.b $$0) {
         this.f = $$0;
         return this;
      }

      public cue.a a() {
         this.i = true;
         return this;
      }

      public cue.a b() {
         this.h = false;
         return this;
      }

      public cue.a c() {
         this.g = false;
         return this;
      }

      protected cue.a a(cue.h $$0) {
         this.j = $$0;
         return this;
      }

      public cue.a a(ale $$0) {
         this.k = $$0;
         return this;
      }

      public cue d() {
         if ((this.j == cue.h.c || this.j == cue.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cue $$0 = new cue(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cue.d var1, cue.e var2);
   }

   static class c implements cue.e {
      public final Collection<cvs> a = cvt.a();
      public final Set<cvs> b = cvt.a();
      private final cue c;
      private final cqq d;

      public c(cue $$0, cqq $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cvs $$0, cue.g $$1) {
         if ($$0.K() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cue.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.I().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(cqq a, boolean b, jq.a c) {

      public boolean a(cqq $$0, boolean $$1, jq.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cvs var1, cue.g var2);

      default void a(cvs $$0) {
         this.a($$0, cue.g.a);
      }

      default void a(dei $$0, cue.g $$1) {
         this.a(new cvs($$0), $$1);
      }

      default void a(dei $$0) {
         this.a(new cvs($$0), cue.g.a);
      }

      default void a(Collection<cvs> $$0, cue.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cvs> $$0) {
         this.a($$0, cue.g.a);
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
