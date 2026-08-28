import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fbt(fbw b) implements fbw {
   public static final MapCodec<fbt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fbw.e.fieldOf("term").forGetter(fbt::c)).apply($$0, fbt::new));

   @Override
   public fbx b() {
      return fby.a;
   }

   public boolean a(eyn $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eyt $$0) {
      fbw.super.a($$0);
      this.b.a($$0);
   }

   public static fbw.a a(fbw.a $$0) {
      fbt $$1 = new fbt($$0.build());
      return () -> $$1;
   }

   public fbw c() {
      return this.b;
   }
}
