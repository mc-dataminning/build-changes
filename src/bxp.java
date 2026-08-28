import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bxp<E extends bvi> implements bxc<E> {
   private final Map<cem<?>, cen> a;
   private final Set<cem<?>> b;
   private final bxp.a c;
   private final bxp.b d;
   private final bzk<bxc<? super E>> e = new bzk<>();
   private bxb.a f = bxb.a.a;

   public bxp(Map<cem<?>, cen> $$0, Set<cem<?>> $$1, bxp.a $$2, bxp.b $$3, List<Pair<? extends bxc<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxc<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bxb.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cem<?>, cen> $$1 : this.a.entrySet()) {
         cem<?> $$2 = $$1.getKey();
         cen $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bxb.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bxb.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bxb.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.f = bxb.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bxb.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxc<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bxb.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bzk::a);

      private final Consumer<bzk<?>> c;

      private a(final Consumer<bzk<?>> $$0) {
         this.c = $$0;
      }

      public void a(bzk<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bvi> void a(Stream<bxc<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxb.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bvi> void a(Stream<bxc<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bxb.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bvi> void a(Stream<bxc<? super E>> var1, ard var2, E var3, long var4);
   }
}
