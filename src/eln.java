import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class eln {
   public static final Codec<eln> h = ma.X.q().dispatch(eln::a, elo::a);

   protected abstract elo<?> a();

   public abstract void a(eln.a var1);

   public static final class a {
      private final dhf a;
      private final BiConsumer<jh, dxo> b;
      private final bac c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kl::v));
         this.e.sort(Comparator.comparingInt(kl::v));
         this.f.sort(Comparator.comparingInt(kl::v));
      }

      public void a(jh $$0, dyf $$1) {
         this.a($$0, dkf.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dxo $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dxn.a::l);
      }

      public boolean a(jh $$0, Predicate<dxo> $$1) {
         return this.a.a($$0, $$1);
      }

      public dhf a() {
         return this.a;
      }

      public bac b() {
         return this.c;
      }

      public ObjectArrayList<jh> c() {
         return this.d;
      }

      public ObjectArrayList<jh> d() {
         return this.e;
      }

      public ObjectArrayList<jh> e() {
         return this.f;
      }
   }
}
