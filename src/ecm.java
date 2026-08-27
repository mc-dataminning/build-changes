import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ecm extends ecs {
   public static final Codec<ecm> a = RecordCodecBuilder.create($$0 -> $$0.group(eap.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ecm::new));
   private final ij<eap> b;
   private final sw c;

   protected ecm(ij<eap> $$0, ecu.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sw b() {
      sw $$0 = new sw();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", djx.a.a.c());
      return $$0;
   }

   @Override
   public jd a(efm $$0, dfe $$1) {
      return jd.g;
   }

   @Override
   public List<efl.c> a(efm $$0, hz $$1, dfe $$2, awp $$3) {
      List<efl.c> $$4 = Lists.newArrayList();
      $$4.add(new efl.c($$1, cyu.pb.o().a(dct.b, ih.a(ie.a, ie.d)), this.c));
      return $$4;
   }

   @Override
   public ebd a(efm $$0, hz $$1, dfe $$2) {
      jd $$3 = this.a($$0, $$2);
      return new ebd($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(efm $$0, cwm $$1, cwk $$2, dng $$3, hz $$4, hz $$5, dfe $$6, ebd $$7, awp $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ect<?> a() {
      return ect.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
