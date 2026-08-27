import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dwp {
   public static final Codec<dwp> h = kd.Z.q().dispatch(dwp::a, dwq::a);

   protected abstract dwq<?> a();

   public abstract void a(dwp.a var1);

   public static final class a {
      private final ctu a;
      private final BiConsumer<hx, djg> b;
      private final auu c;
      private final ObjectArrayList<hx> d;
      private final ObjectArrayList<hx> e;
      private final ObjectArrayList<hx> f;

      public a(ctu $$0, BiConsumer<hx, djg> $$1, auu $$2, Set<hx> $$3, Set<hx> $$4, Set<hx> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jb::v));
         this.e.sort(Comparator.comparingInt(jb::v));
         this.f.sort(Comparator.comparingInt(jb::v));
      }

      public void a(hx $$0, djx $$1) {
         this.a($$0, cwr.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hx $$0, djg $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hx $$0) {
         return this.a.a($$0, djf.a::i);
      }

      public ctu a() {
         return this.a;
      }

      public auu b() {
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
