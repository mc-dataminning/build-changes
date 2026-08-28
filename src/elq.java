import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class elq extends elw {
   public static final MapCodec<elq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejs.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, elq::new)
   );
   private final jn<ejs> b;
   private final uf c;

   protected elq(jn<ejs> $$0, ely.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private uf b() {
      uf $$0 = new uf();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dsg.a.a.c());
      return $$0;
   }

   @Override
   public ki a(eor $$0, dnj $$1) {
      return ki.g;
   }

   @Override
   public List<eoq.c> a(eor $$0, je $$1, dnj $$2, azk $$3) {
      List<eoq.c> $$4 = Lists.newArrayList();
      $$4.add(new eoq.c($$1, dgx.pb.o().b(dkx.b, jl.a(jj.a, jj.d)), this.c));
      return $$4;
   }

   @Override
   public ekg a(eor $$0, je $$1, dnj $$2) {
      ki $$3 = this.a($$0, $$2);
      return new ekg($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(eor $$0, dep $$1, den $$2, dvx $$3, je $$4, je $$5, dnj $$6, ekg $$7, azk $$8, eoa $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public elx<?> a() {
      return elx.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
