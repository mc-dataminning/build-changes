import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsu {
   public static final Codec<dsu> h = jd.aa.q().dispatch(dsu::a, dsv::a);

   protected abstract dsv<?> a();

   public abstract void a(dsu.a var1);

   public static final class a {
      private final cqd a;
      private final BiConsumer<gw, dfl> b;
      private final ase c;
      private final ObjectArrayList<gw> d;
      private final ObjectArrayList<gw> e;
      private final ObjectArrayList<gw> f;

      public a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, Set<gw> $$3, Set<gw> $$4, Set<gw> $$5) {
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

      public void a(gw $$0, dgc $$1) {
         this.a($$0, csy.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gw $$0, dfl $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gw $$0) {
         return this.a.a($$0, dfk.a::i);
      }

      public cqd a() {
         return this.a;
      }

      public ase b() {
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
