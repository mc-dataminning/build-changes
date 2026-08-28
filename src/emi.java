import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class emi extends emo {
   public static final MapCodec<emi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, emi::new)
   );
   private final jo<ekk> b;
   private final ug c;

   protected emi(jo<ekk> $$0, emq.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ug b() {
      ug $$0 = new ug();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dsx.a.a.c());
      return $$0;
   }

   @Override
   public kj a(epj $$0, doa $$1) {
      return kj.g;
   }

   @Override
   public List<epi.c> a(epj $$0, jf $$1, doa $$2, azn $$3) {
      List<epi.c> $$4 = Lists.newArrayList();
      $$4.add(new epi.c($$1, dho.pb.n().b(dlo.b, jm.a(jk.a, jk.d)), this.c));
      return $$4;
   }

   @Override
   public eky a(epj $$0, jf $$1, doa $$2) {
      kj $$3 = this.a($$0, $$2);
      return new eky($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(epj $$0, dfg $$1, dfe $$2, dwp $$3, jf $$4, jf $$5, doa $$6, eky $$7, azn $$8, eos $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public emp<?> a() {
      return emp.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
