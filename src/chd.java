import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class chd {
   private final tf a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final chd.f f;
   private final int g;
   private final chd.h h;
   @Nullable
   private cix i;
   private Collection<cix> j = ciy.a();
   private Set<cix> k = ciy.a();
   @Nullable
   private Consumer<List<cix>> l;
   private final Supplier<cix> m;
   private final chd.b n;

   chd(chd.f $$0, int $$1, chd.h $$2, tf $$3, Supplier<cix> $$4, chd.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static chd.a a(chd.f $$0, int $$1) {
      return new chd.a($$0, $$1);
   }

   public tf a() {
      return this.a;
   }

   public cix b() {
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

   public chd.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != chd.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public chd.h k() {
      return this.h;
   }

   public void a(chd.d $$0) {
      chd.c $$1 = new chd.c(this, $$0.a);
      aeq<chd> $$2 = jb.ao.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cix> l() {
      return this.j;
   }

   public Collection<cix> m() {
      return this.k;
   }

   public boolean a(cix $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cix>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final chd.b a = ($$0, $$1) -> {
      };
      private final chd.f b;
      private final int c;
      private tf d = tf.h();
      private Supplier<cix> e = () -> cix.b;
      private chd.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private chd.h j = chd.h.a;
      private String k = "items.png";

      public a(chd.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public chd.a a(tf $$0) {
         this.d = $$0;
         return this;
      }

      public chd.a a(Supplier<cix> $$0) {
         this.e = $$0;
         return this;
      }

      public chd.a a(chd.b $$0) {
         this.f = $$0;
         return this;
      }

      public chd.a a() {
         this.i = true;
         return this;
      }

      public chd.a b() {
         this.h = false;
         return this;
      }

      public chd.a c() {
         this.g = false;
         return this;
      }

      protected chd.a a(chd.h $$0) {
         this.j = $$0;
         return this;
      }

      public chd.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public chd d() {
         if ((this.j == chd.h.c || this.j == chd.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            chd $$0 = new chd(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(chd.d var1, chd.e var2);
   }

   static class c implements chd.e {
      public final Collection<cix> a = ciy.a();
      public final Set<cix> b = ciy.a();
      private final chd c;
      private final cdu d;

      public c(chd $$0, cdu $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cix $$0, chd.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != chd.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.J().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.d().a(this.d)) {
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

   public static record d(cdu a, boolean b, hg.b c) {

      public boolean a(cdu $$0, boolean $$1, hg.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cix var1, chd.g var2);

      default void a(cix $$0) {
         this.a($$0, chd.g.a);
      }

      default void a(cpk $$0, chd.g $$1) {
         this.a(new cix($$0), $$1);
      }

      default void a(cpk $$0) {
         this.a(new cix($$0), chd.g.a);
      }

      default void a(Collection<cix> $$0, chd.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cix> $$0) {
         this.a($$0, chd.g.a);
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
