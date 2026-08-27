import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dwj {
   public static final Codec<dwj> h = kd.Z.q().dispatch(dwj::a, dwk::a);

   protected abstract dwk<?> a();

   public abstract void a(dwj.a var1);

   public static final class a {
      private final cto a;
      private final BiConsumer<hx, dja> b;
      private final aup c;
      private final ObjectArrayList<hx> d;
      private final ObjectArrayList<hx> e;
      private final ObjectArrayList<hx> f;

      public a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, Set<hx> $$3, Set<hx> $$4, Set<hx> $$5) {
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

      public void a(hx $$0, djr $$1) {
         this.a($$0, cwl.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hx $$0, dja $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hx $$0) {
         return this.a.a($$0, diz.a::i);
      }

      public cto a() {
         return this.a;
      }

      public aup b() {
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
