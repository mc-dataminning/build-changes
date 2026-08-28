import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fco extends fbw {
   public static final MapCodec<fco> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fep.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fco::new)
   );
   private final feo b;
   private final boolean c;

   private fco(List<fds> $$0, feo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fby<fco> b() {
      return fbz.e;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.a();
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fbw.a<?> a(feo $$0) {
      return a($$1 -> new fco($$1, $$0, false));
   }

   public static fbw.a<?> a(feo $$0, boolean $$1) {
      return a($$2 -> new fco($$2, $$0, $$1));
   }
}
