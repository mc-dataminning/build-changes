import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcw extends cws implements cwm {
   public static final MapCodec<dcw> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dip.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dcw::new)
   );
   public static final dka f = djq.aU;
   protected static final float g = 6.0F;
   protected static final emf h = cwj.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dip i;

   @Override
   public MapCodec<? extends dcw> a() {
      return e;
   }

   protected dcw(dip $$0, diz.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return h;
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(amz $$0, hx $$1, dja $$2, aup $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return true;
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f);
   }
}
