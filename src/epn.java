import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class epn {
   public static final Codec<epn> h = mh.X.q().dispatch(epn::a, epo::a);

   protected abstract epo<?> a();

   public abstract void a(epn.a var1);

   public static final class a {
      private final dkf a;
      private final BiConsumer<iw, ebg> b;
      private final azz c;
      private final ObjectArrayList<iw> d;
      private final ObjectArrayList<iw> e;
      private final ObjectArrayList<iw> f;

      public a(dkf $$0, BiConsumer<iw, ebg> $$1, azz $$2, Set<iw> $$3, Set<iw> $$4, Set<iw> $$5) {
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

      public void a(iw $$0, ebx $$1) {
         this.a($$0, dng.fx.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(iw $$0, ebg $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(iw $$0) {
         return this.a.a($$0, ebf.a::l);
      }

      public boolean a(iw $$0, Predicate<ebg> $$1) {
         return this.a.a($$0, $$1);
      }

      public dkf a() {
         return this.a;
      }

      public azz b() {
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
