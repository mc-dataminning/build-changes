import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record efi<FC extends eia, F extends efw<FC>>(F d, FC e) {
   public static final Codec<efi<?, ?>> a = mb.O.q().dispatch($$0 -> $$0.d, efw::a);
   public static final Codec<jr<efi<?, ?>>> b = akq.a(mc.aL, a);
   public static final Codec<jv<efi<?, ?>>> c = kg.a(mc.aL, a);

   public boolean a(dhe $$0, dyr $$1, azg $$2, ji $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<efi<?, ?>> a() {
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
