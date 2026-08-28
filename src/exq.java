import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exq extends exf {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aku.a(mc.bg).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mb.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exq::new)
   );
   private final aku<evx> b;
   private final long c;
   private final jr<duc<?>> d;

   private exq(List<ezb> $$0, aku<evx> $$1, long $$2, jr<duc<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exh<exq> b() {
      return exi.y;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kv.ap, new czq(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(evy $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static exf.a<?> a(duc<?> $$0, aku<evx> $$1) {
      return a($$2 -> new exq($$2, $$1, 0L, $$0.a()));
   }

   public static exf.a<?> a(duc<?> $$0, aku<evx> $$1, long $$2) {
      return a($$3 -> new exq($$3, $$1, $$2, $$0.a()));
   }
}
