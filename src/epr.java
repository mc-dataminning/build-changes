import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class epr {
   public static final Codec<epr> f = mb.ag.q().dispatch("element_type", epr::a, eps::codec);
   private static final jr<esj> a = jr.a(new esj(List.of()));
   @Nullable
   private volatile ept.a b;

   protected static <E extends epr> RecordCodecBuilder<E, ept.a> e() {
      return ept.a.c.fieldOf("projection").forGetter(epr::f);
   }

   protected epr(ept.a $$0) {
      this.b = $$0;
   }

   public abstract km a(esm var1, dqw var2);

   public abstract List<esl.a> a(esm var1, ji var2, dqw var3, azh var4);

   public abstract eob a(esm var1, ji var2, dqw var3);

   public abstract boolean a(esm var1, dhy var2, dhv var3, dzn var4, ji var5, ji var6, dqw var7, eob var8, azh var9, erv var10, boolean var11);

   public abstract eps<?> a();

   public void a(dha $$0, esl.d $$1, ji $$2, dqw $$3, azh $$4, eob $$5) {
   }

   public epr a(ept.a $$0) {
      this.b = $$0;
      return this;
   }

   public ept.a f() {
      ept.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<ept.a, epk> h() {
      return $$0 -> epk.b;
   }

   public static Function<ept.a, epo> a(String $$0) {
      return $$1 -> new epo(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ept.a, epo> a(String $$0, jr<esj> $$1) {
      return $$2 -> new epo(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ept.a, epq> b(String $$0) {
      return $$1 -> new epq(Either.left(aku.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ept.a, epq> b(String $$0, jr<esj> $$1) {
      return $$2 -> new epq(Either.left(aku.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ept.a, epq> a(String $$0, erv $$1) {
      return $$2 -> new epq(Either.left(aku.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ept.a, epq> a(String $$0, jr<esj> $$1, erv $$2) {
      return $$3 -> new epq(Either.left(aku.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ept.a, epl> a(jr<enn> $$0) {
      return $$1 -> new epl($$0, $$1);
   }

   public static Function<ept.a, epp> b(List<Function<ept.a, ? extends epr>> $$0) {
      return $$1 -> new epp($$0.stream().map($$1x -> (epr)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
