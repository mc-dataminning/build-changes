import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class eft {
   public static final Codec<eft> h = lp.Z.q().dispatch(eft::a, efu::a);

   protected abstract efu<?> a();

   public abstract void a(eft.a var1);

   public static final class a {
      private final dcd a;
      private final BiConsumer<iz, dsb> b;
      private final azg c;
      private final ObjectArrayList<iz> d;
      private final ObjectArrayList<iz> e;
      private final ObjectArrayList<iz> f;

      public a(dcd $$0, BiConsumer<iz, dsb> $$1, azg $$2, Set<iz> $$3, Set<iz> $$4, Set<iz> $$5) {
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

      public void a(iz $$0, dss $$1) {
         this.a($$0, dfa.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(iz $$0, dsb $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iz $$0) {
         return this.a.a($$0, dsa.a::i);
      }

      public dcd a() {
         return this.a;
      }

      public azg b() {
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
