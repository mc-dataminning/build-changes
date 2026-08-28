import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diu extends dit {
   public static final MapCodec<diu> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dit::b), u()).apply($$0, diu::new));

   @Override
   public MapCodec<diu> a() {
      return b;
   }

   public diu(deu $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dlg.i, je.a.b));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return dlg.b($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(dlg.i);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(dlg.i, $$0.k().o());
   }
}
