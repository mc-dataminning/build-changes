import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddd extends cwz implements cwt {
   public static final MapCodec<ddd> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(diw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddd::new)
   );
   public static final dkh f = djx.aU;
   protected static final float g = 6.0F;
   protected static final emm h = cwq.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final diw i;

   @Override
   public MapCodec<? extends ddd> a() {
      return e;
   }

   protected ddd(diw $$0, djg.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return h;
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(and $$0, hx $$1, djh $$2, auv $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f);
   }
}
