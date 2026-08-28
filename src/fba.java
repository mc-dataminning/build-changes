import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fba extends fbg {
   public static final MapCodec<fba> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ezt.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fba::new)
   );
   private final ezt.b b;

   public fba(List<fdc> $$0, ezt.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbi<fba> b() {
      return fbj.B;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.a(czr.vx) && $$1.c(this.b.a()) instanceof crm $$2) {
         $$0.b(kk.ak, new dcn($$2.gh()));
      }

      return $$0;
   }

   public static fbg.a<?> a(ezt.b $$0) {
      return a($$1 -> new fba($$1, $$0));
   }
}
