import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ecl {
   public static final Codec<ecl> e = kf.ai.q().dispatch("element_type", ecl::a, ecm::codec);
   private static final ij<efc> a = ij.a(new efc(List.of()));
   @Nullable
   private volatile ecn.a b;

   protected static <E extends ecl> RecordCodecBuilder<E, ecn.a> d() {
      return ecn.a.c.fieldOf("projection").forGetter(ecl::e);
   }

   protected ecl(ecn.a $$0) {
      this.b = $$0;
   }

   public abstract jd a(eff var1, dfa var2);

   public abstract List<efe.c> a(eff var1, hz var2, dfa var3, awo var4);

   public abstract eaw a(eff var1, hz var2, dfa var3);

   public abstract boolean a(eff var1, cwi var2, cwg var3, dnc var4, hz var5, hz var6, dfa var7, eaw var8, awo var9, boolean var10);

   public abstract ecm<?> a();

   public void a(cvo $$0, efe.c $$1, hz $$2, dfa $$3, awo $$4, eaw $$5) {
   }

   public ecl a(ecn.a $$0) {
      this.b = $$0;
      return this;
   }

   public ecn.a e() {
      ecn.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ecn.a, ece> g() {
      return $$0 -> ece.b;
   }

   public static Function<ecn.a, eci> a(String $$0) {
      return $$1 -> new eci(Either.left(new aiy($$0)), a, $$1);
   }

   public static Function<ecn.a, eci> a(String $$0, ij<efc> $$1) {
      return $$2 -> new eci(Either.left(new aiy($$0)), $$1, $$2);
   }

   public static Function<ecn.a, eck> b(String $$0) {
      return $$1 -> new eck(Either.left(new aiy($$0)), a, $$1);
   }

   public static Function<ecn.a, eck> b(String $$0, ij<efc> $$1) {
      return $$2 -> new eck(Either.left(new aiy($$0)), $$1, $$2);
   }

   public static Function<ecn.a, ecf> a(ij<eai> $$0) {
      return $$1 -> new ecf($$0, $$1);
   }

   public static Function<ecn.a, ecj> b(List<Function<ecn.a, ? extends ecl>> $$0) {
      return $$1 -> new ecj($$0.stream().map($$1x -> (ecl)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
