import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class dpw extends dwd implements dmu, dty {
   public static final MapCodec<dpw> a = b(dpw::new);
   public static final ebr<jb> b = ebj.T;
   public static final ebt c = ebj.U;
   private final Function<eat, ffw> g;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   protected dpw(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.c).b(c, Integer.valueOf(1)));
      this.g = this.q();
   }

   private Function<eat, ffw> q() {
      return this.a(this.a(b, c));
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
      return this.a($$0, $$1, c) ? true : super.a($$0, $$1);
   }

   @Override
   public ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.g.apply($$0);
   }

   @Override
   public double b() {
      return 3.0;
   }

   @Override
   public ebt c() {
      return c;
   }

   @Override
   public eat a(ddg $$0) {
      return this.a($$0, this, c, b);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return true;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      int $$4 = $$3.c(c);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(c, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new czn(this));
      }
   }
}
