import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ehc {
   public static final Codec<ehc> i = lh.Z.q().dispatch(ehc::a, ehd::a);

   protected abstract ehd<?> a();

   public abstract void a(ehc.a var1);

   public static final class a {
      private final dcg a;
      private final BiConsumer<ir, dtc> b;
      private final ayt c;
      private final ObjectArrayList<ir> d;
      private final ObjectArrayList<ir> e;
      private final ObjectArrayList<ir> f;

      public a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, Set<ir> $$3, Set<ir> $$4, Set<ir> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jv::v));
         this.e.sort(Comparator.comparingInt(jv::v));
         this.f.sort(Comparator.comparingInt(jv::v));
      }

      public void a(ir $$0, dtt $$1) {
         this.a($$0, dfe.fX.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(ir $$0, dtc $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ir $$0) {
         return this.a.a($$0, dtb.a::i);
      }

      public dcg a() {
         return this.a;
      }

      public ayt b() {
         return this.c;
      }

      public ObjectArrayList<ir> c() {
         return this.d;
      }

      public ObjectArrayList<ir> d() {
         return this.e;
      }

      public ObjectArrayList<ir> e() {
         return this.f;
      }
   }
}
