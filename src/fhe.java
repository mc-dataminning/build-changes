import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class fhe implements fhd {
   public static final MapCodec<fhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("Score", 0).forGetter(fhe::a),
               Codec.BOOL.optionalFieldOf("Locked", false).forGetter(fhe::b),
               xi.a.optionalFieldOf("display").forGetter($$0x -> Optional.ofNullable($$0x.d)),
               yy.b.optionalFieldOf("format").forGetter($$0x -> Optional.ofNullable($$0x.e))
            )
            .apply($$0, fhe::new)
   );
   private int b;
   private boolean c = true;
   @Nullable
   private xg d;
   @Nullable
   private yw e;

   public fhe() {
   }

   private fhe(int $$0, boolean $$1, Optional<xg> $$2, Optional<yw> $$3) {
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
   public xg d() {
      return this.d;
   }

   public void a(@Nullable xg $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public yw c() {
      return this.e;
   }

   public void b(@Nullable yw $$0) {
      this.e = $$0;
   }
}
