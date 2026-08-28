import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class ekw {
   public static final Codec<ekw> h = mb.X.q().dispatch(ekw::a, ekx::a);

   protected abstract ekx<?> a();

   public abstract void a(ekw.a var1);

   public static final class a {
      private final dgo a;
      private final BiConsumer<ji, dwx> b;
      private final azh c;
      private final ObjectArrayList<ji> d;
      private final ObjectArrayList<ji> e;
      private final ObjectArrayList<ji> f;

      public a(dgo $$0, BiConsumer<ji, dwx> $$1, azh $$2, Set<ji> $$3, Set<ji> $$4, Set<ji> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(km::v));
         this.e.sort(Comparator.comparingInt(km::v));
         this.f.sort(Comparator.comparingInt(km::v));
      }

      public void a(ji $$0, dxo $$1) {
         this.a($$0, djo.ft.m().b($$1, Boolean.valueOf(true)));
      }

      public void a(ji $$0, dwx $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ji $$0) {
         return this.a.a($$0, dww.a::l);
      }

      public boolean a(ji $$0, Predicate<dwx> $$1) {
         return this.a.a($$0, $$1);
      }

      public dgo a() {
         return this.a;
      }

      public azh b() {
         return this.c;
      }

      public ObjectArrayList<ji> c() {
         return this.d;
      }

      public ObjectArrayList<ji> d() {
         return this.e;
      }

      public ObjectArrayList<ji> e() {
         return this.f;
      }
   }
}
