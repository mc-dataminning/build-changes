import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bsu<E extends bqo> implements bsh<E> {
   private final Map<bzr<?>, bzs> a;
   private final Set<bzr<?>> b;
   private final bsu.a c;
   private final bsu.b d;
   private final bup<bsh<? super E>> e = new bup<>();
   private bsg.a f = bsg.a.a;

   public bsu(Map<bzr<?>, bzs> $$0, Set<bzr<?>> $$1, bsu.a $$2, bsu.b $$3, List<Pair<? extends bsh<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bsh<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bsg.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bzr<?>, bzs> $$1 : this.a.entrySet()) {
         bzr<?> $$2 = $$1.getKey();
         bzs $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aps $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bsg.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aps $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bsg.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bsg.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aps $$0, E $$1, long $$2) {
      this.f = bsg.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bsg.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dP()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bsh<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bsg.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bup::a);

      private final Consumer<bup<?>> c;

      private a(Consumer<bup<?>> $$0) {
         this.c = $$0;
      }

      public void a(bup<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bqo> void a(Stream<bsh<? super E>> $$0, aps $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsg.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bqo> void a(Stream<bsh<? super E>> $$0, aps $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bsg.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bqo> void a(Stream<bsh<? super E>> var1, aps var2, E var3, long var4);
   }
}
