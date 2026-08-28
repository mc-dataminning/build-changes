import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class eol {
   public static final Codec<eol> h = mf.X.q().dispatch(eol::a, eom::a);

   protected abstract eom<?> a();

   public abstract void a(eol.a var1);

   public static final class a {
      private final djg a;
      private final BiConsumer<iu, eah> b;
      private final azv c;
      private final ObjectArrayList<iu> d;
      private final ObjectArrayList<iu> e;
      private final ObjectArrayList<iu> f;

      public a(djg $$0, BiConsumer<iu, eah> $$1, azv $$2, Set<iu> $$3, Set<iu> $$4, Set<iu> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jz::v));
         this.e.sort(Comparator.comparingInt(jz::v));
         this.f.sort(Comparator.comparingInt(jz::v));
      }

      public void a(iu $$0, eay $$1) {
         this.a($$0, dmh.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iu $$0, eah $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iu $$0) {
         return this.a.a($$0, eag.a::l);
      }

      public boolean a(iu $$0, Predicate<eah> $$1) {
         return this.a.a($$0, $$1);
      }

      public djg a() {
         return this.a;
      }

      public azv b() {
         return this.c;
      }

      public ObjectArrayList<iu> c() {
         return this.d;
      }

      public ObjectArrayList<iu> d() {
         return this.e;
      }

      public ObjectArrayList<iu> e() {
         return this.f;
      }
   }
}
