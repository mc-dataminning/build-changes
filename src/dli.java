import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dli extends dfd implements dex {
   public static final MapCodec<dli> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drm.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dli::new)
   );
   public static final dsx f = dsn.aU;
   protected static final float g = 6.0F;
   protected static final ewf h = deu.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final drm i;

   @Override
   public MapCodec<? extends dli> a() {
      return e;
   }

   protected dli(drm $$0, drw.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return h;
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arb $$0, iz $$1, drx $$2, azc $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f);
   }
}
