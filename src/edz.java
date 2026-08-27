import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class edz {
   public static final Codec<edz> h = ld.Z.q().dispatch(edz::a, eea::a);

   protected abstract eea<?> a();

   public abstract void a(edz.a var1);

   public static final class a {
      private final daj a;
      private final BiConsumer<in, dqh> b;
      private final ayg c;
      private final ObjectArrayList<in> d;
      private final ObjectArrayList<in> e;
      private final ObjectArrayList<in> f;

      public a(daj $$0, BiConsumer<in, dqh> $$1, ayg $$2, Set<in> $$3, Set<in> $$4, Set<in> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jr::v));
         this.e.sort(Comparator.comparingInt(jr::v));
         this.f.sort(Comparator.comparingInt(jr::v));
      }

      public void a(in $$0, dqy $$1) {
         this.a($$0, ddg.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(in $$0, dqh $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(in $$0) {
         return this.a.a($$0, dqg.a::i);
      }

      public daj a() {
         return this.a;
      }

      public ayg b() {
         return this.c;
      }

      public ObjectArrayList<in> c() {
         return this.d;
      }

      public ObjectArrayList<in> d() {
         return this.e;
      }

      public ObjectArrayList<in> e() {
         return this.f;
      }
   }
}
