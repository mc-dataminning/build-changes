import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxa extends cwz {
   public static final MapCodec<cxa> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jb.f.q().fieldOf("host").forGetter(cwz::b), t()).apply($$0, cxa::new));

   @Override
   public MapCodec<cxa> a() {
      return b;
   }

   public cxa(ctc $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(czm.i, ha.a.b));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return czm.b($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(czm.i);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(czm.i, $$0.k().o());
   }
}
