import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eam {
   public static final Codec<eam> e = kd.ai.q().dispatch("element_type", eam::a, ean::codec);
   private static final ih<edd> a = ih.a(new edd(List.of()));
   @Nullable
   private volatile eao.a b;

   protected static <E extends eam> RecordCodecBuilder<E, eao.a> d() {
      return eao.a.c.fieldOf("projection").forGetter(eam::e);
   }

   protected eam(eao.a $$0) {
      this.b = $$0;
   }

   public abstract jb a(edg var1, ddb var2);

   public abstract List<edf.c> a(edg var1, hx var2, ddb var3, auu var4);

   public abstract dyx a(edg var1, hx var2, ddb var3);

   public abstract boolean a(edg var1, cuj var2, cuh var3, dld var4, hx var5, hx var6, ddb var7, dyx var8, auu var9, boolean var10);

   public abstract ean<?> a();

   public void a(ctp $$0, edf.c $$1, hx $$2, ddb $$3, auu $$4, dyx $$5) {
   }

   public eam a(eao.a $$0) {
      this.b = $$0;
      return this;
   }

   public eao.a e() {
      eao.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eao.a, eaf> g() {
      return $$0 -> eaf.b;
   }

   public static Function<eao.a, eaj> a(String $$0) {
      return $$1 -> new eaj(Either.left(new ahg($$0)), a, $$1);
   }

   public static Function<eao.a, eaj> a(String $$0, ih<edd> $$1) {
      return $$2 -> new eaj(Either.left(new ahg($$0)), $$1, $$2);
   }

   public static Function<eao.a, eal> b(String $$0) {
      return $$1 -> new eal(Either.left(new ahg($$0)), a, $$1);
   }

   public static Function<eao.a, eal> b(String $$0, ih<edd> $$1) {
      return $$2 -> new eal(Either.left(new ahg($$0)), $$1, $$2);
   }

   public static Function<eao.a, eag> a(ih<dyj> $$0) {
      return $$1 -> new eag($$0, $$1);
   }

   public static Function<eao.a, eak> b(List<Function<eao.a, ? extends eam>> $$0) {
      return $$1 -> new eak($$0.stream().map($$1x -> (eam)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
