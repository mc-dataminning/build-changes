import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dvy {
   public static final Codec<dvy> h = kb.Z.q().dispatch(dvy::a, dvz::a);

   protected abstract dvz<?> a();

   public abstract void a(dvy.a var1);

   public static final class a {
      private final cte a;
      private final BiConsumer<hv, dip> b;
      private final auf c;
      private final ObjectArrayList<hv> d;
      private final ObjectArrayList<hv> e;
      private final ObjectArrayList<hv> f;

      public a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, Set<hv> $$3, Set<hv> $$4, Set<hv> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(iz::v));
         this.e.sort(Comparator.comparingInt(iz::v));
         this.f.sort(Comparator.comparingInt(iz::v));
      }

      public void a(hv $$0, djg $$1) {
         this.a($$0, cwb.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hv $$0, dip $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hv $$0) {
         return this.a.a($$0, dio.a::i);
      }

      public cte a() {
         return this.a;
      }

      public auf b() {
         return this.c;
      }

      public ObjectArrayList<hv> c() {
         return this.d;
      }

      public ObjectArrayList<hv> d() {
         return this.e;
      }

      public ObjectArrayList<hv> e() {
         return this.f;
      }
   }
}
