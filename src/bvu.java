import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvu<E extends btn> implements bvh<E> {
   private final Map<ccr<?>, ccs> a;
   private final Set<ccr<?>> b;
   private final bvu.a c;
   private final bvu.b d;
   private final bxp<bvh<? super E>> e = new bxp<>();
   private bvg.a f = bvg.a.a;

   public bvu(Map<ccr<?>, ccs> $$0, Set<ccr<?>> $$1, bvu.a $$2, bvu.b $$3, List<Pair<? extends bvh<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bvh<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bvg.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<ccr<?>, ccs> $$1 : this.a.entrySet()) {
         ccr<?> $$2 = $$1.getKey();
         ccs $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(are $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bvg.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(are $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bvg.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bvg.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(are $$0, E $$1, long $$2) {
      this.f = bvg.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bvg.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dS()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bvh<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bvg.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxp::a);

      private final Consumer<bxp<?>> c;

      private a(final Consumer<bxp<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxp<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btn> void a(Stream<bvh<? super E>> $$0, are $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvg.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btn> void a(Stream<bvh<? super E>> $$0, are $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvg.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btn> void a(Stream<bvh<? super E>> var1, are var2, E var3, long var4);
   }
}
