import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dzp extends dzv {
   public static final Codec<dzp> a = RecordCodecBuilder.create($$0 -> $$0.group(dxs.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dzp::new));
   private final ie<dxs> b;
   private final sj c;

   protected dzp(ie<dxs> $$0, dzx.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sj b() {
      sj $$0 = new sj();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dhd.a.a.c());
      return $$0;
   }

   @Override
   public iz a(ecp $$0, dcl $$1) {
      return iz.g;
   }

   @Override
   public List<eco.c> a(ecp $$0, hv $$1, dcl $$2, auf $$3) {
      List<eco.c> $$4 = Lists.newArrayList();
      $$4.add(new eco.c($$1, cwb.pb.o().a(daa.b, ic.a(ia.a, ia.d)), this.c));
      return $$4;
   }

   @Override
   public dyg a(ecp $$0, hv $$1, dcl $$2) {
      iz $$3 = this.a($$0, $$2);
      return new dyg($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ecp $$0, ctt $$1, ctr $$2, dkm $$3, hv $$4, hv $$5, dcl $$6, dyg $$7, auf $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dzw<?> a() {
      return dzw.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
