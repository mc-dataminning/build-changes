import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ejs {
   public static final Codec<ejs> h = lz.X.q().dispatch(ejs::a, ejt::a);

   protected abstract ejt<?> a();

   public abstract void a(ejs.a var1);

   public static final class a {
      private final dfs a;
      private final BiConsumer<jh, dvv> b;
      private final azu c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dfs $$0, BiConsumer<jh, dvv> $$1, azu $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
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

      public void a(jh $$0, dwm $$1) {
         this.a($$0, dis.ff.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dvv $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dvu.a::l);
      }

      public dfs a() {
         return this.a;
      }

      public azu b() {
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
