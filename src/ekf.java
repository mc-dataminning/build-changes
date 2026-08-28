import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ekf {
   public static final Codec<ekf> e = lq.ag.r().dispatch("element_type", ekf::a, ekg::codec);
   private static final jj<emw> a = jj.a(new emw(List.of()));
   @Nullable
   private volatile ekh.a b;

   protected static <E extends ekf> RecordCodecBuilder<E, ekh.a> d() {
      return ekh.a.c.fieldOf("projection").forGetter(ekf::e);
   }

   protected ekf(ekh.a $$0) {
      this.b = $$0;
   }

   public abstract ke a(emz var1, dlv var2);

   public abstract List<emy.c> a(emz var1, ja var2, dlv var3, ayo var4);

   public abstract eip a(emz var1, ja var2, dlv var3);

   public abstract boolean a(emz var1, ddc var2, dda var3, dui var4, ja var5, ja var6, dlv var7, eip var8, ayo var9, boolean var10);

   public abstract ekg<?> a();

   public void a(dch $$0, emy.c $$1, ja $$2, dlv $$3, ayo $$4, eip $$5) {
   }

   public ekf a(ekh.a $$0) {
      this.b = $$0;
      return this;
   }

   public ekh.a e() {
      ekh.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ekh.a, ejy> g() {
      return $$0 -> ejy.b;
   }

   public static Function<ekh.a, ekc> a(String $$0) {
      return $$1 -> new ekc(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ekh.a, ekc> a(String $$0, jj<emw> $$1) {
      return $$2 -> new ekc(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ekh.a, eke> b(String $$0) {
      return $$1 -> new eke(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ekh.a, eke> b(String $$0, jj<emw> $$1) {
      return $$2 -> new eke(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ekh.a, ejz> a(jj<eib> $$0) {
      return $$1 -> new ejz($$0, $$1);
   }

   public static Function<ekh.a, ekd> b(List<Function<ekh.a, ? extends ekf>> $$0) {
      return $$1 -> new ekd($$0.stream().map($$1x -> (ekf)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
