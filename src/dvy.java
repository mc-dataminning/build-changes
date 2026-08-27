import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dvy extends dwe {
   public static final Codec<dvy> a = RecordCodecBuilder.create($$0 -> $$0.group(dub.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dvy::new));
   private final hf<dub> b;
   private final qs c;

   protected dvy(hf<dub> $$0, dwg.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qs b() {
      qs $$0 = new qs();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddj.a.a.c());
      return $$0;
   }

   @Override
   public ia a(dyr $$0, cyw $$1) {
      return ia.g;
   }

   @Override
   public List<dyq.c> a(dyr $$0, gv $$1, cyw $$2, art $$3) {
      List<dyq.c> $$4 = Lists.newArrayList();
      $$4.add(new dyq.c($$1, csl.pb.n().a(cwj.a, hd.a(hb.a, hb.d)), this.c));
      return $$4;
   }

   @Override
   public dup a(dyr $$0, gv $$1, cyw $$2) {
      ia $$3 = this.a($$0, $$2);
      return new dup($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dyr $$0, cqe $$1, cqc $$2, dgv $$3, gv $$4, gv $$5, cyw $$6, dup $$7, art $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwf<?> a() {
      return dwf.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
