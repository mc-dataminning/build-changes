import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dua extends due {
   private final ip<eim> e;
   public static final Codec<dua> a = RecordCodecBuilder.create($$0 -> a($$0).and(ja.a(kj.y).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dua::new));

   public dua(jg $$0, ip<eim> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dmz $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dtu<?> a() {
      return dtu.c;
   }
}
