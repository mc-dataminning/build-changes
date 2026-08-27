import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class blr<E extends bjm> implements ble<E> {
   private final Map<bsn<?>, bso> a;
   private final Set<bsn<?>> b;
   private final blr.a c;
   private final blr.b d;
   private final bnl<ble<? super E>> e = new bnl<>();
   private bld.a f = bld.a.a;

   public blr(Map<bsn<?>, bso> $$0, Set<bsn<?>> $$1, blr.a $$2, blr.b $$3, List<Pair<? extends ble<? super E>, Integer>> $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      $$4.forEach($$0x -> this.e.a((ble<? super E>)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   @Override
   public bld.a a() {
      return this.f;
   }

   private boolean a(E $$0) {
      for (Entry<bsn<?>, bso> $$1 : this.a.entrySet()) {
         bsn<?> $$2 = $$1.getKey();
         bso $$3 = $$1.getValue();
         if (!$$0.dN().a($$2, $$3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public final boolean e(akt $$0, E $$1, long $$2) {
      if (this.a($$1)) {
         this.f = bld.a.b;
         this.c.a(this.e);
         this.d.a(this.e.b(), $$0, $$1, $$2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final void f(akt $$0, E $$1, long $$2) {
      this.e.b().filter($$0x -> $$0x.a() == bld.a.b).forEach($$3 -> $$3.f($$0, $$1, $$2));
      if (this.e.b().noneMatch($$0x -> $$0x.a() == bld.a.b)) {
         this.g($$0, $$1, $$2);
      }
   }

   @Override
   public final void g(akt $$0, E $$1, long $$2) {
      this.f = bld.a.a;
      this.e.b().filter($$0x -> $$0x.a() == bld.a.b).forEach($$3 -> $$3.g($$0, $$1, $$2));
      this.b.forEach($$1.dN()::b);
   }

   @Override
   public String b() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      Set<? extends ble<? super E>> $$0 = this.e.b().filter($$0x -> $$0x.a() == bld.a.b).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + $$0;
   }

   public static enum a {
      a($$0 -> {
      }),
      b(bnl::a);

      private final Consumer<bnl<?>> c;

      private a(Consumer<bnl<?>> $$0) {
         this.c = $$0;
      }

      public void a(bnl<?> $$0) {
         this.c.accept($$0);
      }
   }

   public static enum b {
      a {
         @Override
         public <E extends bjm> void a(Stream<ble<? super E>> $$0, akt $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bld.a.a).filter($$3x -> $$3x.e($$1, $$2, $$3)).findFirst();
         }
      },
      b {
         @Override
         public <E extends bjm> void a(Stream<ble<? super E>> $$0, akt $$1, E $$2, long $$3) {
            $$0.filter($$0x -> $$0x.a() == bld.a.a).forEach($$3x -> $$3x.e($$1, $$2, $$3));
         }
      };

      public abstract <E extends bjm> void a(Stream<ble<? super E>> var1, akt var2, E var3, long var4);
   }
}
