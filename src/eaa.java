import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eaa extends eag {
   public static final Codec<eaa> a = RecordCodecBuilder.create($$0 -> $$0.group(dyd.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eaa::new));
   private final ih<dyd> b;
   private final sl c;

   protected eaa(ih<dyd> $$0, eai.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sl b() {
      sl $$0 = new sl();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dho.a.a.c());
      return $$0;
   }

   @Override
   public jb a(eda $$0, dcv $$1) {
      return jb.g;
   }

   @Override
   public List<ecz.c> a(eda $$0, hx $$1, dcv $$2, aup $$3) {
      List<ecz.c> $$4 = Lists.newArrayList();
      $$4.add(new ecz.c($$1, cwl.pb.o().a(dak.b, ie.a(ic.a, ic.d)), this.c));
      return $$4;
   }

   @Override
   public dyr a(eda $$0, hx $$1, dcv $$2) {
      jb $$3 = this.a($$0, $$2);
      return new dyr($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eda $$0, cud $$1, cub $$2, dkx $$3, hx $$4, hx $$5, dcv $$6, dyr $$7, aup $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eah<?> a() {
      return eah.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
