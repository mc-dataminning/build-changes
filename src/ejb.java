import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ejb {
   public static final Codec<ejb> h = lx.X.q().dispatch(ejb::a, ejc::a);

   protected abstract ejc<?> a();

   public abstract void a(ejb.a var1);

   public static final class a {
      private final dfb a;
      private final BiConsumer<jg, dvd> b;
      private final azr c;
      private final ObjectArrayList<jg> d;
      private final ObjectArrayList<jg> e;
      private final ObjectArrayList<jg> f;

      public a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, Set<jg> $$3, Set<jg> $$4, Set<jg> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kk::v));
         this.e.sort(Comparator.comparingInt(kk::v));
         this.f.sort(Comparator.comparingInt(kk::v));
      }

      public void a(jg $$0, dvu $$1) {
         this.a($$0, dia.ff.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jg $$0, dvd $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jg $$0) {
         return this.a.a($$0, dvc.a::l);
      }

      public dfb a() {
         return this.a;
      }

      public azr b() {
         return this.c;
      }

      public ObjectArrayList<jg> c() {
         return this.d;
      }

      public ObjectArrayList<jg> d() {
         return this.e;
      }

      public ObjectArrayList<jg> e() {
         return this.f;
      }
   }
}
