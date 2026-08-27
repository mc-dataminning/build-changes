import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record duh<FC extends dwy, F extends duu<FC>>(F d, FC e) {
   public static final Codec<duh<?, ?>> a = kh.Q.q().dispatch($$0 -> $$0.d, duu::a);
   public static final Codec<il<duh<?, ?>>> b = aiy.a(ki.ax, a);
   public static final Codec<ip<duh<?, ?>>> c = iz.a(ki.ax, a);

   public boolean a(cwz $$0, dob $$1, awt $$2, ib $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<duh<?, ?>> a() {
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
