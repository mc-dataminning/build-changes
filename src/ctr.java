import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class ctr implements cot {
   public static final int a = 64;
   public static final ctr b = new ctr(List.of());
   public static final Codec<ctr> c = aws.a(crj.a.listOf(), 64).xmap(ctr::new, $$0 -> $$0.g);
   public static final ye<vr, ctr> d = crj.f.a(yc.c(64)).a(ctr::new, $$0 -> $$0.g);
   private static final int e = 4;
   private static final int f = -1;
   final List<crj> g;
   final int h;

   ctr(List<crj> $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public ctr(List<crj> $$0) {
      this($$0, a($$0));
   }

   private static int a(List<crj> $$0) {
      int $$1 = 0;

      for (crj $$2 : $$0) {
         $$1 += a($$2) * $$2.G();
      }

      return $$1;
   }

   static int a(crj $$0) {
      ctr $$1 = $$0.a(jp.w);
      if ($$1 != null) {
         return 4 + $$1.c();
      } else {
         List<dmc.c> $$2 = $$0.a(jp.S, List.of());
         return !$$2.isEmpty() ? 64 : 64 / $$0.i();
      }
   }

   public crj a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<crj> a() {
      return this.g.stream().map(crj::r);
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
         return !($$0 instanceof ctr $$1) ? false : this.h == $$1.h && crj.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return crj.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<crj> a;
      private int b;

      public a(ctr $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
      }

      private int b(crj $$0) {
         if (!$$0.j()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (crj.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(crj $$0) {
         return Math.max(64 - this.b, 0) / ctr.a($$0);
      }

      public int a(crj $$0) {
         if (!$$0.d() && $$0.f().an_()) {
            int $$1 = Math.min($$0.G(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b + ctr.a($$0) * $$1;
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  crj $$3 = this.a.remove($$2);
                  crj $$4 = $$3.c($$3.G() + $$1);
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

      public int a(cok $$0, cjt $$1) {
         crj $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.G(), $$3, $$1));
      }

      @Nullable
      public crj a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            crj $$0 = this.a.remove(0).r();
            this.b = this.b - ctr.a($$0) * $$0.G();
            return $$0;
         }
      }

      public int b() {
         return this.b;
      }

      public ctr c() {
         return new ctr(List.copyOf(this.a), this.b);
      }
   }
}
