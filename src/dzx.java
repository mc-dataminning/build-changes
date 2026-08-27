import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzx extends dxh {
   public static final Codec<dzx> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dzx::new)
   );
   public final boolean e;

   public dzx(dxh.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      dmr.a $$1 = this.e ? dmr.a.a : dmr.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dxz $$0, dxh.a $$1) {
      dbm $$2 = dbm.a($$1.f());
      ht $$3 = new ht($$1.h().d(), 90, $$1.h().e());
      dzw.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dxq<?> e() {
      return dxq.m;
   }
}
