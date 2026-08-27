import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aof(ur c, int d, Optional<ata<Integer>> e) {
   public static final Codec<aof> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ut.a.fieldOf("description").forGetter(aof::a),
               Codec.INT.fieldOf("pack_format").forGetter(aof::b),
               ata.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(aof::c)
            )
            .apply($$0, aof::new)
   );
   public static final aoe<aof> b = aoe.a("pack", a);

   public ur a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ata<Integer>> c() {
      return this.e;
   }
}
