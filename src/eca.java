import com.mojang.serialization.Codec;
import java.util.function.Function;

public record eca<WC extends ebv>(ecc<WC> d, WC e) {
   public static final Codec<eca<?>> a = lu.N.q().dispatch($$0 -> $$0.d, ecc::c);
   public static final Codec<jn<eca<?>>> b = akx.a(lv.aH, a);
   public static final Codec<jr<eca<?>>> c = kc.a(lv.aH, a);

   public boolean a(azk $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ebx $$0, dvw $$1, Function<je, jn<det>> $$2, azk $$3, dzi $$4, dcy $$5, dvv $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ecc<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
