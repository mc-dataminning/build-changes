import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eag {
   public static final Codec<eag> e = kd.ai.q().dispatch("element_type", eag::a, eah::codec);
   private static final ih<ecx> a = ih.a(new ecx(List.of()));
   @Nullable
   private volatile eai.a b;

   protected static <E extends eag> RecordCodecBuilder<E, eai.a> d() {
      return eai.a.c.fieldOf("projection").forGetter(eag::e);
   }

   protected eag(eai.a $$0) {
      this.b = $$0;
   }

   public abstract jb a(eda var1, dcv var2);

   public abstract List<ecz.c> a(eda var1, hx var2, dcv var3, aup var4);

   public abstract dyr a(eda var1, hx var2, dcv var3);

   public abstract boolean a(eda var1, cud var2, cub var3, dkx var4, hx var5, hx var6, dcv var7, dyr var8, aup var9, boolean var10);

   public abstract eah<?> a();

   public void a(ctj $$0, ecz.c $$1, hx $$2, dcv $$3, aup $$4, dyr $$5) {
   }

   public eag a(eai.a $$0) {
      this.b = $$0;
      return this;
   }

   public eai.a e() {
      eai.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eai.a, dzz> g() {
      return $$0 -> dzz.b;
   }

   public static Function<eai.a, ead> a(String $$0) {
      return $$1 -> new ead(Either.left(new ahd($$0)), a, $$1);
   }

   public static Function<eai.a, ead> a(String $$0, ih<ecx> $$1) {
      return $$2 -> new ead(Either.left(new ahd($$0)), $$1, $$2);
   }

   public static Function<eai.a, eaf> b(String $$0) {
      return $$1 -> new eaf(Either.left(new ahd($$0)), a, $$1);
   }

   public static Function<eai.a, eaf> b(String $$0, ih<ecx> $$1) {
      return $$2 -> new eaf(Either.left(new ahd($$0)), $$1, $$2);
   }

   public static Function<eai.a, eaa> a(ih<dyd> $$0) {
      return $$1 -> new eaa($$0, $$1);
   }

   public static Function<eai.a, eae> b(List<Function<eai.a, ? extends eag>> $$0) {
      return $$1 -> new eae($$0.stream().map($$1x -> (eag)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
