import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class eda {
   public static final Codec<eda> h = kt.Z.q().dispatch(eda::a, edb::a);

   protected abstract edb<?> a();

   public abstract void a(eda.a var1);

   public static final class a {
      private final czm a;
      private final BiConsumer<id, dpi> b;
      private final axt c;
      private final ObjectArrayList<id> d;
      private final ObjectArrayList<id> e;
      private final ObjectArrayList<id> f;

      public a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, Set<id> $$3, Set<id> $$4, Set<id> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ji::v));
         this.e.sort(Comparator.comparingInt(ji::v));
         this.f.sort(Comparator.comparingInt(ji::v));
      }

      public void a(id $$0, dpz $$1) {
         this.a($$0, dcj.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(id $$0, dpi $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(id $$0) {
         return this.a.a($$0, dph.a::i);
      }

      public czm a() {
         return this.a;
      }

      public axt b() {
         return this.c;
      }

      public ObjectArrayList<id> c() {
         return this.d;
      }

      public ObjectArrayList<id> d() {
         return this.e;
      }

      public ObjectArrayList<id> e() {
         return this.f;
      }
   }
}
