import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwj {
   public static final Codec<dwj> e = jb.aj.q().dispatch("element_type", dwj::a, dwk::codec);
   private static final he<dyt> a = he.a(new dyt(List.of()));
   @Nullable
   private volatile dwl.a b;

   protected static <E extends dwj> RecordCodecBuilder<E, dwl.a> d() {
      return dwl.a.c.fieldOf("projection").forGetter(dwj::e);
   }

   protected dwj(dwl.a $$0) {
      this.b = $$0;
   }

   public abstract hy a(dyw var1, czn var2);

   public abstract List<dyv.c> a(dyw var1, gw var2, czn var3, ash var4);

   public abstract duu a(dyw var1, gw var2, czn var3);

   public abstract boolean a(dyw var1, cqv var2, cqt var3, dha var4, gw var5, gw var6, czn var7, duu var8, ash var9, boolean var10);

   public abstract dwk<?> a();

   public void a(cqc $$0, dyv.c $$1, gw $$2, czn $$3, ash $$4, duu $$5) {
   }

   public dwj a(dwl.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwl.a e() {
      dwl.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwl.a, dwc> g() {
      return $$0 -> dwc.b;
   }

   public static Function<dwl.a, dwg> a(String $$0) {
      return $$1 -> new dwg(Either.left(new aez($$0)), a, $$1);
   }

   public static Function<dwl.a, dwg> a(String $$0, he<dyt> $$1) {
      return $$2 -> new dwg(Either.left(new aez($$0)), $$1, $$2);
   }

   public static Function<dwl.a, dwi> b(String $$0) {
      return $$1 -> new dwi(Either.left(new aez($$0)), a, $$1);
   }

   public static Function<dwl.a, dwi> b(String $$0, he<dyt> $$1) {
      return $$2 -> new dwi(Either.left(new aez($$0)), $$1, $$2);
   }

   public static Function<dwl.a, dwd> a(he<dug> $$0) {
      return $$1 -> new dwd($$0, $$1);
   }

   public static Function<dwl.a, dwh> a(List<Function<dwl.a, ? extends dwj>> $$0) {
      return $$1 -> new dwh($$0.stream().map($$1x -> (dwj)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
