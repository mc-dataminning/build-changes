import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bwt<E extends bun> implements bwg<E> {
   private final Map<cdq<?>, cdr> a;
   private final Set<cdq<?>> b;
   private final bwt.a c;
   private final bwt.b d;
   private final byo<bwg<? super E>> e = new byo<>();
   private bwf.a f = bwf.a.a;

   public bwt(Map<cdq<?>, cdr> $$0, Set<cdq<?>> $$1, bwt.a $$2, bwt.b $$3, List<Pair<? extends bwg<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bwg<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bwf.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cdq<?>, cdr> $$1 : this.a.entrySet()) {
         cdq<?> $$2 = $$1.getKey();
         cdr $$3 = $$1.getValue();
         if (!$$0.dY().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arj $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bwf.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arj $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bwf.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bwf.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arj $$0, E $$1, long $$2) {
      this.f = bwf.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bwf.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dY()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bwg<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bwf.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(byo::a);

      private final Consumer<byo<?>> c;

      private a(final Consumer<byo<?>> $$0) {
         this.c = $$0;
      }

      public void a(byo<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bun> void a(Stream<bwg<? super E>> $$0, arj $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwf.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bun> void a(Stream<bwg<? super E>> $$0, arj $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwf.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bun> void a(Stream<bwg<? super E>> var1, arj var2, E var3, long var4);
   }
}
