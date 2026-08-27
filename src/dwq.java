import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dwq {
   public static final Codec<dwq> h = kd.Z.q().dispatch(dwq::a, dwr::a);

   protected abstract dwr<?> a();

   public abstract void a(dwq.a var1);

   public static final class a {
      private final ctv a;
      private final BiConsumer<hx, djh> b;
      private final auv c;
      private final ObjectArrayList<hx> d;
      private final ObjectArrayList<hx> e;
      private final ObjectArrayList<hx> f;

      public a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, Set<hx> $$3, Set<hx> $$4, Set<hx> $$5) {
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

      public void a(hx $$0, djy $$1) {
         this.a($$0, cws.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hx $$0, djh $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hx $$0) {
         return this.a.a($$0, djg.a::i);
      }

      public ctv a() {
         return this.a;
      }

      public auv b() {
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
