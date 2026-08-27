import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class emj extends ejt {
   public static final Codec<emj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, emj::new)
   );
   public final boolean e;

   public emj(ejt.d $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dyu.a $$1 = this.e ? dyu.a.a : dyu.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(ekl $$0, ejt.b $$1) {
      dmd $$2 = dmd.a($$1.f());
      ir $$3 = new ir($$1.h().d(), 90, $$1.h().e());
      emi.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public ekc<?> f() {
      return ekc.m;
   }
}
