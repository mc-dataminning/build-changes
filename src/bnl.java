import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bnl<E extends blg> implements bmy<E> {
   private final Map<buh<?>, bui> a;
   private final Set<buh<?>> b;
   private final bnl.a c;
   private final bnl.b d;
   private final bpf<bmy<? super E>> e = new bpf<>();
   private bmx.a f = bmx.a.a;

   public bnl(Map<buh<?>, bui> $$0, Set<buh<?>> $$1, bnl.a $$2, bnl.b $$3, List<Pair<? extends bmy<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bmy<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bmx.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<buh<?>, bui> $$1 : this.a.entrySet()) {
         buh<?> $$2 = $$1.getKey();
         bui $$3 = $$1.getValue();
         if (!$$0.dP().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ame $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bmx.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ame $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bmx.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bmx.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ame $$0, E $$1, long $$2) {
      this.f = bmx.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bmx.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dP()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bmy<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bmx.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bpf::a);

      private final Consumer<bpf<?>> c;

      private a(Consumer<bpf<?>> $$0) {
         this.c = $$0;
      }

      public void a(bpf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends blg> void a(Stream<bmy<? super E>> $$0, ame $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bmx.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends blg> void a(Stream<bmy<? super E>> $$0, ame $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bmx.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends blg> void a(Stream<bmy<? super E>> var1, ame var2, E var3, long var4);
   }
}
