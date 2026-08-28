import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezj extends eyy {
   public static final MapCodec<ezj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  alc.a(me.bn).fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  md.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezj::new)
   );
   private final alc<exq> b;
   private final long c;
   private final js<dvn<?>> d;

   private ezj(List<fau> $$0, alc<exq> $$1, long $$2, js<dvn<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public eza<ezj> b() {
      return ezb.y;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kx.ar, new dav(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(exr $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static eyy.a<?> a(dvn<?> $$0, alc<exq> $$1) {
      return a($$2 -> new ezj($$2, $$1, 0L, $$0.a()));
   }

   public static eyy.a<?> a(dvn<?> $$0, alc<exq> $$1, long $$2) {
      return a($$3 -> new ezj($$3, $$1, $$2, $$0.a()));
   }
}
