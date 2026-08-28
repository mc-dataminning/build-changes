import java.util.Collection;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class csn {
   private final wu a;
   String b = "items.png";
   boolean c = true;
   boolean d = true;
   boolean e = false;
   private final csn.f f;
   private final int g;
   private final csn.h h;
   @Nullable
   private cuc i;
   private Collection<cuc> j = cud.a();
   private Set<cuc> k = cud.a();
   private final Supplier<cuc> l;
   private final csn.b m;

   csn(csn.f $$0, int $$1, csn.h $$2, wu $$3, Supplier<cuc> $$4, csn.b $$5) {
      this.f = $$0;
      this.g = $$1;
      this.a = $$3;
      this.l = $$4;
      this.m = $$5;
      this.h = $$2;
   }

   public static csn.a a(csn.f $$0, int $$1) {
      return new csn.a($$0, $$1);
   }

   public wu a() {
      return this.a;
   }

   public cuc b() {
      if (this.i == null) {
         this.i = this.l.get();
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

   public csn.f g() {
      return this.f;
   }

   public boolean h() {
      return !this.j.isEmpty();
   }

   public boolean i() {
      return this.h != csn.h.a || this.h();
   }

   public boolean j() {
      return this.e;
   }

   public csn.h k() {
      return this.h;
   }

   public void a(csn.d $$0) {
      csn.c $$1 = new csn.c(this, $$0.a);
      akj<csn> $$2 = lq.am.d(this).orElseThrow(() -> new IllegalStateException("Unregistered creative tab: " + this));
      this.m.accept($$0, $$1);
      this.j = $$1.a;
      this.k = $$1.b;
   }

   public Collection<cuc> l() {
      return this.j;
   }

   public Collection<cuc> m() {
      return this.k;
   }

   public boolean a(cuc $$0) {
      return this.k.contains($$0);
   }

   public static class a {
      private static final csn.b a = ($$0, $$1) -> {
      };
      private final csn.f b;
      private final int c;
      private wu d = wu.i();
      private Supplier<cuc> e = () -> cuc.l;
      private csn.b f = a;
      private boolean g = true;
      private boolean h = true;
      private boolean i = false;
      private csn.h j = csn.h.a;
      private String k = "items.png";

      public a(csn.f $$0, int $$1) {
         this.b = $$0;
         this.c = $$1;
      }

      public csn.a a(wu $$0) {
         this.d = $$0;
         return this;
      }

      public csn.a a(Supplier<cuc> $$0) {
         this.e = $$0;
         return this;
      }

      public csn.a a(csn.b $$0) {
         this.f = $$0;
         return this;
      }

      public csn.a a() {
         this.i = true;
         return this;
      }

      public csn.a b() {
         this.h = false;
         return this;
      }

      public csn.a c() {
         this.g = false;
         return this;
      }

      protected csn.a a(csn.h $$0) {
         this.j = $$0;
         return this;
      }

      public csn.a a(String $$0) {
         this.k = $$0;
         return this;
      }

      public csn d() {
         if ((this.j == csn.h.c || this.j == csn.h.b) && this.f != a) {
            throw new IllegalStateException("Special tabs can't have display items");
         } else {
            csn $$0 = new csn(this.b, this.c, this.j, this.d, this.e, this.f);
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
      void accept(csn.d var1, csn.e var2);
   }

   static class c implements csn.e {
      public final Collection<cuc> a = cud.a();
      public final Set<cuc> b = cud.a();
      private final csn c;
      private final coy d;

      public c(csn $$0, coy $$1) {
         this.c = $$0;
         this.d = $$1;
      }

      @Override
      public void a(cuc $$0, csn.g $$1) {
         if ($$0.H() != 1) {
            throw new IllegalArgumentException("Stack size must be exactly 1");
         } else {
            boolean $$2 = this.a.contains($$0) && $$1 != csn.g.c;
            if ($$2) {
               throw new IllegalStateException(
                  "Accidentally adding the same item stack twice " + $$0.F().getString() + " to a Creative Mode Tab: " + this.c.a().getString()
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

   public static record d(coy a, boolean b, jl.a c) {

      public boolean a(coy $$0, boolean $$1, jl.a $$2) {
         return !this.a.equals($$0) || this.b != $$1 || this.c != $$2;
      }
   }

   public interface e {
      void a(cuc var1, csn.g var2);

      default void a(cuc $$0) {
         this.a($$0, csn.g.a);
      }

      default void a(dce $$0, csn.g $$1) {
         this.a(new cuc($$0), $$1);
      }

      default void a(dce $$0) {
         this.a(new cuc($$0), csn.g.a);
      }

      default void a(Collection<cuc> $$0, csn.g $$1) {
         $$0.forEach($$1x -> this.a($$1x, $$1));
      }

      default void a(Collection<cuc> $$0) {
         this.a($$0, csn.g.a);
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
