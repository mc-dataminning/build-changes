import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etp extends ete {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akq.a(lu.bc).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lt.j.s().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etp::new)
   );
   private final akq<erw> b;
   private final long c;
   private final jm<dqj<?>> d;

   private etp(List<evc> $$0, akq<erw> $$1, long $$2, jm<dqj<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public etg<etp> b() {
      return eth.y;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      if ($$0.e()) {
         return $$0;
      } else {
         $$0.b(kq.af, new cxv(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(erx $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().a(lu.bc, this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static ete.a<?> a(dqj<?> $$0, akq<erw> $$1) {
      return a($$2 -> new etp($$2, $$1, 0L, $$0.a()));
   }

   public static ete.a<?> a(dqj<?> $$0, akq<erw> $$1, long $$2) {
      return a($$3 -> new etp($$3, $$1, $$2, $$0.a()));
   }
}
