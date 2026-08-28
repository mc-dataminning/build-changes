import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class byi<E extends bwb> implements bxv<E> {
   private final Map<cff<?>, cfg> a;
   private final Set<cff<?>> b;
   private final byi.a c;
   private final byi.b d;
   private final cad<bxv<? super E>> e = new cad<>();
   private bxu.a f = bxu.a.a;

   public byi(Map<cff<?>, cfg> $$0, Set<cff<?>> $$1, byi.a $$2, byi.b $$3, List<Pair<? extends bxv<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxv<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxu.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cff<?>, cfg> $$1 : this.a.entrySet()) {
         cff<?> $$2 = $$1.getKey();
         cfg $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ash $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxu.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ash $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxu.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxu.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ash $$0, E $$1, long $$2) {
      this.f = bxu.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxu.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxv<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxu.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cad::a);

      private final Consumer<cad<?>> c;

      private a(final Consumer<cad<?>> $$0) {
         this.c = $$0;
      }

      public void a(cad<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bwb> void a(Stream<bxv<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxu.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bwb> void a(Stream<bxv<? super E>> $$0, ash $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxu.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bwb> void a(Stream<bxv<? super E>> var1, ash var2, E var3, long var4);
   }
}
