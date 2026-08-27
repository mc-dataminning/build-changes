import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class cwb implements cqy {
   public static final int a = 64;
   public static final cwb b = new cwb(List.of());
   public static final Codec<cwb> c = cto.a.sizeLimitedListOf(64).xmap(cwb::new, $$0 -> $$0.g);
   public static final yv<wi, cwb> d = cto.f.a(yt.c(64)).a(cwb::new, $$0 -> $$0.g);
   private static final int e = 4;
   private static final int f = -1;
   final List<cto> g;
   final int h;

   cwb(List<cto> $$0, int $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public cwb(List<cto> $$0) {
      this($$0, a($$0));
   }

   private static int a(List<cto> $$0) {
      int $$1 = 0;

      for (cto $$2 : $$0) {
         $$1 += a($$2) * $$2.I();
      }

      return $$1;
   }

   static int a(cto $$0) {
      cwb $$1 = $$0.a(kb.E);
      if ($$1 != null) {
         return 4 + $$1.c();
      } else {
         List<dod.c> $$2 = $$0.a(kb.ab, List.of());
         return !$$2.isEmpty() ? 64 : 64 / $$0.j();
      }
   }

   public cto a(int $$0) {
      return this.g.get($$0);
   }

   public Stream<cto> a() {
      return this.g.stream().map(cto::s);
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
         return !($$0 instanceof cwb $$1) ? false : this.h == $$1.h && cto.a(this.g, $$1.g);
      }
   }

   @Override
   public int hashCode() {
      return cto.a(this.g);
   }

   @Override
   public String toString() {
      return "BundleContents" + this.g;
   }

   public static class a {
      private final List<cto> a;
      private int b;

      public a(cwb $$0) {
         this.a = new ArrayList<>($$0.g);
         this.b = $$0.h;
      }

      private int b(cto $$0) {
         if (!$$0.k()) {
            return -1;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (cto.c(this.a.get($$1), $$0)) {
                  return $$1;
               }
            }

            return -1;
         }
      }

      private int c(cto $$0) {
         return Math.max(64 - this.b, 0) / cwb.a($$0);
      }

      public int a(cto $$0) {
         if (!$$0.e() && $$0.g().am_()) {
            int $$1 = Math.min($$0.I(), this.c($$0));
            if ($$1 == 0) {
               return 0;
            } else {
               this.b = this.b + cwb.a($$0) * $$1;
               int $$2 = this.b($$0);
               if ($$2 != -1) {
                  cto $$3 = this.a.remove($$2);
                  cto $$4 = $$3.c($$3.I() + $$1);
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

      public int a(cqo $$0, clw $$1) {
         cto $$2 = $$0.g();
         int $$3 = this.c($$2);
         return this.a($$0.b($$2.I(), $$3, $$1));
      }

      @Nullable
      public cto a() {
         if (this.a.isEmpty()) {
            return null;
         } else {
            cto $$0 = this.a.remove(0).s();
            this.b = this.b - cwb.a($$0) * $$0.I();
            return $$0;
         }
      }

      public int b() {
         return this.b;
      }

      public cwb c() {
         return new cwb(List.copyOf(this.a), this.b);
      }
   }
}
