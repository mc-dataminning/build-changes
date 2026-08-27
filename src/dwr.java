import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwr {
   public static final Codec<dwr> e = jd.ai.q().dispatch("element_type", dwr::a, dws::codec);
   private static final hg<dzb> a = hg.a(new dzb(List.of()));
   @Nullable
   private volatile dwt.a b;

   protected static <E extends dwr> RecordCodecBuilder<E, dwt.a> d() {
      return dwt.a.c.fieldOf("projection").forGetter(dwr::e);
   }

   protected dwr(dwt.a $$0) {
      this.b = $$0;
   }

   public abstract ib a(dze var1, czj var2);

   public abstract List<dzd.c> a(dze var1, gw var2, czj var3, ase var4);

   public abstract dvc a(dze var1, gw var2, czj var3);

   public abstract boolean a(dze var1, cqr var2, cqp var3, dhi var4, gw var5, gw var6, czj var7, dvc var8, ase var9, boolean var10);

   public abstract dws<?> a();

   public void a(cpy $$0, dzd.c $$1, gw $$2, czj $$3, ase $$4, dvc $$5) {
   }

   public dwr a(dwt.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwt.a e() {
      dwt.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwt.a, dwk> g() {
      return $$0 -> dwk.b;
   }

   public static Function<dwt.a, dwo> a(String $$0) {
      return $$1 -> new dwo(Either.left(new aey($$0)), a, $$1);
   }

   public static Function<dwt.a, dwo> a(String $$0, hg<dzb> $$1) {
      return $$2 -> new dwo(Either.left(new aey($$0)), $$1, $$2);
   }

   public static Function<dwt.a, dwq> b(String $$0) {
      return $$1 -> new dwq(Either.left(new aey($$0)), a, $$1);
   }

   public static Function<dwt.a, dwq> b(String $$0, hg<dzb> $$1) {
      return $$2 -> new dwq(Either.left(new aey($$0)), $$1, $$2);
   }

   public static Function<dwt.a, dwl> a(hg<duo> $$0) {
      return $$1 -> new dwl($$0, $$1);
   }

   public static Function<dwt.a, dwp> a(List<Function<dwt.a, ? extends dwr>> $$0) {
      return $$1 -> new dwp($$0.stream().map($$1x -> (dwr)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
