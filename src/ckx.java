import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ckx {
   private final vd a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final ckx.f f;
   private final int g;
   private final ckx.h h;
   @Nullable
   private cmr i;
   private Collection<cmr> j = cms.a();
   private Set<cmr> k = cms.a();
   @Nullable
   private Consumer<List<cmr>> l;
   private final Supplier<cmr> m;
   private final ckx.b n;

   ckx(ckx.f $$0, int $$1, ckx.h $$2, vd $$3, Supplier<cmr> $$4, ckx.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static ckx.a a(ckx.f $$0, int $$1) {
      return new ckx.a($$0, $$1);
   }

   public vd a() {
      return this.a;
   }

   public cmr b() {
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

   public ckx.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != ckx.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public ckx.h k() {
      return this.h;
   }

   public void a(ckx.d $$0) {
      ckx.c $$1 = new ckx.c(this, $$0.a);
      ahc<ckx> $$2 = kd.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cmr> l() {
      return this.j;
   }

   public Collection<cmr> m() {
      return this.k;
   }

   public boolean a(cmr $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cmr>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final ckx.b a = ($$0, $$1) -> {
      };
      private final ckx.f b;
      private final int c;
      private vd d = vd.i();
      private Supplier<cmr> e = () -> cmr.f;
      private ckx.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private ckx.h j = ckx.h.a;
      private String k = "items.png";

      public a(ckx.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public ckx.a a(vd $$0) {
         this.d = $$0;
         return this;
      }

      public ckx.a a(Supplier<cmr> $$0) {
         this.e = $$0;
         return this;
      }

      public ckx.a a(ckx.b $$0) {
         this.f = $$0;
         return this;
      }

      public ckx.a a() {
         this.i = true;
         return this;
      }

      public ckx.a b() {
         this.h = false;
         return this;
      }

      public ckx.a c() {
         this.g = false;
         return this;
      }

      protected ckx.a a(ckx.h $$0) {
         this.j = $$0;
         return this;
      }

      public ckx.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public ckx d() {
         if ((this.j == ckx.h.c || this.j == ckx.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            ckx $$0 = new ckx(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(ckx.d var1, ckx.e var2);
   }

   static class c implements ckx.e {
      public final Collection<cmr> a = cms.a();
      public final Set<cmr> b = cms.a();
      private final ckx c;
      private final chl d;

      public c(ckx $$0, chl $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cmr $$0, ckx.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != ckx.g.c;
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

   public static record d(chl a, boolean b, ij.b c) {

      public boolean a(chl $$0, boolean $$1, ij.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cmr var1, ckx.g var2);

      default void a(cmr $$0) {
         this.a($$0, ckx.g.a);
      }

      default void a(cth $$0, ckx.g $$1) {
         this.a(new cmr($$0), $$1);
      }

      default void a(cth $$0) {
         this.a(new cmr($$0), ckx.g.a);
      }

      default void a(Collection<cmr> $$0, ckx.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cmr> $$0) {
         this.a($$0, ckx.g.a);
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
