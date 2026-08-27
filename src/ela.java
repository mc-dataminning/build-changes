import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ela {
   public static final Codec<ela> e = lh.ai.q().dispatch("element_type", ela::a, elb::codec);
   private static final ja<enr> a = ja.a(new enr(List.of()));
   @Nullable
   private volatile elc.a b;

   protected static <E extends ela> RecordCodecBuilder<E, elc.a> d() {
      return elc.a.c.fieldOf("projection").forGetter(ela::e);
   }

   protected ela(elc.a $$0) {
      this.b = $$0;
   }

   public abstract jv a(enu var1, dmd var2);

   public abstract List<ent.c> a(enu var1, ir var2, dmd var3, ayt var4);

   public abstract ejl a(enu var1, ir var2, dmd var3);

   public abstract boolean a(enu var1, dcv var2, dct var3, duz var4, ir var5, ir var6, dmd var7, ejl var8, ayt var9, boolean var10);

   public abstract elb<?> a();

   public void a(dcb $$0, ent.c $$1, ir $$2, dmd $$3, ayt $$4, ejl $$5) {
   }

   public ela a(elc.a $$0) {
      this.b = $$0;
      return this;
   }

   public elc.a e() {
      elc.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<elc.a, ekt> g() {
      return $$0 -> ekt.b;
   }

   public static Function<elc.a, ekx> a(String $$0) {
      return $$1 -> new ekx(Either.left(new akt($$0)), a, $$1);
   }

   public static Function<elc.a, ekx> a(String $$0, ja<enr> $$1) {
      return $$2 -> new ekx(Either.left(new akt($$0)), $$1, $$2);
   }

   public static Function<elc.a, ekz> b(String $$0) {
      return $$1 -> new ekz(Either.left(new akt($$0)), a, $$1);
   }

   public static Function<elc.a, ekz> b(String $$0, ja<enr> $$1) {
      return $$2 -> new ekz(Either.left(new akt($$0)), $$1, $$2);
   }

   public static Function<elc.a, eku> a(ja<eix> $$0) {
      return $$1 -> new eku($$0, $$1);
   }

   public static Function<elc.a, eky> b(List<Function<elc.a, ? extends ela>> $$0) {
      return $$1 -> new eky($$0.stream().map($$1x -> (ela)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
