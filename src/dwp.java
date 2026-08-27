import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwp {
   public static final Codec<dwp> e = jd.ai.q().dispatch("element_type", dwp::a, dwq::codec);
   private static final hg<dyz> a = hg.a(new dyz(List.of()));
   @Nullable
   private volatile dwr.a b;

   protected static <E extends dwp> RecordCodecBuilder<E, dwr.a> d() {
      return dwr.a.c.fieldOf("projection").forGetter(dwp::e);
   }

   protected dwp(dwr.a $$0) {
      this.b = $$0;
   }

   public abstract ib a(dzc var1, czh var2);

   public abstract List<dzb.c> a(dzc var1, gw var2, czh var3, asc var4);

   public abstract dva a(dzc var1, gw var2, czh var3);

   public abstract boolean a(dzc var1, cqp var2, cqn var3, dhg var4, gw var5, gw var6, czh var7, dva var8, asc var9, boolean var10);

   public abstract dwq<?> a();

   public void a(cpw $$0, dzb.c $$1, gw $$2, czh $$3, asc $$4, dva $$5) {
   }

   public dwp a(dwr.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwr.a e() {
      dwr.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwr.a, dwi> g() {
      return $$0 -> dwi.b;
   }

   public static Function<dwr.a, dwm> a(String $$0) {
      return $$1 -> new dwm(Either.left(new aex($$0)), a, $$1);
   }

   public static Function<dwr.a, dwm> a(String $$0, hg<dyz> $$1) {
      return $$2 -> new dwm(Either.left(new aex($$0)), $$1, $$2);
   }

   public static Function<dwr.a, dwo> b(String $$0) {
      return $$1 -> new dwo(Either.left(new aex($$0)), a, $$1);
   }

   public static Function<dwr.a, dwo> b(String $$0, hg<dyz> $$1) {
      return $$2 -> new dwo(Either.left(new aex($$0)), $$1, $$2);
   }

   public static Function<dwr.a, dwj> a(hg<dum> $$0) {
      return $$1 -> new dwj($$0, $$1);
   }

   public static Function<dwr.a, dwn> a(List<Function<dwr.a, ? extends dwp>> $$0) {
      return $$1 -> new dwn($$0.stream().map($$1x -> (dwp)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
