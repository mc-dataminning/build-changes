import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejk extends ejq {
   public static final MapCodec<ejk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejk::new)
   );
   private final ji<ehn> b;
   private final ur c;

   protected ejk(ji<ehn> $$0, ejs.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ur b() {
      ur $$0 = new ur();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dqg.a.a.c());
      return $$0;
   }

   @Override
   public kd a(emk $$0, dll $$1) {
      return kd.g;
   }

   @Override
   public List<emj.c> a(emk $$0, iz $$1, dll $$2, azg $$3) {
      List<emj.c> $$4 = Lists.newArrayList();
      $$4.add(new emj.c($$1, dfa.pb.o().a(dja.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public eib a(emk $$0, iz $$1, dll $$2) {
      kd $$3 = this.a($$0, $$2);
      return new eib($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emk $$0, dcs $$1, dcq $$2, dty $$3, iz $$4, iz $$5, dll $$6, eib $$7, azg $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejr<?> a() {
      return ejr.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
