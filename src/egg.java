import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class egg {
   public static final Codec<egg> h = lq.X.r().dispatch(egg::a, egh::a);

   protected abstract egh<?> a();

   public abstract void a(egg.a var1);

   public static final class a {
      private final dcl a;
      private final BiConsumer<ja, dsk> b;
      private final ayo c;
      private final ObjectArrayList<ja> d;
      private final ObjectArrayList<ja> e;
      private final ObjectArrayList<ja> f;

      public a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, Set<ja> $$3, Set<ja> $$4, Set<ja> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ke::v));
         this.e.sort(Comparator.comparingInt(ke::v));
         this.f.sort(Comparator.comparingInt(ke::v));
      }

      public void a(ja $$0, dtb $$1) {
         this.a($$0, dfj.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(ja $$0, dsk $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ja $$0) {
         return this.a.a($$0, dsj.a::i);
      }

      public dcl a() {
         return this.a;
      }

      public ayo b() {
         return this.c;
      }

      public ObjectArrayList<ja> c() {
         return this.d;
      }

      public ObjectArrayList<ja> d() {
         return this.e;
      }

      public ObjectArrayList<ja> e() {
         return this.f;
      }
   }
}
