import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<bf<czu, cr.a>> c, dk.d d) implements ea<czv> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bf.a(cr.a.a).optionalFieldOf("explosions").forGetter(cs::b), dk.d.d.optionalFieldOf("flight_duration", dk.d.c).forGetter(cs::c))
            .apply($$0, cs::new)
   );

   @Override
   public ku<czv> a() {
      return kv.ah;
   }

   public boolean a(cxh $$0, czv $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bf<czu, cr.a>> b() {
      return this.c;
   }

   public dk.d c() {
      return this.d;
   }
}
