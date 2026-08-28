import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eot {
   public static final Codec<eot> f = mb.ag.q().dispatch("element_type", eot::a, eou::codec);
   private static final jr<erl> a = jr.a(new erl(List.of()));
   @Nullable
   private volatile eov.a b;

   protected static <E extends eot> RecordCodecBuilder<E, eov.a> e() {
      return eov.a.c.fieldOf("projection").forGetter(eot::f);
   }

   protected eot(eov.a $$0) {
      this.b = $$0;
   }

   public abstract km a(ero var1, dqd var2);

   public abstract List<ern.a> a(ero var1, ji var2, dqd var3, azh var4);

   public abstract end a(ero var1, ji var2, dqd var3);

   public abstract boolean a(ero var1, dhf var2, dhd var3, dys var4, ji var5, ji var6, dqd var7, end var8, azh var9, eqx var10, boolean var11);

   public abstract eou<?> a();

   public void a(dgi $$0, ern.d $$1, ji $$2, dqd $$3, azh $$4, end $$5) {
   }

   public eot a(eov.a $$0) {
      this.b = $$0;
      return this;
   }

   public eov.a f() {
      eov.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<eov.a, eom> h() {
      return $$0 -> eom.b;
   }

   public static Function<eov.a, eoq> a(String $$0) {
      return $$1 -> new eoq(Either.left(akv.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eov.a, eoq> a(String $$0, jr<erl> $$1) {
      return $$2 -> new eoq(Either.left(akv.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eov.a, eos> b(String $$0) {
      return $$1 -> new eos(Either.left(akv.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eov.a, eos> b(String $$0, jr<erl> $$1) {
      return $$2 -> new eos(Either.left(akv.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eov.a, eos> a(String $$0, eqx $$1) {
      return $$2 -> new eos(Either.left(akv.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<eov.a, eos> a(String $$0, jr<erl> $$1, eqx $$2) {
      return $$3 -> new eos(Either.left(akv.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<eov.a, eon> a(jr<emp> $$0) {
      return $$1 -> new eon($$0, $$1);
   }

   public static Function<eov.a, eor> b(List<Function<eov.a, ? extends eot>> $$0) {
      return $$1 -> new eor($$0.stream().map($$1x -> (eot)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
