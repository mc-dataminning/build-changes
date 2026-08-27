import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eap extends eav {
   public static final Codec<eap> a = RecordCodecBuilder.create($$0 -> $$0.group(dys.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eap::new));
   private final ih<dys> b;
   private final so c;

   protected eap(ih<dys> $$0, eax.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private so b() {
      so $$0 = new so();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", did.a.a.c());
      return $$0;
   }

   @Override
   public jb a(edp $$0, ddk $$1) {
      return jb.g;
   }

   @Override
   public List<edo.c> a(edp $$0, hx $$1, ddk $$2, auw $$3) {
      List<edo.c> $$4 = Lists.newArrayList();
      $$4.add(new edo.c($$1, cxa.pb.o().a(daz.b, ie.a(ic.a, ic.d)), this.c));
      return $$4;
   }

   @Override
   public dzg a(edp $$0, hx $$1, ddk $$2) {
      jb $$3 = this.a($$0, $$2);
      return new dzg($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(edp $$0, cus $$1, cuq $$2, dlm $$3, hx $$4, hx $$5, ddk $$6, dzg $$7, auw $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eaw<?> a() {
      return eaw.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
