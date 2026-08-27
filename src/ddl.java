import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddl extends cxh implements cxb {
   public static final MapCodec<ddl> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dje.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, ddl::new)
   );
   public static final dkp f = dkf.aU;
   protected static final float g = 6.0F;
   protected static final emv h = cwy.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dje i;

   @Override
   public MapCodec<? extends ddl> a() {
      return e;
   }

   protected ddl(dje $$0, djo.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return h;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ane $$0, hx $$1, djp $$2, auw $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f);
   }
}
