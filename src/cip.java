import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cip {
   private final ui a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final cip.f f;
   private final int g;
   private final cip.h h;
   @Nullable
   private ckj i;
   private Collection<ckj> j = ckk.a();
   private Set<ckj> k = ckk.a();
   @Nullable
   private Consumer<List<ckj>> l;
   private final Supplier<ckj> m;
   private final cip.b n;

   cip(cip.f $$0, int $$1, cip.h $$2, ui $$3, Supplier<ckj> $$4, cip.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static cip.a a(cip.f $$0, int $$1) {
      return new cip.a($$0, $$1);
   }

   public ui a() {
      return this.a;
   }

   public ckj b() {
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

   public cip.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != cip.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public cip.h k() {
      return this.h;
   }

   public void a(cip.d $$0) {
      cip.c $$1 = new cip.c(this, $$0.a);
      afv<cip> $$2 = jy.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<ckj> l() {
      return this.j;
   }

   public Collection<ckj> m() {
      return this.k;
   }

   public boolean a(ckj $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<ckj>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final cip.b a = ($$0, $$1) -> {
      };
      private final cip.f b;
      private final int c;
      private ui d = ui.i();
      private Supplier<ckj> e = () -> ckj.b;
      private cip.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private cip.h j = cip.h.a;
      private String k = "items.png";

      public a(cip.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public cip.a a(ui $$0) {
         this.d = $$0;
         return this;
      }

      public cip.a a(Supplier<ckj> $$0) {
         this.e = $$0;
         return this;
      }

      public cip.a a(cip.b $$0) {
         this.f = $$0;
         return this;
      }

      public cip.a a() {
         this.i = true;
         return this;
      }

      public cip.a b() {
         this.h = false;
         return this;
      }

      public cip.a c() {
         this.g = false;
         return this;
      }

      protected cip.a a(cip.h $$0) {
         this.j = $$0;
         return this;
      }

      public cip.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public cip d() {
         if ((this.j == cip.h.c || this.j == cip.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            cip $$0 = new cip(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(cip.d var1, cip.e var2);
   }

   static class c implements cip.e {
      public final Collection<ckj> a = ckk.a();
      public final Set<ckj> b = ckk.a();
      private final cip c;
      private final cfg d;

      public c(cip $$0, cfg $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(ckj $$0, cip.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != cip.g.c;
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

   public static record d(cfg a, boolean b, id.b c) {

      public boolean a(cfg $$0, boolean $$1, id.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(ckj var1, cip.g var2);

      default void a(ckj $$0) {
         this.a($$0, cip.g.a);
      }

      default void a(cqy $$0, cip.g $$1) {
         this.a(new ckj($$0), $$1);
      }

      default void a(cqy $$0) {
         this.a(new ckj($$0), cip.g.a);
      }

      default void a(Collection<ckj> $$0, cip.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<ckj> $$0) {
         this.a($$0, cip.g.a);
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
