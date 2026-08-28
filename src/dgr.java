import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgr(je<dff> c, btd d) implements dgn {
   public static final MapCodec<dgr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dff.c.fieldOf("enchantment").forGetter(dgr::b), btd.c.fieldOf("level").forGetter(dgr::c)).apply($$0, dgr::new)
   );

   @Override
   public void a(cys $$0, dfl.a $$1, azt $$2, btw $$3) {
      $$1.b(this.c, azk.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dgr> a() {
      return b;
   }

   public je<dff> b() {
      return this.c;
   }

   public btd c() {
      return this.d;
   }
}
