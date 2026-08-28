import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eme extends emk {
   public static final MapCodec<eme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekg.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, eme::new)
   );
   private final jn<ekg> b;
   private final uf c;

   protected eme(jn<ekg> $$0, emm.a $$1) {
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
      $$0.a("joint", dsu.a.a.c());
      return $$0;
   }

   @Override
   public ki a(epf $$0, dnx $$1) {
      return ki.g;
   }

   @Override
   public List<epe.c> a(epf $$0, je $$1, dnx $$2, azl $$3) {
      List<epe.c> $$4 = Lists.newArrayList();
      $$4.add(new epe.c($$1, dhl.pb.o().b(dll.b, jl.a(jj.a, jj.d)), this.c));
      return $$4;
   }

   @Override
   public eku a(epf $$0, je $$1, dnx $$2) {
      ki $$3 = this.a($$0, $$2);
      return new eku($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(epf $$0, dfd $$1, dfb $$2, dwl $$3, je $$4, je $$5, dnx $$6, eku $$7, azl $$8, eoo $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eml<?> a() {
      return eml.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
