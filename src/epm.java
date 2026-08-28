import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epm extends eps {
   public static final MapCodec<epm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eno.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, epm::new)
   );
   private final jq<eno> b;
   private final ux c;

   protected epm(jq<eno> $$0, epu.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ux b() {
      ux $$0 = new ux();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dwa.a.a.c());
      return $$0;
   }

   @Override
   public kl a(esn $$0, drc $$1) {
      return kl.h;
   }

   @Override
   public List<esm.a> a(esn $$0, jh $$1, drc $$2, bam $$3) {
      return List.of(esm.a.a(new esm.d($$1, dko.pw.m().b(doq.b, jo.a(jm.a, jm.d)), this.c)));
   }

   @Override
   public eoc a(esn $$0, jh $$1, drc $$2) {
      kl $$3 = this.a($$0, $$2);
      return new eoc($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(esn $$0, dig $$1, die $$2, dzr $$3, jh $$4, jh $$5, drc $$6, eoc $$7, bam $$8, erw $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ept<?> a() {
      return ept.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
