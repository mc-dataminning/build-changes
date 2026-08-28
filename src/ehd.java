import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ehd<FC extends ejv, F extends ehr<FC>>(F d, FC e) {
   public static final Codec<ehd<?, ?>> a = md.O.q().dispatch($$0 -> $$0.d, ehr::a);
   public static final Codec<js<ehd<?, ?>>> b = akz.a(me.aP, a);
   public static final Codec<jw<ehd<?, ?>>> c = kh.a(me.aP, a);

   public boolean a(dio $$0, eak $$1, azs $$2, jj $$3) {
      return this.d.a(this.e, $$0, $$1, $$2, $$3);
   }

   public Stream<ehd<?, ?>> a() {
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
