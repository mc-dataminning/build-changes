import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejm {
   public static final Codec<ejm> e = lp.ai.q().dispatch("element_type", ejm::a, ejn::codec);
   private static final ji<emd> a = ji.a(new emd(List.of()));
   @Nullable
   private volatile ejo.a b;

   protected static <E extends ejm> RecordCodecBuilder<E, ejo.a> d() {
      return ejo.a.c.fieldOf("projection").forGetter(ejm::e);
   }

   protected ejm(ejo.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(emg var1, dlh var2);

   public abstract List<emf.c> a(emg var1, iz var2, dlh var3, azc var4);

   public abstract ehx a(emg var1, iz var2, dlh var3);

   public abstract boolean a(emg var1, dco var2, dcm var3, dtu var4, iz var5, iz var6, dlh var7, ehx var8, azc var9, boolean var10);

   public abstract ejn<?> a();

   public void a(dbu $$0, emf.c $$1, iz $$2, dlh $$3, azc $$4, ehx $$5) {
   }

   public ejm a(ejo.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejo.a e() {
      ejo.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejo.a, ejf> g() {
      return $$0 -> ejf.b;
   }

   public static Function<ejo.a, ejj> a(String $$0) {
      return $$1 -> new ejj(Either.left(new alb($$0)), a, $$1);
   }

   public static Function<ejo.a, ejj> a(String $$0, ji<emd> $$1) {
      return $$2 -> new ejj(Either.left(new alb($$0)), $$1, $$2);
   }

   public static Function<ejo.a, ejl> b(String $$0) {
      return $$1 -> new ejl(Either.left(new alb($$0)), a, $$1);
   }

   public static Function<ejo.a, ejl> b(String $$0, ji<emd> $$1) {
      return $$2 -> new ejl(Either.left(new alb($$0)), $$1, $$2);
   }

   public static Function<ejo.a, ejg> a(ji<ehj> $$0) {
      return $$1 -> new ejg($$0, $$1);
   }

   public static Function<ejo.a, ejk> b(List<Function<ejo.a, ? extends ejm>> $$0) {
      return $$1 -> new ejk($$0.stream().map($$1x -> (ejm)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
