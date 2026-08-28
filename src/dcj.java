import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcj(dcd d, dcd e, jq<bta> f) implements dcn {
   public static final MapCodec<dcj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcd.b.fieldOf("min_damage").forGetter(dcj::b), dcd.b.fieldOf("max_damage").forGetter(dcj::c), bta.b.fieldOf("damage_type").forGetter(dcj::d)
            )
            .apply($$0, dcj::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      float $$5 = azn.b($$3.eb(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsy(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dcj> a() {
      return a;
   }

   public dcd b() {
      return this.d;
   }

   public dcd c() {
      return this.e;
   }

   public jq<bta> d() {
      return this.f;
   }
}
