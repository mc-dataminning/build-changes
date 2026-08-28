import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class elt {
   public static final Codec<elt> h = ma.X.q().dispatch(elt::a, elu::a);

   protected abstract elu<?> a();

   public abstract void a(elt.a var1);

   public static final class a {
      private final dhn a;
      private final BiConsumer<jh, dxu> b;
      private final bam c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dhn $$0, BiConsumer<jh, dxu> $$1, bam $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
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

      public void a(jh $$0, dyl $$1) {
         this.a($$0, dkn.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dxu $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dxt.a::l);
      }

      public boolean a(jh $$0, Predicate<dxu> $$1) {
         return this.a.a($$0, $$1);
      }

      public dhn a() {
         return this.a;
      }

      public bam b() {
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
