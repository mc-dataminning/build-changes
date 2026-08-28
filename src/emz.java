import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class emz {
   public static final Codec<emz> f = lx.ag.q().dispatch("element_type", emz::a, ena::codec);
   private static final jp<epr> a = jp.a(new epr(List.of()));
   @Nullable
   private volatile enb.a b;

   protected static <E extends emz> RecordCodecBuilder<E, enb.a> e() {
      return enb.a.c.fieldOf("projection").forGetter(emz::f);
   }

   protected emz(enb.a $$0) {
      this.b = $$0;
   }

   public abstract kk a(epu var1, dol var2);

   public abstract List<ept.c> a(epu var1, jg var2, dol var3, azr var4);

   public abstract elj a(epu var1, jg var2, dol var3);

   public abstract boolean a(epu var1, dfs var2, dfq var3, dxa var4, jg var5, jg var6, dol var7, elj var8, azr var9, epd var10, boolean var11);

   public abstract ena<?> a();

   public void a(dew $$0, ept.c $$1, jg $$2, dol $$3, azr $$4, elj $$5) {
   }

   public emz a(enb.a $$0) {
      this.b = $$0;
      return this;
   }

   public enb.a f() {
      enb.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<enb.a, ems> h() {
      return $$0 -> ems.b;
   }

   public static Function<enb.a, emw> a(String $$0) {
      return $$1 -> new emw(Either.left(alh.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enb.a, emw> a(String $$0, jp<epr> $$1) {
      return $$2 -> new emw(Either.left(alh.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enb.a, emy> b(String $$0) {
      return $$1 -> new emy(Either.left(alh.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enb.a, emy> b(String $$0, jp<epr> $$1) {
      return $$2 -> new emy(Either.left(alh.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enb.a, emy> a(String $$0, epd $$1) {
      return $$2 -> new emy(Either.left(alh.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<enb.a, emy> a(String $$0, jp<epr> $$1, epd $$2) {
      return $$3 -> new emy(Either.left(alh.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<enb.a, emt> a(jp<ekv> $$0) {
      return $$1 -> new emt($$0, $$1);
   }

   public static Function<enb.a, emx> b(List<Function<enb.a, ? extends emz>> $$0) {
      return $$1 -> new emx($$0.stream().map($$1x -> (emz)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
