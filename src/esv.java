import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class esv {
   public static final Codec<esv> f = mg.ag.q().dispatch("element_type", esv::a, esw::codec);
   private static final jf<evn> a = jf.a(new evn(List.of()));
   @Nullable
   private volatile esx.a b;

   protected static <E extends esv> RecordCodecBuilder<E, esx.a> f() {
      return esx.a.c.fieldOf("projection").forGetter(esv::g);
   }

   protected esv(esx.a $$0) {
      this.b = $$0;
   }

   public abstract ka a(evq var1, dtl var2);

   public abstract List<evp.a> a(evq var1, iv var2, dtl var3, azv var4);

   public abstract erf a(evq var1, iv var2, dtl var3);

   public abstract boolean a(evq var1, dkl var2, dki var3, ecr var4, iv var5, iv var6, dtl var7, erf var8, azv var9, euz var10, boolean var11);

   public abstract esw<?> a();

   public void a(djn $$0, evp.d $$1, iv $$2, dtl $$3, azv $$4, erf $$5) {
   }

   public esv a(esx.a $$0) {
      this.b = $$0;
      return this;
   }

   public esx.a g() {
      esx.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<esx.a, eso> i() {
      return $$0 -> eso.b;
   }

   public static Function<esx.a, ess> a(String $$0) {
      return $$1 -> new ess(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esx.a, ess> a(String $$0, jf<evn> $$1) {
      return $$2 -> new ess(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esx.a, esu> b(String $$0) {
      return $$1 -> new esu(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esx.a, esu> b(String $$0, jf<evn> $$1) {
      return $$2 -> new esu(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esx.a, esu> a(String $$0, euz $$1) {
      return $$2 -> new esu(Either.left(alg.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<esx.a, esu> a(String $$0, jf<evn> $$1, euz $$2) {
      return $$3 -> new esu(Either.left(alg.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<esx.a, esp> a(jf<eqr> $$0) {
      return $$1 -> new esp($$0, $$1);
   }

   public static Function<esx.a, est> b(List<Function<esx.a, ? extends esv>> $$0) {
      return $$1 -> new est($$0.stream().map($$1x -> (esv)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
