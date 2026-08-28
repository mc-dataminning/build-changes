import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bwq<E extends buk> implements bwd<E> {
   private final Map<cdn<?>, cdo> a;
   private final Set<cdn<?>> b;
   private final bwq.a c;
   private final bwq.b d;
   private final byl<bwd<? super E>> e = new byl<>();
   private bwc.a f = bwc.a.a;

   public bwq(Map<cdn<?>, cdo> $$0, Set<cdn<?>> $$1, bwq.a $$2, bwq.b $$3, List<Pair<? extends bwd<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bwd<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bwc.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cdn<?>, cdo> $$1 : this.a.entrySet()) {
         cdn<?> $$2 = $$1.getKey();
         cdo $$3 = $$1.getValue();
         if (!$$0.dX().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arh $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bwc.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arh $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bwc.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bwc.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arh $$0, E $$1, long $$2) {
      this.f = bwc.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bwc.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dX()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bwd<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bwc.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(byl::a);

      private final Consumer<byl<?>> c;

      private a(final Consumer<byl<?>> $$0) {
         this.c = $$0;
      }

      public void a(byl<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends buk> void a(Stream<bwd<? super E>> $$0, arh $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwc.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends buk> void a(Stream<bwd<? super E>> $$0, arh $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwc.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends buk> void a(Stream<bwd<? super E>> var1, arh var2, E var3, long var4);
   }
}
