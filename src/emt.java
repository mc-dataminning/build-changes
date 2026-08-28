import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emt extends emz {
   public static final MapCodec<emt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekv.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, emt::new)
   );
   private final jp<ekv> b;
   private final uj c;

   protected emt(jp<ekv> $$0, enb.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private uj b() {
      uj $$0 = new uj();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dti.a.a.c());
      return $$0;
   }

   @Override
   public kk a(epu $$0, dol $$1) {
      return kk.g;
   }

   @Override
   public List<ept.c> a(epu $$0, jg $$1, dol $$2, azr $$3) {
      List<ept.c> $$4 = Lists.newArrayList();
      $$4.add(new ept.c($$1, dia.pb.m().b(dlz.b, jn.a(jl.a, jl.d)), this.c));
      return $$4;
   }

   @Override
   public elj a(epu $$0, jg $$1, dol $$2) {
      kk $$3 = this.a($$0, $$2);
      return new elj($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(epu $$0, dfs $$1, dfq $$2, dxa $$3, jg $$4, jg $$5, dol $$6, elj $$7, azr $$8, epd $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ena<?> a() {
      return ena.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
