import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esu extends esj {
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akj.a(lr.bb).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lq.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esu::new)
   );
   private final akj<erb> b;
   private final long c;
   private final jj<dps<?>> d;

   private esu(List<euh> $$0, akj<erb> $$1, long $$2, jj<dps<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public esl<esu> b() {
      return esm.y;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kn.ae, new cxf(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(erc $$0) {
      super.a($$0);
      if ($$0.a().a(lr.bb, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static esj.a<?> a(dps<?> $$0, akj<erb> $$1) {
      return a($$2 -> new esu($$2, $$1, 0L, $$0.a()));
   }

   public static esj.a<?> a(dps<?> $$0, akj<erb> $$1, long $$2) {
      return a($$3 -> new esu($$3, $$1, $$2, $$0.a()));
   }
}
