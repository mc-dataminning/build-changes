import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhy extends dhx {
   public static final MapCodec<dhy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(le.e.q().fieldOf("host").forGetter(dhx::b), u()).apply($$0, dhy::new));

   @Override
   public MapCodec<dhy> a() {
      return b;
   }

   public dhy(ddy $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dkk.i, it.a.b));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return dkk.b($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(dkk.i);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(dkk.i, $$0.k().o());
   }
}
