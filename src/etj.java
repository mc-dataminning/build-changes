import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class etj {
   public static final Codec<etj> f = mg.ag.q().dispatch("element_type", etj::a, etk::codec);
   private static final jf<ewb> a = jf.a(new ewb(List.of()));
   @Nullable
   private volatile etl.a b;

   protected static <E extends etj> RecordCodecBuilder<E, etl.a> f() {
      return etl.a.c.fieldOf("projection").forGetter(etj::g);
   }

   protected etj(etl.a $$0) {
      this.b = $$0;
   }

   public abstract ka a(ewe var1, dtw var2);

   public abstract List<ewd.a> a(ewe var1, iv var2, dtw var3, azx var4);

   public abstract ert a(ewe var1, iv var2, dtw var3);

   public abstract boolean a(ewe var1, dkw var2, dkt var3, edc var4, iv var5, iv var6, dtw var7, ert var8, azx var9, evn var10, boolean var11);

   public abstract etk<?> a();

   public void a(djy $$0, ewd.d $$1, iv $$2, dtw $$3, azx $$4, ert $$5) {
   }

   public etj a(etl.a $$0) {
      this.b = $$0;
      return this;
   }

   public etl.a g() {
      etl.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int h() {
      return 1;
   }

   public static Function<etl.a, etc> i() {
      return $$0 -> etc.b;
   }

   public static Function<etl.a, etg> a(String $$0) {
      return $$1 -> new etg(Either.left(ali.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etl.a, etg> a(String $$0, jf<ewb> $$1) {
      return $$2 -> new etg(Either.left(ali.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etl.a, eti> b(String $$0) {
      return $$1 -> new eti(Either.left(ali.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<etl.a, eti> b(String $$0, jf<ewb> $$1) {
      return $$2 -> new eti(Either.left(ali.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<etl.a, eti> a(String $$0, evn $$1) {
      return $$2 -> new eti(Either.left(ali.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<etl.a, eti> a(String $$0, jf<ewb> $$1, evn $$2) {
      return $$3 -> new eti(Either.left(ali.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<etl.a, etd> a(jf<erf> $$0) {
      return $$1 -> new etd($$0, $$1);
   }

   public static Function<etl.a, eth> b(List<Function<etl.a, ? extends etj>> $$0) {
      return $$1 -> new eth($$0.stream().map($$1x -> (etj)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
