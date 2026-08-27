import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class duf {
   public static final Codec<duf> h = jy.aa.q().dispatch(duf::a, dug::a);

   protected abstract dug<?> a();

   public abstract void a(duf.a var1);

   public static final class a {
      private final cry a;
      private final BiConsumer<ht, dgw> b;
      private final ato c;
      private final ObjectArrayList<ht> d;
      private final ObjectArrayList<ht> e;
      private final ObjectArrayList<ht> f;

      public a(cry $$0, BiConsumer<ht, dgw> $$1, ato $$2, Set<ht> $$3, Set<ht> $$4, Set<ht> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(iw::v));
         this.e.sort(Comparator.comparingInt(iw::v));
         this.f.sort(Comparator.comparingInt(iw::v));
      }

      public void a(ht $$0, dhn $$1) {
         this.a($$0, cuv.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(ht $$0, dgw $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ht $$0) {
         return this.a.a($$0, dgv.a::i);
      }

      public cry a() {
         return this.a;
      }

      public ato b() {
         return this.c;
      }

      public ObjectArrayList<ht> c() {
         return this.d;
      }

      public ObjectArrayList<ht> d() {
         return this.e;
      }

      public ObjectArrayList<ht> e() {
         return this.f;
      }
   }
}
