import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqw extends dqv {
   public static final MapCodec<dqw> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mg.e.q().fieldOf("host").forGetter(dqv::b), t()).apply($$0, dqw::new));

   @Override
   public MapCodec<dqw> a() {
      return b;
   }

   public dqw(dmr $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dtk.d, jb.a.b));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return dtk.b($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(dtk.d);
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(dtk.d, $$0.k().o());
   }
}
