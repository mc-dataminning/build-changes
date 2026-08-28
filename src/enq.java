import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class enq {
   public static final Codec<enq> f = lz.ag.q().dispatch("element_type", enq::a, enr::codec);
   private static final jq<eqi> a = jq.a(new eqi(List.of()));
   @Nullable
   private volatile ens.a b;

   protected static <E extends enq> RecordCodecBuilder<E, ens.a> e() {
      return ens.a.c.fieldOf("projection").forGetter(enq::f);
   }

   protected enq(ens.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(eql var1, dpd var2);

   public abstract List<eqk.c> a(eql var1, jh var2, dpd var3, azu var4);

   public abstract ema a(eql var1, jh var2, dpd var3);

   public abstract boolean a(eql var1, dgk var2, dgi var3, dxr var4, jh var5, jh var6, dpd var7, ema var8, azu var9, epu var10, boolean var11);

   public abstract enr<?> a();

   public void a(dfn $$0, eqk.c $$1, jh $$2, dpd $$3, azu $$4, ema $$5) {
   }

   public enq a(ens.a $$0) {
      this.b = $$0;
      return this;
   }

   public ens.a f() {
      ens.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<ens.a, enj> h() {
      return $$0 -> enj.b;
   }

   public static Function<ens.a, enn> a(String $$0) {
      return $$1 -> new enn(Either.left(alj.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ens.a, enn> a(String $$0, jq<eqi> $$1) {
      return $$2 -> new enn(Either.left(alj.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ens.a, enp> b(String $$0) {
      return $$1 -> new enp(Either.left(alj.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ens.a, enp> b(String $$0, jq<eqi> $$1) {
      return $$2 -> new enp(Either.left(alj.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ens.a, enp> a(String $$0, epu $$1) {
      return $$2 -> new enp(Either.left(alj.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ens.a, enp> a(String $$0, jq<eqi> $$1, epu $$2) {
      return $$3 -> new enp(Either.left(alj.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ens.a, enk> a(jq<elm> $$0) {
      return $$1 -> new enk($$0, $$1);
   }

   public static Function<ens.a, eno> b(List<Function<ens.a, ? extends enq>> $$0) {
      return $$1 -> new eno($$0.stream().map($$1x -> (enq)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
