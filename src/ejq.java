import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejq {
   public static final Codec<ejq> e = lp.ai.q().dispatch("element_type", ejq::a, ejr::codec);
   private static final ji<emh> a = ji.a(new emh(List.of()));
   @Nullable
   private volatile ejs.a b;

   protected static <E extends ejq> RecordCodecBuilder<E, ejs.a> d() {
      return ejs.a.c.fieldOf("projection").forGetter(ejq::e);
   }

   protected ejq(ejs.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(emk var1, dll var2);

   public abstract List<emj.c> a(emk var1, iz var2, dll var3, azg var4);

   public abstract eib a(emk var1, iz var2, dll var3);

   public abstract boolean a(emk var1, dcs var2, dcq var3, dty var4, iz var5, iz var6, dll var7, eib var8, azg var9, boolean var10);

   public abstract ejr<?> a();

   public void a(dby $$0, emj.c $$1, iz $$2, dll $$3, azg $$4, eib $$5) {
   }

   public ejq a(ejs.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejs.a e() {
      ejs.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejs.a, ejj> g() {
      return $$0 -> ejj.b;
   }

   public static Function<ejs.a, ejn> a(String $$0) {
      return $$1 -> new ejn(Either.left(new ale($$0)), a, $$1);
   }

   public static Function<ejs.a, ejn> a(String $$0, ji<emh> $$1) {
      return $$2 -> new ejn(Either.left(new ale($$0)), $$1, $$2);
   }

   public static Function<ejs.a, ejp> b(String $$0) {
      return $$1 -> new ejp(Either.left(new ale($$0)), a, $$1);
   }

   public static Function<ejs.a, ejp> b(String $$0, ji<emh> $$1) {
      return $$2 -> new ejp(Either.left(new ale($$0)), $$1, $$2);
   }

   public static Function<ejs.a, ejk> a(ji<ehn> $$0) {
      return $$1 -> new ejk($$0, $$1);
   }

   public static Function<ejs.a, ejo> b(List<Function<ejs.a, ? extends ejq>> $$0) {
      return $$1 -> new ejo($$0.stream().map($$1x -> (ejq)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
