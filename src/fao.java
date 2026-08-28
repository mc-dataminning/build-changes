import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fao extends fau {
   public static final MapCodec<fao> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ezh.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, fao::new)
   );
   private final ezh.b b;

   public fao(List<fcq> $$0, ezh.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fao> b() {
      return fax.B;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      if ($$0.a(czh.vx) && $$1.c(this.b.a()) instanceof crc $$2) {
         $$0.b(kj.ak, new dcd($$2.gi()));
      }

      return $$0;
   }

   public static fau.a<?> a(ezh.b $$0) {
      return a($$1 -> new fao($$1, $$0));
   }
}
