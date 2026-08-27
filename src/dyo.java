import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dyo {
   public static final Codec<dyo> e = jy.aj.q().dispatch("element_type", dyo::a, dyp::codec);
   private static final ib<ebf> a = ib.a(new ebf(List.of()));
   @Nullable
   private volatile dyq.a b;

   protected static <E extends dyo> RecordCodecBuilder<E, dyq.a> d() {
      return dyq.a.c.fieldOf("projection").forGetter(dyo::e);
   }

   protected dyo(dyq.a $$0) {
      this.b = $$0;
   }

   public abstract iw a(ebi var1, dbm var2);

   public abstract List<ebh.c> a(ebi var1, ht var2, dbm var3, ats var4);

   public abstract dwz a(ebi var1, ht var2, dbm var3);

   public abstract boolean a(ebi var1, csu var2, css var3, djf var4, ht var5, ht var6, dbm var7, dwz var8, ats var9, boolean var10);

   public abstract dyp<?> a();

   public void a(csb $$0, ebh.c $$1, ht $$2, dbm $$3, ats $$4, dwz $$5) {
   }

   public dyo a(dyq.a $$0) {
      this.b = $$0;
      return this;
   }

   public dyq.a e() {
      dyq.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dyq.a, dyh> g() {
      return $$0 -> dyh.b;
   }

   public static Function<dyq.a, dyl> a(String $$0) {
      return $$1 -> new dyl(Either.left(new agi($$0)), a, $$1);
   }

   public static Function<dyq.a, dyl> a(String $$0, ib<ebf> $$1) {
      return $$2 -> new dyl(Either.left(new agi($$0)), $$1, $$2);
   }

   public static Function<dyq.a, dyn> b(String $$0) {
      return $$1 -> new dyn(Either.left(new agi($$0)), a, $$1);
   }

   public static Function<dyq.a, dyn> b(String $$0, ib<ebf> $$1) {
      return $$2 -> new dyn(Either.left(new agi($$0)), $$1, $$2);
   }

   public static Function<dyq.a, dyi> a(ib<dwl> $$0) {
      return $$1 -> new dyi($$0, $$1);
   }

   public static Function<dyq.a, dym> b(List<Function<dyq.a, ? extends dyo>> $$0) {
      return $$1 -> new dym($$0.stream().map($$1x -> (dyo)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
