import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class emk {
   public static final Codec<emk> f = lu.ag.q().dispatch("element_type", emk::a, eml::codec);
   private static final jn<epc> a = jn.a(new epc(List.of()));
   @Nullable
   private volatile emm.a b;

   protected static <E extends emk> RecordCodecBuilder<E, emm.a> e() {
      return emm.a.c.fieldOf("projection").forGetter(emk::f);
   }

   protected emk(emm.a $$0) {
      this.b = $$0;
   }

   public abstract ki a(epf var1, dnx var2);

   public abstract List<epe.c> a(epf var1, je var2, dnx var3, azl var4);

   public abstract eku a(epf var1, je var2, dnx var3);

   public abstract boolean a(epf var1, dfd var2, dfb var3, dwl var4, je var5, je var6, dnx var7, eku var8, azl var9, eoo var10, boolean var11);

   public abstract eml<?> a();

   public void a(deh $$0, epe.c $$1, je $$2, dnx $$3, azl $$4, eku $$5) {
   }

   public emk a(emm.a $$0) {
      this.b = $$0;
      return this;
   }

   public emm.a f() {
      emm.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<emm.a, emd> h() {
      return $$0 -> emd.b;
   }

   public static Function<emm.a, emh> a(String $$0) {
      return $$1 -> new emh(Either.left(alc.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<emm.a, emh> a(String $$0, jn<epc> $$1) {
      return $$2 -> new emh(Either.left(alc.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<emm.a, emj> b(String $$0) {
      return $$1 -> new emj(Either.left(alc.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<emm.a, emj> b(String $$0, jn<epc> $$1) {
      return $$2 -> new emj(Either.left(alc.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<emm.a, emj> a(String $$0, eoo $$1) {
      return $$2 -> new emj(Either.left(alc.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<emm.a, emj> a(String $$0, jn<epc> $$1, eoo $$2) {
      return $$3 -> new emj(Either.left(alc.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<emm.a, eme> a(jn<ekg> $$0) {
      return $$1 -> new eme($$0, $$1);
   }

   public static Function<emm.a, emi> b(List<Function<emm.a, ? extends emk>> $$0) {
      return $$1 -> new emi($$0.stream().map($$1x -> (emk)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
