import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class etp extends etv {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(err.b.fieldOf("feature").forGetter($$0x -> $$0x.c), f()).apply($$0, etp::new)
   );
   private static final alr b = alr.b("bottom");
   private final jg<err> c;
   private final ua d;

   protected etp(jg<err> $$0, etx.a $$1) {
      super($$1);
      this.c = $$0;
      this.d = this.b();
   }

   private ua b() {
      ua $$0 = new ua();
      $$0.a("name", alr.a, b);
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", dzs.a, qp.a);
      $$0.a("target", alr.a, dzs.b);
      $$0.a("joint", dzs.a.c, dzs.a.a);
      return $$0;
   }

   @Override
   public kb a(ewq $$0, dui $$1) {
      return kb.i;
   }

   @Override
   public List<ewp.a> a(ewq $$0, iw $$1, dui $$2, bai $$3) {
      return List.of(ewp.a.a(new ewp.d($$1, dnq.pH.m().b(drv.b, je.a(jc.a, jc.d)), this.d)));
   }

   @Override
   public esf a(ewq $$0, iw $$1, dui $$2) {
      kb $$3 = this.a($$0, $$2);
      return new esf($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ewq $$0, dli $$1, dlf $$2, edo $$3, iw $$4, iw $$5, dui $$6, esf $$7, bai $$8, evz $$9, boolean $$10) {
      return this.c.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public etw<?> a() {
      return etw.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.c + "]";
   }
}
