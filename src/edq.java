import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class edq {
   public static final Codec<edq> h = lc.Z.q().dispatch(edq::a, edr::a);

   protected abstract edr<?> a();

   public abstract void a(edq.a var1);

   public static final class a {
      private final daa a;
      private final BiConsumer<im, dpy> b;
      private final ayd c;
      private final ObjectArrayList<im> d;
      private final ObjectArrayList<im> e;
      private final ObjectArrayList<im> f;

      public a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, Set<im> $$3, Set<im> $$4, Set<im> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jq::v));
         this.e.sort(Comparator.comparingInt(jq::v));
         this.f.sort(Comparator.comparingInt(jq::v));
      }

      public void a(im $$0, dqp $$1) {
         this.a($$0, dcx.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(im $$0, dpy $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(im $$0) {
         return this.a.a($$0, dpx.a::i);
      }

      public daa a() {
         return this.a;
      }

      public ayd b() {
         return this.c;
      }

      public ObjectArrayList<im> c() {
         return this.d;
      }

      public ObjectArrayList<im> d() {
         return this.e;
      }

      public ObjectArrayList<im> e() {
         return this.f;
      }
   }
}
