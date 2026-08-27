import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eiq {
   public static final Codec<eiq> e = le.ai.q().dispatch("element_type", eiq::a, eir::codec);
   private static final ix<elh> a = ix.a(new elh(List.of()));
   @Nullable
   private volatile eis.a b;

   protected static <E extends eiq> RecordCodecBuilder<E, eis.a> d() {
      return eis.a.c.fieldOf("projection").forGetter(eiq::e);
   }

   protected eiq(eis.a $$0) {
      this.b = $$0;
   }

   public abstract js a(elk var1, dkl var2);

   public abstract List<elj.c> a(elk var1, io var2, dkl var3, ayk var4);

   public abstract ehb a(elk var1, io var2, dkl var3);

   public abstract boolean a(elk var1, dbs var2, dbq var3, dsy var4, io var5, io var6, dkl var7, ehb var8, ayk var9, boolean var10);

   public abstract eir<?> a();

   public void a(day $$0, elj.c $$1, io $$2, dkl $$3, ayk $$4, ehb $$5) {
   }

   public eiq a(eis.a $$0) {
      this.b = $$0;
      return this;
   }

   public eis.a e() {
      eis.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eis.a, eij> g() {
      return $$0 -> eij.b;
   }

   public static Function<eis.a, ein> a(String $$0) {
      return $$1 -> new ein(Either.left(new akm($$0)), a, $$1);
   }

   public static Function<eis.a, ein> a(String $$0, ix<elh> $$1) {
      return $$2 -> new ein(Either.left(new akm($$0)), $$1, $$2);
   }

   public static Function<eis.a, eip> b(String $$0) {
      return $$1 -> new eip(Either.left(new akm($$0)), a, $$1);
   }

   public static Function<eis.a, eip> b(String $$0, ix<elh> $$1) {
      return $$2 -> new eip(Either.left(new akm($$0)), $$1, $$2);
   }

   public static Function<eis.a, eik> a(ix<egn> $$0) {
      return $$1 -> new eik($$0, $$1);
   }

   public static Function<eis.a, eio> b(List<Function<eis.a, ? extends eiq>> $$0) {
      return $$1 -> new eio($$0.stream().map($$1x -> (eiq)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
