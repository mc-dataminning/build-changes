import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class egr extends egx {
   public static final Codec<egr> a = RecordCodecBuilder.create($$0 -> $$0.group(eeu.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, egr::new));
   private final in<eeu> b;
   private final to c;

   protected egr(in<eeu> $$0, egz.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private to b() {
      to $$0 = new to();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dno.a.a.c());
      return $$0;
   }

   @Override
   public ji a(ejr $$0, dit $$1) {
      return ji.g;
   }

   @Override
   public List<ejq.c> a(ejr $$0, id $$1, dit $$2, axt $$3) {
      List<ejq.c> $$4 = Lists.newArrayList();
      $$4.add(new ejq.c($$1, dcj.pb.n().a(dgi.b, il.a(ij.a, ij.d)), this.c));
      return $$4;
   }

   @Override
   public efi a(ejr $$0, id $$1, dit $$2) {
      ji $$3 = this.a($$0, $$2);
      return new efi($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ejr $$0, dab $$1, czz $$2, drf $$3, id $$4, id $$5, dit $$6, efi $$7, axt $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public egy<?> a() {
      return egy.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
