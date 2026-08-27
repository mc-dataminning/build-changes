import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bug<E extends bsa> implements btt<E> {
   private final Map<cbd<?>, cbe> a;
   private final Set<cbd<?>> b;
   private final bug.a c;
   private final bug.b d;
   private final bwb<btt<? super E>> e = new bwb<>();
   private bts.a f = bts.a.a;

   public bug(Map<cbd<?>, cbe> $$0, Set<cbd<?>> $$1, bug.a $$2, bug.b $$3, List<Pair<? extends btt<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((btt<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bts.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<cbd<?>, cbe> $$1 : this.a.entrySet()) {
         cbd<?> $$2 = $$1.getKey();
         cbe $$3 = $$1.getValue();
         if (!$$0.dQ().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(aqh $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bts.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(aqh $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bts.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bts.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(aqh $$0, E $$1, long $$2) {
      this.f = bts.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bts.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dQ()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends btt<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bts.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bwb::a);

      private final Consumer<bwb<?>> c;

      private a(Consumer<bwb<?>> $$0) {
         this.c = $$0;
      }

      public void a(bwb<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bsa> void a(Stream<btt<? super E>> $$0, aqh $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bts.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bsa> void a(Stream<btt<? super E>> $$0, aqh $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bts.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bsa> void a(Stream<btt<? super E>> var1, aqh var2, E var3, long var4);
   }
}
