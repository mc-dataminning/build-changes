import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eim extends eis {
   public static final MapCodec<eim> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egp.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eim::new)
   );
   private final ix<egp> b;
   private final ud c;

   protected eim(ix<egp> $$0, eiu.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ud b() {
      ud $$0 = new ud();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dpi.a.a.c());
      return $$0;
   }

   @Override
   public js a(elm $$0, dkn $$1) {
      return js.g;
   }

   @Override
   public List<ell.c> a(elm $$0, io $$1, dkn $$2, aym $$3) {
      List<ell.c> $$4 = Lists.newArrayList();
      $$4.add(new ell.c($$1, dec.pb.n().a(dic.b, iv.a(it.a, it.d)), this.c));
      return $$4;
   }

   @Override
   public ehd a(elm $$0, io $$1, dkn $$2) {
      js $$3 = this.a($$0, $$2);
      return new ehd($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(elm $$0, dbu $$1, dbs $$2, dta $$3, io $$4, io $$5, dkn $$6, ehd $$7, aym $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eit<?> a() {
      return eit.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
