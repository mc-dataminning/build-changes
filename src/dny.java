import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dny extends dhs implements dhm {
   public static final MapCodec<dny> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dud.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dny::new)
   );
   public static final dvo f = dve.aU;
   protected static final float g = 6.0F;
   protected static final ezm h = dhj.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dud i;

   @Override
   public MapCodec<? extends dny> a() {
      return e;
   }

   protected dny(dud $$0, dun.d $$1) {
      super($$1);
      this.i = $$0;
      this.l(this.F.b().b(f, Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return h;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.A($$2.d()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(arh $$0, je $$1, duo $$2, azl $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return true;
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f);
   }
}
