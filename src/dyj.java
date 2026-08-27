import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dyj extends dwa {
   public static final Codec<dyj> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(a($$0), Codec.BOOL.fieldOf("is_beached").forGetter($$0x -> $$0x.e)).apply($$0, dyj::new)
   );
   public final boolean e;

   public dyj(dwa.c $$0, boolean $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      dlk.a $$1 = this.e ? dlk.a.a : dlk.a.c;
      return a($$0, $$1, $$1x -> this.a($$1x, $$0));
   }

   private void a(dws $$0, dwa.a $$1) {
      dal $$2 = dal.a($$1.f());
      ht $$3 = new ht($$1.h().d(), 90, $$1.h().e());
      dyi.a($$1.e(), $$3, $$2, $$0, $$1.f(), this.e);
   }

   @Override
   public dwj<?> e() {
      return dwj.m;
   }
}
