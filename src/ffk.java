import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ffk implements ffj {
   public static final MapCodec<ffk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("Score", 0).forGetter(ffk::a),
               Codec.BOOL.optionalFieldOf("Locked", false).forGetter(ffk::b),
               xa.a.optionalFieldOf("display").forGetter($$0x -> Optional.ofNullable($$0x.d)),
               yq.b.optionalFieldOf("format").forGetter($$0x -> Optional.ofNullable($$0x.e))
            )
            .apply($$0, ffk::new)
   );
   private int b;
   private boolean c = true;
   @Nullable
   private wy d;
   @Nullable
   private yo e;

   public ffk() {
   }

   private ffk(int $$0, boolean $$1, Optional<wy> $$2, Optional<yo> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
      this.e = $$3.orElse(null);
   }

   @Override
   public int a() {
      return this.b;
   }

   public void a(int $$0) {
      this.b = $$0;
   }

   @Override
   public boolean b() {
      return this.c;
   }

   public void a(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   public wy d() {
      return this.d;
   }

   public void a(@Nullable wy $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public yo c() {
      return this.e;
   }

   public void b(@Nullable yo $$0) {
      this.e = $$0;
   }
}
