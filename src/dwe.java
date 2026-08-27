import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwe extends dwk {
   public static final Codec<dwe> a = RecordCodecBuilder.create($$0 -> $$0.group(duh.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dwe::new));
   private final hg<duh> b;
   private final qu c;

   protected dwe(hg<duh> $$0, dwm.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qu b() {
      qu $$0 = new qu();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddp.a.a.c());
      return $$0;
   }

   @Override
   public ib a(dyx $$0, czc $$1) {
      return ib.g;
   }

   @Override
   public List<dyw.c> a(dyx $$0, gw $$1, czc $$2, arx $$3) {
      List<dyw.c> $$4 = Lists.newArrayList();
      $$4.add(new dyw.c($$1, csr.pb.n().a(cwp.a, he.a(hc.a, hc.d)), this.c));
      return $$4;
   }

   @Override
   public duv a(dyx $$0, gw $$1, czc $$2) {
      ib $$3 = this.a($$0, $$2);
      return new duv($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dyx $$0, cqk $$1, cqi $$2, dhb $$3, gw $$4, gw $$5, czc $$6, duv $$7, arx $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwl<?> a() {
      return dwl.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
