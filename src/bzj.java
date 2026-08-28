import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bzj<E extends bxe> implements byw<E> {
   private final Map<cgg<?>, cgh> a;
   private final Set<cgg<?>> b;
   private final bzj.a c;
   private final bzj.b d;
   private final cbe<byw<? super E>> e = new cbe<>();
   private byv.a f = byv.a.a;

   public bzj(Map<cgg<?>, cgh> $$0, Set<cgg<?>> $$1, bzj.a $$2, bzj.b $$3, List<Pair<? extends byw<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((byw<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public byv.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cgg<?>, cgh> $$1 : this.a.entrySet()) {
         cgg<?> $$2 = $$1.getKey();
         cgh $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arq $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = byv.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arq $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == byv.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == byv.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arq $$0, E $$1, long $$2) {
      this.f = byv.a.a;
      this.e.b().filter($$0x -> $$0x.a() == byv.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends byw<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == byv.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(cbe::a);

      private final Consumer<cbe<?>> c;

      private a(final Consumer<cbe<?>> $$0) {
         this.c = $$0;
      }

      public void a(cbe<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bxe> void a(Stream<byw<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byv.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bxe> void a(Stream<byw<? super E>> $$0, arq $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == byv.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bxe> void a(Stream<byw<? super E>> var1, arq var2, E var3, long var4);
   }
}
