import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bif<E extends bfz> implements bhs<E> {
   private final Map<bpb<?>, bpc> a;
   private final Set<bpb<?>> b;
   private final bif.a c;
   private final bif.b d;
   private final bjz<bhs<? super E>> e = new bjz<>();
   private bhr.a f = bhr.a.a;

   public bif(Map<bpb<?>, bpc> $$0, Set<bpb<?>> $$1, bif.a $$2, bif.b $$3, List<Pair<? extends bhs<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bhs<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bhr.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bpb<?>, bpc> $$1 : this.a.entrySet()) {
         bpb<?> $$2 = $$1.getKey();
         bpc $$3 = $$1.getValue();
         if (!$$0.dK().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aif $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bhr.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aif $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bhr.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bhr.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aif $$0, E $$1, long $$2) {
      this.f = bhr.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bhr.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dK()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bhs<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bhr.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bjz::a);

      private final Consumer<bjz<?>> c;

      private a(Consumer<bjz<?>> $$0) {
         this.c = $$0;
      }

      public void a(bjz<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bfz> void a(Stream<bhs<? super E>> $$0, aif $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bhr.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bfz> void a(Stream<bhs<? super E>> $$0, aif $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bhr.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bfz> void a(Stream<bhs<? super E>> var1, aif var2, E var3, long var4);
   }
}
