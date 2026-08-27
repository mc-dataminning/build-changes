import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eik extends eiq {
   public static final MapCodec<eik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eik::new)
   );
   private final ix<egn> b;
   private final ud c;

   protected eik(ix<egn> $$0, eis.a $$1) {
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
      $$0.a("joint", dpg.a.a.c());
      return $$0;
   }

   @Override
   public js a(elk $$0, dkl $$1) {
      return js.g;
   }

   @Override
   public List<elj.c> a(elk $$0, io $$1, dkl $$2, ayk $$3) {
      List<elj.c> $$4 = Lists.newArrayList();
      $$4.add(new elj.c($$1, dea.pb.n().a(dia.b, iv.a(it.a, it.d)), this.c));
      return $$4;
   }

   @Override
   public ehb a(elk $$0, io $$1, dkl $$2) {
      js $$3 = this.a($$0, $$2);
      return new ehb($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(elk $$0, dbs $$1, dbq $$2, dsy $$3, io $$4, io $$5, dkl $$6, ehb $$7, ayk $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eir<?> a() {
      return eir.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
