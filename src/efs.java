import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class efs {
   public static final Codec<efs> h = lp.Z.q().dispatch(efs::a, eft::a);

   protected abstract eft<?> a();

   public abstract void a(efs.a var1);

   public static final class a {
      private final dcc a;
      private final BiConsumer<iz, dsa> b;
      private final azf c;
      private final ObjectArrayList<iz> d;
      private final ObjectArrayList<iz> e;
      private final ObjectArrayList<iz> f;

      public a(dcc $$0, BiConsumer<iz, dsa> $$1, azf $$2, Set<iz> $$3, Set<iz> $$4, Set<iz> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kd::v));
         this.e.sort(Comparator.comparingInt(kd::v));
         this.f.sort(Comparator.comparingInt(kd::v));
      }

      public void a(iz $$0, dsr $$1) {
         this.a($$0, dez.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(iz $$0, dsa $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iz $$0) {
         return this.a.a($$0, drz.a::i);
      }

      public dcc a() {
         return this.a;
      }

      public azf b() {
         return this.c;
      }

      public ObjectArrayList<iz> c() {
         return this.d;
      }

      public ObjectArrayList<iz> d() {
         return this.e;
      }

      public ObjectArrayList<iz> e() {
         return this.f;
      }
   }
}
