import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwe {
   public static final Codec<dwe> e = jc.ai.q().dispatch("element_type", dwe::a, dwf::codec);
   private static final hf<dyo> a = hf.a(new dyo(List.of()));
   @Nullable
   private volatile dwg.a b;

   protected static <E extends dwe> RecordCodecBuilder<E, dwg.a> d() {
      return dwg.a.c.fieldOf("projection").forGetter(dwe::e);
   }

   protected dwe(dwg.a $$0) {
      this.b = $$0;
   }

   public abstract ia a(dyr var1, cyw var2);

   public abstract List<dyq.c> a(dyr var1, gv var2, cyw var3, art var4);

   public abstract dup a(dyr var1, gv var2, cyw var3);

   public abstract boolean a(dyr var1, cqe var2, cqc var3, dgv var4, gv var5, gv var6, cyw var7, dup var8, art var9, boolean var10);

   public abstract dwf<?> a();

   public void a(cpl $$0, dyq.c $$1, gv $$2, cyw $$3, art $$4, dup $$5) {
   }

   public dwe a(dwg.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwg.a e() {
      dwg.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwg.a, dvx> g() {
      return $$0 -> dvx.b;
   }

   public static Function<dwg.a, dwb> a(String $$0) {
      return $$1 -> new dwb(Either.left(new aep($$0)), a, $$1);
   }

   public static Function<dwg.a, dwb> a(String $$0, hf<dyo> $$1) {
      return $$2 -> new dwb(Either.left(new aep($$0)), $$1, $$2);
   }

   public static Function<dwg.a, dwd> b(String $$0) {
      return $$1 -> new dwd(Either.left(new aep($$0)), a, $$1);
   }

   public static Function<dwg.a, dwd> b(String $$0, hf<dyo> $$1) {
      return $$2 -> new dwd(Either.left(new aep($$0)), $$1, $$2);
   }

   public static Function<dwg.a, dvy> a(hf<dub> $$0) {
      return $$1 -> new dvy($$0, $$1);
   }

   public static Function<dwg.a, dwc> a(List<Function<dwg.a, ? extends dwe>> $$0) {
      return $$1 -> new dwc($$0.stream().map($$1x -> (dwe)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
