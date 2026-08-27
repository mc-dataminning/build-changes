import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csb {
   private final wx a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csb.f f;
   private final int g;
   private final csb.h h;
   @Nullable
   private ctq i;
   private Collection<ctq> j = ctr.a();
   private Set<ctq> k = ctr.a();
   @Nullable
   private Consumer<List<ctq>> l;
   private final Supplier<ctq> m;
   private final csb.b n;

   csb(csb.f $$0, int $$1, csb.h $$2, wx $$3, Supplier<ctq> $$4, csb.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static csb.a a(csb.f $$0, int $$1) {
      return new csb.a($$0, $$1);
   }

   public wx a() {
      return this.a;
   }

   public ctq b() {
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

   public csb.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csb.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csb.h k() {
      return this.h;
   }

   public void a(csb.d $$0) {
      csb.c $$1 = new csb.c(this, $$0.a);
      akm<csb> $$2 = le.ao.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<ctq> l() {
      return this.j;
   }

   public Collection<ctq> m() {
      return this.k;
   }

   public boolean a(ctq $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<ctq>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final csb.b a = ($$0, $$1) -> {
      };
      private final csb.f b;
      private final int c;
      private wx d = wx.i();
      private Supplier<ctq> e = () -> ctq.i;
      private csb.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csb.h j = csb.h.a;
      private String k = "items.png";

      public a(csb.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csb.a a(wx $$0) {
         this.d = $$0;
         return this;
      }

      public csb.a a(Supplier<ctq> $$0) {
         this.e = $$0;
         return this;
      }

      public csb.a a(csb.b $$0) {
         this.f = $$0;
         return this;
      }

      public csb.a a() {
         this.i = true;
         return this;
      }

      public csb.a b() {
         this.h = false;
         return this;
      }

      public csb.a c() {
         this.g = false;
         return this;
      }

      protected csb.a a(csb.h $$0) {
         this.j = $$0;
         return this;
      }

      public csb.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csb d() {
         if ((this.j == csb.h.c || this.j == csb.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csb $$0 = new csb(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csb.d var1, csb.e var2);
   }

   static class c implements csb.e {
      public final Collection<ctq> a = ctr.a();
      public final Set<ctq> b = ctr.a();
      private final csb c;
      private final col d;

      public c(csb $$0, col $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(ctq $$0, csb.g $$1) {
         if ($$0.I() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csb.g.c;
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

   public static record d(col a, boolean b, iz.a c) {

      public boolean a(col $$0, boolean $$1, iz.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(ctq var1, csb.g var2);

      default void a(ctq $$0) {
         this.a($$0, csb.g.a);
      }

      default void a(day $$0, csb.g $$1) {
         this.a(new ctq($$0), $$1);
      }

      default void a(day $$0) {
         this.a(new ctq($$0), csb.g.a);
      }

      default void a(Collection<ctq> $$0, csb.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<ctq> $$0) {
         this.a($$0, csb.g.a);
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
