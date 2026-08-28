import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class esb {
   public static final Codec<esb> f = mf.ag.q().dispatch("element_type", esb::a, esc::codec);
   private static final je<eut> a = je.a(new eut(List.of()));
   @Nullable
   private volatile esd.a b;

   protected static <E extends esb> RecordCodecBuilder<E, esd.a> e() {
      return esd.a.c.fieldOf("projection").forGetter(esb::f);
   }

   protected esb(esd.a $$0) {
      this.b = $$0;
   }

   public abstract jz a(euw var1, dst var2);

   public abstract List<euv.a> a(euw var1, iu var2, dst var3, azv var4);

   public abstract eql a(euw var1, iu var2, dst var3);

   public abstract boolean a(euw var1, dju var2, djr var3, ebx var4, iu var5, iu var6, dst var7, eql var8, azv var9, euf var10, boolean var11);

   public abstract esc<?> a();

   public void a(diw $$0, euv.d $$1, iu $$2, dst $$3, azv $$4, eql $$5) {
   }

   public esb a(esd.a $$0) {
      this.b = $$0;
      return this;
   }

   public esd.a f() {
      esd.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<esd.a, eru> h() {
      return $$0 -> eru.b;
   }

   public static Function<esd.a, ery> a(String $$0) {
      return $$1 -> new ery(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esd.a, ery> a(String $$0, je<eut> $$1) {
      return $$2 -> new ery(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esd.a, esa> b(String $$0) {
      return $$1 -> new esa(Either.left(alg.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<esd.a, esa> b(String $$0, je<eut> $$1) {
      return $$2 -> new esa(Either.left(alg.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<esd.a, esa> a(String $$0, euf $$1) {
      return $$2 -> new esa(Either.left(alg.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<esd.a, esa> a(String $$0, je<eut> $$1, euf $$2) {
      return $$3 -> new esa(Either.left(alg.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<esd.a, erv> a(je<epx> $$0) {
      return $$1 -> new erv($$0, $$1);
   }

   public static Function<esd.a, erz> b(List<Function<esd.a, ? extends esb>> $$0) {
      return $$1 -> new erz($$0.stream().map($$1x -> (esb)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
