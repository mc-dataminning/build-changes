import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctb {
   private final xp a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final ctb.f f;
   private final int g;
   private final ctb.h h;
   @Nullable
   private cuq i;
   private Collection<cuq> j = cur.a();
   private Set<cuq> k = cur.a();
   @Nullable
   private Consumer<List<cuq>> l;
   private final Supplier<cuq> m;
   private final ctb.b n;

   ctb(ctb.f $$0, int $$1, ctb.h $$2, xp $$3, Supplier<cuq> $$4, ctb.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static ctb.a a(ctb.f $$0, int $$1) {
      return new ctb.a($$0, $$1);
   }

   public xp a() {
      return this.a;
   }

   public cuq b() {
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

   public ctb.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != ctb.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public ctb.h k() {
      return this.h;
   }

   public void a(ctb.d $$0) {
      ctb.c $$1 = new ctb.c(this, $$0.a);
      ale<ctb> $$2 = lp.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cuq> l() {
      return this.j;
   }

   public Collection<cuq> m() {
      return this.k;
   }

   public boolean a(cuq $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cuq>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final ctb.b a = ($$0, $$1) -> {
      };
      private final ctb.f b;
      private final int c;
      private xp d = xp.i();
      private Supplier<cuq> e = () -> cuq.l;
      private ctb.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private ctb.h j = ctb.h.a;
      private String k = "items.png";

      public a(ctb.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public ctb.a a(xp $$0) {
         this.d = $$0;
         return this;
      }

      public ctb.a a(Supplier<cuq> $$0) {
         this.e = $$0;
         return this;
      }

      public ctb.a a(ctb.b $$0) {
         this.f = $$0;
         return this;
      }

      public ctb.a a() {
         this.i = true;
         return this;
      }

      public ctb.a b() {
         this.h = false;
         return this;
      }

      public ctb.a c() {
         this.g = false;
         return this;
      }

      protected ctb.a a(ctb.h $$0) {
         this.j = $$0;
         return this;
      }

      public ctb.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public ctb d() {
         if ((this.j == ctb.h.c || this.j == ctb.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            ctb $$0 = new ctb(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(ctb.d var1, ctb.e var2);
   }

   static class c implements ctb.e {
      public final Collection<cuq> a = cur.a();
      public final Set<cuq> b = cur.a();
      private final ctb c;
      private final cpm d;

      public c(ctb $$0, cpm $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuq $$0, ctb.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != ctb.g.c;
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

   public static record d(cpm a, boolean b, jk.a c) {

      public boolean a(cpm $$0, boolean $$1, jk.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuq var1, ctb.g var2);

      default void a(cuq $$0) {
         this.a($$0, ctb.g.a);
      }

      default void a(dby $$0, ctb.g $$1) {
         this.a(new cuq($$0), $$1);
      }

      default void a(dby $$0) {
         this.a(new cuq($$0), ctb.g.a);
      }

      default void a(Collection<cuq> $$0, ctb.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuq> $$0) {
         this.a($$0, ctb.g.a);
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
