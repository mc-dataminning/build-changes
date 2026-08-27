import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class brd<E extends box> implements bqq<E> {
   private final Map<bya<?>, byb> a;
   private final Set<bya<?>> b;
   private final brd.a c;
   private final brd.b d;
   private final bsy<bqq<? super E>> e = new bsy<>();
   private bqp.a f = bqp.a.a;

   public brd(Map<bya<?>, byb> $$0, Set<bya<?>> $$1, brd.a $$2, brd.b $$3, List<Pair<? extends bqq<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bqq<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bqp.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bya<?>, byb> $$1 : this.a.entrySet()) {
         bya<?> $$2 = $$1.getKey();
         byb $$3 = $$1.getValue();
         if (!$$0.dM().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(apa $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bqp.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(apa $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bqp.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bqp.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(apa $$0, E $$1, long $$2) {
      this.f = bqp.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bqp.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dM()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bqq<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bqp.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bsy::a);

      private final Consumer<bsy<?>> c;

      private a(Consumer<bsy<?>> $$0) {
         this.c = $$0;
      }

      public void a(bsy<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends box> void a(Stream<bqq<? super E>> $$0, apa $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bqp.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends box> void a(Stream<bqq<? super E>> $$0, apa $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bqp.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends box> void a(Stream<bqq<? super E>> var1, apa var2, E var3, long var4);
   }
}
