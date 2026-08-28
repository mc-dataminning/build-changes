import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class elw {
   public static final Codec<elw> f = lu.ag.q().dispatch("element_type", elw::a, elx::codec);
   private static final jn<eoo> a = jn.a(new eoo(List.of()));
   @Nullable
   private volatile ely.a b;

   protected static <E extends elw> RecordCodecBuilder<E, ely.a> e() {
      return ely.a.c.fieldOf("projection").forGetter(elw::f);
   }

   protected elw(ely.a $$0) {
      this.b = $$0;
   }

   public abstract ki a(eor var1, dnj var2);

   public abstract List<eoq.c> a(eor var1, je var2, dnj var3, azk var4);

   public abstract ekg a(eor var1, je var2, dnj var3);

   public abstract boolean a(eor var1, dep var2, den var3, dvx var4, je var5, je var6, dnj var7, ekg var8, azk var9, eoa var10, boolean var11);

   public abstract elx<?> a();

   public void a(ddt $$0, eoq.c $$1, je $$2, dnj $$3, azk $$4, ekg $$5) {
   }

   public elw a(ely.a $$0) {
      this.b = $$0;
      return this;
   }

   public ely.a f() {
      ely.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<ely.a, elp> h() {
      return $$0 -> elp.b;
   }

   public static Function<ely.a, elt> a(String $$0) {
      return $$1 -> new elt(Either.left(alb.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ely.a, elt> a(String $$0, jn<eoo> $$1) {
      return $$2 -> new elt(Either.left(alb.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ely.a, elv> b(String $$0) {
      return $$1 -> new elv(Either.left(alb.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ely.a, elv> b(String $$0, jn<eoo> $$1) {
      return $$2 -> new elv(Either.left(alb.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ely.a, elv> a(String $$0, eoa $$1) {
      return $$2 -> new elv(Either.left(alb.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ely.a, elv> a(String $$0, jn<eoo> $$1, eoa $$2) {
      return $$3 -> new elv(Either.left(alb.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ely.a, elq> a(jn<ejs> $$0) {
      return $$1 -> new elq($$0, $$1);
   }

   public static Function<ely.a, elu> b(List<Function<ely.a, ? extends elw>> $$0) {
      return $$1 -> new elu($$0.stream().map($$1x -> (elw)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
