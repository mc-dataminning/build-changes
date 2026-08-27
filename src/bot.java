import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class bot<E extends bmo> implements bog<E> {
   private final Map<bvq<?>, bvr> a;
   private final Set<bvq<?>> b;
   private final bot.a c;
   private final bot.b d;
   private final bqo<bog<? super E>> e = new bqo<>();
   private bof.a f = bof.a.a;

   public bot(Map<bvq<?>, bvr> $$0, Set<bvq<?>> $$1, bot.a $$2, bot.b $$3, List<Pair<? extends bog<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bog<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bof.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bvq<?>, bvr> $$1 : this.a.entrySet()) {
         bvq<?> $$2 = $$1.getKey();
         bvr $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(ane $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bof.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(ane $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bof.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bof.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(ane $$0, E $$1, long $$2) {
      this.f = bof.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bof.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bog<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bof.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bqo::a);

      private final Consumer<bqo<?>> c;

      private a(Consumer<bqo<?>> $$0) {
         this.c = $$0;
      }

      public void a(bqo<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bmo> void a(Stream<bog<? super E>> $$0, ane $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bof.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bmo> void a(Stream<bog<? super E>> $$0, ane $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bof.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bmo> void a(Stream<bog<? super E>> var1, ane var2, E var3, long var4);
   }
}
