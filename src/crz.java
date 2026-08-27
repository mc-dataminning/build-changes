import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class crz {
   private final wx a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final crz.f f;
   private final int g;
   private final crz.h h;
   @Nullable
   private cto i;
   private Collection<cto> j = ctp.a();
   private Set<cto> k = ctp.a();
   @Nullable
   private Consumer<List<cto>> l;
   private final Supplier<cto> m;
   private final crz.b n;

   crz(crz.f $$0, int $$1, crz.h $$2, wx $$3, Supplier<cto> $$4, crz.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static crz.a a(crz.f $$0, int $$1) {
      return new crz.a($$0, $$1);
   }

   public wx a() {
      return this.a;
   }

   public cto b() {
      if (this.i == null) {
         this.i = this.m.get();
      }

      return this.i;
   }

   public String c() {
      return this.b;
   }

   public boolean d() {
      return this.d;
   }

   public boolean e() {
      return this.c;
   }

   public int f() {
      return this.g;
   }

   public crz.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != crz.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public crz.h k() {
      return this.h;
   }

   public void a(crz.d $$0) {
      crz.c $$1 = new crz.c(this, $$0.a);
      akl<crz> $$2 = le.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cto> l() {
      return this.j;
   }

   public Collection<cto> m() {
      return this.k;
   }

   public boolean a(cto $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cto>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final crz.b a = ($$0, $$1) -> {
      };
      private final crz.f b;
      private final int c;
      private wx d = wx.i();
      private Supplier<cto> e = () -> cto.i;
      private crz.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private crz.h j = crz.h.a;
      private String k = "items.png";

      public a(crz.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public crz.a a(wx $$0) {
         this.d = $$0;
         return this;
      }

      public crz.a a(Supplier<cto> $$0) {
         this.e = $$0;
         return this;
      }

      public crz.a a(crz.b $$0) {
         this.f = $$0;
         return this;
      }

      public crz.a a() {
         this.i = true;
         return this;
      }

      public crz.a b() {
         this.h = false;
         return this;
      }

      public crz.a c() {
         this.g = false;
         return this;
      }

      protected crz.a a(crz.h $$0) {
         this.j = $$0;
         return this;
      }

      public crz.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public crz d() {
         if ((this.j == crz.h.c || this.j == crz.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            crz $$0 = new crz(this.b, this.c, this.j, this.d, this.e, this.f);
            $$0.e = this.i;
            $$0.d = this.h;
            $$0.c = this.g;
            $$0.b = this.k;
            return $$0;
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(crz.d var1, crz.e var2);
   }

   static class c implements crz.e {
      public final Collection<cto> a = ctp.a();
      public final Set<cto> b = ctp.a();
      private final crz c;
      private final coj d;

      public c(crz $$0, coj $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cto $$0, crz.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != crz.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.G().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.g().a(this.d)) {
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

   public static record d(coj a, boolean b, iz.a c) {

      public boolean a(coj $$0, boolean $$1, iz.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cto var1, crz.g var2);

      default void a(cto $$0) {
         this.a($$0, crz.g.a);
      }

      default void a(daw $$0, crz.g $$1) {
         this.a(new cto($$0), $$1);
      }

      default void a(daw $$0) {
         this.a(new cto($$0), crz.g.a);
      }

      default void a(Collection<cto> $$0, crz.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cto> $$0) {
         this.a($$0, crz.g.a);
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
