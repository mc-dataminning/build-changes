import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bzz<E extends bxu> implements bzm<E> {
   private final Map<cgw<?>, cgx> a;
   private final Set<cgw<?>> b;
   private final bzz.a c;
   private final bzz.b d;
   private final cbu<bzm<? super E>> e = new cbu<>();
   private bzl.a f = bzl.a.a;

   public bzz(Map<cgw<?>, cgx> $$0, Set<cgw<?>> $$1, bzz.a $$2, bzz.b $$3, List<Pair<? extends bzm<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bzm<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bzl.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cgw<?>, cgx> $$1 : this.a.entrySet()) {
         cgw<?> $$2 = $$1.getKey();
         cgx $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ars $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bzl.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ars $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bzl.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bzl.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ars $$0, E $$1, long $$2) {
      this.f = bzl.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bzl.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bzm<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bzl.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cbu::a);

      private final Consumer<cbu<?>> c;

      private a(final Consumer<cbu<?>> $$0) {
         this.c = $$0;
      }

      public void a(cbu<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bxu> void a(Stream<bzm<? super E>> $$0, ars $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzl.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bxu> void a(Stream<bzm<? super E>> $$0, ars $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzl.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bxu> void a(Stream<bzm<? super E>> var1, ars var2, E var3, long var4);
   }
}
