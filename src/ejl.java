import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejl extends ejr {
   public static final MapCodec<ejl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eho.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejl::new)
   );
   private final ji<eho> b;
   private final us c;

   protected ejl(ji<eho> $$0, ejt.a $$1) {
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
      $$0.a("joint", dqh.a.a.c());
      return $$0;
   }

   @Override
   public kd a(eml $$0, dlm $$1) {
      return kd.g;
   }

   @Override
   public List<emk.c> a(eml $$0, iz $$1, dlm $$2, azh $$3) {
      List<emk.c> $$4 = Lists.newArrayList();
      $$4.add(new emk.c($$1, dfb.pb.o().a(djb.b, jg.a(je.a, je.d)), this.c));
      return $$4;
   }

   @Override
   public eic a(eml $$0, iz $$1, dlm $$2) {
      kd $$3 = this.a($$0, $$2);
      return new eic($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eml $$0, dct $$1, dcr $$2, dtz $$3, iz $$4, iz $$5, dlm $$6, eic $$7, azh $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejs<?> a() {
      return ejs.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
