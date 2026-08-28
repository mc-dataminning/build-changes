import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eym extends eyb {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  aly.a(mb.bg).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  ma.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eym::new)
   );
   private final aly<ewt> b;
   private final long c;
   private final jq<duy<?>> d;

   private eym(List<ezx> $$0, aly<ewt> $$1, long $$2, jq<duy<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eyd<eym> b() {
      return eye.y;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new dao(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(ewu $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static eyb.a<?> a(duy<?> $$0, aly<ewt> $$1) {
      return a($$2 -> new eym($$2, $$1, 0L, $$0.a()));
   }

   public static eyb.a<?> a(duy<?> $$0, aly<ewt> $$1, long $$2) {
      return a($$3 -> new eym($$3, $$1, $$2, $$0.a()));
   }
}
