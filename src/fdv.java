import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdv(fem b) implements fdq {
   public static final MapCodec<fdv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fen.a.fieldOf("chance").forGetter(fdv::c)).apply($$0, fdv::new));

   @Override
   public fdr b() {
      return fds.d;
   }

   public boolean a(fah $$0) {
      float $$1 = this.b.b($$0);
      return $$0.b().i() < $$1;
   }

   public static fdq.a a(float $$0) {
      return () -> new fdv(fej.a($$0));
   }

   public static fdq.a a(fem $$0) {
      return () -> new fdv($$0);
   }

   public fem c() {
      return this.b;
   }
}
