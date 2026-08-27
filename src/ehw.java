import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ehw {
   public static final Codec<ehw> e = ld.ai.q().dispatch("element_type", ehw::a, ehx::codec);
   private static final iw<ekn> a = iw.a(new ekn(List.of()));
   @Nullable
   private volatile ehy.a b;

   protected static <E extends ehw> RecordCodecBuilder<E, ehy.a> d() {
      return ehy.a.c.fieldOf("projection").forGetter(ehw::e);
   }

   protected ehw(ehy.a $$0) {
      this.b = $$0;
   }

   public abstract jr a(ekq var1, djr var2);

   public abstract List<ekp.c> a(ekq var1, in var2, djr var3, ayg var4);

   public abstract egh a(ekq var1, in var2, djr var3);

   public abstract boolean a(ekq var1, day var2, daw var3, dse var4, in var5, in var6, djr var7, egh var8, ayg var9, boolean var10);

   public abstract ehx<?> a();

   public void a(dae $$0, ekp.c $$1, in $$2, djr $$3, ayg $$4, egh $$5) {
   }

   public ehw a(ehy.a $$0) {
      this.b = $$0;
      return this;
   }

   public ehy.a e() {
      ehy.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ehy.a, ehp> g() {
      return $$0 -> ehp.b;
   }

   public static Function<ehy.a, eht> a(String $$0) {
      return $$1 -> new eht(Either.left(new akh($$0)), a, $$1);
   }

   public static Function<ehy.a, eht> a(String $$0, iw<ekn> $$1) {
      return $$2 -> new eht(Either.left(new akh($$0)), $$1, $$2);
   }

   public static Function<ehy.a, ehv> b(String $$0) {
      return $$1 -> new ehv(Either.left(new akh($$0)), a, $$1);
   }

   public static Function<ehy.a, ehv> b(String $$0, iw<ekn> $$1) {
      return $$2 -> new ehv(Either.left(new akh($$0)), $$1, $$2);
   }

   public static Function<ehy.a, ehq> a(iw<eft> $$0) {
      return $$1 -> new ehq($$0, $$1);
   }

   public static Function<ehy.a, ehu> b(List<Function<ehy.a, ? extends ehw>> $$0) {
      return $$1 -> new ehu($$0.stream().map($$1x -> (ehw)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
