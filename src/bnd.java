import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bnd<E extends bky> implements bmq<E> {
   private final Map<btz<?>, bua> a;
   private final Set<btz<?>> b;
   private final bnd.a c;
   private final bnd.b d;
   private final box<bmq<? super E>> e = new box<>();
   private bmp.a f = bmp.a.a;

   public bnd(Map<btz<?>, bua> $$0, Set<btz<?>> $$1, bnd.a $$2, bnd.b $$3, List<Pair<? extends bmq<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bmq<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bmp.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<btz<?>, bua> $$1 : this.a.entrySet()) {
         btz<?> $$2 = $$1.getKey();
         bua $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ama $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bmp.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ama $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bmp.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bmp.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ama $$0, E $$1, long $$2) {
      this.f = bmp.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bmp.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bmq<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bmp.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(box::a);

      private final Consumer<box<?>> c;

      private a(Consumer<box<?>> $$0) {
         this.c = $$0;
      }

      public void a(box<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bky> void a(Stream<bmq<? super E>> $$0, ama $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bmp.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bky> void a(Stream<bmq<? super E>> $$0, ama $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bmp.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bky> void a(Stream<bmq<? super E>> var1, ama var2, E var3, long var4);
   }
}
