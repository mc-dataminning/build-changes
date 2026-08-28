import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class elm {
   public static final Codec<elm> h = ma.X.q().dispatch(elm::a, eln::a);

   protected abstract eln<?> a();

   public abstract void a(elm.a var1);

   public static final class a {
      private final dhg a;
      private final BiConsumer<jh, dxn> b;
      private final bam c;
      private final ObjectArrayList<jh> d;
      private final ObjectArrayList<jh> e;
      private final ObjectArrayList<jh> f;

      public a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, Set<jh> $$3, Set<jh> $$4, Set<jh> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kl::v));
         this.e.sort(Comparator.comparingInt(kl::v));
         this.f.sort(Comparator.comparingInt(kl::v));
      }

      public void a(jh $$0, dye $$1) {
         this.a($$0, dkg.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(jh $$0, dxn $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jh $$0) {
         return this.a.a($$0, dxm.a::l);
      }

      public boolean a(jh $$0, Predicate<dxn> $$1) {
         return this.a.a($$0, $$1);
      }

      public dhg a() {
         return this.a;
      }

      public bam b() {
         return this.c;
      }

      public ObjectArrayList<jh> c() {
         return this.d;
      }

      public ObjectArrayList<jh> d() {
         return this.e;
      }

      public ObjectArrayList<jh> e() {
         return this.f;
      }
   }
}
