import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dyo {
   public static final Codec<dyo> h = kf.Z.q().dispatch(dyo::a, dyp::a);

   protected abstract dyp<?> a();

   public abstract void a(dyo.a var1);

   public static final class a {
      private final cvt a;
      private final BiConsumer<hz, dlf> b;
      private final awo c;
      private final ObjectArrayList<hz> d;
      private final ObjectArrayList<hz> e;
      private final ObjectArrayList<hz> f;

      public a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, Set<hz> $$3, Set<hz> $$4, Set<hz> $$5) {
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

      public void a(hz $$0, dlw $$1) {
         this.a($$0, cyq.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(hz $$0, dlf $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(hz $$0) {
         return this.a.a($$0, dle.a::i);
      }

      public cvt a() {
         return this.a;
      }

      public awo b() {
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
