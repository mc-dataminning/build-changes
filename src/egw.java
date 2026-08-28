import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class egw {
   public static final Codec<egw> h = lt.X.r().dispatch(egw::a, egx::a);

   protected abstract egx<?> a();

   public abstract void a(egw.a var1);

   public static final class a {
      private final dda a;
      private final BiConsumer<jd, dta> b;
      private final ayv c;
      private final ObjectArrayList<jd> d;
      private final ObjectArrayList<jd> e;
      private final ObjectArrayList<jd> f;

      public a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, Set<jd> $$3, Set<jd> $$4, Set<jd> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kh::v));
         this.e.sort(Comparator.comparingInt(kh::v));
         this.f.sort(Comparator.comparingInt(kh::v));
      }

      public void a(jd $$0, dtr $$1) {
         this.a($$0, dfy.ff.o().a($$1, Boolean.valueOf(true)));
      }

      public void a(jd $$0, dta $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jd $$0) {
         return this.a.a($$0, dsz.a::i);
      }

      public dda a() {
         return this.a;
      }

      public ayv b() {
         return this.c;
      }

      public ObjectArrayList<jd> c() {
         return this.d;
      }

      public ObjectArrayList<jd> d() {
         return this.e;
      }

      public ObjectArrayList<jd> e() {
         return this.f;
      }
   }
}
