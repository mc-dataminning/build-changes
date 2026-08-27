import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eag extends eam {
   public static final Codec<eag> a = RecordCodecBuilder.create($$0 -> $$0.group(dyj.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eag::new));
   private final ih<dyj> b;
   private final sn c;

   protected eag(ih<dyj> $$0, eao.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sn b() {
      sn $$0 = new sn();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dhu.a.a.c());
      return $$0;
   }

   @Override
   public jb a(edg $$0, ddb $$1) {
      return jb.g;
   }

   @Override
   public List<edf.c> a(edg $$0, hx $$1, ddb $$2, auu $$3) {
      List<edf.c> $$4 = Lists.newArrayList();
      $$4.add(new edf.c($$1, cwr.pb.o().a(daq.b, ie.a(ic.a, ic.d)), this.c));
      return $$4;
   }

   @Override
   public dyx a(edg $$0, hx $$1, ddb $$2) {
      jb $$3 = this.a($$0, $$2);
      return new dyx($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(edg $$0, cuj $$1, cuh $$2, dld $$3, hx $$4, hx $$5, ddb $$6, dyx $$7, auu $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ean<?> a() {
      return ean.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
