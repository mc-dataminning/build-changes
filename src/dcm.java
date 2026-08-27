import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcm extends cwi implements cwc {
   public static final MapCodec<dcm> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(die.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dcm::new)
   );
   public static final djp f = djf.aU;
   protected static final float g = 6.0F;
   protected static final elu h = cvz.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final die i;

   @Override
   public MapCodec<? extends dcm> a() {
      return e;
   }

   protected dcm(die $$0, dio.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return h;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(amp $$0, hv $$1, dip $$2, auf $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f);
   }
}
