import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlo extends dfj implements dfd {
   public static final MapCodec<dlo> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drs.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dlo::new)
   );
   public static final dtd f = dst.aU;
   protected static final float g = 6.0F;
   protected static final ewl h = dfa.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drs i;

   @Override
   public MapCodec<? extends dlo> a() {
      return e;
   }

   protected dlo(drs $$0, dsc.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return h;
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arf $$0, iz $$1, dsd $$2, azh $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return true;
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f);
   }
}
