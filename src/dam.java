import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dam extends cuj implements cud {
   public static final MapCodec<dam> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfq.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dam::new)
   );
   public static final dhb f = dgr.aU;
   protected static final float g = 6.0F;
   protected static final eiy h = cua.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dfq i;

   @Override
   public MapCodec<? extends dam> a() {
      return e;
   }

   protected dam(dfq $$0, dga.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return h;
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(alq $$0, ht $$1, dgb $$2, ate $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f);
   }
}
