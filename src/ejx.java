import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejx {
   public static final Codec<ejx> e = lq.ag.r().dispatch("element_type", ejx::a, ejy::codec);
   private static final jj<emo> a = jj.a(new emo(List.of()));
   @Nullable
   private volatile ejz.a b;

   protected static <E extends ejx> RecordCodecBuilder<E, ejz.a> d() {
      return ejz.a.c.fieldOf("projection").forGetter(ejx::e);
   }

   protected ejx(ejz.a $$0) {
      this.b = $$0;
   }

   public abstract ke a(emr var1, dls var2);

   public abstract List<emq.c> a(emr var1, ja var2, dls var3, aym var4);

   public abstract eii a(emr var1, ja var2, dls var3);

   public abstract boolean a(emr var1, dcz var2, dcx var3, due var4, ja var5, ja var6, dls var7, eii var8, aym var9, boolean var10);

   public abstract ejy<?> a();

   public void a(dce $$0, emq.c $$1, ja $$2, dls $$3, aym $$4, eii $$5) {
   }

   public ejx a(ejz.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejz.a e() {
      ejz.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejz.a, ejq> g() {
      return $$0 -> ejq.b;
   }

   public static Function<ejz.a, eju> a(String $$0) {
      return $$1 -> new eju(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ejz.a, eju> a(String $$0, jj<emo> $$1) {
      return $$2 -> new eju(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ejz.a, ejw> b(String $$0) {
      return $$1 -> new ejw(Either.left(new akk($$0)), a, $$1);
   }

   public static Function<ejz.a, ejw> b(String $$0, jj<emo> $$1) {
      return $$2 -> new ejw(Either.left(new akk($$0)), $$1, $$2);
   }

   public static Function<ejz.a, ejr> a(jj<ehu> $$0) {
      return $$1 -> new ejr($$0, $$1);
   }

   public static Function<ejz.a, ejv> b(List<Function<ejz.a, ? extends ejx>> $$0) {
      return $$1 -> new ejv($$0.stream().map($$1x -> (ejx)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
