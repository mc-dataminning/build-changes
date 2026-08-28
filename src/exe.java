import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exe(exh b) implements exh {
   public static final MapCodec<exe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(exh.e.fieldOf("term").forGetter(exe::c)).apply($$0, exe::new));

   @Override
   public exi b() {
      return exj.a;
   }

   public boolean a(etw $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(euc $$0) {
      exh.super.a($$0);
      this.b.a($$0);
   }

   public static exh.a a(exh.a $$0) {
      exe $$1 = new exe($$0.build());
      return () -> $$1;
   }

   public exh c() {
      return this.b;
   }
}
