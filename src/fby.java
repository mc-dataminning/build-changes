import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fby extends fbg {
   public static final MapCodec<fby> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdz.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fby::new)
   );
   private final fdy b;
   private final boolean c;

   private fby(List<fdc> $$0, fdy $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbi<fby> b() {
      return fbj.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fbg.a<?> a(fdy $$0) {
      return a($$1 -> new fby($$1, $$0, false));
   }

   public static fbg.a<?> a(fdy $$0, boolean $$1) {
      return a($$2 -> new fby($$2, $$0, $$1));
   }
}
