import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnk extends dhe implements dgy {
   public static final MapCodec<dnk> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtp.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dnk::new)
   );
   public static final dva f = duq.aU;
   protected static final float g = 6.0F;
   protected static final eyx h = dgv.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dtp i;

   @Override
   public MapCodec<? extends dnk> a() {
      return e;
   }

   protected dnk(dtp $$0, dtz.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.E.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return h;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arg $$0, je $$1, dua $$2, azk $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return true;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f);
   }
}
