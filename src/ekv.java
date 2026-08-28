import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class ekv {
   public static final Codec<ekv> h = mb.X.q().dispatch(ekv::a, ekw::a);

   protected abstract ekw<?> a();

   public abstract void a(ekv.a var1);

   public static final class a {
      private final dgn a;
      private final BiConsumer<ji, dww> b;
      private final azh c;
      private final ObjectArrayList<ji> d;
      private final ObjectArrayList<ji> e;
      private final ObjectArrayList<ji> f;

      public a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, Set<ji> $$3, Set<ji> $$4, Set<ji> $$5) {
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

      public void a(ji $$0, dxn $$1) {
         this.a($$0, djn.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(ji $$0, dww $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ji $$0) {
         return this.a.a($$0, dwv.a::l);
      }

      public boolean a(ji $$0, Predicate<dww> $$1) {
         return this.a.a($$0, $$1);
      }

      public dgn a() {
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
