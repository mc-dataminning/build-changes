import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dxw extends dyc {
   public static final Codec<dxw> a = RecordCodecBuilder.create($$0 -> $$0.group(dvz.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dxw::new));
   private final ib<dvz> b;
   private final rz c;

   protected dxw(ib<dvz> $$0, dye.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private rz b() {
      rz $$0 = new rz();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dfr.a.a.c());
      return $$0;
   }

   @Override
   public iw a(eaw $$0, dbf $$1) {
      return iw.g;
   }

   @Override
   public List<eav.c> a(eaw $$0, ht $$1, dbf $$2, ato $$3) {
      List<eav.c> $$4 = Lists.newArrayList();
      $$4.add(new eav.c($$1, cuv.pb.o().a(cyu.b, hz.a(hx.a, hx.d)), this.c));
      return $$4;
   }

   @Override
   public dwn a(eaw $$0, ht $$1, dbf $$2) {
      iw $$3 = this.a($$0, $$2);
      return new dwn($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eaw $$0, csm $$1, csk $$2, dit $$3, ht $$4, ht $$5, dbf $$6, dwn $$7, ato $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dyd<?> a() {
      return dyd.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
