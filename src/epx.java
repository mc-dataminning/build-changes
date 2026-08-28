import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class epx {
   public static final Codec<epx> h = mh.X.q().dispatch(epx::a, epy::a);

   protected abstract epy<?> a();

   public abstract void a(epx.a var1);

   public static final class a {
      private final dkp a;
      private final BiConsumer<iw, ebq> b;
      private final bai c;
      private final ObjectArrayList<iw> d;
      private final ObjectArrayList<iw> e;
      private final ObjectArrayList<iw> f;

      public a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, Set<iw> $$3, Set<iw> $$4, Set<iw> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kb::v));
         this.e.sort(Comparator.comparingInt(kb::v));
         this.f.sort(Comparator.comparingInt(kb::v));
      }

      public void a(iw $$0, ech $$1) {
         this.a($$0, dnq.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iw $$0, ebq $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iw $$0) {
         return this.a.a($$0, ebp.a::l);
      }

      public boolean a(iw $$0, Predicate<ebq> $$1) {
         return this.a.a($$0, $$1);
      }

      public dkp a() {
         return this.a;
      }

      public bai b() {
         return this.c;
      }

      public ObjectArrayList<iw> c() {
         return this.d;
      }

      public ObjectArrayList<iw> d() {
         return this.e;
      }

      public ObjectArrayList<iw> e() {
         return this.f;
      }
   }
}
