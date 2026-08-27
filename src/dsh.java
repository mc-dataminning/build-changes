import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsh {
   public static final Codec<dsh> h = jc.aa.q().dispatch(dsh::a, dsi::a);

   protected abstract dsi<?> a();

   public abstract void a(dsh.a var1);

   public static final class a {
      private final cpq a;
      private final BiConsumer<gv, dey> b;
      private final art c;
      private final ObjectArrayList<gv> d;
      private final ObjectArrayList<gv> e;
      private final ObjectArrayList<gv> f;

      public a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, Set<gv> $$3, Set<gv> $$4, Set<gv> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ia::v));
         this.e.sort(Comparator.comparingInt(ia::v));
         this.f.sort(Comparator.comparingInt(ia::v));
      }

      public void a(gv $$0, dfp $$1) {
         this.a($$0, csl.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gv $$0, dey $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gv $$0) {
         return this.a.a($$0, dex.a::i);
      }

      public cpq a() {
         return this.a;
      }

      public art b() {
         return this.c;
      }

      public ObjectArrayList<gv> c() {
         return this.d;
      }

      public ObjectArrayList<gv> d() {
         return this.e;
      }

      public ObjectArrayList<gv> e() {
         return this.f;
      }
   }
}
