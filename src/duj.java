import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class duj extends dsa {
   public static final Codec<duj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, duj::new)
   );
   public final boolean e;

   public duj(dsa.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      dhk.a $$1 = this.e ? dhk.a.a : dhk.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dss $$0, dsa.a $$1) {
      cvz $$2 = cvz.a($$1.f());
      gu $$3 = new gu($$1.h().d(), 90, $$1.h().e());
      dui.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dsj<?> e() {
      return dsj.m;
   }
}
