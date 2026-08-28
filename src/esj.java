import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class esj {
   public static final Codec<esj> f = mf.ag.q().dispatch("element_type", esj::a, esk::codec);
   private static final je<evb> a = je.a(new evb(List.of()));
   @Nullable
   private volatile esl.a b;

   protected static <E extends esj> RecordCodecBuilder<E, esl.a> e() {
      return esl.a.c.fieldOf("projection").forGetter(esj::f);
   }

   protected esj(esl.a $$0) {
      this.b = $$0;
   }

   public abstract jz a(eve var1, dsz var2);

   public abstract List<evd.a> a(eve var1, iu var2, dsz var3, azv var4);

   public abstract eqt a(eve var1, iu var2, dsz var3);

   public abstract boolean a(eve var1, djz var2, djw var3, ecf var4, iu var5, iu var6, dsz var7, eqt var8, azv var9, eun var10, boolean var11);

   public abstract esk<?> a();

   public void a(djb $$0, evd.d $$1, iu $$2, dsz $$3, azv $$4, eqt $$5) {
   }

   public esj a(esl.a $$0) {
      this.b = $$0;
      return this;
   }

   public esl.a f() {
      esl.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<esl.a, esc> h() {
      return $$0 -> esc.b;
   }

   public static Function<esl.a, esg> a(String $$0) {
      return $$1 -> new esg(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esl.a, esg> a(String $$0, je<evb> $$1) {
      return $$2 -> new esg(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esl.a, esi> b(String $$0) {
      return $$1 -> new esi(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esl.a, esi> b(String $$0, je<evb> $$1) {
      return $$2 -> new esi(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esl.a, esi> a(String $$0, eun $$1) {
      return $$2 -> new esi(Either.left(alg.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<esl.a, esi> a(String $$0, je<evb> $$1, eun $$2) {
      return $$3 -> new esi(Either.left(alg.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<esl.a, esd> a(je<eqf> $$0) {
      return $$1 -> new esd($$0, $$1);
   }

   public static Function<esl.a, esh> b(List<Function<esl.a, ? extends esj>> $$0) {
      return $$1 -> new esh($$0.stream().map($$1x -> (esj)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
