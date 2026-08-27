import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwa extends dwg {
   public static final Codec<dwa> a = RecordCodecBuilder.create($$0 -> $$0.group(dud.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dwa::new));
   private final he<dud> b;
   private final qr c;

   protected dwa(he<dud> $$0, dwi.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qr b() {
      qr $$0 = new qr();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddl.a.a.c());
      return $$0;
   }

   @Override
   public hz a(dyt $$0, cyy $$1) {
      return hz.g;
   }

   @Override
   public List<dys.c> a(dyt $$0, gu $$1, cyy $$2, aru $$3) {
      List<dys.c> $$4 = Lists.newArrayList();
      $$4.add(new dys.c($$1, csn.pb.n().a(cwl.a, hc.a(ha.a, ha.d)), this.c));
      return $$4;
   }

   @Override
   public dur a(dyt $$0, gu $$1, cyy $$2) {
      hz $$3 = this.a($$0, $$2);
      return new dur($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dyt $$0, cqg $$1, cqe $$2, dgx $$3, gu $$4, gu $$5, cyy $$6, dur $$7, aru $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwh<?> a() {
      return dwh.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
