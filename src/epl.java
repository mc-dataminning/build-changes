import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class epl {
   public static final Codec<epl> f = ma.ag.q().dispatch("element_type", epl::a, epm::codec);
   private static final jq<esd> a = jq.a(new esd(List.of()));
   @Nullable
   private volatile epn.a b;

   protected static <E extends epl> RecordCodecBuilder<E, epn.a> e() {
      return epn.a.c.fieldOf("projection").forGetter(epl::f);
   }

   protected epl(epn.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(esg var1, dqv var2);

   public abstract List<esf.a> a(esg var1, jh var2, dqv var3, bac var4);

   public abstract env a(esg var1, jh var2, dqv var3);

   public abstract boolean a(esg var1, dhx var2, dhv var3, dzk var4, jh var5, jh var6, dqv var7, env var8, bac var9, erp var10, boolean var11);

   public abstract epm<?> a();

   public void a(dha $$0, esf.d $$1, jh $$2, dqv $$3, bac $$4, env $$5) {
   }

   public epl a(epn.a $$0) {
      this.b = $$0;
      return this;
   }

   public epn.a f() {
      epn.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<epn.a, epe> h() {
      return $$0 -> epe.b;
   }

   public static Function<epn.a, epi> a(String $$0) {
      return $$1 -> new epi(Either.left(alp.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epn.a, epi> a(String $$0, jq<esd> $$1) {
      return $$2 -> new epi(Either.left(alp.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epn.a, epk> b(String $$0) {
      return $$1 -> new epk(Either.left(alp.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epn.a, epk> b(String $$0, jq<esd> $$1) {
      return $$2 -> new epk(Either.left(alp.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epn.a, epk> a(String $$0, erp $$1) {
      return $$2 -> new epk(Either.left(alp.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<epn.a, epk> a(String $$0, jq<esd> $$1, erp $$2) {
      return $$3 -> new epk(Either.left(alp.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<epn.a, epf> a(jq<enh> $$0) {
      return $$1 -> new epf($$0, $$1);
   }

   public static Function<epn.a, epj> b(List<Function<epn.a, ? extends epl>> $$0) {
      return $$1 -> new epj($$0.stream().map($$1x -> (epl)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
