import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dyv {
   public static final Codec<dyv> h = kf.Z.q().dispatch(dyv::a, dyw::a);

   protected abstract dyw<?> a();

   public abstract void a(dyv.a var1);

   public static final class a {
      private final cvx a;
      private final BiConsumer<hz, dlj> b;
      private final awp c;
      private final ObjectArrayList<hz> d;
      private final ObjectArrayList<hz> e;
      private final ObjectArrayList<hz> f;

      public a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, Set<hz> $$3, Set<hz> $$4, Set<hz> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jd::v));
         this.e.sort(Comparator.comparingInt(jd::v));
         this.f.sort(Comparator.comparingInt(jd::v));
      }

      public void a(hz $$0, dma $$1) {
         this.a($$0, cyu.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hz $$0, dlj $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hz $$0) {
         return this.a.a($$0, dli.a::i);
      }

      public cvx a() {
         return this.a;
      }

      public awp b() {
         return this.c;
      }

      public ObjectArrayList<hz> c() {
         return this.d;
      }

      public ObjectArrayList<hz> d() {
         return this.e;
      }

      public ObjectArrayList<hz> e() {
         return this.f;
      }
   }
}
