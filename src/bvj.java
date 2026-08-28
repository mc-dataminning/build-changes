import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvj<E extends btc> implements buw<E> {
   private final Map<ccg<?>, cch> a;
   private final Set<ccg<?>> b;
   private final bvj.a c;
   private final bvj.b d;
   private final bxe<buw<? super E>> e = new bxe<>();
   private buv.a f = buv.a.a;

   public bvj(Map<ccg<?>, cch> $$0, Set<ccg<?>> $$1, bvj.a $$2, bvj.b $$3, List<Pair<? extends buw<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((buw<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public buv.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<ccg<?>, cch> $$1 : this.a.entrySet()) {
         ccg<?> $$2 = $$1.getKey();
         cch $$3 = $$1.getValue();
         if (!$$0.dV().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqm $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = buv.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqm $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == buv.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == buv.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqm $$0, E $$1, long $$2) {
      this.f = buv.a.a;
      this.e.b().filter($$0x -> $$0x.a() == buv.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dV()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends buw<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == buv.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxe::a);

      private final Consumer<bxe<?>> c;

      private a(final Consumer<bxe<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxe<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btc> void a(Stream<buw<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buv.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btc> void a(Stream<buw<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buv.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btc> void a(Stream<buw<? super E>> var1, aqm var2, E var3, long var4);
   }
}
