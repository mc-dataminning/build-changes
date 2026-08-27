import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class eev {
   public static final Codec<eev> h = le.Z.q().dispatch(eev::a, eew::a);

   protected abstract eew<?> a();

   public abstract void a(eev.a var1);

   public static final class a {
      private final dbf a;
      private final BiConsumer<io, drd> b;
      private final aym c;
      private final ObjectArrayList<io> d;
      private final ObjectArrayList<io> e;
      private final ObjectArrayList<io> f;

      public a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, Set<io> $$3, Set<io> $$4, Set<io> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(js::v));
         this.e.sort(Comparator.comparingInt(js::v));
         this.f.sort(Comparator.comparingInt(js::v));
      }

      public void a(io $$0, dru $$1) {
         this.a($$0, dec.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(io $$0, drd $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(io $$0) {
         return this.a.a($$0, drc.a::i);
      }

      public dbf a() {
         return this.a;
      }

      public aym b() {
         return this.c;
      }

      public ObjectArrayList<io> c() {
         return this.d;
      }

      public ObjectArrayList<io> d() {
         return this.e;
      }

      public ObjectArrayList<io> e() {
         return this.f;
      }
   }
}
