import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eps {
   public static final Codec<eps> f = ma.ag.q().dispatch("element_type", eps::a, ept::codec);
   private static final jq<esk> a = jq.a(new esk(List.of()));
   @Nullable
   private volatile epu.a b;

   protected static <E extends eps> RecordCodecBuilder<E, epu.a> e() {
      return epu.a.c.fieldOf("projection").forGetter(eps::f);
   }

   protected eps(epu.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(esn var1, drc var2);

   public abstract List<esm.a> a(esn var1, jh var2, drc var3, bam var4);

   public abstract eoc a(esn var1, jh var2, drc var3);

   public abstract boolean a(esn var1, dig var2, die var3, dzr var4, jh var5, jh var6, drc var7, eoc var8, bam var9, erw var10, boolean var11);

   public abstract ept<?> a();

   public void a(dhj $$0, esm.d $$1, jh $$2, drc $$3, bam $$4, eoc $$5) {
   }

   public eps a(epu.a $$0) {
      this.b = $$0;
      return this;
   }

   public epu.a f() {
      epu.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<epu.a, epl> h() {
      return $$0 -> epl.b;
   }

   public static Function<epu.a, epp> a(String $$0) {
      return $$1 -> new epp(Either.left(alz.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epu.a, epp> a(String $$0, jq<esk> $$1) {
      return $$2 -> new epp(Either.left(alz.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epu.a, epr> b(String $$0) {
      return $$1 -> new epr(Either.left(alz.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epu.a, epr> b(String $$0, jq<esk> $$1) {
      return $$2 -> new epr(Either.left(alz.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epu.a, epr> a(String $$0, erw $$1) {
      return $$2 -> new epr(Either.left(alz.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<epu.a, epr> a(String $$0, jq<esk> $$1, erw $$2) {
      return $$3 -> new epr(Either.left(alz.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<epu.a, epm> a(jq<eno> $$0) {
      return $$1 -> new epm($$0, $$1);
   }

   public static Function<epu.a, epq> b(List<Function<epu.a, ? extends eps>> $$0) {
      return $$1 -> new epq($$0.stream().map($$1x -> (eps)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
