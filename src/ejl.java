import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ejl {
   public static final Codec<ejl> h = lz.X.q().dispatch(ejl::a, ejm::a);

   protected abstract ejm<?> a();

   public abstract void a(ejl.a var1);

   public static final class a {
      private final dfl a;
      private final BiConsumer<jh, dvo> b;
      private final azv c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
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

      public void a(jh $$0, dwf $$1) {
         this.a($$0, dil.ff.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dvo $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dvn.a::l);
      }

      public dfl a() {
         return this.a;
      }

      public azv b() {
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
