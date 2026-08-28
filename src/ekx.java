import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class ekx {
   public static final Codec<ekx> h = mb.X.q().dispatch(ekx::a, eky::a);

   protected abstract eky<?> a();

   public abstract void a(ekx.a var1);

   public static final class a {
      private final dgp a;
      private final BiConsumer<ji, dwy> b;
      private final azh c;
      private final ObjectArrayList<ji> d;
      private final ObjectArrayList<ji> e;
      private final ObjectArrayList<ji> f;

      public a(dgp $$0, BiConsumer<ji, dwy> $$1, azh $$2, Set<ji> $$3, Set<ji> $$4, Set<ji> $$5) {
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

      public void a(ji $$0, dxp $$1) {
         this.a($$0, djp.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(ji $$0, dwy $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ji $$0) {
         return this.a.a($$0, dwx.a::l);
      }

      public boolean a(ji $$0, Predicate<dwy> $$1) {
         return this.a.a($$0, $$1);
      }

      public dgp a() {
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
