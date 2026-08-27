import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class cvk implements cqj {
   public static final int a = 64;
   public static final cvk b = new cvk(List.of());
   public static final Codec<cvk> c = axh.a(csz.a.listOf(), 64).xmap(cvk::new, $$0 -> $$0.g);
   public static final ys<wf, cvk> d = csz.f.a(yq.c(64)).a(cvk::new, $$0 -> $$0.g);
   private static final int e = 4;
   private static final int f = -1;
   final List<csz> g;
   final int h;

   cvk(List<csz> $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public cvk(List<csz> $$0) {
      this($$0, a($$0));
   }

   private static int a(List<csz> $$0) {
      int $$1 = 0;

      for (csz $$2 : $$0) {
         $$1 += a($$2) * $$2.G();
      }

      return $$1;
   }

   static int a(csz $$0) {
      cvk $$1 = $$0.a(ka.D);
      if ($$1 != null) {
         return 4 + $$1.c();
      } else {
         List<dnj.c> $$2 = $$0.a(ka.Z, List.of());
         return !$$2.isEmpty() ? 64 : 64 / $$0.i();
      }
   }

   public csz a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<csz> a() {
      return this.g.stream().map(csz::r);
   }

   public int b() {
      return this.g.size();
   }

   public int c() {
      return this.h;
   }

   public boolean d() {
      return this.g.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof cvk $$1) ? false : this.h == $$1.h && csz.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return csz.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<csz> a;
      private int b;

      public a(cvk $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
      }

      private int b(csz $$0) {
         if (!$$0.j()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (csz.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(csz $$0) {
         return Math.max(64 - this.b, 0) / cvk.a($$0);
      }

      public int a(csz $$0) {
         if (!$$0.d() && $$0.f().am_()) {
            int $$1 = Math.min($$0.G(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b + cvk.a($$0) * $$1;
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  csz $$3 = this.a.remove($$2);
                  csz $$4 = $$3.c($$3.G() + $$1);
                  $$0.h($$1);
                  this.a.add(0, $$4);
               } else {
                  this.a.add(0, $$0.a($$1));
               }

               return $$1;
            }
         } else {
            return 0;
         }
      }

      public int a(cpz $$0, clh $$1) {
         csz $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.G(), $$3, $$1));
      }

      @Nullable
      public csz a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            csz $$0 = this.a.remove(0).r();
            this.b = this.b - cvk.a($$0) * $$0.G();
            return $$0;
         }
      }

      public int b() {
         return this.b;
      }

      public cvk c() {
         return new cvk(List.copyOf(this.a), this.b);
      }
   }
}
