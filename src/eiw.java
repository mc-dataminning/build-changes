import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eiw extends egg {
   public static final Codec<eiw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, eiw::new)
   );
   public final boolean e;

   public eiw(egg.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      dvq.a $$1 = this.e ? dvq.a.a : dvq.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(egy $$0, egg.a $$1) {
      dji $$2 = dji.a($$1.f());
      im $$3 = new im($$1.h().d(), 90, $$1.h().e());
      eiv.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public egp<?> e() {
      return egp.m;
   }
}
