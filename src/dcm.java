import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcm(cxx d, ki e, Optional<jn<dzl>> f) implements dcb {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cxx.b.fieldOf("properties").forGetter(dcm::b),
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dcm::c),
               dzl.aj.optionalFieldOf("trigger_game_event").forGetter(dcm::d)
            )
            .apply($$0, dcm::new)
   );

   public dcm(cxx $$0) {
      this($$0, ki.g, Optional.of(dzl.c));
   }

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      je $$5 = je.a((jx)$$4).a(this.e);
      duo $$6 = $$3.dS().a_($$5);
      duo $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dS().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public cxx b() {
      return this.d;
   }

   public ki c() {
      return this.e;
   }

   public Optional<jn<dzl>> d() {
      return this.f;
   }
}
