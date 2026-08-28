import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exb(boolean b) implements exh {
   public static final MapCodec<exb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.BOOL.fieldOf("active").forGetter(exb::e)).apply($$0, exb::new));

   public boolean a(etw $$0) {
      return $$0.b(ews.l) == this.b;
   }

   @Override
   public exi b() {
      return exj.s;
   }

   @Override
   public Set<ewp<?>> a() {
      return Set.of(ews.l);
   }

   public static exh.a c() {
      return () -> new exb(true);
   }

   public static exh.a d() {
      return () -> new exb(false);
   }

   public boolean e() {
      return this.b;
   }
}
