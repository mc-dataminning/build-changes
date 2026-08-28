import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewl extends ewa {
   public static final MapCodec<ewl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ali.a(ma.bd).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  lz.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewl::new)
   );
   private final ali<eus> b;
   private final long c;
   private final jq<dta<?>> d;

   private ewl(List<exy> $$0, ali<eus> $$1, long $$2, jq<dta<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public ewc<ewl> b() {
      return ewd.y;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(ku.ap, new czm(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eut $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static ewa.a<?> a(dta<?> $$0, ali<eus> $$1) {
      return a($$2 -> new ewl($$2, $$1, 0L, $$0.a()));
   }

   public static ewa.a<?> a(dta<?> $$0, ali<eus> $$1, long $$2) {
      return a($$3 -> new ewl($$3, $$1, $$2, $$0.a()));
   }
}
