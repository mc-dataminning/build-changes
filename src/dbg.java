import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbg extends cvc implements cuw {
   public static final MapCodec<dbg> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgl.a.fieldOf("tree").forGetter($$0x -> $$0x.i), t()).apply($$0, dbg::new)
   );
   public static final dhw f = dhm.aU;
   protected static final float g = 6.0F;
   protected static final ekb h = cut.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dgl i;

   @Override
   public MapCodec<? extends dbg> a() {
      return e;
   }

   protected dbg(dgl $$0, dgv.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return h;
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.z($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(ama $$0, ht $$1, dgw $$2, ato $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.k().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f);
   }
}
