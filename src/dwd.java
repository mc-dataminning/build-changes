import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dwd extends dwj {
   public static final Codec<dwd> a = RecordCodecBuilder.create($$0 -> $$0.group(dug.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dwd::new));
   private final he<dug> b;
   private final qw c;

   protected dwd(he<dug> $$0, dwl.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private qw b() {
      qw $$0 = new qw();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", ddy.a.a.c());
      return $$0;
   }

   @Override
   public hy a(dyw $$0, czn $$1) {
      return hy.g;
   }

   @Override
   public List<dyv.c> a(dyw $$0, gw $$1, czn $$2, ash $$3) {
      List<dyv.c> $$4 = Lists.newArrayList();
      $$4.add(new dyv.c($$1, cte.pb.o().a(cxc.b, hc.a(ha.a, ha.d)), this.c));
      return $$4;
   }

   @Override
   public duu a(dyw $$0, gw $$1, czn $$2) {
      hy $$3 = this.a($$0, $$2);
      return new duu($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(dyw $$0, cqv $$1, cqt $$2, dha $$3, gw $$4, gw $$5, czn $$6, duu $$7, ash $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dwk<?> a() {
      return dwk.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
