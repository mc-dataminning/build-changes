import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsn {
   public static final Codec<dsn> h = jd.aa.q().dispatch(dsn::a, dso::a);

   protected abstract dso<?> a();

   public abstract void a(dsn.a var1);

   public static final class a {
      private final cpw a;
      private final BiConsumer<gw, dfe> b;
      private final arx c;
      private final ObjectArrayList<gw> d;
      private final ObjectArrayList<gw> e;
      private final ObjectArrayList<gw> f;

      public a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, Set<gw> $$3, Set<gw> $$4, Set<gw> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ib::v));
         this.e.sort(Comparator.comparingInt(ib::v));
         this.f.sort(Comparator.comparingInt(ib::v));
      }

      public void a(gw $$0, dfv $$1) {
         this.a($$0, csr.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gw $$0, dfe $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gw $$0) {
         return this.a.a($$0, dfd.a::i);
      }

      public cpw a() {
         return this.a;
      }

      public arx b() {
         return this.c;
      }

      public ObjectArrayList<gw> c() {
         return this.d;
      }

      public ObjectArrayList<gw> d() {
         return this.e;
      }

      public ObjectArrayList<gw> e() {
         return this.f;
      }
   }
}
