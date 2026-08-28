import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcl(kk d, Optional<ecg> e, eik f, Optional<jp<eaa>> g) implements dcd {
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kk.f.optionalFieldOf("offset", kk.g).forGetter(dcl::b),
               ecg.b.optionalFieldOf("predicate").forGetter(dcl::c),
               eik.a.fieldOf("block_state").forGetter(dcl::d),
               eaa.aj.optionalFieldOf("trigger_game_event").forGetter(dcl::e)
            )
            .apply($$0, dcl::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      jg $$5 = jg.a((jz)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.ea(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public kk b() {
      return this.d;
   }

   public Optional<ecg> c() {
      return this.e;
   }

   public eik d() {
      return this.f;
   }

   public Optional<jp<eaa>> e() {
      return this.g;
   }
}
