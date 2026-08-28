import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class egz {
   public static final Codec<egz> h = lt.X.r().dispatch(egz::a, eha::a);

   protected abstract eha<?> a();

   public abstract void a(egz.a var1);

   public static final class a {
      private final ddc a;
      private final BiConsumer<jd, dtc> b;
      private final ayw c;
      private final ObjectArrayList<jd> d;
      private final ObjectArrayList<jd> e;
      private final ObjectArrayList<jd> f;

      public a(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, Set<jd> $$3, Set<jd> $$4, Set<jd> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kh::v));
         this.e.sort(Comparator.comparingInt(kh::v));
         this.f.sort(Comparator.comparingInt(kh::v));
      }

      public void a(jd $$0, dtt $$1) {
         this.a($$0, dga.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(jd $$0, dtc $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jd $$0) {
         return this.a.a($$0, dtb.a::i);
      }

      public ddc a() {
         return this.a;
      }

      public ayw b() {
         return this.c;
      }

      public ObjectArrayList<jd> c() {
         return this.d;
      }

      public ObjectArrayList<jd> d() {
         return this.e;
      }

      public ObjectArrayList<jd> e() {
         return this.f;
      }
   }
}
