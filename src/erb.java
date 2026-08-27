import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erb extends eqq {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akl.a(lf.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  le.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erb::new)
   );
   private final akl<epk> b;
   private final long c;
   private final ix<doi<?>> d;

   private erb(List<esl> $$0, akl<epk> $$1, long $$2, ix<doi<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eqs b() {
      return eqt.v;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kb.ad, new cwr(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(epl $$0) {
      super.a($$0);
      if ($$0.a().a(lf.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static eqq.a<?> a(doi<?> $$0, akl<epk> $$1) {
      return a($$2 -> new erb($$2, $$1, 0L, $$0.a()));
   }

   public static eqq.a<?> a(doi<?> $$0, akl<epk> $$1, long $$2) {
      return a($$3 -> new erb($$3, $$1, $$2, $$0.a()));
   }
}
