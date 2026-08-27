import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfs extends czo implements czi {
   public static final MapCodec<dfs> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dlt.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dfs::new)
   );
   public static final dne f = dmu.aU;
   protected static final float g = 6.0F;
   protected static final epo h = czf.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dlt i;

   @Override
   public MapCodec<? extends dfs> a() {
      return e;
   }

   protected dfs(dlt $$0, dmd.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return h;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(apa $$0, ib $$1, dme $$2, awt $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f);
   }
}
