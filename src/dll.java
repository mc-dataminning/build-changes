import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dll extends dfg implements dfa {
   public static final MapCodec<dll> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drp.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dll::new)
   );
   public static final dta f = dsq.aU;
   protected static final float g = 6.0F;
   protected static final ewi h = dex.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drp i;

   @Override
   public MapCodec<? extends dll> a() {
      return e;
   }

   protected dll(drp $$0, drz.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return h;
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(are $$0, iz $$1, dsa $$2, azf $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f);
   }
}
