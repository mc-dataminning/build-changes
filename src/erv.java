import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erv extends esb {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epx.b.fieldOf("feature").forGetter($$0x -> $$0x.b), e()).apply($$0, erv::new)
   );
   private final je<epx> b;
   private final tz c;

   protected erv(je<epx> $$0, esd.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private tz b() {
      tz $$0 = new tz();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dyb.a.a.c());
      return $$0;
   }

   @Override
   public jz a(euw $$0, dst $$1) {
      return jz.i;
   }

   @Override
   public List<euv.a> a(euw $$0, iu $$1, dst $$2, azv $$3) {
      return List.of(euv.a.a(new euv.d($$1, dmc.pE.m().b(dqg.b, jc.a(ja.a, ja.d)), this.c)));
   }

   @Override
   public eql a(euw $$0, iu $$1, dst $$2) {
      jz $$3 = this.a($$0, $$2);
      return new eql($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(euw $$0, dju $$1, djr $$2, ebx $$3, iu $$4, iu $$5, dst $$6, eql $$7, azv $$8, euf $$9, boolean $$10) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public esc<?> a() {
      return esc.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}
