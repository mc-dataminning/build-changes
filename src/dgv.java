import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgv extends dgu {
   public static final MapCodec<dgv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lc.e.q().fieldOf("host").forGetter(dgu::b), u()).apply($$0, dgv::new));

   @Override
   public MapCodec<dgv> a() {
      return b;
   }

   public dgv(dcv $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(djh.i, ir.a.b));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return djh.b($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(djh.i);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(djh.i, $$0.k().o());
   }
}
