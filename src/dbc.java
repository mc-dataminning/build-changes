import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbc(int c, boolean d) {
   public static final Codec<dbc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.l.optionalFieldOf("item_damage_per_attack", 1).forGetter(dbc::a),
               Codec.BOOL.optionalFieldOf("can_disable_blocking", false).forGetter(dbc::b)
            )
            .apply($$0, dbc::new)
   );
   public static final yt<wg, dbc> b = yt.a(yr.h, dbc::a, yr.b, dbc::b, dbc::new);

   public int a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
