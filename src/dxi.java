import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record dxi<FC extends dzz, F extends dxv<FC>>(F d, FC e) {
   public static final Codec<dxi<?, ?>> a = kr.Q.q().dispatch($$0 -> $$0.d, dxv::a);
   public static final Codec<il<dxi<?, ?>>> b = ajp.a(ks.ay, a);
   public static final Codec<ip<dxi<?, ?>>> c = ja.a(ks.ay, a);

   public boolean a(czs $$0, dqw $$1, axr $$2, ib $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<dxi<?, ?>> a() {
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
