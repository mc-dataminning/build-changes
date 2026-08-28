import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exp extends exe {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akt.a(mc.bg).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mb.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exp::new)
   );
   private final akt<evw> b;
   private final long c;
   private final jr<dub<?>> d;

   private exp(List<eza> $$0, akt<evw> $$1, long $$2, jr<dub<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public exg<exp> b() {
      return exh.y;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kv.ap, new czp(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(evx $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static exe.a<?> a(dub<?> $$0, akt<evw> $$1) {
      return a($$2 -> new exp($$2, $$1, 0L, $$0.a()));
   }

   public static exe.a<?> a(dub<?> $$0, akt<evw> $$1, long $$2) {
      return a($$3 -> new exp($$3, $$1, $$2, $$0.a()));
   }
}
