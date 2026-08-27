import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cys extends cyr {
   public static final MapCodec<cys> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cyr::b), t()).apply($$0, cys::new));

   @Override
   public MapCodec<cys> a() {
      return b;
   }

   public cys(cut $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dbe.i, hx.a.b));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return dbe.b($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(dbe.i);
   }

   @Override
   public dgw a(cnj $$0) {
      return this.o().a(dbe.i, $$0.k().o());
   }
}
