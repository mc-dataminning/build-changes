import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class eiq {
   public static final Codec<eiq> h = lv.X.q().dispatch(eiq::a, eir::a);

   protected abstract eir<?> a();

   public abstract void a(eiq.a var1);

   public static final class a {
      private final dep a;
      private final BiConsumer<jf, dus> b;
      private final azn c;
      private final ObjectArrayList<jf> d;
      private final ObjectArrayList<jf> e;
      private final ObjectArrayList<jf> f;

      public a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, Set<jf> $$3, Set<jf> $$4, Set<jf> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kj::v));
         this.e.sort(Comparator.comparingInt(kj::v));
         this.f.sort(Comparator.comparingInt(kj::v));
      }

      public void a(jf $$0, dvj $$1) {
         this.a($$0, dho.ff.n().b($$1, Boolean.valueOf(true)));
      }

      public void a(jf $$0, dus $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jf $$0) {
         return this.a.a($$0, dur.a::l);
      }

      public dep a() {
         return this.a;
      }

      public azn b() {
         return this.c;
      }

      public ObjectArrayList<jf> c() {
         return this.d;
      }

      public ObjectArrayList<jf> d() {
         return this.e;
      }

      public ObjectArrayList<jf> e() {
         return this.f;
      }
   }
}
