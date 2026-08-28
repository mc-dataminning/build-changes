import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class emq {
   public static final Codec<emq> h = md.X.q().dispatch(emq::a, emr::a);

   protected abstract emr<?> a();

   public abstract void a(emq.a var1);

   public static final class a {
      private final dhv a;
      private final BiConsumer<jj, dym> b;
      private final azs c;
      private final ObjectArrayList<jj> d;
      private final ObjectArrayList<jj> e;
      private final ObjectArrayList<jj> f;

      public a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, Set<jj> $$3, Set<jj> $$4, Set<jj> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kn::v));
         this.e.sort(Comparator.comparingInt(kn::v));
         this.f.sort(Comparator.comparingInt(kn::v));
      }

      public void a(jj $$0, dzd $$1) {
         this.a($$0, dkw.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jj $$0, dym $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jj $$0) {
         return this.a.a($$0, dyl.a::l);
      }

      public boolean a(jj $$0, Predicate<dym> $$1) {
         return this.a.a($$0, $$1);
      }

      public dhv a() {
         return this.a;
      }

      public azs b() {
         return this.c;
      }

      public ObjectArrayList<jj> c() {
         return this.d;
      }

      public ObjectArrayList<jj> d() {
         return this.e;
      }

      public ObjectArrayList<jj> e() {
         return this.f;
      }
   }
}
