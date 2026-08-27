import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class boa<E extends blv> implements bnn<E> {
   private final Map<bux<?>, buy> a;
   private final Set<bux<?>> b;
   private final boa.a c;
   private final boa.b d;
   private final bpv<bnn<? super E>> e = new bpv<>();
   private bnm.a f = bnm.a.a;

   public boa(Map<bux<?>, buy> $$0, Set<bux<?>> $$1, boa.a $$2, boa.b $$3, List<Pair<? extends bnn<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bnn<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bnm.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bux<?>, buy> $$1 : this.a.entrySet()) {
         bux<?> $$2 = $$1.getKey();
         buy $$3 = $$1.getValue();
         if (!$$0.dO().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(amp $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bnm.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(amp $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bnm.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bnm.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(amp $$0, E $$1, long $$2) {
      this.f = bnm.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bnm.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dO()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bnn<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bnm.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bpv::a);

      private final Consumer<bpv<?>> c;

      private a(Consumer<bpv<?>> $$0) {
         this.c = $$0;
      }

      public void a(bpv<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends blv> void a(Stream<bnn<? super E>> $$0, amp $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnm.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends blv> void a(Stream<bnn<? super E>> $$0, amp $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bnm.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends blv> void a(Stream<bnn<? super E>> var1, amp var2, E var3, long var4);
   }
}
