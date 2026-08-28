import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class eos {
   public static final Codec<eos> h = mg.X.q().dispatch(eos::a, eot::a);

   protected abstract eot<?> a();

   public abstract void a(eos.a var1);

   public static final class a {
      private final djn a;
      private final BiConsumer<iv, eao> b;
      private final azv c;
      private final ObjectArrayList<iv> d;
      private final ObjectArrayList<iv> e;
      private final ObjectArrayList<iv> f;

      public a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, Set<iv> $$3, Set<iv> $$4, Set<iv> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(ka::v));
         this.e.sort(Comparator.comparingInt(ka::v));
         this.f.sort(Comparator.comparingInt(ka::v));
      }

      public void a(iv $$0, ebf $$1) {
         this.a($$0, dmo.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iv $$0, eao $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iv $$0) {
         return this.a.a($$0, ean.a::l);
      }

      public boolean a(iv $$0, Predicate<eao> $$1) {
         return this.a.a($$0, $$1);
      }

      public djn a() {
         return this.a;
      }

      public azv b() {
         return this.c;
      }

      public ObjectArrayList<iv> c() {
         return this.d;
      }

      public ObjectArrayList<iv> d() {
         return this.e;
      }

      public ObjectArrayList<iv> e() {
         return this.f;
      }
   }
}
