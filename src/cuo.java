import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class cuo implements cpn {
   public static final int a = 64;
   public static final cuo b = new cuo(List.of());
   public static final Codec<cuo> c = axe.a(csd.a.listOf(), 64).xmap(cuo::new, $$0 -> $$0.g);
   public static final yq<wd, cuo> d = csd.f.a(yo.c(64)).a(cuo::new, $$0 -> $$0.g);
   private static final int e = 4;
   private static final int f = -1;
   final List<csd> g;
   final int h;

   cuo(List<csd> $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public cuo(List<csd> $$0) {
      this($$0, a($$0));
   }

   private static int a(List<csd> $$0) {
      int $$1 = 0;

      for (csd $$2 : $$0) {
         $$1 += a($$2) * $$2.G();
      }

      return $$1;
   }

   static int a(csd $$0) {
      cuo $$1 = $$0.a(jz.w);
      if ($$1 != null) {
         return 4 + $$1.c();
      } else {
         List<dna.c> $$2 = $$0.a(jz.S, List.of());
         return !$$2.isEmpty() ? 64 : 64 / $$0.i();
      }
   }

   public csd a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<csd> a() {
      return this.g.stream().map(csd::r);
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
         return !($$0 instanceof cuo $$1) ? false : this.h == $$1.h && csd.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return csd.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<csd> a;
      private int b;

      public a(cuo $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
      }

      private int b(csd $$0) {
         if (!$$0.j()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (csd.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(csd $$0) {
         return Math.max(64 - this.b, 0) / cuo.a($$0);
      }

      public int a(csd $$0) {
         if (!$$0.d() && $$0.f().am_()) {
            int $$1 = Math.min($$0.G(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b + cuo.a($$0) * $$1;
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  csd $$3 = this.a.remove($$2);
                  csd $$4 = $$3.c($$3.G() + $$1);
                  $$0.g($$1);
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

      public int a(cpd $$0, ckl $$1) {
         csd $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.G(), $$3, $$1));
      }

      @Nullable
      public csd a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            csd $$0 = this.a.remove(0).r();
            this.b = this.b - cuo.a($$0) * $$0.G();
            return $$0;
         }
      }

      public int b() {
         return this.b;
      }

      public cuo c() {
         return new cuo(List.copyOf(this.a), this.b);
      }
   }
}
