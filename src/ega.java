import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ega {
   public static final Codec<ega> h = lq.X.r().dispatch(ega::a, egb::a);

   protected abstract egb<?> a();

   public abstract void a(ega.a var1);

   public static final class a {
      private final dcj a;
      private final BiConsumer<ja, dsh> b;
      private final aym c;
      private final ObjectArrayList<ja> d;
      private final ObjectArrayList<ja> e;
      private final ObjectArrayList<ja> f;

      public a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, Set<ja> $$3, Set<ja> $$4, Set<ja> $$5) {
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

      public void a(ja $$0, dsy $$1) {
         this.a($$0, dfh.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(ja $$0, dsh $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ja $$0) {
         return this.a.a($$0, dsg.a::i);
      }

      public dcj a() {
         return this.a;
      }

      public aym b() {
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
