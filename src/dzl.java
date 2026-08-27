import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dzl extends dwv {
   public static final Codec<dzl> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dzl::new)
   );
   public final boolean e;

   public dzl(dwv.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      dmf.a $$1 = this.e ? dmf.a.a : dmf.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dxn $$0, dwv.a $$1) {
      dbf $$2 = dbf.a($$1.f());
      ht $$3 = new ht($$1.h().d(), 90, $$1.h().e());
      dzk.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dxe<?> e() {
      return dxe.m;
   }
}
