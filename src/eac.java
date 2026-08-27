import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eac extends dxm {
   public static final Codec<eac> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eac::new)
   );
   public final boolean e;

   public eac(dxm.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      dmw.a $$1 = this.e ? dmw.a.a : dmw.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dye $$0, dxm.a $$1) {
      dbr $$2 = dbr.a($$1.f());
      hx $$3 = new hx($$1.h().d(), 90, $$1.h().e());
      eab.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dxv<?> e() {
      return dxv.m;
   }
}
