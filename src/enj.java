import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class enj {
   public static final Codec<enj> f = lz.ag.q().dispatch("element_type", enj::a, enk::codec);
   private static final jq<eqb> a = jq.a(new eqb(List.of()));
   @Nullable
   private volatile enl.a b;

   protected static <E extends enj> RecordCodecBuilder<E, enl.a> e() {
      return enl.a.c.fieldOf("projection").forGetter(enj::f);
   }

   protected enj(enl.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(eqe var1, dow var2);

   public abstract List<eqd.c> a(eqe var1, jh var2, dow var3, azv var4);

   public abstract elt a(eqe var1, jh var2, dow var3);

   public abstract boolean a(eqe var1, dgd var2, dgb var3, dxk var4, jh var5, jh var6, dow var7, elt var8, azv var9, epn var10, boolean var11);

   public abstract enk<?> a();

   public void a(dfg $$0, eqd.c $$1, jh $$2, dow $$3, azv $$4, elt $$5) {
   }

   public enj a(enl.a $$0) {
      this.b = $$0;
      return this;
   }

   public enl.a f() {
      enl.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<enl.a, enc> h() {
      return $$0 -> enc.b;
   }

   public static Function<enl.a, eng> a(String $$0) {
      return $$1 -> new eng(Either.left(all.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enl.a, eng> a(String $$0, jq<eqb> $$1) {
      return $$2 -> new eng(Either.left(all.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enl.a, eni> b(String $$0) {
      return $$1 -> new eni(Either.left(all.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<enl.a, eni> b(String $$0, jq<eqb> $$1) {
      return $$2 -> new eni(Either.left(all.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<enl.a, eni> a(String $$0, epn $$1) {
      return $$2 -> new eni(Either.left(all.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<enl.a, eni> a(String $$0, jq<eqb> $$1, epn $$2) {
      return $$3 -> new eni(Either.left(all.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<enl.a, end> a(jq<elf> $$0) {
      return $$1 -> new end($$0, $$1);
   }

   public static Function<enl.a, enh> b(List<Function<enl.a, ? extends enj>> $$0) {
      return $$1 -> new enh($$0.stream().map($$1x -> (enj)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
