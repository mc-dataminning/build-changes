import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class elt {
   public static final Codec<elt> h = mb.X.q().dispatch(elt::a, elu::a);

   protected abstract elu<?> a();

   public abstract void a(elt.a var1);

   public static final class a {
      private final dhf a;
      private final BiConsumer<ji, dxq> b;
      private final azh c;
      private final ObjectArrayList<ji> d;
      private final ObjectArrayList<ji> e;
      private final ObjectArrayList<ji> f;

      public a(dhf $$0, BiConsumer<ji, dxq> $$1, azh $$2, Set<ji> $$3, Set<ji> $$4, Set<ji> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(km::v));
         this.e.sort(Comparator.comparingInt(km::v));
         this.f.sort(Comparator.comparingInt(km::v));
      }

      public void a(ji $$0, dyh $$1) {
         this.a($$0, dkg.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(ji $$0, dxq $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ji $$0) {
         return this.a.a($$0, dxp.a::l);
      }

      public boolean a(ji $$0, Predicate<dxq> $$1) {
         return this.a.a($$0, $$1);
      }

      public dhf a() {
         return this.a;
      }

      public azh b() {
         return this.c;
      }

      public ObjectArrayList<ji> c() {
         return this.d;
      }

      public ObjectArrayList<ji> d() {
         return this.e;
      }

      public ObjectArrayList<ji> e() {
         return this.f;
      }
   }
}
