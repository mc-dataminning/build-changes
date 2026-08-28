import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class enf {
   public static final Codec<enf> f = ly.ag.q().dispatch("element_type", enf::a, eng::codec);
   private static final jq<epx> a = jq.a(new epx(List.of()));
   @Nullable
   private volatile enh.a b;

   protected static <E extends enf> RecordCodecBuilder<E, enh.a> e() {
      return enh.a.c.fieldOf("projection").forGetter(enf::f);
   }

   protected enf(enh.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(eqa var1, dor var2);

   public abstract List<epz.c> a(eqa var1, jh var2, dor var3, azs var4);

   public abstract elp a(eqa var1, jh var2, dor var3);

   public abstract boolean a(eqa var1, dfy var2, dfw var3, dxg var4, jh var5, jh var6, dor var7, elp var8, azs var9, epj var10, boolean var11);

   public abstract eng<?> a();

   public void a(dfc $$0, epz.c $$1, jh $$2, dor $$3, azs $$4, elp $$5) {
   }

   public enf a(enh.a $$0) {
      this.b = $$0;
      return this;
   }

   public enh.a f() {
      enh.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<enh.a, emy> h() {
      return $$0 -> emy.b;
   }

   public static Function<enh.a, enc> a(String $$0) {
      return $$1 -> new enc(Either.left(ali.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enh.a, enc> a(String $$0, jq<epx> $$1) {
      return $$2 -> new enc(Either.left(ali.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enh.a, ene> b(String $$0) {
      return $$1 -> new ene(Either.left(ali.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enh.a, ene> b(String $$0, jq<epx> $$1) {
      return $$2 -> new ene(Either.left(ali.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enh.a, ene> a(String $$0, epj $$1) {
      return $$2 -> new ene(Either.left(ali.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<enh.a, ene> a(String $$0, jq<epx> $$1, epj $$2) {
      return $$3 -> new ene(Either.left(ali.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<enh.a, emz> a(jq<elb> $$0) {
      return $$1 -> new emz($$0, $$1);
   }

   public static Function<enh.a, end> b(List<Function<enh.a, ? extends enf>> $$0) {
      return $$1 -> new end($$0.stream().map($$1x -> (enf)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
