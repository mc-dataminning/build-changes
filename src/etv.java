import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class etv {
   public static final Codec<etv> f = mh.ag.q().dispatch("element_type", etv::a, etw::codec);
   private static final jg<ewn> a = jg.a(new ewn(List.of()));
   @Nullable
   private volatile etx.a b;

   protected static <E extends etv> RecordCodecBuilder<E, etx.a> f() {
      return etx.a.c.fieldOf("projection").forGetter(etv::g);
   }

   protected etv(etx.a $$0) {
      this.b = $$0;
   }

   public abstract kb a(ewq var1, dui var2);

   public abstract List<ewp.a> a(ewq var1, iw var2, dui var3, bai var4);

   public abstract esf a(ewq var1, iw var2, dui var3);

   public abstract boolean a(ewq var1, dli var2, dlf var3, edo var4, iw var5, iw var6, dui var7, esf var8, bai var9, evz var10, boolean var11);

   public abstract etw<?> a();

   public void a(dkk $$0, ewp.d $$1, iw $$2, dui $$3, bai $$4, esf $$5) {
   }

   public etv a(etx.a $$0) {
      this.b = $$0;
      return this;
   }

   public etx.a g() {
      etx.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<etx.a, eto> i() {
      return $$0 -> eto.b;
   }

   public static Function<etx.a, ets> a(String $$0) {
      return $$1 -> new ets(Either.left(alr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etx.a, ets> a(String $$0, jg<ewn> $$1) {
      return $$2 -> new ets(Either.left(alr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etx.a, etu> b(String $$0) {
      return $$1 -> new etu(Either.left(alr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etx.a, etu> b(String $$0, jg<ewn> $$1) {
      return $$2 -> new etu(Either.left(alr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etx.a, etu> a(String $$0, evz $$1) {
      return $$2 -> new etu(Either.left(alr.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<etx.a, etu> a(String $$0, jg<ewn> $$1, evz $$2) {
      return $$3 -> new etu(Either.left(alr.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<etx.a, etp> a(jg<err> $$0) {
      return $$1 -> new etp($$0, $$1);
   }

   public static Function<etx.a, ett> b(List<Function<etx.a, ? extends etv>> $$0) {
      return $$1 -> new ett($$0.stream().map($$1x -> (etv)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
