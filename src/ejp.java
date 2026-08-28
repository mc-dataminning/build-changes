import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ejp {
   public static final Codec<ejp> e = lp.ai.q().dispatch("element_type", ejp::a, ejq::codec);
   private static final ji<emg> a = ji.a(new emg(List.of()));
   @Nullable
   private volatile ejr.a b;

   protected static <E extends ejp> RecordCodecBuilder<E, ejr.a> d() {
      return ejr.a.c.fieldOf("projection").forGetter(ejp::e);
   }

   protected ejp(ejr.a $$0) {
      this.b = $$0;
   }

   public abstract kd a(emj var1, dlk var2);

   public abstract List<emi.c> a(emj var1, iz var2, dlk var3, azf var4);

   public abstract eia a(emj var1, iz var2, dlk var3);

   public abstract boolean a(emj var1, dcr var2, dcp var3, dtx var4, iz var5, iz var6, dlk var7, eia var8, azf var9, boolean var10);

   public abstract ejq<?> a();

   public void a(dbx $$0, emi.c $$1, iz $$2, dlk $$3, azf $$4, eia $$5) {
   }

   public ejp a(ejr.a $$0) {
      this.b = $$0;
      return this;
   }

   public ejr.a e() {
      ejr.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ejr.a, eji> g() {
      return $$0 -> eji.b;
   }

   public static Function<ejr.a, ejm> a(String $$0) {
      return $$1 -> new ejm(Either.left(new ale($$0)), a, $$1);
   }

   public static Function<ejr.a, ejm> a(String $$0, ji<emg> $$1) {
      return $$2 -> new ejm(Either.left(new ale($$0)), $$1, $$2);
   }

   public static Function<ejr.a, ejo> b(String $$0) {
      return $$1 -> new ejo(Either.left(new ale($$0)), a, $$1);
   }

   public static Function<ejr.a, ejo> b(String $$0, ji<emg> $$1) {
      return $$2 -> new ejo(Either.left(new ale($$0)), $$1, $$2);
   }

   public static Function<ejr.a, ejj> a(ji<ehm> $$0) {
      return $$1 -> new ejj($$0, $$1);
   }

   public static Function<ejr.a, ejn> b(List<Function<ejr.a, ? extends ejp>> $$0) {
      return $$1 -> new ejn($$0.stream().map($$1x -> (ejp)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
