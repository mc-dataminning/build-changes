import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bvr<E extends btk> implements bve<E> {
   private final Map<cco<?>, ccp> a;
   private final Set<cco<?>> b;
   private final bvr.a c;
   private final bvr.b d;
   private final bxm<bve<? super E>> e = new bxm<>();
   private bvd.a f = bvd.a.a;

   public bvr(Map<cco<?>, ccp> $$0, Set<cco<?>> $$1, bvr.a $$2, bvr.b $$3, List<Pair<? extends bve<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bve<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bvd.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cco<?>, ccp> $$1 : this.a.entrySet()) {
         cco<?> $$2 = $$1.getKey();
         ccp $$3 = $$1.getValue();
         if (!$$0.dS().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(arb $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bvd.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(arb $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bvd.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bvd.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(arb $$0, E $$1, long $$2) {
      this.f = bvd.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bvd.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dS()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bve<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bvd.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bxm::a);

      private final Consumer<bxm<?>> c;

      private a(final Consumer<bxm<?>> $$0) {
         this.c = $$0;
      }

      public void a(bxm<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends btk> void a(Stream<bve<? super E>> $$0, arb $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvd.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends btk> void a(Stream<bve<? super E>> $$0, arb $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bvd.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends btk> void a(Stream<bve<? super E>> var1, arb var2, E var3, long var4);
   }
}
