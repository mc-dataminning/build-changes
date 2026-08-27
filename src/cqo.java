import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqo {
   private final ws a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cqo.f f;
   private final int g;
   private final cqo.h h;
   @Nullable
   private csd i;
   private Collection<csd> j = cse.a();
   private Set<csd> k = cse.a();
   @Nullable
   private Consumer<List<csd>> l;
   private final Supplier<csd> m;
   private final cqo.b n;

   cqo(cqo.f $$0, int $$1, cqo.h $$2, ws $$3, Supplier<csd> $$4, cqo.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cqo.a a(cqo.f $$0, int $$1) {
      return new cqo.a($$0, $$1);
   }

   public ws a() {
      return this.a;
   }

   public csd b() {
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

   public cqo.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cqo.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cqo.h k() {
      return this.h;
   }

   public void a(cqo.d $$0) {
      cqo.c $$1 = new cqo.c(this, $$0.a);
      ake<cqo> $$2 = lc.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<csd> l() {
      return this.j;
   }

   public Collection<csd> m() {
      return this.k;
   }

   public boolean a(csd $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<csd>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cqo.b a = ($$0, $$1) -> {
      };
      private final cqo.f b;
      private final int c;
      private ws d = ws.i();
      private Supplier<csd> e = () -> csd.i;
      private cqo.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cqo.h j = cqo.h.a;
      private String k = "items.png";

      public a(cqo.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cqo.a a(ws $$0) {
         this.d = $$0;
         return this;
      }

      public cqo.a a(Supplier<csd> $$0) {
         this.e = $$0;
         return this;
      }

      public cqo.a a(cqo.b $$0) {
         this.f = $$0;
         return this;
      }

      public cqo.a a() {
         this.i = true;
         return this;
      }

      public cqo.a b() {
         this.h = false;
         return this;
      }

      public cqo.a c() {
         this.g = false;
         return this;
      }

      protected cqo.a a(cqo.h $$0) {
         this.j = $$0;
         return this;
      }

      public cqo.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cqo d() {
         if ((this.j == cqo.h.c || this.j == cqo.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cqo $$0 = new cqo(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cqo.d var1, cqo.e var2);
   }

   static class c implements cqo.e {
      public final Collection<csd> a = cse.a();
      public final Set<csd> b = cse.a();
      private final cqo c;
      private final cmy d;

      public c(cqo $$0, cmy $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(csd $$0, cqo.g $$1) {
         if ($$0.G() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cqo.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.E().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
               );
            } else {
               if ($$0.f().a(this.d)) {
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

   public static record d(cmy a, boolean b, ix.a c) {

      public boolean a(cmy $$0, boolean $$1, ix.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(csd var1, cqo.g var2);

      default void a(csd $$0) {
         this.a($$0, cqo.g.a);
      }

      default void a(czt $$0, cqo.g $$1) {
         this.a(new csd($$0), $$1);
      }

      default void a(czt $$0) {
         this.a(new csd($$0), cqo.g.a);
      }

      default void a(Collection<csd> $$0, cqo.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<csd> $$0) {
         this.a($$0, cqo.g.a);
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
