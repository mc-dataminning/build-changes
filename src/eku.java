import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eku extends ela {
   public static final Codec<eku> a = RecordCodecBuilder.create($$0 -> $$0.group(eix.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eku::new));
   private final ja<eix> b;
   private final uk c;

   protected eku(ja<eix> $$0, elc.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private uk b() {
      uk $$0 = new uk();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dre.a.a.c());
      return $$0;
   }

   @Override
   public jv a(enu $$0, dmd $$1) {
      return jv.g;
   }

   @Override
   public List<ent.c> a(enu $$0, ir $$1, dmd $$2, ayt $$3) {
      List<ent.c> $$4 = Lists.newArrayList();
      $$4.add(new ent.c($$1, dfe.qm.n().a(dji.b, iy.a(iw.a, iw.d)), this.c));
      return $$4;
   }

   @Override
   public ejl a(enu $$0, ir $$1, dmd $$2) {
      jv $$3 = this.a($$0, $$2);
      return new ejl($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(enu $$0, dcv $$1, dct $$2, duz $$3, ir $$4, ir $$5, dmd $$6, ejl $$7, ayt $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public elb<?> a() {
      return elb.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
