import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fcr extends fbu {
   static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fen.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fcr::new));
   private final fem b;

   private fcr(List<fdq> $$0, fem $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.a();
   }

   @Override
   public fbw<fcr> b() {
      return fbx.Q;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      int $$2 = azo.a(this.b.a($$1), 0, 4);
      $$0.b(kk.ad, new dcw($$2));
      return $$0;
   }

   public fem c() {
      return this.b;
   }

   public static fbu.a<?> a(fem $$0) {
      return a($$1 -> new fcr($$1, $$0));
   }
}
