import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfb extends cyt {
   public static final MapCodec<dfb> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dmt.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dfb::new)
   );
   public static final dmv f = dmu.w;

   @Override
   public MapCodec<dfb> a() {
      return e;
   }

   protected dfb(dmt $$0, dmd.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dme $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dme a(dme $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cwe $$0, ib $$1) {
      Class<? extends bof> $$2 = switch (this.d.f()) {
         case a -> bof.class;
         case b -> box.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f);
   }
}
