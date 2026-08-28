import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dzx<WC extends dzs>(dzz<WC> d, WC e) {
   public static final Codec<dzx<?>> a = lp.P.q().dispatch($$0 -> $$0.d, dzz::c);
   public static final Codec<ji<dzx<?>>> b = alb.a(lq.aB, a);
   public static final Codec<jm<dzx<?>>> c = jx.a(lq.aB, a);

   public boolean a(azh $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dzu $$0, dty $$1, Function<iz, ji<dcx>> $$2, azh $$3, dxg $$4, dbf $$5, dtx $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dzz<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
