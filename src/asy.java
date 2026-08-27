import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record asy(wx c, int d, Optional<axx<Integer>> e) {
   public static final Codec<asy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wz.a.fieldOf("description").forGetter(asy::a),
               Codec.INT.fieldOf("pack_format").forGetter(asy::b),
               axx.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(asy::c)
            )
            .apply($$0, asy::new)
   );
   public static final asx<asy> b = asx.a("pack", a);

   public wx a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<axx<Integer>> c() {
      return this.e;
   }
}
