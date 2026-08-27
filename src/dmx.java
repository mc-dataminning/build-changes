import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmx<WC extends dms>(dmz<WC> d, WC e) {
   public static final Codec<dmx<?>> a = jd.Q.q().dispatch($$0 -> $$0.d, dmz::c);
   public static final Codec<hg<dmx<?>>> b = aeu.a(je.ar, a);
   public static final Codec<hk<dmx<?>>> c = hv.a(je.ar, a);

   public boolean a(ase $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmu $$0, dhh $$1, Function<gw, hg<cqv>> $$2, ase $$3, dkg $$4, cpe $$5, dhg $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmz<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
