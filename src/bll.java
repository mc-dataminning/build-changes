import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bll<E extends bjg> implements bky<E> {
   private final Map<bsh<?>, bsi> a;
   private final Set<bsh<?>> b;
   private final bll.a c;
   private final bll.b d;
   private final bnf<bky<? super E>> e = new bnf<>();
   private bkx.a f = bkx.a.a;

   public bll(Map<bsh<?>, bsi> $$0, Set<bsh<?>> $$1, bll.a $$2, bll.b $$3, List<Pair<? extends bky<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bky<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bkx.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bsh<?>, bsi> $$1 : this.a.entrySet()) {
         bsh<?> $$2 = $$1.getKey();
         bsi $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(akr $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bkx.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akr $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bkx.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bkx.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akr $$0, E $$1, long $$2) {
      this.f = bkx.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bkx.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bky<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bkx.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bnf::a);

      private final Consumer<bnf<?>> c;

      private a(Consumer<bnf<?>> $$0) {
         this.c = $$0;
      }

      public void a(bnf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bjg> void a(Stream<bky<? super E>> $$0, akr $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkx.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bjg> void a(Stream<bky<? super E>> $$0, akr $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bkx.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bjg> void a(Stream<bky<? super E>> var1, akr var2, E var3, long var4);
   }
}
