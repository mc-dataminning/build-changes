import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class cak<E extends byf> implements bzx<E> {
   private final Map<chh<?>, chi> a;
   private final Set<chh<?>> b;
   private final cak.a c;
   private final cak.b d;
   private final ccf<bzx<? super E>> e = new ccf<>();
   private bzw.a f = bzw.a.a;

   public cak(Map<chh<?>, chi> $$0, Set<chh<?>> $$1, cak.a $$2, cak.b $$3, List<Pair<? extends bzx<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((bzx<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bzw.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<chh<?>, chi> $$1 : this.a.entrySet()) {
         chh<?> $$2 = $$1.getKey();
         chi $$3 = $$1.getValue();
         if (!$$0.ec().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(asb $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bzw.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(asb $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bzw.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bzw.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(asb $$0, E $$1, long $$2) {
      this.f = bzw.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bzw.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.ec()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends bzx<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bzw.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(ccf::a);

      private final Consumer<ccf<?>> c;

      private a(final Consumer<ccf<?>> $$0) {
         this.c = $$0;
      }

      public void a(ccf<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends byf> void a(Stream<bzx<? super E>> $$0, asb $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzw.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends byf> void a(Stream<bzx<? super E>> $$0, asb $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bzw.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends byf> void a(Stream<bzx<? super E>> var1, asb var2, E var3, long var4);
   }
}
