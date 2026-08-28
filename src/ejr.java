import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejr {
   public static final Codec<ejr> e = lp.ai.q().dispatch("element_type", ejr::a, ejs::codec);
   private static final ji<emi> a = ji.a(new emi(List.of()));
   @Nullable
   private volatile ejt.a b;

   protected static <E extends ejr> RecordCodecBuilder<E, ejt.a> d() {
      return ejt.a.c.fieldOf("projection").forGetter(ejr::e);
   }

   protected ejr(ejt.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(eml var1, dlm var2);

   public abstract List<emk.c> a(eml var1, iz var2, dlm var3, azh var4);

   public abstract eic a(eml var1, iz var2, dlm var3);

   public abstract boolean a(eml var1, dct var2, dcr var3, dtz var4, iz var5, iz var6, dlm var7, eic var8, azh var9, boolean var10);

   public abstract ejs<?> a();

   public void a(dbz $$0, emk.c $$1, iz $$2, dlm $$3, azh $$4, eic $$5) {
   }

   public ejr a(ejt.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejt.a e() {
      ejt.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejt.a, ejk> g() {
      return $$0 -> ejk.b;
   }

   public static Function<ejt.a, ejo> a(String $$0) {
      return $$1 -> new ejo(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<ejt.a, ejo> a(String $$0, ji<emi> $$1) {
      return $$2 -> new ejo(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<ejt.a, ejq> b(String $$0) {
      return $$1 -> new ejq(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<ejt.a, ejq> b(String $$0, ji<emi> $$1) {
      return $$2 -> new ejq(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<ejt.a, ejl> a(ji<eho> $$0) {
      return $$1 -> new ejl($$0, $$1);
   }

   public static Function<ejt.a, ejp> b(List<Function<ejt.a, ? extends ejr>> $$0) {
      return $$1 -> new ejp($$0.stream().map($$1x -> (ejr)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
