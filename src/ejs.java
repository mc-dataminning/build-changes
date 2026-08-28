import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejs {
   public static final Codec<ejs> e = lp.ai.q().dispatch("element_type", ejs::a, ejt::codec);
   private static final ji<emj> a = ji.a(new emj(List.of()));
   @Nullable
   private volatile eju.a b;

   protected static <E extends ejs> RecordCodecBuilder<E, eju.a> d() {
      return eju.a.c.fieldOf("projection").forGetter(ejs::e);
   }

   protected ejs(eju.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(emm var1, dln var2);

   public abstract List<eml.c> a(emm var1, iz var2, dln var3, azh var4);

   public abstract eid a(emm var1, iz var2, dln var3);

   public abstract boolean a(emm var1, dcu var2, dcs var3, dua var4, iz var5, iz var6, dln var7, eid var8, azh var9, boolean var10);

   public abstract ejt<?> a();

   public void a(dca $$0, eml.c $$1, iz $$2, dln $$3, azh $$4, eid $$5) {
   }

   public ejs a(eju.a $$0) {
      this.b = $$0;
      return this;
   }

   public eju.a e() {
      eju.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eju.a, ejl> g() {
      return $$0 -> ejl.b;
   }

   public static Function<eju.a, ejp> a(String $$0) {
      return $$1 -> new ejp(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<eju.a, ejp> a(String $$0, ji<emj> $$1) {
      return $$2 -> new ejp(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<eju.a, ejr> b(String $$0) {
      return $$1 -> new ejr(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<eju.a, ejr> b(String $$0, ji<emj> $$1) {
      return $$2 -> new ejr(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<eju.a, ejm> a(ji<ehp> $$0) {
      return $$1 -> new ejm($$0, $$1);
   }

   public static Function<eju.a, ejq> b(List<Function<eju.a, ? extends ejs>> $$0) {
      return $$1 -> new ejq($$0.stream().map($$1x -> (ejs)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
