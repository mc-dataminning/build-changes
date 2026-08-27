import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ego {
   public static final Codec<ego> e = kr.ai.q().dispatch("element_type", ego::a, egp::codec);
   private static final il<ejf> a = il.a(new ejf(List.of()));
   @Nullable
   private volatile egq.a b;

   protected static <E extends ego> RecordCodecBuilder<E, egq.a> d() {
      return egq.a.c.fieldOf("projection").forGetter(ego::e);
   }

   protected ego(egq.a $$0) {
      this.b = $$0;
   }

   public abstract jg a(eji var1, dik var2);

   public abstract List<ejh.c> a(eji var1, ib var2, dik var3, axr var4);

   public abstract eez a(eji var1, ib var2, dik var3);

   public abstract boolean a(eji var1, czs var2, czq var3, dqw var4, ib var5, ib var6, dik var7, eez var8, axr var9, boolean var10);

   public abstract egp<?> a();

   public void a(cyy $$0, ejh.c $$1, ib $$2, dik $$3, axr $$4, eez $$5) {
   }

   public ego a(egq.a $$0) {
      this.b = $$0;
      return this;
   }

   public egq.a e() {
      egq.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<egq.a, egh> g() {
      return $$0 -> egh.b;
   }

   public static Function<egq.a, egl> a(String $$0) {
      return $$1 -> new egl(Either.left(new ajt($$0)), a, $$1);
   }

   public static Function<egq.a, egl> a(String $$0, il<ejf> $$1) {
      return $$2 -> new egl(Either.left(new ajt($$0)), $$1, $$2);
   }

   public static Function<egq.a, egn> b(String $$0) {
      return $$1 -> new egn(Either.left(new ajt($$0)), a, $$1);
   }

   public static Function<egq.a, egn> b(String $$0, il<ejf> $$1) {
      return $$2 -> new egn(Either.left(new ajt($$0)), $$1, $$2);
   }

   public static Function<egq.a, egi> a(il<eel> $$0) {
      return $$1 -> new egi($$0, $$1);
   }

   public static Function<egq.a, egm> b(List<Function<egq.a, ? extends ego>> $$0) {
      return $$1 -> new egm($$0.stream().map($$1x -> (ego)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
