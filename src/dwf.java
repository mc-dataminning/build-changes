import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwf {
   public static final Codec<dwf> e = jb.ai.q().dispatch("element_type", dwf::a, dwg::codec);
   private static final he<dyp> a = he.a(new dyp(List.of()));
   @Nullable
   private volatile dwh.a b;

   protected static <E extends dwf> RecordCodecBuilder<E, dwh.a> d() {
      return dwh.a.c.fieldOf("projection").forGetter(dwf::e);
   }

   protected dwf(dwh.a $$0) {
      this.b = $$0;
   }

   public abstract hz a(dys var1, cyx var2);

   public abstract List<dyr.c> a(dys var1, gu var2, cyx var3, aru var4);

   public abstract duq a(dys var1, gu var2, cyx var3);

   public abstract boolean a(dys var1, cqf var2, cqd var3, dgw var4, gu var5, gu var6, cyx var7, duq var8, aru var9, boolean var10);

   public abstract dwg<?> a();

   public void a(cpm $$0, dyr.c $$1, gu $$2, cyx $$3, aru $$4, duq $$5) {
   }

   public dwf a(dwh.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwh.a e() {
      dwh.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwh.a, dvy> g() {
      return $$0 -> dvy.b;
   }

   public static Function<dwh.a, dwc> a(String $$0) {
      return $$1 -> new dwc(Either.left(new aer($$0)), a, $$1);
   }

   public static Function<dwh.a, dwc> a(String $$0, he<dyp> $$1) {
      return $$2 -> new dwc(Either.left(new aer($$0)), $$1, $$2);
   }

   public static Function<dwh.a, dwe> b(String $$0) {
      return $$1 -> new dwe(Either.left(new aer($$0)), a, $$1);
   }

   public static Function<dwh.a, dwe> b(String $$0, he<dyp> $$1) {
      return $$2 -> new dwe(Either.left(new aer($$0)), $$1, $$2);
   }

   public static Function<dwh.a, dvz> a(he<duc> $$0) {
      return $$1 -> new dvz($$0, $$1);
   }

   public static Function<dwh.a, dwd> a(List<Function<dwh.a, ? extends dwf>> $$0) {
      return $$1 -> new dwd($$0.stream().map($$1x -> (dwf)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
