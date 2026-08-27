import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxb extends dxh {
   public static final Codec<dxb> a = RecordCodecBuilder.create($$0 -> $$0.group(dve.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dxb::new));
   private final ib<dve> b;
   private final rt c;

   protected dxb(ib<dve> $$0, dxj.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private rt b() {
      rt $$0 = new rt();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dew.a.a.c());
      return $$0;
   }

   @Override
   public iw a(dzu $$0, dal $$1) {
      return iw.g;
   }

   @Override
   public List<dzt.c> a(dzu $$0, ht $$1, dal $$2, ate $$3) {
      List<dzt.c> $$4 = Lists.newArrayList();
      $$4.add(new dzt.c($$1, cuc.pb.o().a(cya.b, hz.a(hx.a, hx.d)), this.c));
      return $$4;
   }

   @Override
   public dvs a(dzu $$0, ht $$1, dal $$2) {
      iw $$3 = this.a($$0, $$2);
      return new dvs($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dzu $$0, crt $$1, crr $$2, dhy $$3, ht $$4, ht $$5, dal $$6, dvs $$7, ate $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dxi<?> a() {
      return dxi.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
