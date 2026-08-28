import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class esq {
   public static final Codec<esq> f = mg.ag.q().dispatch("element_type", esq::a, esr::codec);
   private static final jf<evi> a = jf.a(new evi(List.of()));
   @Nullable
   private volatile ess.a b;

   protected static <E extends esq> RecordCodecBuilder<E, ess.a> f() {
      return ess.a.c.fieldOf("projection").forGetter(esq::g);
   }

   protected esq(ess.a $$0) {
      this.b = $$0;
   }

   public abstract ka a(evl var1, dtg var2);

   public abstract List<evk.a> a(evl var1, iv var2, dtg var3, azv var4);

   public abstract era a(evl var1, iv var2, dtg var3);

   public abstract boolean a(evl var1, dkg var2, dkd var3, ecm var4, iv var5, iv var6, dtg var7, era var8, azv var9, euu var10, boolean var11);

   public abstract esr<?> a();

   public void a(dji $$0, evk.d $$1, iv $$2, dtg $$3, azv $$4, era $$5) {
   }

   public esq a(ess.a $$0) {
      this.b = $$0;
      return this;
   }

   public ess.a g() {
      ess.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<ess.a, esj> i() {
      return $$0 -> esj.b;
   }

   public static Function<ess.a, esn> a(String $$0) {
      return $$1 -> new esn(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ess.a, esn> a(String $$0, jf<evi> $$1) {
      return $$2 -> new esn(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ess.a, esp> b(String $$0) {
      return $$1 -> new esp(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ess.a, esp> b(String $$0, jf<evi> $$1) {
      return $$2 -> new esp(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ess.a, esp> a(String $$0, euu $$1) {
      return $$2 -> new esp(Either.left(alg.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ess.a, esp> a(String $$0, jf<evi> $$1, euu $$2) {
      return $$3 -> new esp(Either.left(alg.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ess.a, esk> a(jf<eqm> $$0) {
      return $$1 -> new esk($$0, $$1);
   }

   public static Function<ess.a, eso> b(List<Function<ess.a, ? extends esq>> $$0) {
      return $$1 -> new eso($$0.stream().map($$1x -> (esq)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
