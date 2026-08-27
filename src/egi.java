import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egi extends ego {
   public static final Codec<egi> a = RecordCodecBuilder.create($$0 -> $$0.group(eel.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, egi::new));
   private final il<eel> b;
   private final tm c;

   protected egi(il<eel> $$0, egq.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tm b() {
      tm $$0 = new tm();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dnf.a.a.c());
      return $$0;
   }

   @Override
   public jg a(eji $$0, dik $$1) {
      return jg.g;
   }

   @Override
   public List<ejh.c> a(eji $$0, ib $$1, dik $$2, axr $$3) {
      List<ejh.c> $$4 = Lists.newArrayList();
      $$4.add(new ejh.c($$1, dca.pb.n().a(dfz.b, ij.a(ih.a, ih.d)), this.c));
      return $$4;
   }

   @Override
   public eez a(eji $$0, ib $$1, dik $$2) {
      jg $$3 = this.a($$0, $$2);
      return new eez($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eji $$0, czs $$1, czq $$2, dqw $$3, ib $$4, ib $$5, dik $$6, eez $$7, axr $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public egp<?> a() {
      return egp.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
