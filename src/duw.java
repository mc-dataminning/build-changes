import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class duw {
   public static final Codec<duw> h = kc.aa.q().dispatch(duw::a, dux::a);

   protected abstract dux<?> a();

   public abstract void a(duw.a var1);

   public static final class a {
      private final csl a;
      private final BiConsumer<hx, dhn> b;
      private final atw c;
      private final ObjectArrayList<hx> d;
      private final ObjectArrayList<hx> e;
      private final ObjectArrayList<hx> f;

      public a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, Set<hx> $$3, Set<hx> $$4, Set<hx> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ja::v));
         this.e.sort(Comparator.comparingInt(ja::v));
         this.f.sort(Comparator.comparingInt(ja::v));
      }

      public void a(hx $$0, die $$1) {
         this.a($$0, cvh.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hx $$0, dhn $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hx $$0) {
         return this.a.a($$0, dhm.a::i);
      }

      public csl a() {
         return this.a;
      }

      public atw b() {
         return this.c;
      }

      public ObjectArrayList<hx> c() {
         return this.d;
      }

      public ObjectArrayList<hx> d() {
         return this.e;
      }

      public ObjectArrayList<hx> e() {
         return this.f;
      }
   }
}
