import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dth {
   public static final Codec<dth> e = jb.ai.q().dispatch("element_type", dth::a, dti::codec);
   private static final he<dvr> a = he.a(new dvr(List.of()));
   @Nullable
   private volatile dtj.a b;

   protected static <E extends dth> RecordCodecBuilder<E, dtj.a> d() {
      return dtj.a.c.fieldOf("projection").forGetter(dth::e);
   }

   protected dth(dtj.a $$0) {
      this.b = $$0;
   }

   public abstract hz a(dvu var1, cvz var2);

   public abstract List<dvt.c> a(dvu var1, gu var2, cvz var3, apf var4);

   public abstract drs a(dvu var1, gu var2, cvz var3);

   public abstract boolean a(dvu var1, cng var2, cne var3, ddy var4, gu var5, gu var6, cvz var7, drs var8, apf var9, boolean var10);

   public abstract dti<?> a();

   public void a(cmn $$0, dvt.c $$1, gu $$2, cvz $$3, apf $$4, drs $$5) {
   }

   public dth a(dtj.a $$0) {
      this.b = $$0;
      return this;
   }

   public dtj.a e() {
      dtj.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dtj.a, dta> g() {
      return $$0 -> dta.b;
   }

   public static Function<dtj.a, dte> a(String $$0) {
      return $$1 -> new dte(Either.left(new acq($$0)), a, $$1);
   }

   public static Function<dtj.a, dte> a(String $$0, he<dvr> $$1) {
      return $$2 -> new dte(Either.left(new acq($$0)), $$1, $$2);
   }

   public static Function<dtj.a, dtg> b(String $$0) {
      return $$1 -> new dtg(Either.left(new acq($$0)), a, $$1);
   }

   public static Function<dtj.a, dtg> b(String $$0, he<dvr> $$1) {
      return $$2 -> new dtg(Either.left(new acq($$0)), $$1, $$2);
   }

   public static Function<dtj.a, dtb> a(he<dre> $$0) {
      return $$1 -> new dtb($$0, $$1);
   }

   public static Function<dtj.a, dtf> a(List<Function<dtj.a, ? extends dth>> $$0) {
      return $$1 -> new dtf($$0.stream().map($$1x -> (dth)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
