import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class end extends enj {
   public static final MapCodec<end> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elf.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, end::new)
   );
   private final jq<elf> b;
   private final un c;

   protected end(jq<elf> $$0, enl.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private un b() {
      un $$0 = new un();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dtt.a.a.c());
      return $$0;
   }

   @Override
   public kl a(eqe $$0, dow $$1) {
      return kl.g;
   }

   @Override
   public List<eqd.c> a(eqe $$0, jh $$1, dow $$2, azv $$3) {
      List<eqd.c> $$4 = Lists.newArrayList();
      $$4.add(new eqd.c($$1, dil.pb.m().b(dmk.b, jo.a(jm.a, jm.d)), this.c));
      return $$4;
   }

   @Override
   public elt a(eqe $$0, jh $$1, dow $$2) {
      kl $$3 = this.a($$0, $$2);
      return new elt($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eqe $$0, dgd $$1, dgb $$2, dxk $$3, jh $$4, jh $$5, dow $$6, elt $$7, azv $$8, epn $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public enk<?> a() {
      return enk.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
