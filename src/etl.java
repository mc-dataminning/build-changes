import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class etl {
   public static final Codec<etl> f = mh.ag.q().dispatch("element_type", etl::a, etm::codec);
   private static final jg<ewd> a = jg.a(new ewd(List.of()));
   @Nullable
   private volatile etn.a b;

   protected static <E extends etl> RecordCodecBuilder<E, etn.a> f() {
      return etn.a.c.fieldOf("projection").forGetter(etl::g);
   }

   protected etl(etn.a $$0) {
      this.b = $$0;
   }

   public abstract kb a(ewg var1, dty var2);

   public abstract List<ewf.a> a(ewg var1, iw var2, dty var3, azz var4);

   public abstract erv a(ewg var1, iw var2, dty var3);

   public abstract boolean a(ewg var1, dky var2, dkv var3, ede var4, iw var5, iw var6, dty var7, erv var8, azz var9, evp var10, boolean var11);

   public abstract etm<?> a();

   public void a(dka $$0, ewf.d $$1, iw $$2, dty $$3, azz $$4, erv $$5) {
   }

   public etl a(etn.a $$0) {
      this.b = $$0;
      return this;
   }

   public etn.a g() {
      etn.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<etn.a, ete> i() {
      return $$0 -> ete.b;
   }

   public static Function<etn.a, eti> a(String $$0) {
      return $$1 -> new eti(Either.left(alk.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etn.a, eti> a(String $$0, jg<ewd> $$1) {
      return $$2 -> new eti(Either.left(alk.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etn.a, etk> b(String $$0) {
      return $$1 -> new etk(Either.left(alk.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etn.a, etk> b(String $$0, jg<ewd> $$1) {
      return $$2 -> new etk(Either.left(alk.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etn.a, etk> a(String $$0, evp $$1) {
      return $$2 -> new etk(Either.left(alk.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<etn.a, etk> a(String $$0, jg<ewd> $$1, evp $$2) {
      return $$3 -> new etk(Either.left(alk.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<etn.a, etf> a(jg<erh> $$0) {
      return $$1 -> new etf($$0, $$1);
   }

   public static Function<etn.a, etj> b(List<Function<etn.a, ? extends etl>> $$0) {
      return $$1 -> new etj($$0.stream().map($$1x -> (etl)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
