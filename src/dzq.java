import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dzq {
   public static final Codec<dzq> h = kh.Z.q().dispatch(dzq::a, dzr::a);

   protected abstract dzr<?> a();

   public abstract void a(dzq.a var1);

   public static final class a {
      private final cwk a;
      private final BiConsumer<ib, dme> b;
      private final awt c;
      private final ObjectArrayList<ib> d;
      private final ObjectArrayList<ib> e;
      private final ObjectArrayList<ib> f;

      public a(cwk $$0, BiConsumer<ib, dme> $$1, awt $$2, Set<ib> $$3, Set<ib> $$4, Set<ib> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jf::v));
         this.e.sort(Comparator.comparingInt(jf::v));
         this.f.sort(Comparator.comparingInt(jf::v));
      }

      public void a(ib $$0, dmv $$1) {
         this.a($$0, czh.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(ib $$0, dme $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ib $$0) {
         return this.a.a($$0, dmd.a::i);
      }

      public cwk a() {
         return this.a;
      }

      public awt b() {
         return this.c;
      }

      public ObjectArrayList<ib> c() {
         return this.d;
      }

      public ObjectArrayList<ib> d() {
         return this.e;
      }

      public ObjectArrayList<ib> e() {
         return this.f;
      }
   }
}
