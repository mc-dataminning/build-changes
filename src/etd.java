import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etd extends etj {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erf.b.fieldOf("feature").forGetter($$0x -> $$0x.c), f()).apply($$0, etd::new)
   );
   private static final ali b = ali.b("bottom");
   private final jf<erf> c;
   private final tz d;

   protected etd(jf<erf> $$0, etl.a $$1) {
      super($$1);
      this.c = $$0;
      this.d = this.b();
   }

   private tz b() {
      tz $$0 = new tz();
      $$0.a("name", ali.a, b);
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", dzg.a, qo.a);
      $$0.a("target", ali.a, dzg.b);
      $$0.a("joint", dzg.a.c, dzg.a.a);
      return $$0;
   }

   @Override
   public ka a(ewe $$0, dtw $$1) {
      return ka.i;
   }

   @Override
   public List<ewd.a> a(ewe $$0, iv $$1, dtw $$2, azx $$3) {
      return List.of(ewd.a.a(new ewd.d($$1, dne.pH.m().b(drj.b, jd.a(jb.a, jb.d)), this.d)));
   }

   @Override
   public ert a(ewe $$0, iv $$1, dtw $$2) {
      ka $$3 = this.a($$0, $$2);
      return new ert($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ewe $$0, dkw $$1, dkt $$2, edc $$3, iv $$4, iv $$5, dtw $$6, ert $$7, azx $$8, evn $$9, boolean $$10) {
      return this.c.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public etk<?> a() {
      return etk.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.c + "]";
   }
}
