import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eov {
   public static final Codec<eov> f = mb.ag.q().dispatch("element_type", eov::a, eow::codec);
   private static final jr<ern> a = jr.a(new ern(List.of()));
   @Nullable
   private volatile eox.a b;

   protected static <E extends eov> RecordCodecBuilder<E, eox.a> e() {
      return eox.a.c.fieldOf("projection").forGetter(eov::f);
   }

   protected eov(eox.a $$0) {
      this.b = $$0;
   }

   public abstract km a(erq var1, dqf var2);

   public abstract List<erp.a> a(erq var1, ji var2, dqf var3, azh var4);

   public abstract enf a(erq var1, ji var2, dqf var3);

   public abstract boolean a(erq var1, dhh var2, dhf var3, dyu var4, ji var5, ji var6, dqf var7, enf var8, azh var9, eqz var10, boolean var11);

   public abstract eow<?> a();

   public void a(dgk $$0, erp.d $$1, ji $$2, dqf $$3, azh $$4, enf $$5) {
   }

   public eov a(eox.a $$0) {
      this.b = $$0;
      return this;
   }

   public eox.a f() {
      eox.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<eox.a, eoo> h() {
      return $$0 -> eoo.b;
   }

   public static Function<eox.a, eos> a(String $$0) {
      return $$1 -> new eos(Either.left(akv.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eox.a, eos> a(String $$0, jr<ern> $$1) {
      return $$2 -> new eos(Either.left(akv.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eox.a, eou> b(String $$0) {
      return $$1 -> new eou(Either.left(akv.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<eox.a, eou> b(String $$0, jr<ern> $$1) {
      return $$2 -> new eou(Either.left(akv.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<eox.a, eou> a(String $$0, eqz $$1) {
      return $$2 -> new eou(Either.left(akv.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<eox.a, eou> a(String $$0, jr<ern> $$1, eqz $$2) {
      return $$3 -> new eou(Either.left(akv.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<eox.a, eop> a(jr<emr> $$0) {
      return $$1 -> new eop($$0, $$1);
   }

   public static Function<eox.a, eot> b(List<Function<eox.a, ? extends eov>> $$0) {
      return $$1 -> new eot($$0.stream().map($$1x -> (eov)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
