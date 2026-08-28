import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record du(boolean d, boolean e) implements by {
   public static final MapCodec<du> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(du::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(du::c))
            .apply($$0, du::new)
   );
   public static final du c = new du(false, true);

   @Override
   public MapCodec<du> a() {
      return bz.e;
   }

   @Override
   public boolean a(buk $$0, arc $$1, @Nullable fba $$2) {
      return !($$0 instanceof cql $$3) ? false : $$3.gE() == this.d && $$3.gD() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
