import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class epl {
   public static final Codec<epl> h = mg.X.q().dispatch(epl::a, epm::a);

   protected abstract epm<?> a();

   public abstract void a(epl.a var1);

   public static final class a {
      private final dkd a;
      private final BiConsumer<iv, ebe> b;
      private final azx c;
      private final ObjectArrayList<iv> d;
      private final ObjectArrayList<iv> e;
      private final ObjectArrayList<iv> f;

      public a(dkd $$0, BiConsumer<iv, ebe> $$1, azx $$2, Set<iv> $$3, Set<iv> $$4, Set<iv> $$5) {
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

      public void a(iv $$0, ebv $$1) {
         this.a($$0, dne.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iv $$0, ebe $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iv $$0) {
         return this.a.a($$0, ebd.a::l);
      }

      public boolean a(iv $$0, Predicate<ebe> $$1) {
         return this.a.a($$0, $$1);
      }

      public dkd a() {
         return this.a;
      }

      public azx b() {
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
