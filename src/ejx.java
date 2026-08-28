import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ejx extends ekd {
   public static final MapCodec<ejx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eia.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ejx::new)
   );
   private final jj<eia> b;
   private final tx c;

   protected ejx(jj<eia> $$0, ekf.a $$1) {
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
      $$0.a("joint", dqq.a.a.c());
      return $$0;
   }

   @Override
   public ke a(emx $$0, dlu $$1) {
      return ke.g;
   }

   @Override
   public List<emw.c> a(emx $$0, ja $$1, dlu $$2, ayo $$3) {
      List<emw.c> $$4 = Lists.newArrayList();
      $$4.add(new emw.c($$1, dfj.pb.o().a(djj.b, jh.a(jf.a, jf.d)), this.c));
      return $$4;
   }

   @Override
   public eio a(emx $$0, ja $$1, dlu $$2) {
      ke $$3 = this.a($$0, $$2);
      return new eio($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(emx $$0, ddb $$1, dcz $$2, duh $$3, ja $$4, ja $$5, dlu $$6, eio $$7, ayo $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eke<?> a() {
      return eke.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
