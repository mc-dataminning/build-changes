import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record db(boolean d, boolean e) implements bs {
   public static final MapCodec<db> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("has_raid", false).forGetter(db::b), Codec.BOOL.optionalFieldOf("is_captain", false).forGetter(db::c))
            .apply($$0, db::new)
   );
   public static final db c = new db(false, true);

   @Override
   public MapCodec<db> a() {
      return bt.e;
   }

   @Override
   public boolean a(bru $$0, aqm $$1, @Nullable euk $$2) {
      return !($$0 instanceof cni $$3) ? false : $$3.gF() == this.d && $$3.gE() == this.e;
   }

   public boolean b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
