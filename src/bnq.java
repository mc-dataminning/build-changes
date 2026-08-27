import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bnq<E extends bll> implements bnd<E> {
   private final Map<bum<?>, bun> a;
   private final Set<bum<?>> b;
   private final bnq.a c;
   private final bnq.b d;
   private final bpk<bnd<? super E>> e = new bpk<>();
   private bnc.a f = bnc.a.a;

   public bnq(Map<bum<?>, bun> $$0, Set<bum<?>> $$1, bnq.a $$2, bnq.b $$3, List<Pair<? extends bnd<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bnd<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bnc.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bum<?>, bun> $$1 : this.a.entrySet()) {
         bum<?> $$2 = $$1.getKey();
         bun $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ami $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bnc.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ami $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bnc.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bnc.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ami $$0, E $$1, long $$2) {
      this.f = bnc.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bnc.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dP()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bnd<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bnc.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bpk::a);

      private final Consumer<bpk<?>> c;

      private a(Consumer<bpk<?>> $$0) {
         this.c = $$0;
      }

      public void a(bpk<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bll> void a(Stream<bnd<? super E>> $$0, ami $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnc.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bll> void a(Stream<bnd<? super E>> $$0, ami $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnc.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bll> void a(Stream<bnd<? super E>> var1, ami var2, E var3, long var4);
   }
}
