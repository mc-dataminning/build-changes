import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bwl<E extends buf> implements bvy<E> {
   private final Map<cdi<?>, cdj> a;
   private final Set<cdi<?>> b;
   private final bwl.a c;
   private final bwl.b d;
   private final byg<bvy<? super E>> e = new byg<>();
   private bvx.a f = bvx.a.a;

   public bwl(Map<cdi<?>, cdj> $$0, Set<cdi<?>> $$1, bwl.a $$2, bwl.b $$3, List<Pair<? extends bvy<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bvy<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bvx.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cdi<?>, cdj> $$1 : this.a.entrySet()) {
         cdi<?> $$2 = $$1.getKey();
         cdj $$3 = $$1.getValue();
         if (!$$0.dX().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arg $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bvx.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arg $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bvx.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bvx.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arg $$0, E $$1, long $$2) {
      this.f = bvx.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bvx.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dX()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bvy<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bvx.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(byg::a);

      private final Consumer<byg<?>> c;

      private a(final Consumer<byg<?>> $$0) {
         this.c = $$0;
      }

      public void a(byg<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends buf> void a(Stream<bvy<? super E>> $$0, arg $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvx.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends buf> void a(Stream<bvy<? super E>> $$0, arg $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvx.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends buf> void a(Stream<bvy<? super E>> var1, arg var2, E var3, long var4);
   }
}
