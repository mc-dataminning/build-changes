import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ckn {
   private final vb a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final ckn.f f;
   private final int g;
   private final ckn.h h;
   @Nullable
   private cmh i;
   private Collection<cmh> j = cmi.a();
   private Set<cmh> k = cmi.a();
   @Nullable
   private Consumer<List<cmh>> l;
   private final Supplier<cmh> m;
   private final ckn.b n;

   ckn(ckn.f $$0, int $$1, ckn.h $$2, vb $$3, Supplier<cmh> $$4, ckn.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.m = $$4;
      this.n = $$5;
      this.h = $$2;
   }

   public static ckn.a a(ckn.f $$0, int $$1) {
      return new ckn.a($$0, $$1);
   }

   public vb a() {
      return this.a;
   }

   public cmh b() {
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

   public ckn.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != ckn.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public ckn.h k() {
      return this.h;
   }

   public void a(ckn.d $$0) {
      ckn.c $$1 = new ckn.c(this, $$0.a);
      ags<ckn> $$2 = kb.ap.c(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.n.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
      this.n();
   }

   public Collection<cmh> l() {
      return this.j;
   }

   public Collection<cmh> m() {
      return this.k;
   }

   public boolean a(cmh $$0) {
      return this.k.contains($$0);
   }

   public void a(Consumer<List<cmh>> $$0) {
      this.l = $$0;
   }

   public void n() {
      if (this.l != null) {
         this.l.accept(Lists.newArrayList(this.k));
      }
   }

   public static class a {
      private static final ckn.b a = ($$0, $$1) -> {
      };
      private final ckn.f b;
      private final int c;
      private vb d = vb.i();
      private Supplier<cmh> e = () -> cmh.f;
      private ckn.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private ckn.h j = ckn.h.a;
      private String k = "items.png";

      public a(ckn.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public ckn.a a(vb $$0) {
         this.d = $$0;
         return this;
      }

      public ckn.a a(Supplier<cmh> $$0) {
         this.e = $$0;
         return this;
      }

      public ckn.a a(ckn.b $$0) {
         this.f = $$0;
         return this;
      }

      public ckn.a a() {
         this.i = true;
         return this;
      }

      public ckn.a b() {
         this.h = false;
         return this;
      }

      public ckn.a c() {
         this.g = false;
         return this;
      }

      protected ckn.a a(ckn.h $$0) {
         this.j = $$0;
         return this;
      }

      public ckn.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public ckn d() {
         if ((this.j == ckn.h.c || this.j == ckn.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            ckn $$0 = new ckn(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(ckn.d var1, ckn.e var2);
   }

   static class c implements ckn.e {
      public final Collection<cmh> a = cmi.a();
      public final Set<cmh> b = cmi.a();
      private final ckn c;
      private final chb d;

      public c(ckn $$0, chb $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cmh $$0, ckn.g $$1) {
         if ($$0.L() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != ckn.g.c;
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

   public static record d(chb a, boolean b, ih.b c) {

      public boolean a(chb $$0, boolean $$1, ih.b $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cmh var1, ckn.g var2);

      default void a(cmh $$0) {
         this.a($$0, ckn.g.a);
      }

      default void a(csx $$0, ckn.g $$1) {
         this.a(new cmh($$0), $$1);
      }

      default void a(csx $$0) {
         this.a(new cmh($$0), ckn.g.a);
      }

      default void a(Collection<cmh> $$0, ckn.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cmh> $$0) {
         this.a($$0, ckn.g.a);
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
