import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eqo {
   public static final Codec<eqo> f = md.ag.q().dispatch("element_type", eqo::a, eqp::codec);
   private static final js<etg> a = js.a(new etg(List.of()));
   @Nullable
   private volatile eqq.a b;

   protected static <E extends eqo> RecordCodecBuilder<E, eqq.a> e() {
      return eqq.a.c.fieldOf("projection").forGetter(eqo::f);
   }

   protected eqo(eqq.a $$0) {
      this.b = $$0;
   }

   public abstract kn a(etj var1, drm var2);

   public abstract List<eti.a> a(etj var1, jj var2, drm var3, azs var4);

   public abstract eoy a(etj var1, jj var2, drm var3);

   public abstract boolean a(etj var1, dio var2, dil var3, eak var4, jj var5, jj var6, drm var7, eoy var8, azs var9, ess var10, boolean var11);

   public abstract eqp<?> a();

   public void a(dhq $$0, eti.d $$1, jj $$2, drm $$3, azs $$4, eoy $$5) {
   }

   public eqo a(eqq.a $$0) {
      this.b = $$0;
      return this;
   }

   public eqq.a f() {
      eqq.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<eqq.a, eqh> h() {
      return $$0 -> eqh.b;
   }

   public static Function<eqq.a, eql> a(String $$0) {
      return $$1 -> new eql(Either.left(ald.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eqq.a, eql> a(String $$0, js<etg> $$1) {
      return $$2 -> new eql(Either.left(ald.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eqq.a, eqn> b(String $$0) {
      return $$1 -> new eqn(Either.left(ald.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eqq.a, eqn> b(String $$0, js<etg> $$1) {
      return $$2 -> new eqn(Either.left(ald.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eqq.a, eqn> a(String $$0, ess $$1) {
      return $$2 -> new eqn(Either.left(ald.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<eqq.a, eqn> a(String $$0, js<etg> $$1, ess $$2) {
      return $$3 -> new eqn(Either.left(ald.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<eqq.a, eqi> a(js<eok> $$0) {
      return $$1 -> new eqi($$0, $$1);
   }

   public static Function<eqq.a, eqm> b(List<Function<eqq.a, ? extends eqo>> $$0) {
      return $$1 -> new eqm($$0.stream().map($$1x -> (eqo)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
