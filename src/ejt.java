import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejt {
   public static final Codec<ejt> e = lp.ai.q().dispatch("element_type", ejt::a, eju::codec);
   private static final ji<emk> a = ji.a(new emk(List.of()));
   @Nullable
   private volatile ejv.a b;

   protected static <E extends ejt> RecordCodecBuilder<E, ejv.a> d() {
      return ejv.a.c.fieldOf("projection").forGetter(ejt::e);
   }

   protected ejt(ejv.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(emn var1, dlo var2);

   public abstract List<emm.c> a(emn var1, iz var2, dlo var3, azh var4);

   public abstract eie a(emn var1, iz var2, dlo var3);

   public abstract boolean a(emn var1, dcv var2, dct var3, dub var4, iz var5, iz var6, dlo var7, eie var8, azh var9, boolean var10);

   public abstract eju<?> a();

   public void a(dcb $$0, emm.c $$1, iz $$2, dlo $$3, azh $$4, eie $$5) {
   }

   public ejt a(ejv.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejv.a e() {
      ejv.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejv.a, ejm> g() {
      return $$0 -> ejm.b;
   }

   public static Function<ejv.a, ejq> a(String $$0) {
      return $$1 -> new ejq(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<ejv.a, ejq> a(String $$0, ji<emk> $$1) {
      return $$2 -> new ejq(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<ejv.a, ejs> b(String $$0) {
      return $$1 -> new ejs(Either.left(new alf($$0)), a, $$1);
   }

   public static Function<ejv.a, ejs> b(String $$0, ji<emk> $$1) {
      return $$2 -> new ejs(Either.left(new alf($$0)), $$1, $$2);
   }

   public static Function<ejv.a, ejn> a(ji<ehq> $$0) {
      return $$1 -> new ejn($$0, $$1);
   }

   public static Function<ejv.a, ejr> b(List<Function<ejv.a, ? extends ejt>> $$0) {
      return $$1 -> new ejr($$0.stream().map($$1x -> (ejt)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
