import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dff extends czb implements cyv {
   public static final MapCodec<dff> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dky.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dff::new)
   );
   public static final dmj f = dlz.aU;
   protected static final float g = 6.0F;
   protected static final eos h = cys.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dky i;

   @Override
   public MapCodec<? extends dff> a() {
      return e;
   }

   protected dff(dky $$0, dli.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return h;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aow $$0, hz $$1, dlj $$2, awp $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f);
   }
}
