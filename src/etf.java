import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etf extends etl {
   public static final MapCodec<etf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erh.b.fieldOf("feature").forGetter($$0x -> $$0x.c), f()).apply($$0, etf::new)
   );
   private static final alk b = alk.b("bottom");
   private final jg<erh> c;
   private final ua d;

   protected etf(jg<erh> $$0, etn.a $$1) {
      super($$1);
      this.c = $$0;
      this.d = this.b();
   }

   private ua b() {
      ua $$0 = new ua();
      $$0.a("name", alk.a, b);
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", dzi.a, qp.a);
      $$0.a("target", alk.a, dzi.b);
      $$0.a("joint", dzi.a.c, dzi.a.a);
      return $$0;
   }

   @Override
   public kb a(ewg $$0, dty $$1) {
      return kb.i;
   }

   @Override
   public List<ewf.a> a(ewg $$0, iw $$1, dty $$2, azz $$3) {
      return List.of(ewf.a.a(new ewf.d($$1, dng.pH.m().b(drl.b, je.a(jc.a, jc.d)), this.d)));
   }

   @Override
   public erv a(ewg $$0, iw $$1, dty $$2) {
      kb $$3 = this.a($$0, $$2);
      return new erv($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ewg $$0, dky $$1, dkv $$2, ede $$3, iw $$4, iw $$5, dty $$6, erv $$7, azz $$8, evp $$9, boolean $$10) {
      return this.c.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public etm<?> a() {
      return etm.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.c + "]";
   }
}
