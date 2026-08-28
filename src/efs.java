import com.mojang.serialization.Codec;
import java.util.function.Function;

public record efs<WC extends efn>(efu<WC> d, WC e) {
   public static final Codec<efs<?>> a = mb.N.q().dispatch($$0 -> $$0.d, efu::c);
   public static final Codec<jr<efs<?>>> b = akq.a(mc.aL, a);
   public static final Codec<jv<efs<?>>> c = kg.a(mc.aL, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(efp $$0, dzm $$1, Function<ji, jr<dic>> $$2, azh $$3, eda $$4, dgg $$5, dzl $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public efu<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
