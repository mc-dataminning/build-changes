import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyn extends dyt {
   public static final Codec<dyn> a = RecordCodecBuilder.create($$0 -> $$0.group(dwq.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dyn::new));
   private final ig<dwq> b;
   private final sd c;

   protected dyn(ig<dwq> $$0, dyv.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sd b() {
      sd $$0 = new sd();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dgi.a.a.c());
      return $$0;
   }

   @Override
   public ja a(ebn $$0, dbr $$1) {
      return ja.g;
   }

   @Override
   public List<ebm.c> a(ebn $$0, hx $$1, dbr $$2, atw $$3) {
      List<ebm.c> $$4 = Lists.newArrayList();
      $$4.add(new ebm.c($$1, cvh.pb.o().a(czg.b, id.a(ib.a, ib.d)), this.c));
      return $$4;
   }

   @Override
   public dxe a(ebn $$0, hx $$1, dbr $$2) {
      ja $$3 = this.a($$0, $$2);
      return new dxe($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ebn $$0, csz $$1, csx $$2, djk $$3, hx $$4, hx $$5, dbr $$6, dxe $$7, atw $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dyu<?> a() {
      return dyu.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
