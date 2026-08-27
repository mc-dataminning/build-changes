import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehq extends ehw {
   public static final Codec<ehq> a = RecordCodecBuilder.create($$0 -> $$0.group(eft.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, ehq::new));
   private final iw<eft> b;
   private final ua c;

   protected ehq(iw<eft> $$0, ehy.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ua b() {
      ua $$0 = new ua();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dom.a.a.c());
      return $$0;
   }

   @Override
   public jr a(ekq $$0, djr $$1) {
      return jr.g;
   }

   @Override
   public List<ekp.c> a(ekq $$0, in $$1, djr $$2, ayg $$3) {
      List<ekp.c> $$4 = Lists.newArrayList();
      $$4.add(new ekp.c($$1, ddg.pb.n().a(dhg.b, iu.a(is.a, is.d)), this.c));
      return $$4;
   }

   @Override
   public egh a(ekq $$0, in $$1, djr $$2) {
      jr $$3 = this.a($$0, $$2);
      return new egh($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ekq $$0, day $$1, daw $$2, dse $$3, in $$4, in $$5, djr $$6, egh $$7, ayg $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public ehx<?> a() {
      return ehx.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
