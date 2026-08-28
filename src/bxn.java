import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bxn<E extends bvg> implements bxa<E> {
   private final Map<cek<?>, cel> a;
   private final Set<cek<?>> b;
   private final bxn.a c;
   private final bxn.b d;
   private final bzi<bxa<? super E>> e = new bzi<>();
   private bwz.a f = bwz.a.a;

   public bxn(Map<cek<?>, cel> $$0, Set<cek<?>> $$1, bxn.a $$2, bxn.b $$3, List<Pair<? extends bxa<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bxa<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bwz.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cek<?>, cel> $$1 : this.a.entrySet()) {
         cek<?> $$2 = $$1.getKey();
         cel $$3 = $$1.getValue();
         if (!$$0.eb().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ard $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bwz.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ard $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bwz.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bwz.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ard $$0, E $$1, long $$2) {
      this.f = bwz.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bwz.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.eb()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bxa<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bwz.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bzi::a);

      private final Consumer<bzi<?>> c;

      private a(final Consumer<bzi<?>> $$0) {
         this.c = $$0;
      }

      public void a(bzi<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bvg> void a(Stream<bxa<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwz.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bvg> void a(Stream<bxa<? super E>> $$0, ard $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bwz.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bvg> void a(Stream<bxa<? super E>> var1, ard var2, E var3, long var4);
   }
}
