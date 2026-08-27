import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsm {
   public static final Codec<dsm> h = jb.aa.q().dispatch(dsm::a, dsn::a);

   protected abstract dsn<?> a();

   public abstract void a(dsm.a var1);

   public static final class a {
      private final cqh a;
      private final BiConsumer<gw, dfd> b;
      private final ash c;
      private final ObjectArrayList<gw> d;
      private final ObjectArrayList<gw> e;
      private final ObjectArrayList<gw> f;

      public a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, Set<gw> $$3, Set<gw> $$4, Set<gw> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(hy::v));
         this.e.sort(Comparator.comparingInt(hy::v));
         this.f.sort(Comparator.comparingInt(hy::v));
      }

      public void a(gw $$0, dfu $$1) {
         this.a($$0, cte.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(gw $$0, dfd $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gw $$0) {
         return this.a.a($$0, dfc.a::i);
      }

      public cqh a() {
         return this.a;
      }

      public ash b() {
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
