import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fch extends fbw {
   public static final MapCodec<fch> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  fao.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  Codec.LONG.optionalFieldOf("seed", 0L).forGetter($$0x -> $$0x.c),
                  mh.j.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fch::new)
   );
   private final alj<fao> b;
   private final long c;
   private final jg<dyg<?>> d;

   private fch(List<fds> $$0, alj<fao> $$1, long $$2, jg<dyg<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public fby<fch> b() {
      return fbz.y;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         $$0.b(kl.at, new ddb(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.b.a() + ", but references are not allowed");
      } else {
         if ($$0.a().c(this.b).isEmpty()) {
            $$0.b("Missing loot table used for container: " + this.b.a());
         }
      }
   }

   public static fbw.a<?> a(dyg<?> $$0, alj<fao> $$1) {
      return a($$2 -> new fch($$2, $$1, 0L, $$0.a()));
   }

   public static fbw.a<?> a(dyg<?> $$0, alj<fao> $$1, long $$2) {
      return a($$3 -> new fch($$3, $$1, $$2, $$0.a()));
   }
}
