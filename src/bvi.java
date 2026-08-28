import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvi<E extends btb> implements buv<E> {
   private final Map<ccf<?>, ccg> a;
   private final Set<ccf<?>> b;
   private final bvi.a c;
   private final bvi.b d;
   private final bxd<buv<? super E>> e = new bxd<>();
   private buu.a f = buu.a.a;

   public bvi(Map<ccf<?>, ccg> $$0, Set<ccf<?>> $$1, bvi.a $$2, bvi.b $$3, List<Pair<? extends buv<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((buv<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public buu.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<ccf<?>, ccg> $$1 : this.a.entrySet()) {
         ccf<?> $$2 = $$1.getKey();
         ccg $$3 = $$1.getValue();
         if (!$$0.dU().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqm $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = buu.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqm $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == buu.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == buu.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqm $$0, E $$1, long $$2) {
      this.f = buu.a.a;
      this.e.b().filter($$0x -> $$0x.a() == buu.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dU()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends buv<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == buu.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxd::a);

      private final Consumer<bxd<?>> c;

      private a(final Consumer<bxd<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxd<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btb> void a(Stream<buv<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buu.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btb> void a(Stream<buv<? super E>> $$0, aqm $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == buu.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btb> void a(Stream<buv<? super E>> var1, aqm var2, E var3, long var4);
   }
}
