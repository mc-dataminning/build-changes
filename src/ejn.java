import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejn extends ejt {
   public static final MapCodec<ejn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejn::new)
   );
   private final ji<ehq> b;
   private final us c;

   protected ejn(ji<ehq> $$0, ejv.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private us b() {
      us $$0 = new us();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dqj.a.a.c());
      return $$0;
   }

   @Override
   public kd a(emn $$0, dlo $$1) {
      return kd.g;
   }

   @Override
   public List<emm.c> a(emn $$0, iz $$1, dlo $$2, azh $$3) {
      List<emm.c> $$4 = Lists.newArrayList();
      $$4.add(new emm.c($$1, dfd.pb.o().a(djd.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public eie a(emn $$0, iz $$1, dlo $$2) {
      kd $$3 = this.a($$0, $$2);
      return new eie($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emn $$0, dcv $$1, dct $$2, dub $$3, iz $$4, iz $$5, dlo $$6, eie $$7, azh $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eju<?> a() {
      return eju.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
