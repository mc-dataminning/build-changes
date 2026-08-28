import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ejh {
   public static final Codec<ejh> h = ly.X.q().dispatch(ejh::a, eji::a);

   protected abstract eji<?> a();

   public abstract void a(ejh.a var1);

   public static final class a {
      private final dfh a;
      private final BiConsumer<jh, dvj> b;
      private final azs c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dfh $$0, BiConsumer<jh, dvj> $$1, azs $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kl::v));
         this.e.sort(Comparator.comparingInt(kl::v));
         this.f.sort(Comparator.comparingInt(kl::v));
      }

      public void a(jh $$0, dwa $$1) {
         this.a($$0, dig.ff.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dvj $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dvi.a::l);
      }

      public dfh a() {
         return this.a;
      }

      public azs b() {
         return this.c;
      }

      public ObjectArrayList<jh> c() {
         return this.d;
      }

      public ObjectArrayList<jh> d() {
         return this.e;
      }

      public ObjectArrayList<jh> e() {
         return this.f;
      }
   }
}
