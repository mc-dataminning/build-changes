import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record efl<FC extends eid, F extends efz<FC>>(F d, FC e) {
   public static final Codec<efl<?, ?>> a = mb.O.q().dispatch($$0 -> $$0.d, efz::a);
   public static final Codec<jr<efl<?, ?>>> b = akr.a(mc.aL, a);
   public static final Codec<jv<efl<?, ?>>> c = kg.a(mc.aL, a);

   public boolean a(dhh $$0, dyu $$1, azh $$2, ji $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<efl<?, ?>> a() {
      return Stream.concat(Stream.of(this), this.e.e());
   }

   @Override
   public String toString() {
      return "Configured: " + this.d + ": " + this.e;
   }

   public F b() {
      return this.d;
   }

   public FC c() {
      return this.e;
   }
}
