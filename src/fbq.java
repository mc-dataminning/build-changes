import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbq extends fbw {
   public static final MapCodec<fbq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(faj.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fbq::new)
   );
   private final faj.b b;

   public fbq(List<fds> $$0, faj.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fby<fbq> b() {
      return fbz.B;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.a(dae.vx) && $$1.c(this.b.a()) instanceof crz $$2) {
         $$0.b(kl.ak, new dda($$2.gi()));
      }

      return $$0;
   }

   public static fbw.a<?> a(faj.b $$0) {
      return a($$1 -> new fbq($$1, $$0));
   }
}
