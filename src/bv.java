import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bv(Optional<Boolean> d) implements br {
   public static final bv b = new bv(Optional.empty());
   public static final MapCodec<bv> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(arj.a(Codec.BOOL, "in_open_water").forGetter(bv::b)).apply($$0, bv::new));

   public static bv a(boolean $$0) {
      return new bv(Optional.of($$0));
   }

   @Override
   public br.a a() {
      return br.b.c;
   }

   @Override
   public boolean a(biw $$0, akt $$1, @Nullable ehh $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cco $$3 ? this.d.get() == $$3.q() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
