import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejr extends ejx {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ehu.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejr::new)
   );
   private final jj<ehu> b;
   private final tx c;

   protected ejr(jj<ehu> $$0, ejz.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tx b() {
      tx $$0 = new tx();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dqn.a.a.c());
      return $$0;
   }

   @Override
   public ke a(emr $$0, dls $$1) {
      return ke.g;
   }

   @Override
   public List<emq.c> a(emr $$0, ja $$1, dls $$2, aym $$3) {
      List<emq.c> $$4 = Lists.newArrayList();
      $$4.add(new emq.c($$1, dfh.pb.o().a(djh.b, jh.a(jf.a, jf.d)), this.c));
      return $$4;
   }

   @Override
   public eii a(emr $$0, ja $$1, dls $$2) {
      ke $$3 = this.a($$0, $$2);
      return new eii($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emr $$0, dcz $$1, dcx $$2, due $$3, ja $$4, ja $$5, dls $$6, eii $$7, aym $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ejy<?> a() {
      return ejy.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
