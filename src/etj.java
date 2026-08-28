import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etj extends esy {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akp.a(lu.bc).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lt.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etj::new)
   );
   private final akp<erq> b;
   private final long c;
   private final jm<dqh<?>> d;

   private etj(List<euw> $$0, akp<erq> $$1, long $$2, jm<dqh<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eta<etj> b() {
      return etb.y;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kq.af, new cxt(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(err $$0) {
      super.a($$0);
      if ($$0.a().a(lu.bc, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static esy.a<?> a(dqh<?> $$0, akp<erq> $$1) {
      return a($$2 -> new etj($$2, $$1, 0L, $$0.a()));
   }

   public static esy.a<?> a(dqh<?> $$0, akp<erq> $$1, long $$2) {
      return a($$3 -> new etj($$3, $$1, $$2, $$0.a()));
   }
}
