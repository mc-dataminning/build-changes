import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class eim {
   public static final Codec<eim> h = lu.X.q().dispatch(eim::a, ein::a);

   protected abstract ein<?> a();

   public abstract void a(eim.a var1);

   public static final class a {
      private final dem a;
      private final BiConsumer<je, duo> b;
      private final azl c;
      private final ObjectArrayList<je> d;
      private final ObjectArrayList<je> e;
      private final ObjectArrayList<je> f;

      public a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, Set<je> $$3, Set<je> $$4, Set<je> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ki::v));
         this.e.sort(Comparator.comparingInt(ki::v));
         this.f.sort(Comparator.comparingInt(ki::v));
      }

      public void a(je $$0, dvf $$1) {
         this.a($$0, dhl.ff.o().b($$1, Boolean.valueOf(true)));
      }

      public void a(je $$0, duo $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(je $$0) {
         return this.a.a($$0, dun.a::l);
      }

      public dem a() {
         return this.a;
      }

      public azl b() {
         return this.c;
      }

      public ObjectArrayList<je> c() {
         return this.d;
      }

      public ObjectArrayList<je> d() {
         return this.e;
      }

      public ObjectArrayList<je> e() {
         return this.f;
      }
   }
}
