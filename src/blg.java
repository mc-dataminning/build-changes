import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class blg<E extends bjb> implements bkt<E> {
   private final Map<bsc<?>, bsd> a;
   private final Set<bsc<?>> b;
   private final blg.a c;
   private final blg.b d;
   private final bna<bkt<? super E>> e = new bna<>();
   private bks.a f = bks.a.a;

   public blg(Map<bsc<?>, bsd> $$0, Set<bsc<?>> $$1, blg.a $$2, blg.b $$3, List<Pair<? extends bkt<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bkt<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bks.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bsc<?>, bsd> $$1 : this.a.entrySet()) {
         bsc<?> $$2 = $$1.getKey();
         bsd $$3 = $$1.getValue();
         if (!$$0.dM().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(akn $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bks.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akn $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bks.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bks.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akn $$0, E $$1, long $$2) {
      this.f = bks.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bks.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dM()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bkt<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bks.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bna::a);

      private final Consumer<bna<?>> c;

      private a(Consumer<bna<?>> $$0) {
         this.c = $$0;
      }

      public void a(bna<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bjb> void a(Stream<bkt<? super E>> $$0, akn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bks.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bjb> void a(Stream<bkt<? super E>> $$0, akn $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bks.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bjb> void a(Stream<bkt<? super E>> var1, akn var2, E var3, long var4);
   }
}
