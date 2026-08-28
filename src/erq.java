import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class erq {
   public static final Codec<erq> f = mf.ag.q().dispatch("element_type", erq::a, err::codec);
   private static final je<eui> a = je.a(new eui(List.of()));
   @Nullable
   private volatile ers.a b;

   protected static <E extends erq> RecordCodecBuilder<E, ers.a> e() {
      return ers.a.c.fieldOf("projection").forGetter(erq::f);
   }

   protected erq(ers.a $$0) {
      this.b = $$0;
   }

   public abstract jz a(eul var1, dsm var2);

   public abstract List<euk.a> a(eul var1, iu var2, dsm var3, azt var4);

   public abstract eqa a(eul var1, iu var2, dsm var3);

   public abstract boolean a(eul var1, djo var2, djl var3, ebm var4, iu var5, iu var6, dsm var7, eqa var8, azt var9, etu var10, boolean var11);

   public abstract err<?> a();

   public void a(diq $$0, euk.d $$1, iu $$2, dsm $$3, azt $$4, eqa $$5) {
   }

   public erq a(ers.a $$0) {
      this.b = $$0;
      return this;
   }

   public ers.a f() {
      ers.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<ers.a, erj> h() {
      return $$0 -> erj.b;
   }

   public static Function<ers.a, ern> a(String $$0) {
      return $$1 -> new ern(Either.left(ale.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ers.a, ern> a(String $$0, je<eui> $$1) {
      return $$2 -> new ern(Either.left(ale.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ers.a, erp> b(String $$0) {
      return $$1 -> new erp(Either.left(ale.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ers.a, erp> b(String $$0, je<eui> $$1) {
      return $$2 -> new erp(Either.left(ale.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ers.a, erp> a(String $$0, etu $$1) {
      return $$2 -> new erp(Either.left(ale.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ers.a, erp> a(String $$0, je<eui> $$1, etu $$2) {
      return $$3 -> new erp(Either.left(ale.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ers.a, erk> a(je<epm> $$0) {
      return $$1 -> new erk($$0, $$1);
   }

   public static Function<ers.a, ero> b(List<Function<ers.a, ? extends erq>> $$0) {
      return $$1 -> new ero($$0.stream().map($$1x -> (erq)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
