import com.mojang.serialization.Codec;
import java.util.function.Function;

public record ecs<WC extends ecn>(ecu<WC> d, WC e) {
   public static final Codec<ecs<?>> a = lv.N.q().dispatch($$0 -> $$0.d, ecu::c);
   public static final Codec<jo<ecs<?>>> b = ala.a(lw.aJ, a);
   public static final Codec<js<ecs<?>>> c = kd.a(lw.aJ, a);

   public boolean a(azn $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(ecp $$0, dwo $$1, Function<jf, jo<dfk>> $$2, azn $$3, eaa $$4, ddp $$5, dwn $$6) {
      return ab.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public ecu<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
