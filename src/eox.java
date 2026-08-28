import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class eox {
   public static final Codec<eox> h = mg.X.q().dispatch(eox::a, eoy::a);

   protected abstract eoy<?> a();

   public abstract void a(eox.a var1);

   public static final class a {
      private final djs a;
      private final BiConsumer<iv, eat> b;
      private final azv c;
      private final ObjectArrayList<iv> d;
      private final ObjectArrayList<iv> e;
      private final ObjectArrayList<iv> f;

      public a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, Set<iv> $$3, Set<iv> $$4, Set<iv> $$5) {
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

      public void a(iv $$0, ebk $$1) {
         this.a($$0, dmt.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iv $$0, eat $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iv $$0) {
         return this.a.a($$0, eas.a::l);
      }

      public boolean a(iv $$0, Predicate<eat> $$1) {
         return this.a.a($$0, $$1);
      }

      public djs a() {
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
