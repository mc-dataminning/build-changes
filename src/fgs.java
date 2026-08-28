import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgs implements fgr {
   public static final MapCodec<fgs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("Score", 0).forGetter(fgs::a),
               Codec.BOOL.optionalFieldOf("Locked", false).forGetter(fgs::b),
               xc.a.optionalFieldOf("display").forGetter($$0x -> Optional.ofNullable($$0x.d)),
               ys.b.optionalFieldOf("format").forGetter($$0x -> Optional.ofNullable($$0x.e))
            )
            .apply($$0, fgs::new)
   );
   private int b;
   private boolean c = true;
   @Nullable
   private xa d;
   @Nullable
   private yq e;

   public fgs() {
   }

   private fgs(int $$0, boolean $$1, Optional<xa> $$2, Optional<yq> $$3) {
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
   public xa d() {
      return this.d;
   }

   public void a(@Nullable xa $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public yq c() {
      return this.e;
   }

   public void b(@Nullable yq $$0) {
      this.e = $$0;
   }
}
