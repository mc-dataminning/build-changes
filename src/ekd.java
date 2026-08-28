import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ekd {
   public static final Codec<ekd> e = lq.ag.r().dispatch("element_type", ekd::a, eke::codec);
   private static final jj<emu> a = jj.a(new emu(List.of()));
   @Nullable
   private volatile ekf.a b;

   protected static <E extends ekd> RecordCodecBuilder<E, ekf.a> d() {
      return ekf.a.c.fieldOf("projection").forGetter(ekd::e);
   }

   protected ekd(ekf.a $$0) {
      this.b = $$0;
   }

   public abstract ke a(emx var1, dlu var2);

   public abstract List<emw.c> a(emx var1, ja var2, dlu var3, ayo var4);

   public abstract eio a(emx var1, ja var2, dlu var3);

   public abstract boolean a(emx var1, ddb var2, dcz var3, duh var4, ja var5, ja var6, dlu var7, eio var8, ayo var9, boolean var10);

   public abstract eke<?> a();

   public void a(dcg $$0, emw.c $$1, ja $$2, dlu $$3, ayo $$4, eio $$5) {
   }

   public ekd a(ekf.a $$0) {
      this.b = $$0;
      return this;
   }

   public ekf.a e() {
      ekf.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ekf.a, ejw> g() {
      return $$0 -> ejw.b;
   }

   public static Function<ekf.a, eka> a(String $$0) {
      return $$1 -> new eka(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ekf.a, eka> a(String $$0, jj<emu> $$1) {
      return $$2 -> new eka(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ekf.a, ekc> b(String $$0) {
      return $$1 -> new ekc(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ekf.a, ekc> b(String $$0, jj<emu> $$1) {
      return $$2 -> new ekc(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ekf.a, ejx> a(jj<eia> $$0) {
      return $$1 -> new ejx($$0, $$1);
   }

   public static Function<ekf.a, ekb> b(List<Function<ekf.a, ? extends ekd>> $$0) {
      return $$1 -> new ekb($$0.stream().map($$1x -> (ekd)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
