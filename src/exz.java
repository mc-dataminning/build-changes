import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exz(String b) implements eyb {
   public static final MapCodec<exz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(exz::c)).apply($$0, exz::new));

   public static eyb a(String $$0) {
      return new exz($$0);
   }

   @Override
   public eya a() {
      return eyc.b;
   }

   @Override
   public faa a(etl $$0) {
      return faa.c(this.b);
   }

   @Override
   public Set<ewe<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
