import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class drg extends dwd implements dty {
   public static final MapCodec<drg> a = b(drg::new);
   public static final ebr<jb> b = ebj.T;
   private final Function<eat, ffw> c;

   public drg(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(this.c(), Integer.valueOf(1)));
      this.c = this.q();
   }

   private Function<eat, ffw> q() {
      return this.a(this.a(b, this.c()));
   }

   @Override
   protected MapCodec<drg> a() {
      return a;
   }

   @Override
   public eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public boolean a(eat $$0, ddg $$1) {
      return this.a($$0, $$1, this.c()) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return a($$1, $$2.e(), jb.b);
   }

   @Override
   public ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.c.apply($$0);
   }

   @Override
   public eat a(ddg $$0) {
      return this.a($$0, this, this.c(), b);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, this.c());
   }
}
