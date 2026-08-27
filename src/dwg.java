import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwg {
   public static final Codec<dwg> e = jb.ai.q().dispatch("element_type", dwg::a, dwh::codec);
   private static final he<dyq> a = he.a(new dyq(List.of()));
   @Nullable
   private volatile dwi.a b;

   protected static <E extends dwg> RecordCodecBuilder<E, dwi.a> d() {
      return dwi.a.c.fieldOf("projection").forGetter(dwg::e);
   }

   protected dwg(dwi.a $$0) {
      this.b = $$0;
   }

   public abstract hz a(dyt var1, cyy var2);

   public abstract List<dys.c> a(dyt var1, gu var2, cyy var3, aru var4);

   public abstract dur a(dyt var1, gu var2, cyy var3);

   public abstract boolean a(dyt var1, cqg var2, cqe var3, dgx var4, gu var5, gu var6, cyy var7, dur var8, aru var9, boolean var10);

   public abstract dwh<?> a();

   public void a(cpn $$0, dys.c $$1, gu $$2, cyy $$3, aru $$4, dur $$5) {
   }

   public dwg a(dwi.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwi.a e() {
      dwi.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwi.a, dvz> g() {
      return $$0 -> dvz.b;
   }

   public static Function<dwi.a, dwd> a(String $$0) {
      return $$1 -> new dwd(Either.left(new aer($$0)), a, $$1);
   }

   public static Function<dwi.a, dwd> a(String $$0, he<dyq> $$1) {
      return $$2 -> new dwd(Either.left(new aer($$0)), $$1, $$2);
   }

   public static Function<dwi.a, dwf> b(String $$0) {
      return $$1 -> new dwf(Either.left(new aer($$0)), a, $$1);
   }

   public static Function<dwi.a, dwf> b(String $$0, he<dyq> $$1) {
      return $$2 -> new dwf(Either.left(new aer($$0)), $$1, $$2);
   }

   public static Function<dwi.a, dwa> a(he<dud> $$0) {
      return $$1 -> new dwa($$0, $$1);
   }

   public static Function<dwi.a, dwe> a(List<Function<dwi.a, ? extends dwg>> $$0) {
      return $$1 -> new dwe($$0.stream().map($$1x -> (dwg)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
