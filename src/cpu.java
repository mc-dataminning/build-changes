import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cpu {
   private final wg a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cpu.f f;
   private final int g;
   private final cpu.h h;
   @Nullable
   private crj i;
   private Collection<crj> j = crk.a();
   private Set<crj> k = crk.a();
   @Nullable
   private Consumer<List<crj>> l;
   private final Supplier<crj> m;
   private final cpu.b n;

   cpu(cpu.f $$0, int $$1, cpu.h $$2, wg $$3, Supplier<crj> $$4, cpu.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cpu.a a(cpu.f $$0, int $$1) {
      return new cpu.a($$0, $$1);
   }

   public wg a() {
      return this.a;
   }

   public crj b() {
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

   public cpu.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cpu.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cpu.h k() {
      return this.h;
   }

   public void a(cpu.d $$0) {
      cpu.c $$1 = new cpu.c(this, $$0.a);
      ajs<cpu> $$2 = kr.ap.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<crj> l() {
      return this.j;
   }

   public Collection<crj> m() {
      return this.k;
   }

   public boolean a(crj $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<crj>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cpu.b a = ($$0, $$1) -> {
      };
      private final cpu.f b;
      private final int c;
      private wg d = wg.i();
      private Supplier<crj> e = () -> crj.i;
      private cpu.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cpu.h j = cpu.h.a;
      private String k = "items.png";

      public a(cpu.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cpu.a a(wg $$0) {
         this.d = $$0;
         return this;
      }

      public cpu.a a(Supplier<crj> $$0) {
         this.e = $$0;
         return this;
      }

      public cpu.a a(cpu.b $$0) {
         this.f = $$0;
         return this;
      }

      public cpu.a a() {
         this.i = true;
         return this;
      }

      public cpu.a b() {
         this.h = false;
         return this;
      }

      public cpu.a c() {
         this.g = false;
         return this;
      }

      protected cpu.a a(cpu.h $$0) {
         this.j = $$0;
         return this;
      }

      public cpu.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cpu d() {
         if ((this.j == cpu.h.c || this.j == cpu.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cpu $$0 = new cpu(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cpu.d var1, cpu.e var2);
   }

   static class c implements cpu.e {
      public final Collection<crj> a = crk.a();
      public final Set<crj> b = crk.a();
      private final cpu c;
      private final cmg d;

      public c(cpu $$0, cmg $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(crj $$0, cpu.g $$1) {
         if ($$0.G() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cpu.g.c;
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

   public static record d(cmg a, boolean b, in.a c) {

      public boolean a(cmg $$0, boolean $$1, in.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(crj var1, cpu.g var2);

      default void a(crj $$0) {
         this.a($$0, cpu.g.a);
      }

      default void a(cyw $$0, cpu.g $$1) {
         this.a(new crj($$0), $$1);
      }

      default void a(cyw $$0) {
         this.a(new crj($$0), cpu.g.a);
      }

      default void a(Collection<crj> $$0, cpu.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<crj> $$0) {
         this.a($$0, cpu.g.a);
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
