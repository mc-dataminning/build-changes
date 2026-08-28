import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class ens {
   public static final Codec<ens> h = mf.X.q().dispatch(ens::a, ent::a);

   protected abstract ent<?> a();

   public abstract void a(ens.a var1);

   public static final class a {
      private final div a;
      private final BiConsumer<iu, dzo> b;
      private final azt c;
      private final ObjectArrayList<iu> d;
      private final ObjectArrayList<iu> e;
      private final ObjectArrayList<iu> f;

      public a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, Set<iu> $$3, Set<iu> $$4, Set<iu> $$5) {
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

      public void a(iu $$0, eaf $$1) {
         this.a($$0, dlw.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iu $$0, dzo $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iu $$0) {
         return this.a.a($$0, dzn.a::l);
      }

      public boolean a(iu $$0, Predicate<dzo> $$1) {
         return this.a.a($$0, $$1);
      }

      public div a() {
         return this.a;
      }

      public azt b() {
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
