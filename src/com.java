import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record com(agt c, ie<cmc> d, vb e, boolean f) {
   public static final Codec<com> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               agt.a.fieldOf("asset_id").forGetter(com::a),
               agq.a(kc.F).fieldOf("template_item").forGetter(com::b),
               vd.a.fieldOf("description").forGetter(com::c),
               Codec.BOOL.fieldOf("decal").orElse(false).forGetter(com::d)
            )
            .apply($$0, com::new)
   );
   public static final Codec<ie<com>> b = agp.a(kc.aI, a);

   public vb a(ie<cok> $$0) {
      return this.e.f().c($$0.a().e().a());
   }

   public agt a() {
      return this.c;
   }

   public ie<cmc> b() {
      return this.d;
   }

   public vb c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }
}
