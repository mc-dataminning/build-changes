import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eis {
   public static final Codec<eis> e = le.ai.q().dispatch("element_type", eis::a, eit::codec);
   private static final ix<elj> a = ix.a(new elj(List.of()));
   @Nullable
   private volatile eiu.a b;

   protected static <E extends eis> RecordCodecBuilder<E, eiu.a> d() {
      return eiu.a.c.fieldOf("projection").forGetter(eis::e);
   }

   protected eis(eiu.a $$0) {
      this.b = $$0;
   }

   public abstract js a(elm var1, dkn var2);

   public abstract List<ell.c> a(elm var1, io var2, dkn var3, aym var4);

   public abstract ehd a(elm var1, io var2, dkn var3);

   public abstract boolean a(elm var1, dbu var2, dbs var3, dta var4, io var5, io var6, dkn var7, ehd var8, aym var9, boolean var10);

   public abstract eit<?> a();

   public void a(dba $$0, ell.c $$1, io $$2, dkn $$3, aym $$4, ehd $$5) {
   }

   public eis a(eiu.a $$0) {
      this.b = $$0;
      return this;
   }

   public eiu.a e() {
      eiu.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<eiu.a, eil> g() {
      return $$0 -> eil.b;
   }

   public static Function<eiu.a, eip> a(String $$0) {
      return $$1 -> new eip(Either.left(new akn($$0)), a, $$1);
   }

   public static Function<eiu.a, eip> a(String $$0, ix<elj> $$1) {
      return $$2 -> new eip(Either.left(new akn($$0)), $$1, $$2);
   }

   public static Function<eiu.a, eir> b(String $$0) {
      return $$1 -> new eir(Either.left(new akn($$0)), a, $$1);
   }

   public static Function<eiu.a, eir> b(String $$0, ix<elj> $$1) {
      return $$2 -> new eir(Either.left(new akn($$0)), $$1, $$2);
   }

   public static Function<eiu.a, eim> a(ix<egp> $$0) {
      return $$1 -> new eim($$0, $$1);
   }

   public static Function<eiu.a, eiq> b(List<Function<eiu.a, ? extends eis>> $$0) {
      return $$1 -> new eiq($$0.stream().map($$1x -> (eis)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
